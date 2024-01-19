# Selenium-WebDriver-TestSuite
End-to-End Test Suite using Selenium WebDriver for User Registration on a Magento Demo Site

# Selenium User Registration Test for Magento Commerce Demo

## Overview
This repository contains a Selenium WebDriver script written in Java for automating the user registration process on the Magento Commerce Demo website. The script is designed to test and validate various scenarios related to user onboarding and account management.

## Test Case Details

### Test Environment
Magento Commerce Demo is specifically designed for testing and exploring features.
Link: [Magento Commerce Demo](https://magento-demo.lexiconn.com/)

### Scenario: User Registration and Profile Management

#### Scenario Overview
As a QA tester, the objective is to ensure a seamless and secure user registration and profile management process on an e-commerce website. The focus is on identifying and validating various scenarios related to user onboarding and account management.

### Test Steps
1. **Setup:**
   - Open the Chrome browser.
   - Configure ChromeOptions to accept insecure certificates.

2. **Test: User Registration:**
   - Navigate to the user registration page on Magento Commerce Demo.
   - Fill in the registration form with valid user data.
   - Submit the registration form.
   - Verify that the registration is successful.

3. **Teardown:**
   - Close the Chrome browser.

### Test Data
- Valid user data for registration (firstname, lastname, email_address, password).

### Expected Results
1. The user should be successfully registered.
2. The system should display a confirmation message.

### Notes
- Warnings related to CDP version may appear; consider including a specific version of the CDP in project dependencies.

## How to Run the Test

### Prerequisites
1. Ensure you have Java installed on your machine.
2. Download the [ChromeDriver](https://sites.google.com/chromium.org/driver/) executable and set the path in the script.

### Running the Test
1. Clone this repository to your local machine.
2. Open the project in your preferred Java IDE.
3. Run the `UserRegistrationTest` class as a TestNG test.

## Test Execution Output
PASSED: testUserRegistration

===============================================
    Default test
    Tests run: 1, Failures: 0, Skips: 0
===============================================

===============================================
Default suite
Total tests run: 1, Passes: 1, Failures: 0, Skips: 0
===============================================


## Author
G.H.Nishadi Anuththara


