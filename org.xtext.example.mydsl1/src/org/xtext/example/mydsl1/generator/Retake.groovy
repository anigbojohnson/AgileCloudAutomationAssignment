package org.xtext.example.mydsl1.generator

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.resource.XtextResourceSet

import com.google.inject.Injector

import org.xtext.example.mydsl1.MyDslStandaloneSetup
import org.xtext.example.mydsl1.myDsl.ConnectionStatement
import org.xtext.example.mydsl1.myDsl.CollectionFieldDefination
import org.xtext.example.mydsl1.myDsl.Model
import org.xtext.example.mydsl1.myDsl.CollectionEntry
import org.xtext.example.mydsl1.myDsl.UpdateCollectionEntry
import org.xtext.example.mydsl1.myDsl.MongoDB

import org.xtext.example.mydsl1.myDsl.CRUDOperationAndCollectionSchema


import org.xtext.example.mydsl1.myDsl.CollectionSchema;
import org.xtext.example.mydsl1.myDsl.CRUDOperations;
import java.io.File

class Retake {
	/**
	 * Generates MongoDB code for connection and schema definition.
	 */
	def static performOperation = 0
	def static modelList = []
	
	
	static void main(String[] args) {
	
		def injector = new MyDslStandaloneSetup().createInjectorAndDoEMFRegistration()
		// obtain a resource set from the injector

		// obtain a resourceset from the injector
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class)

		def path = "C:/Users/THOMPSON ANIGBO/eclipse-workspace/org.xtext.example.mydsl1/resources/example2.mydsl1" // Adjust the path to your DSL file
		
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
			case CRUDOperations:
				text += traverse(element. statements)
			break;
			case ConnectionStatement:
				text += generateMongoDBConnectionCode(element)
			break;	
			
			case CRUDOperationAndCollectionSchema:
				if(element.schema)
					text += generateMongoDBSchema(element.schema)
				if(element.operations) {
					for (obj in element.operations) {
						if(!modelList.contains(obj.collection.getName())){
							modelList.add(obj.collection.getName())
							text += generateModel(obj)
						
					}
				}
				text += """
               (async () => {
                             try{
                               await connect()"""

				for (obj in element.operations) {
					
					performOperation++
					text += generateCRUDOperations(obj, performOperation)
				}
			      text +=  """
                         }catch(e){
                             console.log(e.errmsg)
                      }
                    })();"""  
			}
			break;
			case UpdateCollectionEntry:
			println("here we come")
			println( element.entries[1])
		}
	
		
	//	generateUpdate()
				//text += generateCRUDOperations(element.operations)
					
		return text
	}
	//const User = mongoose.model('User', userSchema);
	//return word.substring(0, 1).toLowerCase() + word.substring(1)
	
	def static String generateModel(CRUDOperations obj) {
		println( obj.collection.getName())
		def text =""
		
			text += 	"""
				const ${obj.collection.getName()} = mongoose.model("${obj.collection.getName()}",${obj.collection.getName().substring(0, 1).toLowerCase()+obj.collection.getName().substring(1)}Schema);
			"""
			println(text)
		return text
	}
	def static String generateMongoDBSchema(CollectionSchema schema) {
	
	String code = """
     const ${schema.name.toLowerCase()}Schema = new mongoose.Schema({
   """

        // Generate schema fields based on dictionary entries
        for (entry in schema.defination) {
            code += generateSchemaField(entry, schema.getName())
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
        String databaseName = connection.databaseName

        // Generate code based on extracted information
        return """

const mongoose = require('mongoose');

const mongoURI = "${connectionString}";
let db = undefined;

async function connect() {
    try {
      mongoose.connect(mongoURI, {
        useNewUrlParser: true,
        useUnifiedTopology: true,
        serverSelectionTimeoutMS: 30000
    })
    .then(() => {
        console.log("Connected successfully to MongoDB");
    })
    .catch(error => {
        console.error("Error connecting to MongoDB:", error);
    });
    } catch (error) {
        console.error(error);
    }
}
        """
    
	}
	
	static String generateSchemaField(CollectionFieldDefination entry, collectionName) {
	
        String code = """
            ${entry.name}: {
        """

        // Check if the field is a reference
        if (entry.refCollection != null) {
            code += """
                type: mongoose.Schema.Types.ObjectId,
                ref: '${entry.refCollection.name}',
        """
					
	
        } else {
            code += """
                type: ${entry.fieldType},
        """
        }

        // Additional properties based on DSL
        if (entry.status == true) {
            code += """
                required: true,
            """
        }
        if (entry.uniqueKey == true) {
            code += """
                unique: true,
            """
        }

        code += """
            },
        """

        return code
	}
	
	static String generateCRUDOperations(CRUDOperations operationStatement,count) {
		String collectionName = operationStatement.collection.name
		String operationType = operationStatement.type.toLowerCase()
		String code = ""
		
		
		switch (operationType) {
			case "get":
				code += """
    
                const refValue${count} = await ${collectionName}.findOne(${generateEntries(operationStatement)});
                console.log( "task ${operationStatement.getName()} Retrieved value is");
                console.log(refValue${count});  
  
            """
				break;
			case "delete":
				code += """
				
				const refValue${count} = await ${collectionName}.deleteOne(${generateEntries(operationStatement)});
                console.log( "task ${operationStatement.getName()} is deleted"); 
            """
				break;
			case "insert":

				
				code += """
               const refValue${count} = new ${collectionName}(${generateEntries(operationStatement)});
			   const savedValue${count} = await refValue${count}.save();   
               console.log("the value of ${operationStatement.getName()} task inserted is ") 
                console.log(savedValue${count})             
            
            """
				break;
				
				case "update":
				
				code += """
              const refValue${count} = await ${collectionName}.findOneAndUpdate(${generateUpdate(operationStatement)}, { new: true });
               console.log("Task +${operationStatement.getName()}");
                  
            """
				break;
				
		}
		
		return code
	}
	
	
	static String generateEntries(CRUDOperations operationStatement) {
		
		
		if(operationStatement.type=="INSERT" && operationStatement.type=="GET" && operationStatement.type=="DELETE" ) {
			String filter = "{"
			for (entry in operationStatement.entries) {
				filter += "'${entry.valueName}': "
				
				if (entry.valueString != null) {
					
					filter += "'${entry.valueString}'"
				} else if (entry.valueInt != null) {
					
					filter += "${entry.valueInt}"
				}
				filter += ", "
			}
			
			filter = filter.substring(0, filter.length() - 2)
			filter += "}"
		}
		
	}
	
	static String generateUpdate(CRUDOperations operationStatement) {
		//println(operationStatement.entries)
		String filter = "{"
		String update = "{"
		for (entry in operationStatement.entries) {
			switch(entry) {
				case CollectionEntry:
					filter += "'${entry.valueName}': "
				
			    	if (entry.valueString != null) {
						filter += "'${entry.valueString}'"
					} else if (entry.valueInt != null) {
						filter += "${entry.valueInt}"
					}
						filter += ", "
				break
				case UpdateCollectionEntry:
				println(entry)
				update += "'${entry.valueName}': "
			
				if (entry.valueString != null) {
					update += "'${entry.valueString}'"
				} else if (entry.valueInt != null) {
					update += "${entry.valueInt}"
				}
					update += ", "
				break
			}
			
		}
		filter = filter.substring(0, filter.length() - 2)
		filter += "}"
		
		update = update.substring(0, update.length() - 2)
		update += "}"
		String finalResult =filter + ','+ update
		return finalResult
		
	}
	

}
