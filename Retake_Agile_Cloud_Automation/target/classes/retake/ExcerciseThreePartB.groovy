package retake

import com.mongodb.client.model.Aggregates
import com.mongodb.client.model.Accumulators
import com.mongodb.MongoClientSettings
import com.mongodb.ServerAddress
import com.mongodb.client.MongoClients
import com.mongodb.client.MongoCollection
import com.mongodb.client.model.Projections
import com.mongodb.client.model.Filters

import org.bson.Document
import org.bson.conversions.Bson
import groovy.json.JsonOutput
import com.mongodb.client.model.Sorts


class ExerciseThree {
	static void main(String[] args) {
		
		def startTime = System.currentTimeMillis()
		def connectionString = "mongodb+srv://anigbojohnsona:Sonship123@cluster0.kybkuyh.mongodb.net/ReatakeAgileCloudAuthomation?retryWrites=true&w=majority" 

        // Connect to the MongoDB server using the connection string
        def mongoClient = MongoClients.create(connectionString)

        // Access a specific database
        def database = mongoClient.getDatabase("ReatakeAgileCloudAuthomation")

        // Access a specific collection in the database
        def collection = database.getCollection("currency")		
		
		println("All country currency in the world per doller:")
		println(allCurrenciesQuery(collection ) )
		println("\n")
		
		println("Filtered countries whose (rate > 1000.0):")
        println(filterHighRateCountries(collection))
		println("\n")
		
		println("Give average rate of each conitinent rate to the dollar:")
		println(groupAvgRatePerContinent(collection))
		println("\n")
		
		println("Top performing currency (rate to dollar < 5.0):")
		println(filteredCurrencyBelowFiveRate(collection) )
		println("\n")
		
		println("Filtered and Aggregate Worst Ten performing currency to the dollar:")
		println(topWorstPerformingCurrency(collection))
		
		
		println("Project European Countries Rate to the Dollar:")
		println(projectEuropeanCountryAndRates(collection))
		
		println("Get Top Five Performing Curency Per Continent")
		println( topFiveCurrenciesPerContinent(collection))
		println("\n")
		
		
		def codeOrCountry = "ANG" // Example: code or country name	
		println("Get Rate to US Doller Based on Country Or Code")
		println( findRateByCodeOrCountry(collection, codeOrCountry))
		println("\n")
        
		mongoClient.close()
		mongoClient.close()
		def endTime = System.currentTimeMillis()
		def elapsedTime = endTime - startTime
		println "Elapsed time: ${elapsedTime} milliseconds"
		
	}
	
		
	static String allCurrenciesQuery(MongoCollection<Document> collection) {
		def formattedTable = new StringBuilder()
		formattedTable.append(String.format("| %-35s | %-10s | %-20s | %-20s |\n", "Country", "Code", "Continent", "Rate to USD"))
		formattedTable.append("|-------------------------------------|------------|--------------------|----------------------|\n")
	
		
		def allDocuments = collection.find()
		allDocuments.each { doc ->
			def code = doc.get("code")
			def rate = doc.get("rate_to_usd")
			def country = doc.get("country")
			def continent = doc.get("continent")
			
			formattedTable.append(String.format("| %-35s | %-10s | %-20s | %-20s |\n", country, code, continent, rate))
		}
		
		return formattedTable.toString()
	}
	
	

	static String filterHighRateCountries(MongoCollection<Document> collection) {
		def formattedTable = new StringBuilder()
		formattedTable.append(String.format("| %-20s | %-20s |\n", "Country", "Rate"))
		formattedTable.append("|----------------------|----------------------|\n")

		collection.find(new Document("rate_to_usd", new Document("\$gt", 1000))).forEach { doc ->
			def country = doc.getString("country")
			def rateToUSD = doc.getDouble("rate_to_usd")
			formattedTable.append(String.format("| %-20s | %-20s |\n", country, rateToUSD))
			
		}
		return formattedTable.toString()
	}
	
