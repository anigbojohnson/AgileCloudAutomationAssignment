package retake


import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.mongodb.MongoClientSettings
import com.mongodb.ServerAddress
import com.mongodb.client.MongoClients
import com.mongodb.client.MongoCollection
import org.bson.Document
import groovy.json.JsonOutput
import groovy.json.JsonSlurper
import java.util.List
class ExcerciseFivePartB {

	static void main(args) {
		// TODO Auto-generated method stub
		def startTime = System.currentTimeMillis()
		
		def jsonFilePath = 'src/main/resources/currency-extended.json'
		
		// Read the JSON file using JsonSlurper
		def jsonSlurper = new JsonSlurper()
		def jsonData = jsonSlurper.parse(new File(jsonFilePath))
		
		def currencyData = jsonData as List
		
		println("All country currency in the world per doller:")
		println(currenciesPerformanceQuery(currencyData ) )
		println("\n")
		
		
		println("All country currency and descriotion:")
		println(currenciesDescriptionQuery(currencyData ))
		println("\n")
		
		def endTime = System.currentTimeMillis()
		def elapsedTime = endTime - startTime
		println "Elapsed time: ${elapsedTime} milliseconds"
	}
	static String currenciesPerformanceQuery(currencyCollection) {
		def formattedTable = new StringBuilder()
		formattedTable.append(String.format("| %-35s | %-20s |%-20s |%-20s |\n", "Country","Code","Continent", "Lowest Rate"))
		formattedTable.append("|-------------------------------------|----------------------|----------------------|----------------------|\n")
		
		// Execute the aggregation pipeline
		def groupedData = currencyCollection.groupBy { it.code }.collect { code, items ->
			[
				code: code,
				lowestRate: items.min { it.rate_to_usd }
			]
		}.sort { it.code }
		
		// Print the results
		groupedData.each { result ->
			def code = result.code
			def lowestRate = result.lowestRate.rate_to_usd 
			
			// Find the document with the specified code and lowest rate
			def countryData = currencyCollection.find { it.code == code && it.rate_to_usd == lowestRate }
			formattedTable.append(String.format("| %-35s | %-20s | %-20s | %-20s |\n", countryData.country, code, countryData.continent, lowestRate))
		}
		
		return formattedTable.toString()
	}
	static String currenciesDescriptionQuery(currencyCollection) {
	        // Sample data representing country descriptions
	    
	        
	        Gson gson = new GsonBuilder().setPrettyPrinting().create()
	        def formattedTable = new StringBuilder()
	        formattedTable.append(String.format("| %-35s | %-50s  |\n", "Country","Description"))
	        formattedTable.append("|-------------------------------------|----------------------|\n")
	        
	        def data = []
	        currencyCollection.each { entry ->
	            def country = entry.country
	            def description = entry.description
	            // Check if description is not null before adding to the data list
	            if (description != null) {
	                def documentData = [:]
	                documentData['country'] = country
	                documentData['description'] = description
	                // Add the map to the list
	                data.add(documentData)
	            }
	        }
	        
	        // Convert data list to JSON string
	        return gson.toJson(data)
	    }
	
	
}
