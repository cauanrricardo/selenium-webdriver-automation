package br.com.cauan;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.*;

public class FooterLinkTest {
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
    public void shouldOpenGithubPageWhenFooterLinkIsClicked(){
        driver.get("https://cauanrricardo.github.io/sistema-login-teste/");
        WebElement github = driver.findElement(By.cssSelector("body > footer:nth-child(3) > p:nth-child(1) > a:nth-child(2)"));
        assertTrue(github.isDisplayed(), "Link is active");
        github.click();

        assertTrue(driver.getCurrentUrl().contains("github.com"), "ERRO: Don´t go to github");
    }
}
