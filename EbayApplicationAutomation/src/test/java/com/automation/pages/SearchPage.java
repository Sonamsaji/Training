package com.automation.pages;

import com.automation.utils.DriverManager;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchPage extends BasePage{
//    locator for search text field
    @FindBy(id = "com.ebay.mobile:id/search_src_text")
    WebElement searchTextField;
    @FindBy(id = "")
    WebElement searchResult;
//    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//    WebElement searchTextField = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.ebay.mobile:id/search_src_text")));


    public void clickSearchTextField(){
        searchTextField.sendKeys("laptop" );
        searchResult.click();
////       JavascriptExecutor js =  (JavascriptExecutor) driver;
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        //DriverManager.getAndroidDriver().executeScript("mobile: performEditorAction", ImmutableMap.of("action","done"));
//        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action","search"));
//        driver.perform(ImmutableMap.of("action","search"));
    }

}
