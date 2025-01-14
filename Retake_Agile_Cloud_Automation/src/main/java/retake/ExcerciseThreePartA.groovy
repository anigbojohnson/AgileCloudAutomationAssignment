
package retake

import com.google.gson.Gson;

import com.mongodb.client.model.Aggregates
import com.mongodb.client.model.Accumulators
import com.mongodb.MongoClientSettings
import com.mongodb.ServerAddress
import com.mongodb.client.MongoClient
import com.mongodb.client.MongoClients
import com.mongodb.client.MongoCollection
import com.mongodb.client.MongoCursor
import com.mongodb.client.MongoDatabase
import com.mongodb.client.model.Projections
import com.mongodb.client.model.Filters
import com.mongodb.client.model.Indexes;
import org.jfree.chart.ChartFactory
import org.jfree.chart.ChartPanel
import org.jfree.chart.plot.PlotOrientation 
import org.jfree.data.category.DefaultCategoryDataset

import org.bson.Document
import org.bson.conversions.Bson
import groovy.json.JsonOutput
import groovy.json.JsonSlurper
import javax.swing.JFrame
import com.mongodb.client.model.Sorts



class ExcerciseThreePartA {
	def static final connectionString = "mongodb+srv://anigbojohnsona:Sonship123@cluster0.kybkuyh.mongodb.net/ReatakeAgileCloudAuthomation?retryWrites=true&w=majority"
	
	
	static void main(String[] args) {
		
		def startTime = System.currentTimeMillis()
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
		
		    def result =formattedTable.toString()
			return result
	}
	
	

	static String filterHighRateCountries(MongoCollection<Document> collection) {
		collection.createIndex(new Document("rate_to_usd", -1))
	
		
		MongoDBCache cache = new MongoDBCache(connectionString, "ReatakeAgileCloudAuthomation", "cache_collection");
		def data = []
		def cacheKey = "filterHighRateCountries"
		def cachedResult = cache.get(cacheKey)
		println(cachedResult)
		
		if (cachedResult != null) {
			println("jesus is lord")
			// Parse the JSON string into a Groovy object
			def jsonSlurper = new JsonSlurper()
			def cacheddata = jsonSlurper.parseText(cachedResult)
			def dataset = new DefaultCategoryDataset()
			cacheddata.each { item ->
				println(item.country)
				println(item.rateToUSD)
				
				dataset.addValue(item.rateToUSD, "Rate", item.country)
			}
			
			// Createddddd   
			def chart = ChartFactory.createBarChart(
				"Filtered countries whose (rate > 1000.0)", // Title
				"Country", // X-axis label
				"Rate", // Y-axis label
				dataset
			)
			
			// Display chart
			def panel = new ChartPanel(chart)
			def frame = new javax.swing.JFrame("Exchange Rate by Country")
			frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE)
			frame.getContentPane().add(panel)
			frame.pack()
			frame.setVisible(true)
		
		}
		
	

		collection.find(new Document("rate_to_usd", new Document("\$gt", 1000))).forEach { doc ->
			def country = doc.getString("country")
			def rateToUSD = doc.getDouble("rate_to_usd")
			
			def documentData = [:]
			documentData['country'] = country
			documentData['rateToUSD'] = rateToUSD
			
			// Add the map to the list
			data.add(documentData)
			
			
		}
		
		def dataset = new DefaultCategoryDataset()
		data.each{ item ->
			println(item.country)
			println(item.rateToUSD)
			
			dataset.addValue(item.rateToUSD, "Rate", item.country)
		}
		
		// Createddddd
		def chart = ChartFactory.createBarChart(
			"Filtered countries whose (rate > 1000.0)", // Title
			"Country", // X-axis label
			"Rate", // Y-axis label
			dataset
		)
		
