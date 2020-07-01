This is a springboot application to manage user and projects

To build the application
1- go to the project directory which has the pom.xml
2- run the command mvn clean install

To run the application
1- go to the project directory where you can see the "target" dir
2- run the command    java -jar target/user-projects.jar


To test the application invoke the below endpoints 
1- GET user's projects             http://localhost:8080/projects/{username}
2- GET user's project by projectid http://localhost:8080/projects/{username}/{projectid}
