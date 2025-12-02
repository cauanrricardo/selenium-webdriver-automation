package com.testautomation.login;


import com.testautomation.core.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class LoginTests{
    private WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        driver = DriverFactory.createFirefoxDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }
    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }
    @Test(groups = {"positive", "regression", "smoke"})
    public void  testLoginFunctionality(){
//    Test case 1: Positive LogIn test

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

    @Parameters({"username", "password", "expectedErrorMessage"})
    @Test(groups = {"negative", "regression"})
    public void testLoginNegative(String username, String password, String expectedErrorMessage){

//        Actions
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("submit")).click();

//        Verify error message is displayed
        WebElement errorMessage = driver.findElement(By.id("error"));
        Assert.assertTrue(errorMessage.isDisplayed());

//        Verify error message text is = Your (username/password) is invalid!
        String actualMessage = errorMessage.getText();
        Assert.assertEquals(actualMessage, expectedErrorMessage);

    }
}
