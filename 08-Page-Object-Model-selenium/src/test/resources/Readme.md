# TestNG Regression Suite Overview

contains a general TestNG regression suite used to organize and execute login test scenarios. The suite includes both positive and negative test cases and defines how each test should run within the automation framework.

## Suite Purpose

The suite is designed to run a complete regression for the login functionality. It ensures that both successful and failing authentication flows are validated consistently.

## Test Structure

The suite includes:

### Positive Login Test
Validates that a user with correct credentials can successfully log in.

### Negative Login Tests
Two tests validate error handling for incorrect authentication attempts:
- One test checks the behavior when an invalid username is provided.
- Another test checks the behavior when the password is incorrect.

## Parameters

Negative tests use parameters to define:
- Username
- Password
- Expected error message

These parameters allow dynamic execution and consistent validation of error handling.

## Execution Behavior

Each test specifies:
- The test class to be executed
- The specific method included for that scenario
- Any required input parameters

This ensures controlled, repeatable, and organized execution across different login conditions.
