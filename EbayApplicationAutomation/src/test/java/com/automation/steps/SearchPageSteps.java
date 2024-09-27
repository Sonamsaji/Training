package com.automation.steps;

import com.automation.pages.SearchPage;
import io.cucumber.java.en.When;

public class SearchPageSteps {

    SearchPage searchPage = new SearchPage();

    @When("search for {string}")
    public void search_for(String string) {
        searchPage.clickSearchTextField();
    }


}
