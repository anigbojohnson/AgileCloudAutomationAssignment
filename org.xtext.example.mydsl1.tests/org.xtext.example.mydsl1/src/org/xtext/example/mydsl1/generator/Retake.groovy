package org.xtext.example.mydsl1.generator

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.resource.XtextResourceSet

import com.google.inject.Injector

import org.xtext.example.mydsl1.MyDslStandaloneSetup
import org.xtext.example.mydsl1.myDsl.ConnectionStatement
import org.xtext.example.mydsl1.myDsl.DictionaryEntry
import org.xtext.example.mydsl1.myDsl.MakeStatement
import org.xtext.example.mydsl1.myDsl.Model
import org.xtext.example.mydsl1.myDsl.OtherOperationStatement

import org.xtext.example.mydsl1.myDsl.MongoDB

import org.xtext.example.mydsl1.myDsl.OperationStatement

import java.io.File

class Retake {
	/**
	 * Generates MongoDB code for connection and schema definition.
	 */
	static void main(String[] args) {
	
		def injector = new MyDslStandaloneSetup().createInjectorAndDoEMFRegistration()
		// obtain a resource set from the injector

		// obtain a resourceset from the injector
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class)

		def path = "C:/Users/THOMPSON ANIGBO/eclipse-workspace/org.xtext.example.mydsl1/resources/jeff.mydsl1" // Adjust the path to your DSL file
		
		// load a resource by URI, in this case from the file system
		Resource resource = resourceSet.getResource(URI.createFileURI(path), true)

		def mongo =(MongoDB)resource.getContents().get(0)
		
		/**
		 * TODO: Use a traversal strategy and call code templates
		 */

		def text = traverse(mongo.models)

		// Write the generated code to a file
		// Adjust the output file path as needed
		def output = new File("C:/Users/THOMPSON ANIGBO/eclipse-workspace/org.xtext.example.mydsl1/resources/output.js")
		output.delete()
		output.createNewFile()
		output << text
		println("Generated code written to: ${output.absolutePath}")
	}

	def static String traverse(List<EObject> list) {
		String text = ''
		for (obj in list) {
			println(obj)
			println("Traversing element: ${obj.eClass().name}")
			text += generatePatterns(obj)
		}
		return text
	}
	
	def static String generatePatterns(EObject element) {
		
		def text = ""
		switch (element) {
			case Model:
			text += generateMongoDBConnectionCode(element. connection)
			text += traverse(element.statements)
			break;
			case OtherOperationStatement:
			text += traverse(element. statements)
			break;
			case ConnectionStatement:
			text += generateMongoDBConnectionCode(element)
			break;	
			
			case OperationStatement:
			text += generateMongoDBSchema(element.schema)
			break;
		}
		return text
	}
	
	def static String generateMongoDBSchema(MakeStatement schema) {
		
	String code = """
            const ${schema.name.toLowerCase()}Schema = new mongoose.Schema({
        """

        // Generate schema fields based on dictionary entries
        for (entry in schema.entries) {
            code += generateSchemaField(entry)
        }

        code += """
            }, {
                timestamps: true,
            });
        """

        return code
	}
	
	def static String generateMongoDBConnectionCode(ConnectionStatement connection) {
		
        // Access properties of ConnectionStatement
        String connectionString = connection.connectionString
        String databaseName = connection.database

        // Generate code based on extracted information
        return """

            const { MongoClient } = require('mongodb');
            const client = new MongoClient("${connectionString}",{ useNewUrlParser: true, useUnifiedTopology: true });
            let db = undefined;

            async function connect() {
                try {
                    await client.connect();
                    db = await client.db("${databaseName}");
                    console.log("Connected successfully to server");
                } catch (error) {
                    console.error(error);
                }
            }
           connect()
        """
    
	}
	
	static String generateSchemaField(DictionaryEntry entry) {
		
        String code = """
            ${entry.name}: {
        """

        // Check if the field is a reference
        if (entry.refDictionary != null) {
            code += """
                type: mongoose.Schema.Types.ObjectId,
                ref: '${entry.refDictionary.name}',
        """
        } else {
            code += """
                type: ${entry.fieldType},
        """
        }

        // Additional properties based on DSL
        if (entry.status != null && entry.status == "required") {
            code += """
                required: true,
            """
        }
        if (entry.uniqueKey != null && entry.uniqueKey == "unique") {
            code += """
                unique: true,
            """
        }

        code += """
            },
        """

        return code
	}
	
	
}
