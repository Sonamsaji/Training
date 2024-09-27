package com.automation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManager {
    //create driver

    static WebDriver driver;      //webdriver is static so we can use everywhere the webdriver withut creating object

    public static void createDriver(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

    }

    public static WebDriver getDriver(){
        return driver; //return object of driver
    }

}
