package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionClassTask {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        WebElement cate = driver.findElement(By.xpath("//li/a[text()='Electronics']"));
        WebElement apple = driver.findElement(By.xpath("//li/a[text()='Apple']"));
        Actions action = new Actions(driver);
        action.moveToElement(cate).pause(1000).keyDown(Keys.CONTROL).click(apple).build().perform();


    }
}
