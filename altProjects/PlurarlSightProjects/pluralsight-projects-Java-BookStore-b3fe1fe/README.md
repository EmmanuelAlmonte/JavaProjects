<!-- In order to run app enter following command in cli   -->

- mvn clean install tomcat7:run

<!-- After visit this URL  -->

- localhost:8080/books/list

<!-- To run Tests in CLI type  -->

- "mvn -P integration verify"

<!-- Currently after running tests for the first time all tests fail as expected by the end all tests should pass. -->
<!-- After completing each section -->

- "run mvn -q -Pintegration -Dit.test=Module1\_\* verify"
