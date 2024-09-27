package com.automation.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

import static org.testng.AssertJUnit.assertEquals;

public class SaucedemoTest {

    WebDriver driver;
    WebElement username;
    WebElement password;
    WebElement button;
    WebElement error;
    WebElement title;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        username = driver.findElement(By.id("user-name"));
        password = driver.findElement(By.id("password"));
        button = driver.findElement(By.id("login-button"));


    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }




    @Test(dataProvider ="PositiveDataProvider")
    public void rightUsernameRightPassword(String data){
        username.sendKeys(data);
        password.sendKeys("secret_sauce");
        button.click();
        title=driver.findElement(By.xpath("//span[@class='title']"));
        Assert.assertEquals(title.getText(),"Products");

    }
    @Test(dataProvider = "PositiveDataProvider")
    public void rightUsernameWrongPassword(String data){
        username.sendKeys(data);
        password.sendKeys("random");
        button.click();
        error = driver.findElement(By.xpath("//h3"));
        Assert.assertEquals(error.getText(),"Epic sadface: Username and password do not match any user in this service");
    }
    @Test(dataProvider ="NegativeDataProvider")
    public void wrongUsernameRightPassword(String data){
        username.sendKeys(data);
        password.sendKeys("secret_sauce");
        button.click();
        error = driver.findElement(By.xpath("//h3"));
        Assert.assertEquals(error.getText(),"Epic sadface: Sorry, this user has been locked out.");
    }
    @Test(dataProvider ="NegativeDataProvider")
    public void wrongUsernameWrongPassword(String data){
        username.sendKeys(data);
        password.sendKeys("random");
        button.click();
        error = driver.findElement(By.xpath("//h3"));
        Assert.assertEquals(error.getText(),"Epic sadface: Username and password do not match any user in this service");
    }

    @DataProvider(name="PositiveDataProvider")
    public Object[] positiveData(){
        Object[] data={
                "standard_user",
                "problem_user",
                "performance_glitch_user",
                "error_user",
                "visual_user"
        };
        return data;
    }
    @DataProvider(name="NegativeDataProvider")
    public Object[] negativeData(){
        Object[] data={"locked_out_user"};
        return data;
    }


}
