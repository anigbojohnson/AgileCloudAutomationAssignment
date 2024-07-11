package retake


import com.mongodb.MongoClientSettings
import com.mongodb.ServerAddress
import com.mongodb.client.MongoClients
import com.mongodb.client.MongoCollection
import org.bson.Document
import groovy.json.JsonOutput
import java.util.List

import groovy.json.JsonSlurper

class  ExerciseTwo {
	static void main(String[] args) {
		def jsonFilePath = 'src/main/resources/currency.json'
		
		def startTime = System.currentTimeMillis()
		
		
		// Read the JSON file using JsonSlurper
		def jsonSlurper = new JsonSlurper()
		def jsonData = jsonSlurper.parse(new File(jsonFilePath))
		
		def currencyData = jsonData as List
		
		println("All country currency in the world per doller:")
		println(allCurrencyQuery(currencyData ) )
		println("\n")
		
		
		println("Worst performing currency ")
		println(topWorstPerformingCurrency(currencyData ) )
		println("\n")
		
		println("Top performing currency (rate to dollar < 5.0):")
		println(filteredCurrencyBelowFiveRate(currencyData ) )
		println("\n")
		
		println("Get countries whose (rate > 1000.0):")
		println(countriesRateAboveOneThousand(currencyData))
		println("\n")
		
			
		println("Get Top Five Performing Curency Per Continent")
		println( topFiveCurrenciesPerContinent(currencyData))
		println("\n")
		
		
		println("Projection of European Countries rates to the doller")
		println( projectEuropeanCountryRates(currencyData))
		println("\n")
		
		def codeOrCountry = "Nigeria" // Example: code or country name
		println("Get Rate to US Doller Based on Country Or Code")
		println( findRateByCodeOrCountry(currencyData, codeOrCountry))
		println("\n")
		
		def endTime = System.currentTimeMillis()
		def elapsedTime = endTime - startTime
		println "Elapsed time: ${elapsedTime} milliseconds"
		

	
	}
	
	static String allCurrencyQuery(currencyCollection) {
		def formattedTable = new StringBuilder()
	
		// Append header row with column names
		formattedTable.append(String.format("| %-35s | %-10s | %-20s | %-20s |\n", "Country", "Code", "Continent", "Rate to USD"))
		formattedTable.append("|-------------------------------------|------------|--------------------|----------------------|\n")
	
		// Append data rows
		currencyCollection.each { entry ->
			def country = entry.containsKey("country") ? entry["country"].toString().padRight(35) : ""
			def code = entry.containsKey("code") ? entry["code"] : ""
			def continent = entry.containsKey("continent") ? entry["continent"].toString().padRight(20) : ""
			def rateToUSD = entry.containsKey("rate_to_usd") ? entry["rate_to_usd"] : ""
	
			formattedTable.append(String.format("| %-35s | %-10s | %-20s | %-20s |\n", country, code, continent, rateToUSD))
		}
	
		return formattedTable.toString()
	}
	
	
	static String topWorstPerformingCurrency(currencyCollection) {
		def formattedTable = new StringBuilder()
		formattedTable.append(String.format("| %-35s | %-20s |\n", "Country", "Rate"))
		formattedTable.append("|-------------------------------------|----------------------|\n")
		
		// Sort the data based on rate_to_usd in descending order
		
		currencyCollection.sort { a, b -> b.rate_to_usd <=> a.rate_to_usd }
		
		
		// Limit to top 10 documents
		def top10 = currencyCollection.take(10)
		
		// Iterate over the top 10 documents
		top10.each { doc ->
			def country = doc.country
			def rateToUSD = doc.rate_to_usd
			formattedTable.append(String.format("| %-35s | %-20s |\n", country, rateToUSD))
		}
		
		return formattedTable.toString()
	}
	
	
	static String countriesRateAboveOneThousand(currencyCollection) {
          def formattedTable = new StringBuilder()
          formattedTable.append(String.format("| %-30s | %-20s |\n", "Country", "Rate"))
          formattedTable.append("|--------------------------------|----------------------|\n")

    currencyCollection.each { entry ->
        def country = entry.country
        def rateToUSD = entry.rate_to_usd 
        if (rateToUSD > 1000) {
            formattedTable.append(String.format("| %-30s | %-20s |\n", country, rateToUSD))
        }
    }
    return formattedTable.toString()
	}
	

	static String filteredCurrencyBelowFiveRate(List<Map<String, Object>> documents) {
		def formattedTable = new StringBuilder()
		formattedTable.append(String.format("| %-35s | %-20s |\n", "Country", "Rate to USD"))
		formattedTable.append("|-------------------------------------|----------------------|\n")
		
		// Filter documents where rate > 5
		def filteredDocuments = documents.findAll { doc ->
			doc.rate_to_usd < 5.0
		}
		
		// Iterate over filtered documents and format as table
		filteredDocuments.each { doc ->
			def country = doc.country.toString().padRight(35)
			def rateToUSD = doc.rate_to_usd
			formattedTable.append(String.format("| %-35s | %-20s |\n", country, rateToUSD))
		}
		
		return formattedTable.toString()
	}
	
	static String topFiveCurrenciesPerContinent(List<Map<String, Object>> currencies) {
		def formattedTable = new StringBuilder()
		formattedTable.append(String.format("| %-35s | %-20s | %-20s |\n", "Country", "Continent", "Rate to Dollar"))
		formattedTable.append("|-------------------------------------|----------------------|----------------------|\n")
	
		// Group currencies by continent
		def currenciesByContinent = currencies.groupBy { it.continent }
	
		// Iterate over each continent
		currenciesByContinent.each { continent, currencyList ->
			// Sort currency list by rate_to_usd in ascending order
			currencyList.sort { a, b -> a.rate_to_usd <=> b.rate_to_usd }
	
			// Take top five currencies
			def topFiveCurrencies = currencyList.take(5)
	
			// Append top five currencies to the table
			topFiveCurrencies.each { currency ->
				formattedTable.append(String.format("| %-35s | %-20s | %-20s |\n", currency.country, continent, currency.rate_to_usd))
			}
		}
	
		return formattedTable.toString()
	}
	
	static String projectEuropeanCountryRates(List<Map<String, Object>> currencyList) {
		def formattedTable = new StringBuilder()
		formattedTable.append(String.format("| %-35s | %-20s |\n", "Country", "Rate"))
		formattedTable.append("|-------------------------------------|----------------------|\n")
	
	  currencyList
            .findAll { it.continent == "Europe" }
            .each { currency ->
                def country = currency.country
                def rateToUSD = currency.rate_to_usd
                formattedTable.append(String.format("| %-35s | %-20s |\n", country, rateToUSD))
            }

   
	
		return formattedTable.toString()
 }
 static String findRateByCodeOrCountry(List<Map<String, Object>> dataset, String codeOrCountry) {
	 def formattedTable = new StringBuilder()
	 formattedTable.append(String.format("| %-20s | %-20s |\n", "Country", "Rate to USD"))
	 formattedTable.append("|----------------------|----------------------|\n")
 
	 // Find document matching the code or country
	 def document = dataset.find { it.code == codeOrCountry || it.country == codeOrCountry }
 
	 if (document) {
		 // Extract country and rate_to_usd from the document
		 def country = document.country
		 def rateToUSD = document.rate_to_usd
 
		 // Append result to the table
		 formattedTable.append(String.format("| %-20s | %-20s |\n", country, rateToUSD))
	 } else {
		 formattedTable.append("| No matching document found |\n")
	 }
 
	 return formattedTable.toString()
 }
 

}