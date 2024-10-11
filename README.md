Baykar Kariyer Website Testing Project
This repository contains the test automation and manual test documentation for the Baykar Kariyer (https://kariyer.baykartech.com/) website. The project focuses on ensuring the quality and functionality of key features through thorough manual and automated testing.

Project Overview
Manual Tests:
Scope: Prepared test scenarios and documentation for the Baykar Kariyer website.
Focus Areas: Navigation bar functionality, language switch validation, and job filtering/search functionality.
Automation Tests:
Language: Java
Frameworks & Tools:
JUnit/TestNG/Cucumber: Test structure and execution.
Selenium WebDriver: Browser automation.
WebDriverWait/ExpectedConditions: Handling dynamic waits.
Cucumber/Gherkin: Behavior-driven development.
Maven: Build automation and dependency management.
Test Scenarios
Navigation Bar Automation:

Ensures that all elements in the navigation bar are clickable and the correct pages load without errors.
The test is designed to be dynamic: if new elements are added to the navbar, the automation doesn't require updates. Clicking and validation are handled in a loop within a single method.
Language Switch Automation:

Validates that users can switch between languages provided by the site and ensures that the correct language is displayed.
The automation is static: it verifies the site’s supported languages and checks that the elements are correctly displayed after a language switch.
Job Position Search & Filter Automation:

Users can search for open positions and filter by departments.
The automation uses a data-driven approach, dynamically pulling departments and positions from the site. It ensures that the position title displayed matches or contains the input provided by the user.
Key Principles
The code follows DRY, SOLID, and OOP principles to ensure maintainability and scalability.
Functional and black-box testing methodologies are applied.
