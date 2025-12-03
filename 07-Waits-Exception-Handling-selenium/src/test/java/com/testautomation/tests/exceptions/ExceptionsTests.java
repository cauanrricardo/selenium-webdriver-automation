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
import org.testng.annotations.Test;

public class ExceptionsTests {
    private WebDriver driver;
    private static final Logger logger = LogManager.getLogger(ExceptionsTests.class);

    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        driver = DriverFactory.createFirefoxDriver();
        logger.info("Running test in firefox browser");

 //      open page
        driver.get("https://practicetestautomation.com/practice-test-exceptions/");
        logger.info("Open page successfully: " + driver.getTitle());
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        driver.quit();
        logger.info("browser is closed");
    }

    @Test
    public void noSuchElementExceptionTest(){
//       CLick add button
        driver.findElement(By.xpath("//*[@id=\"add_btn\"]")).click();
//       verify row 2 input field is displayed
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement row2 = driver.findElement(By.xpath("/html/body/div/div/section/section/div/div[3]/div/input"));
        Assert.assertTrue(row2.isDisplayed(), "Row2 field is not displayed");
    }

}
