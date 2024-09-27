package com.automation.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class DriverManager {
    static WebDriver driver;


    public static void createDriver() throws MalformedURLException {

        if(ConfigReader.getConfigValue("platform").equals("local")){
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        }else{
            ChromeOptions browserOptions = new ChromeOptions();
            browserOptions.setPlatformName("Windows 11");
            browserOptions.setBrowserVersion("latest");
            Map<String, Object> sauceOptions = new HashMap<>();
            sauceOptions.put("username", "SonaMS");
            sauceOptions.put("accessKey", "1b62dd77-105a-4c13-a97e-5a5f97cc3b87");
            sauceOptions.put("build", "selenium-build-SNSR3");
            sauceOptions.put("name", "login Test");
            browserOptions.setCapability("sauce:options", sauceOptions);

            // start the session
            URL url = new URL("https://ondemand.us-west-1.saucelabs.com:443/wd/hub");
            driver = new RemoteWebDriver(url, browserOptions);
        }

    }
    public static WebDriver getDriver(){
        return driver;
    }

    
}
