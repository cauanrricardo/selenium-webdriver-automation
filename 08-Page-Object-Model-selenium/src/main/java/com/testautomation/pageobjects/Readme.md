# Page Objects Documentation

## Overview

This documentation describes the Java Page Object Model classes for test automation using Selenium WebDriver.

## Package Structure

All classes are located in the `com.testautomation.pageobjects` package.

## Class Descriptions

### BasePage
The foundation class providing common WebDriver functionality and reusable methods.

### ExceptionsPage
Page object for handling dynamic elements and exceptions in test scenarios.

### LoginPage
Page object for login functionality testing.

### SuccessfulLoginPage
Page object for post-login success page.

## Key Design Patterns

1. **Page Object Model (POM)**
   Each page has its own class with encapsulated locators and methods.

2. **Inheritance**
   All page classes extend BasePage for common functionality.

3. **Explicit Waits**
   Uses WebDriverWait for reliable element interactions.

4. **Method Chaining**
   `executeLogin()` method returns the next page object for fluent navigation.

## Implementation Notes

### Base Class Features

- **Reusable utilities**: Common Selenium operations wrapped with waits
- **Error handling**: `isDisplayed()` handles `NoSuchElementException`
- **Configuration**: 10-second default wait timeout

### Page-Specific Implementations

- **ExceptionsPage**: Handles dynamic UI changes and confirmation messages
- **LoginPage**: Contains both individual step methods and complete flow method
- **SuccessfulLoginPage**: Simple page for post-login verification

### Testing URLs

- **Login Page**: https://practicetestautomation.com/practice-test-login/
- **Exceptions Page**: https://practicetestautomation.com/practice-test-exceptions/

### Dependencies

- Selenium WebDriver
- Java 8+ (uses `java.time.Duration`)
