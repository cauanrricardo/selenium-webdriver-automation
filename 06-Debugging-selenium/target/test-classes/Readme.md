# 📂 TestNG Suite Configuration

This directory contains TestNG XML configuration files for organizing and executing automated test suites.

## Files

### 1. `Full Regression Suite`
**Location:** `/home/cauanricardoribeiro/Selenium/05-Maximizing-testNG/src/test/resources`

**Purpose:** Comprehensive regression testing suite covering positive and negative login scenarios.

**Test Structure:**
- **Positive Login Test** - Validates successful login functionality
- **Incorrect Username Test** - Tests login with invalid username
- **Incorrect Password Test** - Tests login with invalid password

**Key Features:**
- Uses parameterized testing for negative test cases
- Each negative test has specific error message validation
- All tests execute methods from `com.testautomation.login.LoginTests` class
