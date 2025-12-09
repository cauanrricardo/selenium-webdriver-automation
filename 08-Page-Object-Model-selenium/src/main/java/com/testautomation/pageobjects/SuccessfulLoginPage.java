package com.testautomation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuccessfulLoginPage extends BasePage {

    private By logOutButtonInsert = By.linkText("Log out");

    public SuccessfulLoginPage(WebDriver driver){
        super(driver);
    }
    public boolean isLogoutButtonDisplayed(){
       return  isDisplayed(logOutButtonInsert);

    }
    public void load(){
        waitForElement(logOutButtonInsert);
    }
}
