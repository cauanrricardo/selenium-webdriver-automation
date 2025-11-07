package br.com.cauan;

import org.openqa.selenium.WebDriver;
public class Ex02_DriverFactory {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.createFirefoxDriver();

        driver.get("https://www.google.com");

        String title = driver.getTitle();

        if(title != null && !title.isEmpty()){
            System.out.println("Sucess - title: " + title);
        } else {
            System.out.println("ERR");
        }
    }


}
