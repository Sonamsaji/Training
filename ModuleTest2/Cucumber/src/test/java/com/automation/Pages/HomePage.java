package com.automation.Pages;

import com.automation.Utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    //locator for getting fish icon
    @FindBy(xpath = "//div[@id='SidebarContent']//a[1]//img")
    WebElement fishIcon;

    public void openWebsite() {
        driver.get(ConfigReader.getConfigProperty("url"));
    }

    public void userClickFishIcon() {
        fishIcon.click();
    }
}
