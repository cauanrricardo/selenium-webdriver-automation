package br.com.cauan;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DisableLoginTest {
    private WebDriver driver;

    @BeforeEach
    void setup() {
        driver = DriverFactory.createFirefoxDriver();
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }

    @Test
    public void ShouldDisableLoginButtonWhenFieldsAreEmpty() {
        driver.get("https://cauanrricardo.github.io/sistema-login-teste/");
        WebElement button = driver.findElement(By.xpath("//button[@type='button']"));
        assertTrue(button.isDisplayed(), "Button is on");
        assertFalse(button.isEnabled(), "Button in not enable to click");
        //TEST FAILED - EXIST A BUG IN THE SYSTEM
    }

}
