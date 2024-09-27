package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage {

    //Locator for mensShirtIcon icon
    @FindBy(xpath = "//*[@id=\"__next\"]/div[3]/div[2]/div/div[1]/div/ul/li[5]/a")
    WebElement mensShirtIcon;

    public void openWebsite() {
        driver.get(ConfigReader.getConfigProperty("url"));
    }

    public void clicksMensShirtIcon() {
        mensShirtIcon.click();
    }


}
