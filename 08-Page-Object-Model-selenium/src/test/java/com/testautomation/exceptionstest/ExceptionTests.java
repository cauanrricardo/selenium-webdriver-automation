package com.testautomation.exceptionstest;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.testautomation.BaseTest;

public class ExceptionTests extends BaseTest {

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
