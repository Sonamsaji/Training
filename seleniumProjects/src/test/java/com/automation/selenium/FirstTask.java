package com.automation.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTask {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
//        driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("laptop");
//        driver.findElement(By.id("gh-btn")).click();
//        Select objSelect =new Select(driver.findElement(By.xpath("//*[@id=\"gh-cat\"]")));
//        objSelect.selectByVisibleText("Music");
//        driver.findElement(By.id("gh-btn")).click();
//        driver.findElement(By.xpath("//*[@id=\"gh-as-a\"]")).click();
//        WebElement first = driver.findElement(By.name("LH_TitleDesc"));
//        if(!first.isSelected()){
//            first.click();
//        }
//        WebElement secondbox = driver.findElement(By.name("LH_Complete"));
//        if(!secondbox.isSelected()){
//            secondbox.click();
//        }
//        WebElement thirdbox = driver.findElement(By.name("LH_Sold"));
//        if(!thirdbox.isSelected()){
//            thirdbox.click();
//        }
//        //SELECT ALL CATEGORIES FROM A CHECKBOX
//        Select s =new Select(driver.findElement(By.xpath("//*[@id=\"gh-cat\"]")));
//        List<WebElement> list = s.getOptions();
//        int len = list.size();
//        for(int i = 0; i<len; i++){
//            String options = list.get(i).getText();
//            System.out.println(options);
//        }


//        driver.close();
    }
}
