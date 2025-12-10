# LoginTests 

The purpose of this document is to explain what the test does, required dependencies, how to run it, and execution examples.

## Overview 
- Read and documented the behavior of the `LoginTests.java` file.
- Created clear instructions  about prerequisites, execution, and configuration for running these Selenium + TestNG-based automation tests.

## What `LoginTests` Does
The class contains two main tests using the Page Object pattern:

1. `testLoginFunctionality` (groups: `positive`, `regression`, `smoke`)
   - Positive test that:
     - Opens the login page via `LoginPage.visit()`.
     - Performs login with fixed credentials `student` / `Password123`.
     - Validates that the loaded URL contains `logged-in-successfully`.
     - Validates that the success message `Congratulations student. You successfully logged in!` is present in the page content.
     - Verifies that the logout button is visible (`isLogoutButtonDisplayed()`).

2. `testLoginNegative` (groups: `negative`, `regression`)
   - Negative parameterized test:
     - Receives `username`, `password`, and `expectedErrorMessage` via TestNG parameters.
     - Executes login with the provided credentials.
     - Verifies that the error message returned by `LoginPage.getErrorMessage()` matches the `expectedErrorMessage`.

## Test Lifecycle
- `@BeforeMethod setUp()` creates a Firefox driver (`DriverFactory.createFirefoxDriver()`) and logs the page title.
- `@AfterMethod tearDown()` terminates the WebDriver (`driver.quit()`).

## Dependencies Used
- Selenium WebDriver
- TestNG
- Log4j2 for logging
- Page Object Pattern (classes `LoginPage` and `SuccessfulLoginPage`)
