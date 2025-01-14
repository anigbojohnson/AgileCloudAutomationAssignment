package org.xtext.example.mydsl.generator


import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.resource.XtextResourceSet

import com.google.inject.Injector

import org.xtext.example.mydsl.MyDslStandaloneSetup
import org.xtext.example.mydsl.myDsl.ConnectionStatement
import org.xtext.example.mydsl.myDsl.CollectionFieldDefination
import org.xtext.example.mydsl.myDsl.Model
import org.xtext.example.mydsl.myDsl.CollectionEntry
import org.xtext.example.mydsl.myDsl.MongoDB

import org.xtext.example.mydsl.myDsl.CRUDOperationAndCollectionSchema


import org.xtext.example.mydsl.myDsl.CollectionSchema;
import org.xtext.example.mydsl.myDsl.CRUDOperations;
import java.io.File

class ExcerciseFive {
	/**
	 * Generates MongoDB code for connection and schema definition.
	 */
	def static performOperation = 0
	def static modelList = []
	def static count=0
	
	
	static void main(String[] args) {
	
		def injector = new MyDslStandaloneSetup().createInjectorAndDoEMFRegistration()
		// obtain a resource set from the injector

		// obtain a resourceset from the injector
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class)

		def path = "C:/Users/THOMPSON ANIGBO/eclipse-workspace/org.xtext.example.mydsl/Resources/example1.mydsl" // Adjust the path to your DSL file
		
		// load a resource by URI, in this case from the file system
		Resource resource = resourceSet.getResource(URI.createFileURI(path), true)

		def mongo =(MongoDB)resource.getContents().get(0)
		
		/**
		 * TODO: Use a traversal strategy and call code templates
		 */

		def text = traverse(mongo.models)

		// Write the generated code to a file
		// Adjust the output file path as needed
		def output = new File("C:/Users/THOMPSON ANIGBO/eclipse-workspace/org.xtext.example.mydsl/resources/output.js")
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
			
			case ConnectionStatement:
				text += generateMongoDBConnectionCode(element)
			break;
			
			case CRUDOperationAndCollectionSchema:
				if(element.schema)
					text += generateMongoDBSchema(element.schema)
					text += traverse(element.schema.defination)
					
					text += """
               }, {
                    timestamps: true,
                 });
               """
				//	text+=traverse(element.defination)
				if(element.operations) {
					text += """
               (async () => {
                             try{
                               await connect()"""
					for (model in modelList)
						text += generateModel(model)
					text+=traverse(element.operations)
					
					text +=  """
                         }catch(e){
                             console.log(e.errmsg)
                      }
                    })();"""  
				}
			break
			case CRUDOperations:
			
			   text+=generateCRUDOperations(element)
			   break
			case CollectionFieldDefination:		       
					text += generateSchemaField(element)
					break
			case CollectionEntry:
			
			text += generateEntries(element)
			break
			}
		
	return text;	
	
	
	}
	//const User = mongoose.model('User', userSchema);
	//return word.substring(0, 1).toLowerCase() + word.substring(1)
	
	def static String generateModel(String collectionName) {
		def text =""
		text += 	"""
				const ${ collectionName} = mongoose.model("${ collectionName}",${ collectionName.substring(0, 1).toLowerCase()+ collectionName.substring(1)}Schema);
			"""
		
		return text
	}
	def static String generateMongoDBSchema(CollectionSchema schema) {
		
		modelList.add(schema.getName())
		
	   String code = """
           const ${schema.name.toLowerCase()}Schema = new mongoose.Schema({
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
	
	static String generateSchemaField(CollectionFieldDefination entry) {

		
	
		
		
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
	
	static String generateCRUDOperations(CRUDOperations operationStatement) {
		String collectionName = operationStatement.collection.name
		String updateOperation = operationStatement.updateOperation.toString().toLowerCase()

		String operationType = operationStatement.type.toString().toLowerCase()
		String code = ""
		String filter = "{"
		switch (operationType) {
			case "get":
			String entriesObject=traverse(operationStatement.entries)
			entriesObject =entriesObject.substring(0, entriesObject.length() - 2)
				code += """
    
                const refValue${count} = await ${collectionName}.findOne(${"{"+entriesObject+"}"});
                console.log( "task ${operationStatement.getName()} Retrieved value is");
                console.log(refValue${count});  
  
            """
				count++
				break;
			case "delete":
				String entriesObject=traverse(operationStatement.entries)
				entriesObject =entriesObject.substring(0, entriesObject.length() - 2)
				code += """
				
				const refValue${count} = await ${collectionName}.deleteOne(${"{"+entriesObject+"}"});
                console.log( "task ${operationStatement.getName()} is deleted"); 
            """
				count++
				break;
			case "insert":

			String entriesObject=traverse(operationStatement.entries)
			entriesObject =entriesObject.substring(0, entriesObject.length() - 2)
			
			
				code += """
               const refValue${count} = new ${collectionName}(${"{"+entriesObject+"}"});
			   const savedValue${count} = await refValue${count}.save();   
               console.log("the value of ${operationStatement.getName()} task inserted is ") 
                console.log(savedValue${count})             
            
            """
				count++
				break;
		
				
				
		}
		if(updateOperation =='update') {
			String inputObject =""
			
			def criteriaObject=""
			if(operationStatement.entries) {
				inputObject=traverse(operationStatement.entries)
				inputObject =inputObject.substring(0, inputObject.length() - 2)
			}
			
			if(operationStatement.criteria) {
				criteriaObject=traverse(operationStatement.criteria)		
				criteriaObject =criteriaObject.substring(0, criteriaObject.length() - 2)
			}
			code += """
              const refValue${count} = await ${collectionName}.findOneAndUpdate(${"{"+criteriaObject +"},"+"{"+inputObject +"},{ new: true }"});
               console.log("Task +${operationStatement.getName()}");
                  
            """
			
				  count++
		}
		return code
	}
	
	
	static String generateEntries(CollectionEntry entry) {
		
		
			
			String filter = ""
	
				filter += "'${entry.valueName}': "
				
				if (entry.valueString != null) {
					
					filter += "'${entry.valueString}'"
				} else if (entry.valueInt != null) {
					
					filter += "${entry.valueInt}"
				}
				filter += ", "
			
			
		
		
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
				case entry.updateEntries:
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
