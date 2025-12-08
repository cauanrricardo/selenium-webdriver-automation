package com.testautomation.pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class LoginPage {

        private WebDriver driver;
        private WebDriverWait wait;
        private By usarnameInputLocator = By.id("username");
        private By passwordInputLocator = By.id("password");
        private By submitButtonLocator = By.id("submit");
        private By errorMessageLocator = By.id("error");

    public LoginPage(WebDriver driver){
            this.driver = driver;
            this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        }

        public void enterUsername(String username){
            driver.findElement(usarnameInputLocator);
        }
        public void enterPassword(String password){
            driver.findElement(passwordInputLocator);
        }
        public void clickSubmitButton(){
            driver.findElement(submitButtonLocator).click();
        }
        public SuccessfulLoginPage executeLogin(String username, String password){
            enterPassword(username);
            enterPassword(password);
            clickSubmitButton();
    return  new SuccessfulLoginPage(driver);
        }
        public String getErrorMessage(){
            WebElement errorMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessageLocator));
            return  errorMessageElement.getText();
        }


}
