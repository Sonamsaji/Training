package com.automation.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DatePickerByUser {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.expedia.co.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        Thread.sleep(2000);
        String checkInDate = "18 october 2024";
        String checkOutDate = "13 october 2024";
        driver.findElement(By.xpath("//button[contains(@name, 'date-selector')]")).click();
        selectDate(checkInDate, driver);
        selectDate(checkOutDate, driver);
    }
    public static void selectDate(String data, WebDriver driver) throws InterruptedException{
        String xpathDay = "//div[contains(@class, 'uitk-month-left')]//div[contains(@class, 'date-number') and text()='%s']";
        String monthYear = data.substring(data.indexOf(' ') + 1);
        String day = data.substring(0, data.indexOf(' '));

        WebElement monthYearElement = driver.findElement(By.xpath("//div[]"));
        while ((!monthYear.equals(monthYearElement.getText()))){
            WebElement nextBtn = driver.findElement(By.xpath("//button"));
            nextBtn.click();
            monthYearElement = driver.findElement(By.xpath("//div[@class, '']"));
            Thread.sleep(1000);
        }

        String dayLocator = String.format(xpathDay, day);
        WebElement dayElement = driver.findElement(By.xpath((dayLocator)));
        dayElement.click();
    }
}
