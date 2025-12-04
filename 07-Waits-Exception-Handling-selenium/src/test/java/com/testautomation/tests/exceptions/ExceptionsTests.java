package com.testautomation.tests.exceptions;


import com.testautomation.core.DriverFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

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
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
//       CLick add button
        driver.findElement(By.xpath("//*[@id=\"add_btn\"]")).click();
        By row2Input = By.cssSelector("#row2 input.input-field");
        WebElement row2 =   wait.until(ExpectedConditions.visibilityOfElementLocated(row2Input));

//       verify row 2 input field is displayed
        Assert.assertTrue(row2.isDisplayed(), "Row2 field is not displayed");
    }

    @Test
    public void timeoutExceptionTest(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
//       CLick add button
        driver.findElement(By.xpath("//*[@id=\"add_btn\"]")).click();
        By row2Input = By.cssSelector("#row2 input.input-field");
        WebElement row2 =   wait.until(ExpectedConditions.visibilityOfElementLocated(row2Input));

//       verify row 2 input field is displayed
        Assert.assertTrue(row2.isDisplayed(), "Row2 field is not displayed");
    }

    @Test
    public void elementNotInteractableExceptionTest(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
        logger.info("----STARTS TESTS  ------");
        driver.findElement(By.id("add_btn")).click();
        By row2Input = By.cssSelector("#row2 input.input-field");
        WebElement row2 = wait.until(ExpectedConditions.visibilityOfElementLocated(row2Input));
        String expectString = "macaroni";
        row2.sendKeys(expectString);
        By saveButtonInput = By.xpath("//*[@id='row2']//button[@name='Save']\n");
        WebElement saveButton = driver.findElement(saveButtonInput);
        saveButton.click();

        String actual = row2.getAttribute("value");
        Assert.assertEquals(actual, expectString, "ERROR");

        By message = By.id("confirmation");
        WebElement confirmationMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(message));

        String actualMsg = confirmationMsg.getText();
        String expectMsg = "Row 2 was saved";
        Assert.assertEquals(actualMsg, expectMsg, "ERROR: success message incorrect");

    }
    @Test
    public void invalidElementStateExceptionTest(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
        By row1Input = By.cssSelector("#row1 input.input-field");
      By editButton = By.id("edit_btn");
      WebElement buttonEdit =  wait.until(ExpectedConditions.visibilityOfElementLocated(editButton));
      buttonEdit.click();
        WebElement row1 = wait.until(ExpectedConditions.visibilityOfElementLocated(row1Input));
        row1.clear();
        logger.info("Clear input successfully");
        row1.sendKeys("macaroni");

        By saveButtonInput = By.xpath("//*[@id='row1']//button[@name='Save']\n");
        WebElement saveButton = driver.findElement(saveButtonInput);
        saveButton.click();

        By message = By.id("confirmation");
        WebElement confirmationMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(message));
        String actualMsg = confirmationMsg.getText();
        String expectMsg = "Row 1 was saved";
        Assert.assertEquals(actualMsg, expectMsg, "ERROR: success message incorrect");
    }

    @Test
    public void staleElementReferenceExceptionTest(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        By inst =  By.id("instructions");

        // Click Add button
        By addB = By.id("add_btn");
        WebElement addButton = driver.findElement(addB);
        addButton.click();

        // Verify instruction text element is no longer displayed]
        Assert.assertTrue(wait.until(ExpectedConditions.invisibilityOfElementLocated(inst)), "Instructions text is still displayed");

    }


}
