package br.com.cauan;

import org.openqa.selenium.WebDriver;
/*
 * This class uses a try-catch block in case it finds an error. */
public class Ex04_HandlingExceptions {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.createFirefoxDriver();
        try{
            driver.get("https://site-que-nao-existe.com");
            System.out.println("Title:" + driver.getTitle());
        }catch(Exception e){
            System.out.println("ERROR: Failed to access site: " + e.getMessage());
        }
        driver.quit();

    }


}
