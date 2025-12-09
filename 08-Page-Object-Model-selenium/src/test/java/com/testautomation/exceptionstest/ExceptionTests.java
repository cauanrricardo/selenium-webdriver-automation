package com.testautomation.exceptionstest;

import com.testautomation.core.DriverFactory;
import com.testautomation.pageobjects.ExceptionsPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ExceptionTests {
    private WebDriver driver;
    private ExceptionsPage exceptionsPage;

    @BeforeMethod
    void setup(){
        driver = DriverFactory.createFirefoxDriver();
        exceptionsPage = new ExceptionsPage(driver);
        exceptionsPage.visit();
    }

    @AfterMethod
    void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }

    @Test
    public void noSuchElementExceptionTest() {
        exceptionsPage.clickAddButton();
        exceptionsPage.getRow2Input();
        Assert.assertTrue(exceptionsPage.isRow2InputDisplayed(), "Row2 field is not displayed");

    }

    @Test
    public void timeoutExceptionTest(){
        exceptionsPage.clickAddButton();
        exceptionsPage.getRow2Input();
        Assert.assertTrue(exceptionsPage.isRow2InputDisplayed(), "Row2 field is not displayed");

    }
    @Parameters({"text"})
    @Test
    public void  elementNotInteractableExceptionTest(String text){
        exceptionsPage.clickAddButton();
        exceptionsPage.enterRow2Input(text);
        exceptionsPage.clickSaveRow2();
        String actualValue = exceptionsPage.getRow2Value();
        Assert.assertEquals(actualValue, text,"ERROR");

        String actualMessage = exceptionsPage.getConfirmationMessage();
        String expectMessage = "Row 2 was saved";
        Assert.assertEquals(actualMessage, expectMessage, "ERROR: success message incorrect");

    }

    @Parameters({"text"})
    @Test
   public void  invalidElementStateExceptionTest(String text){
        exceptionsPage.clickEditButton();
        exceptionsPage.enterRow1Input(text);
        exceptionsPage.clickSaveRow1();

        String actualMessage = exceptionsPage.getConfirmationMessage();
        String expectMessage = "Row 1 was saved";
        Assert.assertEquals(actualMessage, expectMessage, "ERROR: success message incorrect");

    }
    @Test
    public void staleElementReferenceExceptionTest(){
        exceptionsPage.clickAddButton();
        Assert.assertTrue(exceptionsPage.waitInstructionToDisappear());
    }


}
