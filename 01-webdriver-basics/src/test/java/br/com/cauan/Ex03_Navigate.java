package br.com.cauan;

import org.openqa.selenium.WebDriver;
/*
** This class shows the navigation through pages. */
public class Ex03_Navigate {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = DriverFactory.createFirefoxDriver();
        driver.get("https://www.google.com");
        Thread.sleep(1000);
        driver.get("https://wikipedia.org");
        Thread.sleep(1000);
        driver.navigate().back();
        System.out.println("actual title: " + driver.getTitle());
        driver.navigate().forward();
        System.out.println("actual title: " + driver.getTitle());
        driver.quit();
    }

}
