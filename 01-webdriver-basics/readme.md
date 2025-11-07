# Module 01 – WebDriver Basics

This module covers the fundamental concepts of Selenium WebDriver in Java, using Maven as the build and dependency management tool.
All exercises were built and executed using **IntelliJ IDEA** and **Firefox** on Linux.

---

## Objectives

- Understand the role of Selenium WebDriver in web automation.
- Configure a Java project with Maven dependencies.
- Learn how to open browsers, navigate between pages, and retrieve page information.
- Apply exception handling and code reusability principles using a `DriverFactory` class.
- Prepare for interaction with HTML elements and the DOM in the next module.

---

## 📂 Project Structure

* `01-webdriver-basics`


  ##  Exercise Summary


  | Exercise                    | Topic              | Description                                                     |
  | :-------------------------- | :----------------- | :-------------------------------------------------------------- |
  | **Ex01_OpenSites**          | Opening pages      | Opens multiple URLs, prints each page title.                    |
  | **Ex02_DriverFactory**      | Code reusability   | Uses a central`DriverFactory` to manage browser creation.       |
  | **Ex03_Navigation**         | Browser navigation | Practices`Maps().to()`, `back()`, and `forward()`.              |
  | **Ex04_HandlingExceptions** | Exception handling | Uses`try-catch-finally` to handle connection errors gracefully. |
  | **Ex05_PageInformation**    | Page analysis      | Opens a test website, prints page title and current URL.        |
