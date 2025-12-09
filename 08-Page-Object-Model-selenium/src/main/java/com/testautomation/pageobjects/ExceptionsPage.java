package com.testautomation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExceptionsPage extends BasePage {

    private By addButtonLocator = By.id("add_btn");
    private By row2InputLocator = By.cssSelector("#row2 input.input-field");
    private By saveRow1ButtonLocator = By.xpath("//*[@id='row1']//button[@name='Save']");
    private By saveRow2ButtonLocator = By.xpath("//*[@id='row2']//button[@name='Save']");
    private By confirmationMessageLocator = By.id("confirmation");
    private By row1InputLocator = By.cssSelector("#row1 input.input-field");
    private By editButtonLocator = By.id("edit_btn");
    private By instructionLocator = By.id("instructions");

    public ExceptionsPage(WebDriver driver){
        super(driver);
    }
    public void visit(){
        super.visit("https://practicetestautomation.com/practice-test-exceptions/");
    }
    public void clickAddButton(){
       click(addButtonLocator);
    }
    public WebElement getRow2Input(){
        return waitForElement(row2InputLocator);
    }
    public boolean isRow2InputDisplayed(){
        return isDisplayed(row2InputLocator);
    }
    public void enterRow2Input (String text){
        sendKeys(row2InputLocator, text);
    }
    public String getRow2Value(){
        return getRow2Input().getAttribute("value");
    }
    public void clickSaveRow1(){
        click(saveRow1ButtonLocator);
    }
    public String getConfirmationMessage(){
       WebElement element=  waitForElement(confirmationMessageLocator);
        return element.getText();
    }
    public WebElement getEditButton(){
        return waitForElement(editButtonLocator);
    }
    public void clickEditButton(){
        click(editButtonLocator);
    }
    public WebElement getRow1Input(){
        return  waitForElement(row1InputLocator);
    }
    public void enterRow1Input(String text){
        sendKeys(row1InputLocator, text);
    }
    public String getRow1Value(){
        return getRow1Input().getAttribute("value");
    }
    public void clickSaveRow2() {
        click(saveRow2ButtonLocator);
    }
    public boolean waitInstructionToDisappear(){
        return  waitUntilInvisible(instructionLocator);
    }

}
