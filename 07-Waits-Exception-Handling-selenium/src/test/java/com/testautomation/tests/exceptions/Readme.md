# Exceptions Tests

This project contains test cases demonstrating common Selenium WebDriver exceptions and how to handle them using explicit waits.

## Overview

The tests simulate various exception scenarios on a practice web page to illustrate proper wait strategies in Selenium automation. Each test focuses on a different exception type and shows how to prevent or handle it.

## Test Structure

- **Browser Setup**: Tests run in Firefox using a DriverFactory
- **Page**: https://practicetestautomation.com/practice-test-exceptions/
- **Framework**: TestNG with Log4j logging
- **Wait Strategy**: Explicit waits with WebDriverWait

## Test Cases

### 1. NoSuchElementException Test
Tests handling of dynamically added elements. Uses explicit wait to ensure an element is visible before interacting with it.

### 2. TimeoutException Test  
Demonstrates proper timeout configuration when waiting for element visibility.

### 3. ElementNotInteractableException Test
Shows how to handle elements that may not be immediately ready for interaction. Tests saving data in a dynamically added form.

### 4. InvalidElementStateException Test
Tests editing and saving data in an existing form field, demonstrating proper element state management.

### 5. StaleElementReferenceException Test
Demonstrates handling of elements that become stale (removed from DOM) after page changes.

## Key Features

- Uses explicit waits with timeouts (6-10 seconds)
- Logs all test steps with Log4j
- Proper test cleanup with @AfterMethod
- Assertions for verification of test results
- Demonstrates waiting for various conditions:
  - Element visibility
  - Element invisibility
  - Element interactability
