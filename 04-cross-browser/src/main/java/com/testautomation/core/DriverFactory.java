package com.testautomation.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/*
 * class used for code reuse in other projects.*/
public class DriverFactory {

    public static  WebDriver createFireFoxDriver(){
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().window().maximize();
        return  driver;
    }

    public static WebDriver createChrome(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        return  driver;
    }
    public static WebDriver createEdgeDriver(){
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        return  driver;
    }

}
