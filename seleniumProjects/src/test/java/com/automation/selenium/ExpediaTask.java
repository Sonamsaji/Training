package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;

public class ExpediaTask {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.expedia.co.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"multi-product-search-form-1\"]/div/div/div[1]/ul/li[2]/a/span")).click();

        //trivandrum
        driver.findElement(By.xpath("//*[@id=\"FlightSearchForm_ROUND_TRIP\"]/div/div[1]/div/div[1]/div/div/div[2]/div[1]")).click();
        driver.findElement(By.id("origin_select")).sendKeys("Thiruvananthapuram");
        driver.findElement(By.xpath("//li[@data-index='0']")).click();
        //dubai
        driver.findElement(By.xpath("//*[@id=\"FlightSearchForm_ROUND_TRIP\"]/div/div[1]/div/div[2]/div/div/div[2]/div[1]")).click();
        driver.findElement(By.id("destination_select")).sendKeys("abu dhabi");
        driver.findElement(By.xpath("//li[@data-index='0']")).click();
        //date
        driver.findElement(By.xpath("//*[@id=\"FlightSearchForm_ROUND_TRIP\"]/div/div[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"FlightSearchForm_ROUND_TRIP\"]//section//tbody/tr[3]/td[4]")).click();
        driver.findElement(By.xpath("//*[@id=\"FlightSearchForm_ROUND_TRIP\"]//section//tbody/tr[4]/td[7]")).click();
        driver.findElement(By.xpath("//footer//button")).click();
        driver.findElement(By.xpath("//*[@id=\"search_button\"]")).click();
}}