	static String groupAvgRatePerContinent(MongoCollection<Document> collection) {
		def formattedTable = new StringBuilder()
		formattedTable.append("| %-20s | %-20s |\n".format("Continent", "Average Rate to USD"))
		formattedTable.append("|----------------------|----------------------|\n")

		collection.aggregate([
			new Document("\$group", new Document("_id", "\$continent").append("avgRate", new Document("\$avg", "\$rate_to_usd")))
		]).forEach { doc ->
			def continent = doc.getString("_id")
			def avgRate = doc.getDouble("avgRate")
			formattedTable.append(String.format("| %-20s | %-20s |\n", continent, avgRate))
			
		}
		return formattedTable.toString()
	}

		
	static String topWorstPerformingCurrency(MongoCollection<Document> collection) {
			def formattedTable = new StringBuilder()
			formattedTable.append(String.format("| %-35s | %-20s |\n", "Country", "Rate"))
			formattedTable.append("|-------------------------------------|----------------------|\n")
	
			// Aggregate pipeline to sort documents based on rate_to_usd and limit to top 10
			def pipeline = [
				new Document('$sort', new Document('rate_to_usd', -1)), // Sort by rate_to_usd in descending order
				new Document('$limit', 10), // Limit to top 10 documents
				new Document('$project', new Document('country', 1).append('rate_to_usd', 1)) // Project only country and rate_to_usd fields
			]
	
			// Perform aggregation
			collection.aggregate(pipeline).forEach { doc ->
				def country = doc.getString("country")
				def rateToUSD = doc.get("rate_to_usd") instanceof Integer ? doc.getInteger("rate_to_usd").doubleValue() : doc.getDouble("rate_to_usd")
				formattedTable.append(String.format("| %-35s | %-20s |\n", country, rateToUSD))
			}
			return formattedTable.toString()
		}
	
	
	static String projectEuropeanCountryAndRates(MongoCollection<Document> collection) {
	       def formattedTable = new StringBuilder()
           formattedTable.append(String.format("| %-35s | %-20s |\n", "Country", "Rate"))
           formattedTable.append("|-------------------------------------|----------------------|\n")
    
            def projection = new Document("country", 1).append("rate_to_usd", 1)
            def filter = Filters.eq("continent", "Europe")
    
         collection.find(filter).projection(projection).forEach { doc ->
         def country = doc.getString("country")
         def rateToUSD = doc.get("rate_to_usd") instanceof Integer ? doc.getInteger("rate_to_usd").doubleValue() : doc.getDouble("rate_to_usd")
         formattedTable.append(String.format("| %-35s | %-20s |\n", country, rateToUSD))
    }
    
    return formattedTable.toString()
	}
	
	static String topFiveCurrenciesPerContinent(MongoCollection<Document> collection) {
		
		def continents = ["Africa", "Asia", "Europe", "North America", "South America", "Oceania"]
		
			def formattedTable = new StringBuilder()
			formattedTable.append(String.format("| %-35s | %-20s | %-15s |\n", "Country", "Continent", "Rate"))
			formattedTable.append("|-------------------------------------|----------------------|---------------|\n")
		
			continents.each { continent ->
				def currencies = collection.find(Filters.eq("continent", continent))
											.sort(new Document("rate_to_usd", 1))
											.projection(Projections.include("country", "rate_to_usd"))
											.limit(5)
											.toList()
		
				currencies.each { currency ->
					def country = currency.getString("country")
					def rateToUSD = currency.get("rate_to_usd") instanceof Integer ? currency.getInteger("rate_to_usd").doubleValue() : currency.getDouble("rate_to_usd")
					formattedTable.append(String.format("| %-35s | %-20s | %-15s |\n", country, continent, rateToUSD))
				}
			}
		
			return formattedTable.toString()
	}
	
	static String filteredCurrencyBelowFiveRate(MongoCollection<Document> collection) {
		def formattedTable = new StringBuilder()
		formattedTable.append(String.format("| %-35s | %-20s |\n", "Country", "Rate to USD"))
		formattedTable.append("|-------------------------------------|----------------------|\n")
	
		// Filter documents where rate < 5
		def filteredDocuments = collection.find(new Document("rate_to_usd", new Document("\$lt", 5)))
	
		// Iterate over filtered documents and format as table
		filteredDocuments.each { Document doc ->
			def country = doc.getString("country").padRight(35)
			// Convert rate_to_usd to Double if it's an Integer
			def rateToUSD = doc.get("rate_to_usd") instanceof Integer ?
				doc.getInteger("rate_to_usd").doubleValue() :
				doc.getDouble("rate_to_usd")
			formattedTable.append(String.format("| %-35s | %-20s |\n", country, rateToUSD))
		}
	
		return formattedTable.toString()
	}
	
	static String findRateByCodeOrCountry(MongoCollection<Document> collection, String codeOrCountry) {
		def formattedTable = new StringBuilder()
		formattedTable.append(String.format("| %-20s | %-20s |\n", "Country", "Rate to USD"))
		formattedTable.append("|----------------------|----------------------|\n")
	
		// Determine whether to search by country or code
		def query = codeOrCountry ?
				new Document("code", codeOrCountry) :
				new Document("country", codeOrCountry)
	
		// Find document matching the query
		def document = collection.find(query).first()
	
		if (document) {
			// Extract code and rate_to_usd from the document
			def country = document.getString("country")
			def rateToUSD = document.getDouble("rate_to_usd")
	
			// Append result to the table
			formattedTable.append(String.format("| %-20s | %-20s |\n", country, rateToUSD))
		} else {
			formattedTable.append("| No matching document found |\n")
		}
	
		return formattedTable.toString()
	}
	
	
	

}