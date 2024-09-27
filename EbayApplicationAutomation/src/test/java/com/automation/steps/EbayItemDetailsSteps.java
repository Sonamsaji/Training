package com.automation.steps;

import com.automation.pages.EbayItemDetailsPage;
import io.cucumber.java.en.Given;

public class EbayItemDetailsSteps {
    EbayItemDetailsPage ebayItemDetailsPage = new EbayItemDetailsPage();

    @Given("verify zoom functionality")
    public void verify_zoom_functionality() throws InterruptedException {
        ebayItemDetailsPage.verifyZoomFunctionality();
    }
}
