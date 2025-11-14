## 📂 Project Structure

The source code is located in the `src/main/java` directory under the package `com.testautomation.core`.

The package currently contains the following main class:

---

### `DriverFactory.java`

* **Purpose:** This class is designed to be a utility for **code reuse** in managing WebDriver instances.
* **Functionality:**
    * It provides a static method, `createFirefoxDriver()`.
    * This method **instantiates a new `FirefoxDriver`**, **maximizes the browser window** (`driver.manage().window().maximize()`), and returns the configured `WebDriver` instance, ready for use in tests or other automation tasks.
    * This pattern helps centralize the driver creation logic.

