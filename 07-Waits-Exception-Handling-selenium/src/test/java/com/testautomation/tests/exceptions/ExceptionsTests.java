package com.testautomation.tests.exceptions;


import com.testautomation.core.DriverFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ExceptionsTests {
    private WebDriver driver;
    private static final Logger logger = LogManager.getLogger(LoginTests.class);

    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        driver = DriverFactory.createFirefoxDriver();
        logger.info("Running test in firefox browser");

 //      open page
        driver.get("https://practicetestautomation.com/practice-test-login/");
        logger.info("Open page successfully: " + driver.getTitle());
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        driver.quit();
        logger.info("browser is closed");
    }
    @Test(groups = {"positive", "regression", "smoke"})
    public void  testLoginFunctionality(){
//    Test case 1: Positive LogIn test
        logger.info("Starting testLoginFunctionality");

        WebElement usernameInput = driver.findElement(By.id("username"));
        logger.info("type username");
        usernameInput.sendKeys("student");

        WebElement passwordInput = driver.findElement(By.id("password"));
        logger.info("type password");
        passwordInput.sendKeys("Password123");

       WebElement SubmitButton = driver.findElement(By.id("submit"));
        logger.info("click submit button");
        SubmitButton.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

       logger.info("verify the login positive functionality");
        logger.info("verifying if the URL was loaded");
//    Verify new page URL contains practicetestautomation.com/logged-in-successfully/
        String expectUrl = "https://practicetestautomation.com/logged-in-successfully/";
        String actualUrl = driver.getCurrentUrl(); //get the current Url
        //debug
        logger.debug("Expect URL: {}; Actual URL {}", expectUrl, actualUrl);
        Assert.assertEquals(actualUrl, expectUrl); //testNG


        logger.info("Message Verify");
//    Verify new page contains expected text ('Congratulations' or 'successfully logged in')
        String expectMessage = "Congratulations student. You successfully logged in!";
        String pageSource = driver.getPageSource();
        Assert.assertTrue(pageSource.contains(expectMessage));
        logger.info("Success Message. Test Passed");


//    Verify button Log out is displayed on the new page
        WebElement LogOutButton = driver.findElement(By.cssSelector(".wp-block-button__link"));
        Assert.assertTrue(LogOutButton .isDisplayed());
        logger.info("Button is visible. Test Passed");
        logger.info("--- Positive LogIn Test Finished ---");

    }

    @Parameters({"username", "password", "expectedErrorMessage"})
    @Test(groups = {"negative", "regression"})
    public void testLoginNegative(String username, String password, String expectedErrorMessage){
        logger.info("--- Starting Negative LogIn Test ---");
        logger.debug("Testing with user: {} and expect error: {}", username, expectedErrorMessage);
//        Actions
        driver.findElement(By.id("username")).sendKeys(username);
        logger.info("Typing Username: " + username);
        driver.findElement(By.id("password")).sendKeys(password);
        logger.info("Typing Password");
        driver.findElement(By.id("submit")).click();
        logger.info("Click submit button" );

//        Verify error message is displayed
        WebElement errorMessage = driver.findElement(By.id("error"));
        Assert.assertTrue(errorMessage.isDisplayed());
        logger.info("Error message element is displayed.");

//        Verify error message text is = Your (username/password) is invalid!
        String actualMessage = errorMessage.getText();
        Assert.assertEquals(actualMessage, expectedErrorMessage);
        logger.info("--- Negative LogIn Test Finished ---");

    }
}
