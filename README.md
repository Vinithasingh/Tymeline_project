Automated Google Search Testing with Selenium
This project contains an automated test suite to test Google search functionality using Selenium WebDriver. The test suite includes test cases related to recent 
sensitive searches, specifically testing Google search for the query"Recent rape cases happening in India".while considering ethical and privacy aspects.

Prerequisites
Before running this project, ensure you have the following installed on your system:
Java Development Kit (JDK) (version 8 or later)
Apache Maven
Google Chrome or Mozilla Firefox installed
ChromeDriver or GeckoDriver depending on your browser choice

Project Structure
├── src
│   ├── main
│   └── test
│       ├── java
│       │   └── com
│       │       └── testcases
│       │           └── GoogleSearchTest.java
│       └── resources
├── pom.xml
└── README.md

Key Files
pom.xml: Maven configuration file to manage project dependencies, including Selenium and TestNG/Pytest (optional).
GoogleSearchTest.java: This is the main test file that contains the test cases to automate Google search functionality using Selenium WebDriver.
testng.xml (Optional): Configuration for running tests with TestNG.

Test Scenarios
1. Basic Google Search Test
Verifies that Google search is functional.
Ensures that results are returned for the query: "Recent rape cases happening in India."
2. Additional Test Scenarios
positive test cases
Verify that Google search functionality works for different related queries and returns expected results.
Verify that pagination is functioning properly by navigating to the second and third pages of Google search results.
Verify that whether Google provides auto-suggestions when typing the query and validate the top suggestion.
Verify if Google search results return content that is recent and relevant to the query.
negative test cases
Verify that Google search functionality works for invalid queries gracefully.
Enter a search query with an unusually large number of characters
Enter queries with excessive special characters or symbols 
Verify behavior when no input is provided

Assumptions
The project assumes that the user has an internet connection to access Google search.
Browser drivers should be set up and configured correctly for tests to run smoothly.
Ethical handling of sensitive content has been considered, and no sensitive data is stored or processed beyond the search results.

Reporting and Logs
Test results and execution logs can be found under the seleniumwebdriverproject\target after running the tests.
if you want to see my test report search for (seleniumwebdriverproject\target\ExtentReports.html) and download the file

Future Enhancements
Add more test cases to cover a broader range of functionalities, such as image search and news search.
Integrate with CI/CD pipelines for continuous testing and reporting.

