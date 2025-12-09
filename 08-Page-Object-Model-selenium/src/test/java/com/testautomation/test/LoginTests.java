package com.testautomation.test;


import com.testautomation.core.DriverFactory;
import com.testautomation.pageobjects.LoginPage;
import com.testautomation.pageobjects.SuccessfulLoginPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class LoginTests {
    private WebDriver driver;
    private static final Logger logger = LogManager.getLogger(LoginTests.class);

    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        driver = DriverFactory.createFirefoxDriver();
        logger.info("Running test in firefox browser");

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
        LoginPage loginPage = new LoginPage(driver);
        loginPage.visit();
        SuccessfulLoginPage successfulLoginPage = loginPage.executeLogin("student", "Password123"); //move to new page (success)
        successfulLoginPage.load();

       logger.info("verify the login positive functionality");

        logger.info("verifying if the URL was loaded");
//    Verify new page URL contains practicetestautomation.com/logged-in-successfully/
        String expectPath = "logged-in-successfully";
        String actualUrl = successfulLoginPage.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectPath), "URL did not contain expected path. Actual: " + actualUrl);

        logger.info("Message Verify");
//    Verify new page contains expected text ('Congratulations' or 'successfully logged in')
        String expectMessage = "Congratulations student. You successfully logged in!";
        String pageSource = successfulLoginPage.getPageSource();
        Assert.assertTrue(pageSource.contains(expectMessage), "Success message was not displayed.");
        logger.info("Success Message. Test Passed");

//    Verify button Log out is displayed on the new page
        Assert.assertTrue(successfulLoginPage.isLogoutButtonDisplayed());
        logger.info("Button is visible. Test Passed");

        logger.info("--- Positive LogIn Test Finished ---");

    }

    @Parameters({"username", "password", "expectedErrorMessage"})
    @Test(groups = {"negative", "regression"})
    public void testLoginNegative(String username, String password, String expectedErrorMessage){
        logger.info("--- Starting Negative LogIn Test ---");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.visit();
        loginPage.executeLogin(username, password);
        Assert.assertEquals(loginPage.getErrorMessage(), expectedErrorMessage);
        logger.info("--- Negative LogIn Test Finished ---");

    }
}
