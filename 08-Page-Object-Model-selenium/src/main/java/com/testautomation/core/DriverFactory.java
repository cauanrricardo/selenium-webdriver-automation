
package com.testautomation;
/*
 * class used for code reuse in other projects.*/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    public static WebDriver createFirefoxDriver(){
            WebDriver driver = new FirefoxDriver(); //create a webdriver instance for firefox
            driver.manage().window().maximize(); //maximize the browser window.
            return driver; //return the driver, ready to be used.
        }
}
