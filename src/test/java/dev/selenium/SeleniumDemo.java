package dev.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class SeleniumDemo {
    WebDriver driver;

    @BeforeMethod
    public void  before() {
        driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
    }

    @Test
    public void testOpenBrowser(){
        WebElement textInput = driver.findElement(By.cssSelector("input#my-text-id"));
        textInput.click();

        WebElement passInput1 = driver.findElement(By.cssSelector("[type=password]"));
        WebElement passInput = driver.findElement(By.xpath("//*[@type='password']"));
        passInput.click();
        passInput.sendKeys("ABSURD DA RABOTI");

        WebElement bigTextInput1 = driver.findElement(By.cssSelector("textarea"));
        WebElement bigTextInput = driver.findElement(By.xpath("//textarea"));
        bigTextInput.click();

        WebElement existingText1 = driver.findElement(By.cssSelector("[value=\"Readonly input\"]"));
        WebElement existingText = driver.findElement(By.xpath("//*[@value='Readonly input']"));
        existingText.click();

        WebElement dateClick1 = driver.findElement(By.cssSelector("label>[name=my-date]"));
        WebElement dateClick = driver.findElement(By.xpath("//label/*[@name='my-date']"));
        dateClick.click();


    }

    /*@AfterMethod
   public void tearDown() {
        driver.quit();
    }*/
}
