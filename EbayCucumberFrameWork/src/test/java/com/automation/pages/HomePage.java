package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Set;

public class HomePage extends BasePage {
    //search for laptop
    @FindBy(id = "gh-ac")
    WebElement sentLaptopKey;
    //click search button
    @FindBy(xpath = "//td[@class='gh-td gh-sch-btn']//input")
    WebElement clickSearchIcon;

    public void openWebsite() {
        driver.get("https://www.ebay.com/");
    }

    public void searchForLapTop(String itemName) {
        sentLaptopKey.clear();
        sentLaptopKey.sendKeys(itemName);
        clickSearchIcon.click();
    }

    public void switchToNewTab() {
        String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();

        for (String handle : allWindowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }
    }


}
