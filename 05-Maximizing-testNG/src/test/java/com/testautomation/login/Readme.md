# Login Tests - Test Automation

## Overview
Java-based TestNG test class for automating login functionality testing on a practice test automation website.

## Class Details
- **Package:** `com.testautomation.login`
- **Class:** `LoginTests`
- **Framework:** TestNG with Selenium WebDriver

## Test Structure

### Setup & Teardown Methods
- **`setUp()`** - Initializes Firefox WebDriver before each test method
- **`tearDown()`** - Closes browser after each test method
- Both methods use `alwaysRun = true` to ensure execution regardless of test outcome

### Test Methods

#### 1. `testLoginFunctionality()` - Positive Login Test
**Groups:** `positive`, `regression`, `smoke`

**Test Flow:**
1. Navigate to `https://practicetestautomation.com/practice-test-login/`
2. Enter valid credentials:
   - Username: `student`
   - Password: `Password123`
3. Click submit button
4. Add 2-second wait for page load
5. Perform validations:
   - Verify URL contains `practicetestautomation.com/logged-in-successfully/`
   - Verify page contains success message: "Congratulations student. You successfully logged in!"
   - Verify Logout button is displayed

#### 2. `testLoginNegative()` - Negative Login Test
**Groups:** `negative`, `regression`
**Parameters:** `username`, `password`, `expectedErrorMessage`

**Test Flow:**
1. Navigate to login page
2. Enter provided credentials (parameterized)
3. Click submit button
4. Validate error message:
   - Verify error message element is displayed
   - Verify error message text matches expected parameter

## Dependencies
- **DriverFactory** - Custom factory for WebDriver instantiation
- **Selenium WebDriver** - Browser automation
- **TestNG** - Testing framework

## Test Data
- **Positive Test:** Uses hardcoded valid credentials
- **Negative Tests:** Parameterized via TestNG XML files
- **Base URL:** `https://practicetestautomation.com/`

## Usage
Tests can be executed:
1. Individually via IDE/TestNG
2. Through TestNG XML suites (parameterized negative tests)
3. By test groups (`smoke`, `regression`, `positive`, `negative`)

## Notes
- Includes explicit Thread.sleep for demonstration (consider using explicit waits in production)
- Uses CSS selector for logout button: `.wp-block-button__link`
- Error message element ID: `error`
- Form element IDs: `username`, `password`, `submit`
