# traini8
 traini8 Assignment
Project SETUP 
Step 1: Prerequisite 
1. Install Java 21 LTS 
Java 21 is the latest Long-Term Support version, supported by Spring Boot 3.x, offering modern features 
and stability. 
2.  Install Eclipse Java EE IDE 
Eclipse Java EE provides tools for enterprise Java development, including Maven and Spring support. 
3.  Install Maven (Optional, as Eclipse has it built-in) 
Maven manages dependencies and builds, though Eclipse’s embedded Maven is usually sufficient. 
Use  maven.apache.org to download  apache-maven-3.x.x-bin.zip. 
And  Extract to C:\maven or /usr/local/maven. 
4. Install Postman(for API Testing) 
Postman simplifies API testing with a GUI this really helps in testing process 
Step 2: Create the Maven Project 
1) Start a New Maven Project 
Sets up the foundation for a Spring Boot app. 
o In Eclipse: File > New > Maven Project. 
o Check "Create a simple project (skip archetype selection)" > Next. 
o Group Id: com.traini8 - Namespace for your project. 
o Artifact Id: traini8-mvp - Project name. 
o Version: 0.0.1-SNAPSHOT - Development version. 
o Packaging: jar - Spring Boot uses JAR with embedded Tomcat. 
o Click Finish. 
Step 3: Extract Backend_Traini8_vanshika_jain.zip 
o Extract the given zip file into the project 
o Right Click on the project  
o Select Mavan > update Project 
This will download all the necessary modules and packages 
Step 5: Verify Setup 
Build the Project 
• Ensures dependencies and configuration are correct. 
o Right-click traini8-mvp > Run As > Maven Build…. 
o Goals: clean install > Run. 
o Check Console for "BUILD SUCCESS." 
Run the Application 
• Why: Starts the Spring Boot server. 
• How: 
o Right-click Traini8MvpApplication.java > Run As > Java Application. 
o Console shows: 
Tomcat started on port(s): 8080 (http) 
Started Traini8MvpApplication in X.XXX seconds 
Test Basic Setup 
o Browser: http://localhost:8080 → "Whitelabel Error Page" (normal, no root endpoint yet). 
o H2 Console: http://localhost:8080/h2-console → Login with jdbc:h2:mem:traini8db, sa, no 
password. 
Step 6: Final Test 
• Test APIs: Use Postman or curl after coding the APIs. 
