package br.com.cauan;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.junit.jupiter.api.Assertions.*;

public class LoginSuccessTest {
    private WebDriver driver;

    @BeforeEach
    void setup(){
        driver = DriverFactory.createFirefoxDriver();
    }

    @AfterEach
    void teardown(){
        driver.quit();
    }

    @Test
    void shouldLoginSuccess(){
        driver.get("https://cauanrricardo.github.io/sistema-login-teste/");
        driver.findElement(By.id("usuario")).sendKeys("admin");
        driver.findElement(By.id("senha")).sendKeys("bigboss@");
        driver.findElement(By.xpath("//button[@type='button']")).click();

        WebElement success = driver.findElement(By.id("msg"));
        assertEquals("Login realizado com sucesso!", success.getText());

    }
}
