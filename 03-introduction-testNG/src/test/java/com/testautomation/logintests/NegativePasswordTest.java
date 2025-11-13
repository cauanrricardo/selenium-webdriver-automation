package com.testautomation.logintests;

import com.testautomation.core.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NegativePasswordTest {

    private WebDriver driver;

    @BeforeMethod
    void setup() {
        driver = DriverFactory.createFirefoxDriver();
    }

    @AfterMethod
    void teardown() {
        driver.quit();
    }

    @Test
    public void testLoginNegativePassword(){
//        Test case 3: Negative password test
//
//        Open page
        driver.get("https://practicetestautomation.com/practice-test-login/");
//        Type username student into Username field
        driver.findElement(By.id("username")).sendKeys("student");
//        Type password incorrectPassword into Password field
        driver.findElement(By.id("password")).sendKeys("incorrectPassword");
//        Push Submit button
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
        WebElement errorMessage = driver.findElement(By.id("error"));
//        Verify error message is displayed
        Assert.assertTrue(errorMessage.isDisplayed(), "Error message should be visible");
//        Verify error message text is Your password is invalid!
        Assert.assertEquals(errorMessage.getText(), "Your password is invalid!", "Incorrect error message text");

    }
}
