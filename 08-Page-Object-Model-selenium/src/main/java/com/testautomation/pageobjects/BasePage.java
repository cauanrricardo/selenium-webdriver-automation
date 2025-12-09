package com.testautomation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class BasePage {

    // protected = just class inherits can get this attribute
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    protected void visit(String url){
        driver.get(url);
    }
    public String  getCurrentUrl(){
        return driver.getCurrentUrl();
    }
    public String getPageSource(){
        return  driver.getPageSource();
    }
    protected WebElement waitForElement(By locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    protected  void click(By locator){
        WebElement element = waitForElement(locator);
        element.click();
    }
    protected void sendKeys(By locator, String text){
        WebElement element = waitForElement(locator);
        element.clear();
        element.sendKeys(text);
    }
    protected boolean isDisplayed(By locator){
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }
    protected boolean waitUntilInvisible(By locator) {
        return wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

}