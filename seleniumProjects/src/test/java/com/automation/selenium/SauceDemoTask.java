package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class SauceDemoTask {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor)  driver;
        WebElement exc = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));

        js.executeScript("arguments[0].style.border ='2px solid black'", exc);
                exc.sendKeys("standard_user");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//body//div[@class=\"shopping_cart_container\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class=\"cart_footer\"]/button[@id=\"checkout\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id=\"first-name\"]")).sendKeys("Sona");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id=\"last-name\"]")).sendKeys("hello");
        Thread.sleep(2000);
//        driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("s");

        driver.findElement(By.xpath("//input[@id=\"postal-code\"]")).sendKeys("686106");
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();

        List<WebElement> list = driver.findElements(By.xpath("//div[@class=\"cart_item_label\"]"));
        System.out.println("Checkout details");
        for (WebElement i: list){
            System.out.println(i.getText());
        }
        List<WebElement> list1 = driver.findElements(By.xpath("//div[@class='summary_info']/div[not(@class='cart_footer')]"));
        for (WebElement j: list1){
            System.out.println(j.getText());
        }

//        driver.findElement(By.id("finish")).click();
        WebElement FinishBtn=driver.findElement(By.xpath("//button[@id='finish']"));
        FinishBtn.click();
}}
