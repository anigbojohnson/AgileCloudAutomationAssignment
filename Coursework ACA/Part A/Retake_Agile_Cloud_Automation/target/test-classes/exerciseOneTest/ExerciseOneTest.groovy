package exerciseOneTest


import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import com.mongodb.client.MongoClients
import com.mongodb.client.MongoCollection
import com.mongodb.client.MongoDatabase
import org.bson.Document
import static org.junit.jupiter.api.Assertions.assertTrue

import retake.ExerciseOne


class ExerciseOneTest {
	static MongoDatabase database
	static MongoCollection<Document> collection

	@BeforeAll
	static void setup() {
		def mongoClient = MongoClients.create("mongodb+srv://anigbojohnsona:Sonship123@cluster0.kybkuyh.mongodb.net/?retryWrites=true&w=majority")
		database = mongoClient.getDatabase("testDatabase")
		collection = database.getCollection("currency")
	}




  	@Test
	void testAllDocumentsQuery() {
		// Insert test data into the collection for this test
		collection.deleteMany(new Document())
		Document document1 = new Document("code", "SampleCode1").append("rate", 10.5)
		Document document2 = new Document("code", "SampleCode2").append("rate", 8.2)
		collection.insertMany([document1, document2])
		// Perform the test
		def result = ExerciseOne.allDocumentsQuery(collection)
		//http://org.eclipse.ui.intro/showPage?id=whatsnew&standby=false
		
		println(result)
		
		// Assert the results
		assertTrue(result.contains("| Code                 | Rate                 |"))
		assertTrue(result.contains("|----------------------|----------------------|"))
		assertTrue(result.contains("| SampleCode1          | 10.5                 |"))
		assertTrue(result.contains("| SampleCode2          | 8.2                  |"))
	}


	@Test
	void testFilteredDocumentsQuery() {
	
		collection.deleteMany(new Document())
		Document document1 = new Document("code", "SampleCode1").append("rate", 10.5)
		Document document2 = new Document("code", "SampleCode2").append("rate", 8.2)
		Document document3 = new Document("code", "SampleCode2").append("rate", 4.0)
		collection.insertMany([document1, document2,document3])
		
		

		// Perform the test
		def result = ExerciseOne.filteredDocumentsQuery(collection)

		// Assert the results
		assertTrue(result.contains("| Code                 | Rate                 |"))
		assertTrue(result.contains("|----------------------|----------------------|"))
		assertTrue(result.contains("| SampleCode1          | 10.5                 |"))
		assertTrue(result.contains("| SampleCode2          | 8.2                  |"))
				
	}
	
	
	
	@Test
	void testGroupedDocumentsQuery() {
	
	collection.deleteMany(new Document())
	Document document1 = new Document("code", "SampleCode1").append("rate", 10.5)
	Document document2 = new Document("code", "SampleCode2").append("rate", 8.2)
	Document document3 = new Document("code", "SampleCode3").append("rate", 7.0)
	Document document4 = new Document("code", "SampleCode4").append("rate", 5.5)

	collection.insertMany([document1, document2,document3, document4 ])
	
		// Perform the test
		def result = ExerciseOne.groupedDocumentsQuery(collection)

		// Print the result for manual inspection
		println(result)

		// Assert the results
		assertTrue(result.contains("| Id                   | Average Rate         |"))
		assertTrue(result.contains("|----------------------|----------------------|"))
		assertTrue(result.contains("| S                    | 7.8                  |"))
	}
		
	@Test
	void testProjectedDocumentsQuery() {
		// Insert test data into the collection for this test
		collection.deleteMany(new Document())
		
		Document document1 = new Document("code", "SampleCode1").append("rate", 10.5)
		Document document2 = new Document("code", "SampleCode2").append("rate", 8.2)
		Document document3 = new Document("code", "SampleCode3").append("rate", 7.0)

		collection.insertMany([document1, document2, document3])

		// Perform the test
		def result = ExerciseOne.projectedDocumentsQuery(collection)

		// Print the result for manual inspection
		println(result)

		// Assert the results
		assertTrue(result.contains("| Code                 | Rate                 |"))
		assertTrue(result.contains("|----------------------|----------------------|"))
		assertTrue(result.contains("| SampleCode1          | 10.5                 |"))
		assertTrue(result.contains("| SampleCode2          | 8.2                  |"))
		assertTrue(result.contains("| SampleCode3          | 7.0                  |"))
	}
	// Add similar test methods for other queries (projectedDocumentsQuery, filteredDocumentsQuery, groupedDocumentsQuery)
}
