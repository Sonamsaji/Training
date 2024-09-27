package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ThirdTask {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading");
        driver.manage().window().maximize();

        //implicit weight
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/a[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"start\"]/button")).click();
        WebElement drive = driver.findElement(By.xpath("//*[@id=\"finish\"]/h4"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOf(drive));
//        System.out.println(drive.isDisplayed() + " ");
        System.out.println(drive.getText());
//        driver.quit();
    }
}
