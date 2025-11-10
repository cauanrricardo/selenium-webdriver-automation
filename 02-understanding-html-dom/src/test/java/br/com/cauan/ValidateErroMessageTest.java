package br.com.cauan;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidateErroMessageTest {

    private WebDriver driver;

    @BeforeEach
    void setup() {
        driver = DriverFactory.createFirefoxDriver();
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }

    @Test
    void shouldValidateErroMessage() {
        driver.get("https://cauanrricardo.github.io/sistema-login-teste/");
        driver.findElement(By.id("usuario")).sendKeys("admin");
        WebElement button = driver.findElement(By.xpath("//button[@type='button']"));
        button.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        WebElement msg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("msg")));
        assertEquals("Acesso negado!", msg.getText(), "Mensagem incorreta ou nao exibida");

    }
}
