# 📂 Project Structure

The source code is located in the `main/java` directory under the package `br.com.cauan`.
The `br.com.cauan` package contains two main classes:

### 1. `SeleniumDemo.java`

* **Purpose:** This class serves as a simple **test** and demonstration of basic Selenium functionality.
* **Functionality:**
    * It contains a `main` method that executes the demonstration.
    * The private static method `firefoxTest(String url)` **instantiates a `FirefoxDriver`**, navigates to a specified URL (in the example, `https://www.google.com/`), retrieves the page title, and **closes the browser** using `driver.quit()`.
    * The code includes a comment indicating it's the author's first code using Selenium.

### 2. `DriverFactory.java`

* **Purpose:** This class is designed to be a utility for **code reuse** in managing WebDriver instances.
* **Functionality:**
    * It provides a static method, `createFirefoxDriver()`.
    * This method **instantiates a new `FirefoxDriver`**, **maximizes the browser window** (`driver.manage().window().maximize()`), and returns the configured `WebDriver` instance, ready for use in tests or other automation tasks.
    * This pattern helps centralize the driver creation logic.
