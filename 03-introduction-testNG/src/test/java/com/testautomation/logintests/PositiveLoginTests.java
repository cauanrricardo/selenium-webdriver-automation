package com.testautomation.logintests;


import com.testautomation.core.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class PositiveLoginTests{
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = DriverFactory.createFirefoxDriver();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    @Test
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


}
