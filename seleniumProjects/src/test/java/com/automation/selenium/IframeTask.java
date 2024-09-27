package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class IframeTask {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        WebElement cate = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
        driver.switchTo().frame(cate);
        WebElement content = driver.findElement(By.xpath("//body[@id='tinymce']/p"));
        System.out.println(content.getText());

        driver.switchTo().defaultContent();
        WebElement heading = driver.findElement(By.xpath("//h3"));
        System.out.println(heading.getText());


    }
}
