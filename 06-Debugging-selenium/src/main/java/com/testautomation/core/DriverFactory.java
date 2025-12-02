
package com.testautomation.core;
/*
 * class used for code reuse in other projects.*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverFactory {

    public static WebDriver createFirefoxDriver(){
        FirefoxOptions options = new FirefoxOptions();
//        options.addArguments("--headless"); //its bad for debugging
        options.addArguments("--width=1920");
        options.addArguments("--height=1080");
        WebDriver driver = new FirefoxDriver(options);
        return driver;
    }
}
