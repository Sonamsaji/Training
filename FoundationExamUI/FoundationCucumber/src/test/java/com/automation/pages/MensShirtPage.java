package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MensShirtPage extends BasePage {

    //Locator for getting urban icon
    @FindBy(xpath = "//*[@id=\"4f Urban\"]/img")
    WebElement urbanIcon;

    public void userClicksUrbanIcon() {
        urbanIcon.click();
    }

}
