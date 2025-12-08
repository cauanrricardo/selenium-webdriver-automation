package com.testautomation.core;

import org.openqa.selenium.WebDriver;


public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod

    public void setUp() {
        driver = DriverFactory.createFirefoxDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
