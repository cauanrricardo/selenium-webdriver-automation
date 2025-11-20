# Module 04 – Cross-Browser Testing

This module demonstrates cross-browser test automation using Selenium WebDriver with TestNG. It shows how to run the same test suite across multiple browsers to ensure compatibility and consistent behavior

## 📁 Project Structure

The test classes are located in the `src/test/java/com/testautomation/login` package:

| Test Class                | Description |
|---------------------------|--------------|
| **PositiveLoginTests**    | Validates successful login using correct username and password. |
| **NegativeLoginTests**  | Verifies login failure when using an incorrect username and password. |



##  Key Learning Points

- Using **@BeforeMethod** and **@AfterMethod** for setup and teardown.
- Implementing **assertions** with TestNG (`Assert.assertTrue`, `Assert.assertEquals`).
- Executing automated browser tests using Selenium.
- Structuring modular test classes for better readability and maintenance.
- Parameterized browser configuration via TestNG XML suites.
- Cross-browser test execution using Driver Factory pattern.
- Performance comparison between different browsers.

##  Cross-Browser Support

Tests run on multiple browsers through parameterization:

   -  Microsoft Edge
  - Mozilla Firefox

## Running the Tests

Run all TestNG tests via Maven:
```bash
mvn test

