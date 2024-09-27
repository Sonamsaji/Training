package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class DragAndDropTask {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
        driver.switchTo().frame(iframe);

        List<WebElement> list = driver.findElements(By.xpath("//li/img"));
        WebElement trashArea = driver.findElement(By.id("trash"));

        Actions action = new Actions(driver);
        for (WebElement image: list){
            action.dragAndDrop(image, trashArea).pause(1000).build().perform();
        }

    }
}
