package com.testautomation;

import com.testautomation.core.DriverFactory;
import com.testautomation.pageobjects.ExceptionsPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;
    protected ExceptionsPage exceptionsPage;

    @BeforeMethod
   protected void setup(){
        driver = DriverFactory.createFirefoxDriver();
        exceptionsPage = new ExceptionsPage(driver);
        exceptionsPage.visit();
    }

    @AfterMethod
  protected  void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }

}
