package com.testautomation.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * class used for code reuse in other projects.*/
public class DriverFactory {

    public static WebDriver createDriver(String browserName) {
        switch (browserName.toLowerCase()) {
            case "chrome":
                return new ChromeDriver();
            case "firefox":
                return new FirefoxDriver();
            case "edge":
                System.setProperty("webdriver.edge.driver", "src/main/resources/msedgedriver.exe");
                return new EdgeDriver();
            default:
                throw new IllegalArgumentException("Invalid browser name");
        }
    }


}
