package retake


import com.mongodb.MongoClientSettings
import com.mongodb.ServerAddress
import com.mongodb.client.MongoClients
import com.mongodb.client.MongoCollection
import org.bson.Document

class ExerciseOne {
	static void main(String[] args) {
 def connectionString = "mongodb+srv://anigbojohnsona:Sonship123@cluster0.kybkuyh.mongodb.net/ReatakeAgileCloudAuthomation?retryWrites=true&w=majority" 

        // Connect to the MongoDB server using the connection string
        def mongoClient = MongoClients.create(connectionString)

        // Access a specific database
        def database = mongoClient.getDatabase("ReatakeAgileCloudAuthomation")

        // Access a specific collection in the database
        def collection = database.getCollection("currency")
		def document;
		
		
	
		
		// 1. Data Selection (Select * from ... in SQL)
		println("All Documents:")
        println(allDocumentsQuery(collection))
		println("\n")
		
		
		// 2. Data Projection (Select COL1, COL2, COL3 from ... in SQL)
		println("Projected Documents:")
        println(projectedDocumentsQuery(collection))
		println("\n")
		

		// 3. Data Filtering (Select * from ... where condition in SQL)
	    println("Filtered Documents (rate > 5.0):")
        println(filteredDocumentsQuery(collection))
		println("\n")

		// 4. Data Combination (like sums) and/or Data Grouping (like GROUP BY in SQL)
		// For illustration, let's group by the first letter of the currency code
        println("Grouped Documents (Average Rate by First Letter of Currency Code):")
        println(groupedDocumentsQuery(collection))
		println("\n")
        mongoClient.close()
	}
	
	
	static String allDocumentsQuery(MongoCollection<Document> collection) {
	def formattedTable = new StringBuilder()
		formattedTable.append(String.format("| %-20s | %-20s |\n", "Code", "Rate"))
		formattedTable.append("|----------------------|----------------------|\n")
	
		def allDocuments = collection.find()
		allDocuments.each { doc ->         
		       def code = doc.get("code")
               def rate = doc.get("rate")
               formattedTable.append(String.format("| %-20s | %-20s |\n", code, rate))		
		
		}
    return formattedTable.toString()
	}

	static String projectedDocumentsQuery(MongoCollection<Document> collection) {
		def formattedTable = new StringBuilder()
		formattedTable.append(String.format("| %-20s | %-20s |\n", "Code", "Rate"))
		formattedTable.append("|----------------------|----------------------|\n")
		
		
		def projectionDocument = new Document("code", 1).append("rate", 1).append("_id", 0)
		def projectedDocuments = collection.find().projection(projectionDocument)
		projectedDocuments.each { doc ->
			def code = doc.get("code")
			def rate = doc.get("rate")
			formattedTable.append(String.format("| %-20s | %-20s |\n", code, rate))
		}
		return formattedTable.toString()
		
	}

	static String filteredDocumentsQuery(MongoCollection<Document> collection) {
		def formattedTable = new StringBuilder()
		formattedTable.append(String.format("| %-20s | %-20s |\n", "Code", "Rate"))
		formattedTable.append("|----------------------|----------------------|\n")
		
		
		def filterDocument = new Document("rate", new Document("\$gt", 5.0))
		def filteredDocuments = collection.find(filterDocument)
		filteredDocuments.each { doc ->
			def code = doc.get("code")
			def rate = doc.get("rate")
			formattedTable.append(String.format("| %-20s | %-20s |\n", code, rate))
		}
		return formattedTable.toString()
		
	}

	static String groupedDocumentsQuery(MongoCollection<Document> collection) {
		def formattedTable = new StringBuilder()
		formattedTable.append(String.format("| %-20s | %-20s |\n", "Id", "Average Rate"))
		formattedTable.append("|----------------------|----------------------|\n")

		
		def result = ""
		def groupDocument = new Document("_id", new Document("\$substr", ["\$code", 0, 1])).append("averageRate", new Document("\$avg", "\$rate"))
		def groupedDocuments = collection.aggregate([new Document("\$group", groupDocument)])
		groupedDocuments.each { doc ->
			formattedTable.append(String.format("| %-20s | %-20s |\n", doc._id, doc.averageRate))
			
			}
			return formattedTable.toString()
			
	}
}