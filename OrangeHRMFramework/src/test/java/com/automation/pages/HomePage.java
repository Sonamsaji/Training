package com.automation.pages;

import com.automation.utils.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(xpath = "//nav/div[2]/ul/li[1]")
    WebElement adminClick;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[1]/h5")
    WebElement adminText;

    public HomePage(){
        this.driver = DriverManager.getDriver();
    }

    public void adminClickIsWorking(){
        adminClick.click();
    }

    public boolean adminPageIsCorrectlyDisplaying(){
        String adminTextString = adminText.getText();
        return adminTextString.equals("System Users");
    }
}
