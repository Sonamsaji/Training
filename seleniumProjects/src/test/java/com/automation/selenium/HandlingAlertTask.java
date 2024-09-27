package com.automation.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandlingAlertTask {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        Alert alert1 = driver.switchTo().alert();
        alert1.dismiss();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Alert alert2 = driver.switchTo().alert();
        alert2.sendKeys("hi");
        alert2.accept();


}}
