# QA Automation Exercise
## Task 1

### Runtime Environment:
Java 1.8 + Maven

### Third party libraries:
TestNG - test runner

Allure Report - Test Reporting

OKhttp - Send HTTP request and get the response

Gson - Json Serialization and deserialization.

### How to setup test cases to be executed:
By configure the testng.xml file.

### How to Run the test:
Type “mvn clean test” in Terminal to trigger automation execution. The allure-results folder will be generated with result files inside.

### How to generate HTML Allure Report:
Type “libs/allure-2.17.2/bin/allure generate allure-results/ -o allure-report/html --clean” in Terminal to generate HTML report.

### Test Design and Test Cases
1. Verify different languages en/tc/cs/ got correct response.
2. Verify all response item type, value and format match the spec document.



