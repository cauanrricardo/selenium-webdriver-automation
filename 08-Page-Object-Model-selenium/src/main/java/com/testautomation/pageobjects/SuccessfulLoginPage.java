package com.testautomation.pageobjects;

import com.testautomation.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

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
