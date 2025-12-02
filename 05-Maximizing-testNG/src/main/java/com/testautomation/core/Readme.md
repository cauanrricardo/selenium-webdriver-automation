# 📂 Project Structure

The source code is located in the `main/java` directory under the package `com.testautomation`.
The `com.testautomation.core` package contains main classes:
###  `DriverFactory.java`
Creates and returns a Firefox WebDriver instance with predefined configurations suitable for headless automated testing.
### Configuration Details

The method configures the Firefox driver with the following options:
**Headless Mode**
  - eadless: Runs Firefox in headless mode (no GUI displayed)
  -  Ideal for `CI/CD pipelines`, server environments, and faster test execution

 **Window Size**
  - width=1920: Sets browser window width to 1920 pixels
  - height=1080: Sets browser window height to 1080 pixels
  - Ensures consistent viewport size for visual testing and responsive design validation
  - 
**Returns**
  - WebDriver: A configured `Firefox WebDriverFirefox` WebDriver instance ready for use in **test automation**



