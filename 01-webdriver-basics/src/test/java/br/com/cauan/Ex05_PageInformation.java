package br.com.cauan;

import org.openqa.selenium.WebDriver;
/*
* This class shows the information about the page*/
public class Ex05_PageInformation {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.createFirefoxDriver();
        driver.get("https://pt.wikipedia.org/wiki/L%C3%B4_Borges");
        System.out.println("Title:" + driver.getTitle());
        System.out.println("URL:" + driver.getCurrentUrl());

    }
}
