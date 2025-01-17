package retake

import com.mongodb.client.model.Aggregates
import com.mongodb.client.model.Accumulators
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.mongodb.MongoClientSettings
import com.mongodb.ServerAddress
import com.mongodb.client.MongoClients
import com.mongodb.client.MongoCollection
import com.mongodb.client.MongoCursor
import com.mongodb.client.model.Projections
import com.mongodb.client.model.Filters
import org.bson.Document
import org.bson.conversions.Bson
import groovy.json.JsonOutput
import groovy.json.JsonSlurper
import com.mongodb.client.model.Indexes

import com.mongodb.client.model.Sorts

class ExcerciseFivePartA {
	def static connectionString = "mongodb+srv://anigbojohnsona:Sonship123@cluster0.kybkuyh.mongodb.net/ReatakeAgileCloudAuthomation?retryWrites=true&w=majority"
	
	static void main(String[] args) {
		       def startTime = System.currentTimeMillis()
		
	   
			   // Connect to the MongoDB server using the connection string
			   def mongoClient = MongoClients.create(connectionString)
	   
			   // Access a specific database
			   def database = mongoClient.getDatabase("ReatakeAgileCloudAuthomation")
	   
			   // Access a specific collection in the database
			   def collection = database.getCollection("currency-extra")
			   
			   
			   
			   println("All country currency in the world per doller:")
			   println(currenciesPerformanceQuery(collection ))  
			   println("\n")
			   
			   
			 
			   
			   
			   def endTime = System.currentTimeMillis()
			   def elapsedTime = endTime - startTime
			   println "Elapsed time: ${elapsedTime} milliseconds"	  
		   }
	static String currenciesPerformanceQuery(MongoCollection<Document> collection) {
		def cacheKey = "currenciesPerformance"
		
		MongoDBCache cache = new MongoDBCache(connectionString, "ReatakeAgileCloudAuthomation", "cache_collection");
		
		  //    collection.createIndex(new Document("code", 1))
		   //   collection.createIndex(new Document("rate_to_usd", 1))
			   
			   def formattedTable = new StringBuilder()
			   formattedTable.append(String.format("| %-35s | %-20s |%-20s |%-20s |\n", "Country","Code","Continent", "Lowest Rate"))
			   formattedTable.append("|-----------------------------------|--------------------|--------------------|--------------------|\n")
			   def cachedResult = cache.get(cacheKey)
			   
			   if (cachedResult != null) {
				   // Parse the JSON string into a Groovy object
				   def jsonSlurper = new JsonSlurper()
				   def cacheddata = jsonSlurper.parseText(cachedResult)	   
				   cacheddata.each { item ->
					   formattedTable.append(String.format("| %-35s | %-20s | %-20s | %-20s |\n", item.country, item.code, item.continent, item.lowestRate))	  
					   }
				   return  formattedTable.toString()	   			   
			   }
			   // Execute the aggregation pipeline
			   
			   
			   def pipeline = [
				   Aggregates.group(
					   "\$code",
					   Accumulators.min("lowestRate", "\$date.rate_to_doller"),
					   Accumulators.first("document", "\$\$ROOT")
				   ),
				   Aggregates.project(
					   Projections.fields(
						   Projections.excludeId(),
						   Projections.include("document.country", "document.code", "document.continent", "document.description"),
						   new Document("lowestRate", "\$lowestRate")
					   )
				   )
			   ]
			   
			   // Execute the aggregation
			   def explain = collection.aggregate(pipeline).explain()
			   println(explain)
	List<Document> results = collection.aggregate(pipeline).into(new ArrayList<>());
	def data=[]

// Print the results
	results.each { result ->
		def code = result._id.code
		def lowestRate = result.get("lowestRate")
	
	// Query the collection again to find the document with the specified code and lowest rate
		Document dateResult = collection.find(
			Filters.and(
			Filters.eq("code", code),
			Filters.eq("rate_to_usd", lowestRate)
		)
	).first()
	
	def documentData = [:]
	documentData['country'] = dateResult.country
	documentData['lowestRate'] = lowestRate
	documentData['code'] = code
	documentData['continent'] = dateResult.continent
	
	// Add the map to the list
	data.add(documentData)
	formattedTable.append(String.format("| %-35s | %-20s | %-20s | %-20s |\n", dateResult.country, code, dateResult.continent, lowestRate))
	
	}
	
	
	def result = JsonOutput.toJson(data)
	cache.put(cacheKey, result, 60)
	return formattedTable.toString()
	
	}
	
	

	
	
}
