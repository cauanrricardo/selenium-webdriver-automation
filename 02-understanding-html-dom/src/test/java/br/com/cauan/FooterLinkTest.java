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

import static org.junit.jupiter.api.Assertions.assertTrue;

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
    void shouldOpenGithubPageWhenFooterLinkIsClicked() {
        driver.get("https://cauanrricardo.github.io/sistema-login-teste/");

        WebElement githubLink = driver.findElement(By.linkText("GitHub"));
        assertTrue(githubLink.isDisplayed(), "Github visible");
        githubLink.click();

        //store the current window handle
        String originalWindow = driver.getWindowHandle();

        //is the handle different of originalWindow?
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);// yes, change the focus to the new window
                break;  // stop looping, the new window was found
            }
        }

        // Wait until the new page URL contains 'github.com'
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("github.com"));

        // Verify that the URL contains 'github.com'
        assertTrue(driver.getCurrentUrl().contains("github.com"),
                "ERRO: don´t direction to github");

        // Switch back to the original window
        driver.switchTo().window(originalWindow);
    }

}
