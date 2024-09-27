package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    //Locator for clicking close icon when we open ebay
    @FindBy(id = "com.ebay.mobile:id/identity_app_onboarding_screen_close")
    WebElement clickCloseIcon;

    //locator for clicking searchIcon
    @FindBy(id = "com.ebay.mobile:id/search_box")
    WebElement searchIcon;

    @FindBy(id = "com.ebay.mobile:id/search_src_text")
    WebElement searchInput;

    @FindBy(id = "com.ebay.mobile:id/search_landing_container")
    WebElement searchResult;
    @FindBy(id = "com.ebay.mobile:id/text_slot_1")
    WebElement textInfo;
    @FindBy(id = "com.ebay.mobile:id/search_item_card_header")
    WebElement searchItem;
    public void openApplication() {
        clickCloseIcon.click();
    }

    public void clickSearchIcon() {

    }

    public void searchWithKeyword(String keyword) {
        searchIcon.click();
        waitForElementToBeClickable(searchInput);
        searchInput.sendKeys(keyword);
        searchResult.click();
    }
    public void clickOnFirstLink() {
        textInfo.click();
        searchItem.click();
    }
}
