package com.testautomation.login;


import com.testautomation.core.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginTests{
    WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        driver = DriverFactory.createFirefoxDriver();
    }
    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }
    @Test(groups = {"positive", "regression", "smoke"})
    public void  testLoginFunctionality(){
//    Test case 1: Positive LogIn test
        driver.get("https://practicetestautomation.com/practice-test-login/");

        WebElement usernameInput = driver.findElement(By.id("username"));
        usernameInput.sendKeys("student");

        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("Password123");

        WebElement SubmitButton = driver.findElement(By.id("submit"));
        SubmitButton.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//    Verify new page URL contains practicetestautomation.com/logged-in-successfully/
        String expectUrl = "https://practicetestautomation.com/logged-in-successfully/";
        String actualUrl = driver.getCurrentUrl(); //get the current Url
        Assert.assertEquals(actualUrl, expectUrl); //testNG

//    Verify new page contains expected text ('Congratulations' or 'successfully logged in')
        String expectMessage = "Congratulations student. You successfully logged in!";
        String pageSource = driver.getPageSource();
        Assert.assertTrue(pageSource.contains(expectMessage));

//    Verify button Log out is displayed on the new page
        WebElement LogOutButton = driver.findElement(By.cssSelector(".wp-block-button__link"));
        Assert.assertTrue(LogOutButton .isDisplayed());

    }

    @Test(groups = {"negative", "regression"})
    public void testLoginNegativeUsername(){
//        Test case 2: Negative username test
//
//        Open page
        driver.get("https://practicetestautomation.com/practice-test-login/");
//        Type username incorrectUser into Username field
        driver.findElement(By.id("username")).sendKeys("incorrectUser");
//        Type password Password123 into Password field
        driver.findElement(By.id("password")).sendKeys("Password123");
//        Push Submit button
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
        WebElement errorMessage = driver.findElement(By.id("error"));
//        Verify error message is displayed
        Assert.assertTrue(errorMessage.isDisplayed(), "Error message should be visible");
//        Verify error message text is Your username is invalid!
        Assert.assertEquals(errorMessage.getText(), "Your username is invalid!", "Incorrect error message text" );

    }

    @Test(groups = {"negative", "regression"})
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
