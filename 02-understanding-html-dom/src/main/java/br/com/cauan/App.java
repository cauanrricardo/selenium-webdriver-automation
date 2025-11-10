package br.com.cauan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://cauanrricardo.github.io/sistema-login-teste/");
        //System.out.println(driver.getTitle());
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement usernameInputField = driver.findElement(By.id("usuario"));
//        WebElement passwordInputField = driver.findElement(By.id("senha"));
        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("usuario")));
        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("senha")));
        username.sendKeys("admin");
        password.sendKeys("bigboss@");
        WebElement button = driver.findElement(By.xpath("//button[@type='button']"));
        button.click();
        //if the code html change, this didn´t work

        WebElement sucess = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("msg")));
        System.out.println("Sucess Text: "+ sucess.getText());
//        List<WebElement> inputFields = driver.findElements(By.tagName("input"));
//        WebElement linkTextLocator = driver.findElement(By.linkText("GitHub"));
//        WebElement  partialLinkTextLocation = driver.findElement(By.partialLinkText("Hub"));
//
//        WebElement passwordFieldBelowUsername = driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.id("usuario")));

        driver.quit();
    }
}
