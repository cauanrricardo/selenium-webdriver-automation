package br.com.cauan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.ArrayList;
/*
* This class uses an array to save the url and using after, with a  for-each loop.*/
public class Ex01_OpenSites {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        ArrayList<String> urls = new ArrayList<>();
        urls.add("https://www.google.com/");
        urls.add("https://www.nike.com");
        urls.add("https://www.netflix.com");

        //this prints each page title and uses Thread.sleep() to wait the transitions.
        // Using Thread.sleep() is not a code clean!
        for(String url : urls){
            driver.get(url);
            String title = driver.getTitle();
            System.out.println("Titulo da web: " + title);
            System.out.println("-------------");
            Thread.sleep(2000);
        }
        driver.quit();


    }

}
