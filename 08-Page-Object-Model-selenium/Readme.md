# Module 08 – Page Object Model (POM) in Selenium
This module focuses on implementing the **Page Object Model (POM)** to build cleaner, reusable, and maintainable Selenium test automation frameworks.
Objectives

- Understand the Page Object Model (POM) design pattern
- Create reusable Page Classes
- Use a BasePage to centralize common actions
- Improve test readability & maintainability
- Apply OOP principles (Inheritance & Encapsulation)
- Write cleaner test classes using Page Objects

## Key Concepts Implemented

- BasePage handling:
    -  WebDriver and WebDriverWait
    -  Common methods: visit(), waitForElement(), click(), sendKeys(), isDisplayed(), etc.
- LoginPage and SuccessfulLoginPage following POM structure
- ExceptionsPage refactored using Page Objects
- Tests become smaller and easier to understand

## Benefits of Using POM

- Reduces code duplication
- Makes tests more readable
- Centralizes element locators
- Easier maintenance when UI changes
- Enhances scalability of the automation framework

_Exercises in this module were implemented using IntelliJ IDEA, Firefox, Maven, and TestNG on Linux._
