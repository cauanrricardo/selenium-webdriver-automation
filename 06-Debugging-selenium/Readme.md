# Module 06 – Effective Debugging and Logging

This module focuses on establishing a professional diagnostic infrastructure, allowing for reliable test analysis both locally (via debugger) and remotely (via persistent log files). It addresses the crucial difference between reliable, parameterized execution (Maven CLI) and local IDE runs.

## Objectives

- **Implement Industrial-Grade Logging:** Set up the Log4j2 framework using Maven to replace simplistic `System.out.println()` with structured, filterable logs.
- **Master Log Configuration:** Configure the `log4j2.xml` file to define log levels (`INFO`, `DEBUG`) and set up **Appenders** to send output simultaneously to the console and a persistent `.log` file (File Appender).
- **Log Filtering:** Understand and apply log level hierarchies (`DEBUG` vs. `INFO` vs. `ERROR`) to strategically filter output, providing comprehensive diagnostics in files while maintaining a clean console output.
- **Debugging Mastery:** Utilize IDE **Breakpoints** and the **Evaluate Expression** tool (Alt+F8) to inspect variables and test locators in real-time during paused execution.
- **Ensure Execution Reliability:** Differentiate between running tests via **Maven CLI** (which correctly loads `@Parameters` from the XML suite) and running directly from the IDE (F5), and configure the IDE to use the TestNG XML suite.

## Key Concepts Implemented

### Logger Architecture
- **Log4j2 (API, Core):** Core libraries for powerful logging.
- **SLF4J Binding (`log4j-slf4j-impl`):** The crucial bridge dependency to ensure Log4j2 can process logs from third-party libraries like Selenium and TestNG.

### Debugging & Reliability
- **Breakpoints:** Used for halting execution to inspect the WebDriver state and element locators.
- **Diagnostic Logging:** Strategic use of `logger.debug()` to capture actual vs. expected values right before an assertion, making failure diagnosis immediate.