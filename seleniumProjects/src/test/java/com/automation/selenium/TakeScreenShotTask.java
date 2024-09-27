package com.automation.selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class TakeScreenShotTask {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        Thread.sleep(2000);

        TakesScreenshot ss = (TakesScreenshot) driver;
        File file = ss.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new  File("src/test/resources/Screenshot/img1.png"));
}}

