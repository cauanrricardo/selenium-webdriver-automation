package br.com.cauan;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/*
* This class is just for test, - my first code using Selenium*/
public class SeleniumDemo {
    public static void main(String[] args) {
        String firefoxTitle = firefoxTest("https://www.google.com/");
        System.out.println(firefoxTitle);

    }
    private  static String firefoxTest(String url){
        WebDriver driver = new FirefoxDriver();
        driver.get(url);
        String title = driver.getTitle();
        driver.quit();
        return title;
    }

}
