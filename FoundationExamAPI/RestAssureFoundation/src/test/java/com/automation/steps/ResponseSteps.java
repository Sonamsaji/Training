package com.automation.steps;

import com.automation.utils.ConfigReader;
import com.automation.utils.RestAssuredUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ResponseSteps {
    @Then("verify status code is {int}")
    public void verify_status_code_is(int statusCode) {
        Assert.assertEquals(statusCode, RestAssuredUtils.getStatusCode());
    }

    @And("stores created user id into {string}")
    public void storesCreatedUserIdInto(String key) {
        ConfigReader.setConfigValue(key, RestAssuredUtils.getResponseFieldValue("id"));
        System.out.println(RestAssuredUtils.getResponseFieldValue("id"));
    }
}
