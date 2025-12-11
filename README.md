# Selenium Test Automation

This repository contains **my full learning journey** through Selenium WebDriver in Java — **from the very basics of browser automation to advanced** concepts such as TestNG, debugging, exception handling, and** the Page Object Model (POM).**

**Each folder represents one module of the course,** completed in sequential order, with hands-on exercises, refactored code, and **notes for practice.**

I also created `GitHub Issues` throughout the process** to document** ideas, doubts, solutions, and study notes — **using Issues as part of my learning workflow.**

---

## About This Repository

This repository contains my complete learning journey through a full Selenium WebDriver course - [link course - udemy](https://www.udemy.com/course/selenium-for-beginners/)

The project is structured like a real-world automation framework and demonstrates hands-on practice with **Java, Selenium, and TestNG.**

---

##  What You Will Find Here

-** Each module may include, depending on its scope and level of completion:**

- Practical automation scripts
- A README explaining the key concepts covered
- Clean and organized code following best practices
- Page Object Model structure when applicable
- Techniques for handling dynamic elements and exceptions
- TestNG suite configuration files
- Logging setup (for modules that implement it)
- A modular Maven structure when relevant

 ## This repository serves both as:
- A study guide, and
- A portfolio showing automation engineering skills.

---

## 📂 Repository Structure
├── 01-WebDriver-Basics <br>
├── 02-Understanding-html-dom <br>
├── 03-Introduction-testNG <br>
├── 04-cross-browser <br>
├── 05-Maximizing-testNG <br>
├── 06-Debugging-selenium <br>
├── 07-Waits-Exception-Handling <br>
├── 08-Page-Object-Model <br>
└── README.md   


Each module contains:

- Source code (`src/main/java`)
- Automated tests (`src/test/java`)
- A module-specific README explaining the topic

---

##  Technologies Used

- Java 17+
- Selenium WebDriver 4.x
- TestNG
- Maven
- Firefox + GeckoDriver
- Log4j2
- Linux / IntelliJ IDEA

---

## 🚀 Key Skills Developed

Throughout this repository, I learned and applied:

### ✔ Selenium Fundamentals
- Finding and interacting with web elements
- XPath, CSS Selectors, and dynamic locators
- Browser automation with multiple drivers

### ✔ Test Automation Engineering
- Designing maintainable test scripts
- Framework organization and modular architecture
- TestNG annotations, groups, parameters, and suites
- **Cross Browser - Firefox/Edge/Chrome **

### ✔ Synchronization & Stability
- Explicit vs. Implicit waits
- Fluent waits
- Handling dynamic and unstable DOM elements

### ✔ Exception Handling
- NoSuchElementException
- TimeoutException
- ElementNotInteractableException
- InvalidElementStateException
- StaleElementReferenceException

### ✔ Page Object Model (POM)
- BasePage + Page classes
- Encapsulation and class responsibilities
- Reusable methods for navigation, waits, interactions

### ✔ Debugging & Best Practices
- Breakpoints
- Evaluate Expression (Alt+F8)
- Reading stack traces and logs

---

## 🧪 How to Run the Tests

1. Install Java & Maven
2. Clone the repository
3. Run any module with:

   ```bash
   mvn clean test

