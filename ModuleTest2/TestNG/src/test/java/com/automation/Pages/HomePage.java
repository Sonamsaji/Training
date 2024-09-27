package com.automation.Pages;

import com.automation.Utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    //Locator for Search Field Icon
    @FindBy(xpath = "//form//input[@name=\"keyword\"]")
    WebElement searchField;
    //Locator for SearchButton
    @FindBy(xpath = "//form//input[@name=\"searchProducts\"]")
    WebElement searchButton;
    //Locator for getting GolfFish Text in the table
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[3]")
    WebElement goldFishText;

    public void openWebsite() {
        driver.get(ConfigReader.getConfigProperty("url"));
    }

    public void clickSearchFieldIcon() {
        searchField.sendKeys(ConfigReader.getConfigProperty("search.word"));
    }

    public void clickSearchButton() {
        searchButton.click();
    }
    public String getSearchText(){
        return ConfigReader.getConfigProperty("search.word");
    }


    public String verifyGoldFishingIsDisplaying(){
        return goldFishText.getText();
    }

}
