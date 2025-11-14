# Module 03 – TestNG Introduction

This module introduces the **TestNG testing framework** and its integration with Selenium WebDriver.  
It focuses on structuring automated test cases with setup and teardown methods, and validating results using assertions.

## 📁 Project Structure

The test classes are located in the `src/test/java/com/testautomation/logintests` package:

| Test Class                | Description |
|---------------------------|--------------|
| **PositiveLoginTests**    | Validates successful login using correct username and password. |
| **NegativeLoginTests**  | Verifies login failure when using an incorrect username and password. |



##  Key Learning Points

- Using **@BeforeMethod** and **@AfterMethod** for setup and teardown.
- Implementing **assertions** with TestNG (`Assert.assertTrue`, `Assert.assertEquals`).
- Executing automated browser tests using Selenium.
- Structuring modular test classes for better readability and maintenance.

## Running the Tests

Run all TestNG tests via Maven:
```bash
mvn test

