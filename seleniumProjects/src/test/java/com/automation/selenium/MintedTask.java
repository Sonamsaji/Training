package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;

public class MintedTask {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.minted.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
//        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"bx-element-2619158-Gu64MsV-input\"]")).sendKeys("sonamsaji3@gmail.com");

}}
