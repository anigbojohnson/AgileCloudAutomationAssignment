Retake Project Instructions

Project Overview:
The project involves creating a runnable JavaScript file that establishes a connection to a MongoDB database and executes user-provided queries in a Domain Specific Language (DSL). The DSL examples, "example1.mydsl1" and "example2.mydsl1," are crucial for the project and should be placed in the directory at the relative path of  "/org.xtext.example.mydsl1/resources" The generated node JS synthex can be checked with nodeJS IDE.

Requirements:

Software Dependencies:

Install .groovy and Ecore tools.
DSL examples ("example1.mydsl1" and "example2.mydsl1") must be added to "co7217.miniproject2.parent/co7217.miniproject2/src/main/resources/."
NodeJS Installation:

Install NodeJS v20 or above on your local system from https://nodejs.org/en/download/.
Configure NodeJS and npm on your system.
Verify the installation with the command node --version which must be at least v20.8.0 
verify npm with "npm --version" . it must be atleast 9.8.1.

Install xtext from eclipse market place which you can locate at help tab

Generate Xtext Artifacts:

1. Locate "MyDsl.xtext" at "/org.xtext.example.mydsl1/src/org/xtext/example/mydsl1/MyDsl.xtext" and Right-click on the file, choose "Run As," and select "Generate Xtext Artifacts."
2. Locate "GenerateMyDsl.mwe2" at "/org.xtext.example.mydsl1/src/org/xtext/example/mydsl1/GenerateMyDsl.mwe2" and Right-click on the file, choose "Run As," and select "mwe2 workflow" and "run configuration"
3. create a new configuration and run .
4. create a new project and then create a file inside it with extension ".mydsl1",
5. Here you can define your DSL 

Compile DSL Compiler:

1. Locate "Retake.groovy" at "/org.xtext.example.mydsl1/src/org/xtext/example/mydsl1/generator/Retake.groovy"
Right-click on the file, choose "Run As," and select "Groovy console"

2. A groovy console will be displayed, then select "run"  to generate an output. 

3. After step 2, the output file is generated at "/org.xtext.example.mydsl1/resources/output.js"
Open a terminal at the location and run the command node output.js.
Executing Different Examples:

4. the output node js file will be displayed with no synthex error in your IDE like VS code. 
