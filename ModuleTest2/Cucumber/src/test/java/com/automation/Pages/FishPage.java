package com.automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FishPage extends BasePage {
    @FindBy(xpath = "//h2")
    WebElement fishText;

    @FindBy(xpath = "//table//td[1]//a")
    WebElement angelFishIcon;

    public String isUserInFishPage() {
        return fishText.getText();
    }

    public void clickAngelFishIcon() {
        angelFishIcon.click();
    }

}
