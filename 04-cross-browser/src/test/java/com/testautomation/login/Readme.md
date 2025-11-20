# Module 04 – Cross-Browser Testing

This module focuses on cross-browser test automation using Selenium WebDriver with TestNG parameterization. It demonstrates how to execute the same test scenarios across multiple browsers to ensure compatibility.

## 📁 Project Structure

The test classes are located in the `src/test/java/com/testautomation/logint` package:

| Test Class                | Description |
|---------------------------|--------------|
| **PositiveLoginTests**    | Validates successful login using correct username and password. |
| **NegativeLoginTests**  | Verifies login failure when using an incorrect username and password. |



##  Key Learning Points

- Using **@BeforeMethod** and **@AfterMethod** for setup and teardown.
- Implementing **assertions** with TestNG (`Assert.assertTrue`, `Assert.assertEquals`).
- Parameterized browser configuration via TestNG XML suites.
- Cross-browser test execution using Driver Factory pattern.
- Performance comparison between different browsers.

## Running the Tests

Run all TestNG tests via Maven:
```bash
mvn test
