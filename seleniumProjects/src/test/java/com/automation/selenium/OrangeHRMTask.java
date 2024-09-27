package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;
import java.util.Random;

public class OrangeHRMTask {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
        driver.findElement(By.xpath("//*[@id=\"app\"]//button")).click();
        //Admin
        driver.findElement(By.xpath("//*[@id=\"app\"]//li//a[1]")).click();
        //Add button
        driver.findElement(By.xpath("//div[@class=\"orangehrm-header-container\"]/button")).click();
        //User role
//        driver.findElement(By.className("oxd-select-text oxd-select-text--active")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]/i")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div[2]/div[3]")).click();
        //Employee name*
        driver.findElement(By.xpath("//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']//input")).sendKeys("a");
        WebElement select=driver.findElement(By.xpath("//span[text()='Peter Mac Anderson']"));
        select.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]/i")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div[2]/div[2]")).click();
        //Username*
//        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input")).sendKeys("Shaz1234");
        // Generating random number  for user name
        WebElement adminUsername = driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//input[@class='oxd-input oxd-input--active']"));
        Random random = new Random();
        int randomNumber = random.nextInt(900) + 100;
        adminUsername.sendKeys("Shaz" + randomNumber);
        //Password*
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")).sendKeys("Sonaa@123");
        //confirm password
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")).sendKeys("Sonaa@123");
        //save
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();

        WebElement profile=driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']"));
        profile.click();
        Thread.sleep(1000);
        WebElement logout=driver.findElement(By.xpath("//li[4]/a[@class='oxd-userdropdown-link']"));
        logout.click();
        Thread.sleep(1000);

        WebElement user1=driver.findElement(By.name("username"));
        user1.sendKeys("Shaz" + randomNumber);

        WebElement password1=driver.findElement(By.name("password"));
        password1.sendKeys("Sonaa@123");
        Thread.sleep(1000);
        WebElement click1=driver.findElement(By.xpath("//button"));
        click1.click();

        WebElement userprofile=driver.findElement(By.xpath("//ul//span[@class='oxd-userdropdown-tab']"));
        userprofile.click();
        Thread.sleep(1000);
        WebElement logout1=driver.findElement(By.xpath("//li[4]/a[@class='oxd-userdropdown-link']"));
        logout1.click();
        Thread.sleep(1000);

        WebElement user2=driver.findElement(By.name("username"));
        user2.sendKeys("Admin");
        WebElement password2=driver.findElement(By.name("password"));
        password2.sendKeys("admin123");
        Thread.sleep(1000);
        WebElement click2=driver.findElement(By.xpath("//button"));
        click2.click();
        Thread.sleep(1000);

        WebElement admin1=driver.findElement(By.xpath("//span[text()='Admin']"));
        admin1.click();
        WebElement passuser=driver.findElement(By.xpath("//div[2]/input"));
        passuser.sendKeys("Shaz" + randomNumber);
        driver.findElement(By.xpath("//button[text()=' Search ']")).click();
        Thread.sleep(1000);

        WebElement checkbox=driver.findElement(By.xpath("//span[@class='oxd-checkbox-input oxd-checkbox-input--active --label-right oxd-checkbox-input']//i"));
        checkbox.click();
        Thread.sleep(1000);

        WebElement delete=driver.findElement(By.xpath("//button[@class='oxd-icon-button oxd-table-cell-action-space']/i"));
        delete.click();
        Thread.sleep(1000);

        WebElement yes=driver.findElement(By.xpath("//button[text()=' Yes, Delete ']"));
        yes.click();
        Thread.sleep(1000);

        WebElement profile1=driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']"));
        profile1.click();
        WebElement logoutp=driver.findElement(By.xpath("//li[4]/a[@class='oxd-userdropdown-link']"));
        logoutp.click();
    }
}