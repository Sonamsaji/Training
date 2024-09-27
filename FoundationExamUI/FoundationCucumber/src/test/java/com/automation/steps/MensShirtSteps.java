package com.automation.steps;

import com.automation.pages.MensShirtPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MensShirtSteps {

    MensShirtPage mensShirtPage = new MensShirtPage();

    @And("user clicks urban shirts")
    public void userClicksUrbanShirts() {
        mensShirtPage.userClicksUrbanIcon();
    }
}
