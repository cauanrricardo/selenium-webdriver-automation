package com.testautomation.logintests;

import com.testautomation.core.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NegativeUsernameTest {

    private WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = DriverFactory.createFirefoxDriver();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    @Test
        public void testLoginNegativeUsername(){
//        Test case 2: Negative username test
//
//        Open page
        driver.get("https://practicetestautomation.com/practice-test-login/");
//        Type username incorrectUser into Username field
        driver.findElement(By.id("username")).sendKeys("incorrectUser");
//        Type password Password123 into Password field
        driver.findElement(By.id("password")).sendKeys("Password123 ");
//        Push Submit button
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
        WebElement erroMessage = driver.findElement(By.id("error"));
//        Verify error message is displayed
        Assert.assertTrue(erroMessage.isDisplayed());
//        Verify error message text is Your username is invalid!
        Assert.assertEquals(erroMessage.getText(), "Your username is invalid!" );

    }
}