		// Display chart
		def panel = new ChartPanel(chart)
		def frame = new javax.swing.JFrame("Exchange Rate by Country")
		frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE)
		frame.getContentPane().add(panel)
		frame.pack()
		frame.setVisible(true)
		
	     def result = JsonOutput.toJson(data)
		 cache.put( cacheKey, result, 60);
		 return
	}
	
	static String groupAvgRatePerContinent(MongoCollection<Document> collection) {
		MongoDBCache cache = new MongoDBCache(connectionString, "ReatakeAgileCloudAuthomation", "cache_collection")
		
		def cacheKey = "groupAvgRatePerContinent"
		def cachedResult = cache.get(cacheKey)
		if (cachedResult != null) {
			
			// Parse the JSON string into a Groovy object
			def jsonSlurper = new JsonSlurper()
			def cacheddata = jsonSlurper.parseText(cachedResult)
			def dataset = new DefaultCategoryDataset()
			cacheddata.each { item ->
			
				
				dataset.addValue(item.avgRate, "Rate", item.continent)
			}
			
			// Createddddd
				def chart = ChartFactory.createBarChart(
				"Average Rate to USD per Continent", // Chart title
				"Continent", // X-axis label
				"Average Rate to USD", // Y-axis label
				dataset, // Dataset
				PlotOrientation.VERTICAL, // Plot orientation
				true, // Show legend
				true, // Show tooltips
				false // Show URLs
		)
		
		// Display the chart
		def chartPanel = new ChartPanel(chart)
		def frame = new JFrame("Bar Chart")
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
		frame.getContentPane().add(chartPanel)
		frame.pack()
		frame.setVisible(true)
		return
		}
		
		collection.createIndex(new Document("continent", 1))
		def dataset = new DefaultCategoryDataset()
		def data = []
		collection.aggregate([
			new Document("\$group", new Document("_id", "\$continent").append("avgRate", new Document("\$avg", "\$rate_to_usd")))
			
		]).forEach { doc ->
			def continent = doc.getString("_id")
			def avgRate = doc.getDouble("avgRate")
			dataset.addValue(avgRate, "Average Rate", continent)
			
			def documentData = [:]
			documentData['avgRate'] = avgRate 
			documentData['continent'] = continent
			
			// Add the map to the list
			data.add(documentData)
		}
		
		// Create the chart
		def chart = ChartFactory.createBarChart(
				"Average Rate to USD per Continent", // Chart title
				"Continent", // X-axis label
				"Average Rate to USD", // Y-axis label
				dataset, // Dataset
				PlotOrientation.VERTICAL, // Plot orientation
				true, // Show legend
				true, // Show tooltips
				false // Show URLs
		)
		
		// Display the chart
		def chartPanel = new ChartPanel(chart)
		def frame = new JFrame("Bar Chart")
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
		frame.getContentPane().add(chartPanel)
		frame.pack()
		frame.setVisible(true)
	
	
		// Cache the result and return
		def result = JsonOutput.toJson(data)
		cache.put(cacheKey, result, 60)
		return result
	}
		
	static String topWorstPerformingCurrency(MongoCollection<Document> collection) {
		MongoDBCache cache = new MongoDBCache(connectionString, "ReatakeAgileCloudAuthomation", "cache_collection")
	
		def cacheKey = "topWorstPerformingCurrency"
		def cachedResult = cache.get(cacheKey)
		if (cachedResult != null) {
			
			
			// Parse the JSON string into a Groovy object
			def jsonSlurper = new JsonSlurper()
			def cacheddata = jsonSlurper.parseText(cachedResult)
			def dataset = new DefaultCategoryDataset()
			cacheddata.each { item ->
			
				
				dataset.addValue(item.rateToUSD, "Rate", item.country)
			}
			
			def chart = ChartFactory.createBarChart(
				"Top 10 Worst Performing Currencies", // Title
				"Country", // X-axis label
				"Rate", // Y-axis label
				dataset, // Dataset
				PlotOrientation.VERTICAL, // Plot orientation
				true, // Show legend
				true, // Show tooltips
				false // Show URLs
		)
	
		// Display chart
		def chartPanel = new ChartPanel(chart)
		def frame = new javax.swing.JFrame("Top 10 Worst Performing Currencies")
		frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE)
		frame.getContentPane().add(chartPanel)
		frame.pack()
		frame.setVisible(true)
			return
		}
	
		// If cached result not found, execute the MongoDB query
		collection.createIndex(new Document("rate_to_usd", -1))
	

	
		// Aggregate pipeline to sort documents based on rate_to_usd and limit to top 10
		def pipeline = [
				new Document('$sort', new Document('rate_to_usd', -1)), // Sort by rate_to_usd in descending order
				new Document('$limit', 10), // Limit to top 10 documents
				new Document('$project', new Document('country', 1).append('rate_to_usd', 1)) // Project only country and rate_to_usd fields
		]
	


	
		// Create dataset for chart
		def dataset = new DefaultCategoryDataset()
		def data= []
		collection.aggregate(pipeline).forEach { doc ->
			def country = doc.getString("country")
			def rateToUSD = doc.get("rate_to_usd") instanceof Integer ? doc.getInteger("rate_to_usd").doubleValue() : doc.getDouble("rate_to_usd")
			def documentData = [:]
			documentData['country'] = country
			documentData['rateToUSD'] = rateToUSD
			
			// Add the map to the list
			data.add(documentData)
			dataset.addValue(rateToUSD, "Rate", country)
		}
	
		// Create chart
		def chart = ChartFactory.createBarChart(
				"Top 10 Worst Performing Currencies", // Title
				"Country", // X-axis label
				"Rate", // Y-axis label
				dataset, // Dataset
				PlotOrientation.VERTICAL, // Plot orientation
				true, // Show legend
				true, // Show tooltips
				false // Show URLs
		)
	
		// Display chart
		def chartPanel = new ChartPanel(chart)
		def frame = new javax.swing.JFrame("Top 10 Worst Performing Currencies")
		frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE)
		frame.getContentPane().add(chartPanel)
		frame.pack()
		frame.setVisible(true)
	
		// Cache the result and return
		def result = JsonOutput.toJson(data)
		
		cache.put(cacheKey, result, 60)
		return
	}
	
	static String projectEuropeanCountryAndRates(MongoCollection<Document> collection) {
		def cacheKey = "projectEuropeanCountryAndRates"
		MongoDBCache cache = new MongoDBCache(connectionString, "ReatakeAgileCloudAuthomation", "cache_collection")
	
		def cachedResult = cache.get(cacheKey)
		if (cachedResult != null) {
			
			
			// Parse the JSON string into a Groovy object
			def jsonSlurper = new JsonSlurper()
			def cacheddata = jsonSlurper.parseText(cachedResult)
			def dataset = new DefaultCategoryDataset()
			cacheddata.each { item ->
			
				
				dataset.addValue(item.rateToUSD, "Rate", item.country)
			}
			
			def chart = ChartFactory.createBarChart(
				"Exchange Rate of European Countries", // Title
				"Country", // X-axis label
				"Rate", // Y-axis label
				dataset, // Dataset
				PlotOrientation.VERTICAL, // Plot orientation
				true, // Show legend
				true, // Show tooltips
				false // Show URLs
		)
	
		// Display chart
		def chartPanel = new ChartPanel(chart)
		def frame = new javax.swing.JFrame("Exchange Rate of European Countries")
		frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE)
		frame.getContentPane().add(chartPanel)
		frame.pack()
		frame.setVisible(true)
	
		
		return
		}
	
		// If cached result not found, execute the MongoDB query
		collection.createIndex(new Document("continent", 1))
	
		
	
		// Perform the MongoDB query to project European countries and their exchange rates
		
		def projection = Projections.fields(Projections.include("country", "rate_to_usd"), Projections.exclude("_id"))

		def data =[]
		def filter = Filters.eq("continent", "Europe")
		def dataset = new DefaultCategoryDataset()
		collection.find(filter).projection(projection).forEach { doc ->
			def country = doc.getString("country")
			def rateToUSD = doc.get("rate_to_usd") instanceof Integer ? doc.getInteger("rate_to_usd").doubleValue() : doc.getDouble("rate_to_usd")
			dataset.addValue(rateToUSD, "Rate", country)
			
			def documentData = [:]
			documentData['country'] = country
			documentData['rateToUSD'] = rateToUSD
			
			// Add the map to the list
			data.add(documentData)
		}
	
		// Create chart
		def chart = ChartFactory.createBarChart(
				"Exchange Rate of European Countries", // Title
				"Country", // X-axis label
				"Rate", // Y-axis label
				dataset, // Dataset
				PlotOrientation.VERTICAL, // Plot orientation
				true, // Show legend
				true, // Show tooltips
				false // Show URLs
		)
	
		// Display chart
		def chartPanel = new ChartPanel(chart)
		def frame = new javax.swing.JFrame("Exchange Rate of European Countries")
		frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE)
		frame.getContentPane().add(chartPanel)
		frame.pack()
		frame.setVisible(true)
	
		// Cache the result and return
		def result = JsonOutput.toJson(data)
		cache.put(cacheKey, result, 60)
		return
	}
	static String topFiveCurrenciesPerContinent(MongoCollection<Document> collection) {
		def cacheKey = "topFiveCurrenciesPerContinent"
		MongoDBCache cache = new MongoDBCache(connectionString, "ReatakeAgileCloudAuthomation", "cache_collection")
	
		def cachedResult = cache.get(cacheKey)
		if (cachedResult != null) {
			println("Cached result found, returning cached data")
			
			def jsonSlurper = new JsonSlurper()
			def cacheddata = jsonSlurper.parseText(cachedResult)
			def dataset = new DefaultCategoryDataset()
			cacheddata.each { item ->
			
				
				dataset.addValue(item.rateToUSD, "Rate", item.country)
			}
			def chart = ChartFactory.createBarChart(
				"Top Five Currencies per Continent", // Title
				"Continent", // X-axis label
				"Rate to USD", // Y-axis label
				dataset, // Dataset
				PlotOrientation.VERTICAL, // Plot orientation
				true, // Show legend
				true, // Show tooltips
				false // Show URLs
		)
	
		// Display chart
		def chartPanel = new ChartPanel(chart)
		def frame = new javax.swing.JFrame("Top Five Currencies per Continent")
		frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE)
		frame.getContentPane().add(chartPanel)
		frame.pack()
		frame.setVisible(true)
			return 
		}
	
		// If cached result not found, execute the MongoDB query
		def continents = ["Africa", "Asia", "Europe", "North America", "South America", "Oceania"]
		collection.createIndex(new Document("continent", 1).append("rate_to_usd", 1))
	
		// Create dataset for chart
		def dataset = new DefaultCategoryDataset()
		def data = []
		continents.each { continent ->
			def currencies = collection.find(Filters.eq("continent", continent))
									  .sort(new Document("rate_to_usd", 1))
									  .projection(Projections.include("country", "rate_to_usd"))
									  .limit(5)
									  .toList()
	
			currencies.each { currency ->
				def country = currency.getString("country")
				def rateToUSD = currency.get("rate_to_usd") instanceof Integer ? currency.getInteger("rate_to_usd").doubleValue() : currency.getDouble("rate_to_usd")
				dataset.addValue(rateToUSD, country, continent)
				def documentData = [:]
				documentData['country'] = country
				documentData['rateToUSD'] = rateToUSD
				
				// Add the map to the list
				data.add(documentData)
			}
		}
	
		// Create chart
		def chart = ChartFactory.createBarChart(
				"Top Five Currencies per Continent", // Title
				"Continent", // X-axis label
				"Rate to USD", // Y-axis label
				dataset, // Dataset
				PlotOrientation.VERTICAL, // Plot orientation
				true, // Show legend
				true, // Show tooltips
				false // Show URLs
		)
	
		// Display chart
		def chartPanel = new ChartPanel(chart)
		def frame = new javax.swing.JFrame("Top Five Currencies per Continent")
		frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE)
		frame.getContentPane().add(chartPanel)
		frame.pack()
		frame.setVisible(true)
	
		// Cache the result and return
		def result = JsonOutput.toJson(data)
		
		cache.put(cacheKey, result, 60)
		return
	}
	
	static String filteredCurrencyBelowFiveRate(MongoCollection<Document> collection) {
		def cacheKey = "filteredCurrencyBelowFiveRate"
		MongoDBCache cache = new MongoDBCache(connectionString, "ReatakeAgileCloudAuthomation", "cache_collection")
	
		def cachedResult = cache.get(cacheKey)
		if (cachedResult != null) {
			
			
			def jsonSlurper = new JsonSlurper()
			def cacheddata = jsonSlurper.parseText(cachedResult)
			def dataset = new DefaultCategoryDataset()
			cacheddata.each { item ->
			
				
				dataset.addValue(item.rateToUSD, "Rate", item.country)
			}
			// Create chart
			def chart = ChartFactory.createBarChart(
					"Exchange Rate by Country (Rate < 5)", // Title
					"Country", // X-axis label
					"Rate", // Y-axis label
					dataset, // Dataset
					PlotOrientation.VERTICAL, // Plot orientation
					true, // Show legend
					true, // Show tooltips
					false // Show URLs
			)
		
			// Display chart
			def chartPanel = new ChartPanel(chart)
			def frame = new javax.swing.JFrame("Exchange Rate by Country (Rate < 5)")
			frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE)
			frame.getContentPane().add(chartPanel)
			frame.pack()
			frame.setVisible(true)
			return cachedResult
		}
	
		// If cached result not found, execute the MongoDB query
		def filteredData = collection.find(new Document("rate_to_usd", new Document("\$lt", 5)))
									.projection(Projections.include("country", "rate_to_usd"))
									.toList()
	
		// Create dataset for chart
		def dataset = new DefaultCategoryDataset()
		def data=[]
		filteredData.each { currency ->
			def country = currency.getString("country")
			def rateToUSD = currency.get("rate_to_usd") instanceof Integer ? currency.getInteger("rate_to_usd").doubleValue() : currency.getDouble("rate_to_usd")
			dataset.addValue(rateToUSD, "Rate", country)
			
			def documentData = [:]
			documentData['country'] = country
			documentData['rateToUSD'] = rateToUSD
			
			// Add the map to the list
			data.add(documentData)
		}
	
		// Create chart
		def chart = ChartFactory.createBarChart(
				"Exchange Rate by Country (Rate < 5)", // Title
				"Country", // X-axis label
				"Rate", // Y-axis label
				dataset, // Dataset
				PlotOrientation.VERTICAL, // Plot orientation
				true, // Show legend
				true, // Show tooltips
				false // Show URLs
		)
	
		// Display chart
		def chartPanel = new ChartPanel(chart)
		def frame = new javax.swing.JFrame("Exchange Rate by Country (Rate < 5)")
		frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE)
		frame.getContentPane().add(chartPanel)
		frame.pack()
		frame.setVisible(true)
	
		// Cache the result and return
		def result = JsonOutput.toJson(data)
		cache.put(cacheKey, result, 60)
		return 
	}
	
	static String findRateByCodeOrCountry(MongoCollection<Document> collection, String codeOrCountry) {
		def result = ""
		def cacheKey = "findRateByCodeOrCountry"
		MongoDBCache cache = new MongoDBCache(connectionString, "ReatakeAgileCloudAuthomation", "cache_collection");
		
		def cachedResult = cache.get(cacheKey)
		
		if (cachedResult != null) {
			// Parse the JSON string into a Groovy object
			def jsonSlurper = new JsonSlurper()
			def cacheddata = jsonSlurper.parseText(cachedResult)
			println(cacheddata)
			return
		
		}
		
				// Retrieve data from the cache
	     // Determine whether to search by country or code
		collection.createIndex(Indexes.ascending("code"));
		
		// Define your match query
		Document matchQuery = new Document("\$match", new Document("code", codeOrCountry));
		
		// Define your projection to retrieve only specific fields (if needed)
		Document projection = new Document("\$project", new Document("country", 1).append("rate_to_usd", 1).append("_id", 0));
		
		// Add a $limit stage to ensure only the first matching document is returned
		Document limitStage = new Document("\$limit", 1);
		
		// Aggregate using the match, projection, and limit stages
		MongoCursor<Document> cursor = collection.aggregate(Arrays.asList(matchQuery, projection, limitStage)).iterator();
		
		// Check if there is a document and process it
		if (cursor.hasNext()) {
			Document document = cursor.next();
			result = document.toJson()
			cursor.close();
			def jsonSlurper = new JsonSlurper()
			 result = jsonSlurper.parseText(result)
			
			cache.put( "findRateByCodeOrCountry",  document.toJson(), 60); // Cache for 60 seconds
			println("The country code is "+codeOrCountry)
			println("The rate is "+result.rate_to_usd)
			println("The country is "+result.country)
			
			
		} else {
			println("No matching document found");
		}
      
	}
	
}

public class MongoDBCache {
	private final MongoClient mongoClient;
	private final MongoDatabase database;
	private final MongoCollection<Document> cacheCollection;

	public MongoDBCache(String connectionString, String databaseName, String collectionName) {
		mongoClient = MongoClients.create(connectionString);
		database = mongoClient.getDatabase(databaseName);
		cacheCollection = database.getCollection(collectionName);
	}

	public void put(String key, String value, long ttlInSeconds) {
		Document cacheEntry = new Document("key", key)
								  .append("value", value)
								  .append("expirationTime", System.currentTimeMillis() + ttlInSeconds * 1000);
		cacheCollection.insertOne(cacheEntry);
	}

	public String get(String key) {
		Document cacheEntry = cacheCollection.find(new Document("key", key)).first();
		
		
		if (cacheEntry != null) {
			long expirationTime = cacheEntry.getLong("expirationTime");
			if (expirationTime > System.currentTimeMillis()) {
				
				Gson gson = new Gson();
				return cacheEntry.getString("value");
			} else {
				// Remove expired cache entry
		
				cacheCollection.deleteOne(new Document("key", key));
			}
		}
		return null; // Cache miss
	}
}