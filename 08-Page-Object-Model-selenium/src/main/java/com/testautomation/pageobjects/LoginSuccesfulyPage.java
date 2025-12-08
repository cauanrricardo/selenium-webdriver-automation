package com.testautomation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginSuccesfulyPage {

    private WebDriver driver;
    private By  logOutButtonInsert = By.linkText("Log out");
    private WebDriverWait wait;

    public LoginSuccesfulyPage(WebDriver driver){
    this.driver = driver;
    this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public String  getCurrentUrl(){
        return driver.getCurrentUrl();
    }
    public String getPageSource(){
        return  driver.getPageSource();
    }
    public boolean ButtonLogOutOn(){
        try {
            return driver.findElement(logOutButtonInsert).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }

    }
}
