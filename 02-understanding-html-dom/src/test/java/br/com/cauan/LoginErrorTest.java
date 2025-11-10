package br.com.cauan;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginErrorTest {
    private WebDriver driver;

    @BeforeEach
     void setup(){
       driver = DriverFactory.createFirefoxDriver();
    }

    @AfterEach
    void tearDown(){
        driver.quit();
    }

    @Test
    void ShouldLoginErro(){
        driver.get("https://cauanrricardo.github.io/sistema-login-teste/");
        driver.findElement(By.cssSelector("#usuario")).sendKeys("admin");
        driver.findElement(By.cssSelector("#senha")).sendKeys("galo13");
        driver.findElement(By.cssSelector("#loginForm > button:nth-child(3)")).click();

        WebElement erro = driver.findElement(By.cssSelector("#msg"));
        assertEquals("Acesso negado!", erro.getText());
    }
}
