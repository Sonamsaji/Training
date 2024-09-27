package com.automation.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class SuaceDemoNavigationTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        Thread.sleep(2000);
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        List<WebElement> list =  driver.findElements(By.className("inventory_list"));
        for(WebElement i:list){
            System.out.println(i.getText());
        }
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("shopping_cart_container")).click();
        List<WebElement> cartList = driver.findElements(By.className("cart_item_label"));
        System.out.println("-----cart list-----");
        for (WebElement j: cartList){
            System.out.println(j.getText());
        }

        if(list.contains(cartList.get(0))){
            System.out.println("Same");
        }
        driver.quit();
}}
