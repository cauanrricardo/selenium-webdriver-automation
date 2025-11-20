
## DriverFactory Class

This class is a utility for creating WebDriver instances to facilitate browser automation testing.

## 📂  Project Structure

The source code is located in the `src/main/java` directory under the package `com.testautomation.core`.

The package contains the main class:

### `DriverFactory.java`

- **Purpose:** Reuse code to create WebDriver instances for different browsers.
- **Functionality:** 
  - Static method `createDriver(String browserName)` that returns a WebDriver instance.
  - Supports browsers: Chrome, Firefox, and Edge.
  - Throws an exception if an unsupported browser name is provided.

## Usage

- Call `DriverFactory.createDriver("chrome")` to get a ChromeDriver instance.
- Call `DriverFactory.createDriver("firefox")` for FirefoxDriver.
- Call `DriverFactory.createDriver("edge")` for EdgeDriver.
- Use the returned WebDriver instance for browser automation and testing.

This centralizes driver creation logic, making it reusable and easier to maintain across test projects.

