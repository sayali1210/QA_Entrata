# QA_Entrata
Automation Testing Using Java Selenium for Entrata Website
This project aims to automate testing procedures for the Entrata website using Java, Selenium, TestNG, and Maven.

Project Structure
Group ID: Java_Selenium_Entrata
Artifact ID: Java_Selenium_Entrata_Website
Version: 0.0.1-SNAPSHOT

Description
The project involves automating various test scenarios on the Entrata website using Java Selenium along with TestNG for test management and Maven for project build automation.

Dependencies
WebDriverManager: Version 5.4.1
Automates the management of WebDriver binaries.
Selenium Java: Version 4.11.0
Selenium WebDriver bindings for Java.
TestNG: Version 7.6.1
Testing framework for Java.

Test Scenarios

Test Home Page Title
Verifies the title of the homepage.

Test Sign Button
Checks the presence of the Sign In button.

Test Watch Demo Button
Verifies the presence and clickability of the Watch Demo button.

Test Navigation Bar
Asserts the presence of various dropdowns in the navigation bar.

Verify Social Media Links
Checks the presence of social media links (Twitter, LinkedIn, Facebook).

Click on Accept Cookies Button
Verifies the presence and clickability of the Accept Cookies button.

Verify that Learn More Button Navigates to Another Page
Checks if the Learn More button navigates to the expected URL.

Complete the Form to Read the Full Study
Fills out the form fields to complete a study request.

Execution
The test cases are executed using TestNG. Prior to running the tests, ensure that you have Chrome browser installed and WebDriverManager downloads the necessary ChromeDriver version (version 122.0.6261.94). The tests will open the Entrata homepage in Chrome, perform the specified actions, and assert the expected results.

Test Class
The test class QA_Entrata_web_class contains the actual test methods along with setup and teardown methods defined by TestNG annotations (@BeforeTest, @Test, @AfterTest).

How to Run
To run the tests, execute the test class QA_Entrata_web_class. Ensure that all dependencies are resolved and the WebDriverManager sets up the required WebDriver binaries for Chrome.
