package com.automation.steps;

import com.automation.utils.ConfigReader;
import com.automation.utils.RestAssuredUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class ResponseSteps {

    @Then("verify status code is {int}")
    public void verify_status_code_is(int statusCode) {
        Assert.assertEquals(statusCode, RestAssuredUtils.getStatusCode());
    }

    @Then("verify post id is not empty")
    public void verify_post_id_is_not_empty() {
        String bookingId = RestAssuredUtils.getResponse().jsonPath().getString("id");
        Assert.assertTrue(!bookingId.isEmpty());
    }

    @Then("stores created post id into {string}")
    public void stores_created_post_id_into(String key) {
        ConfigReader.setConfigValue(key, RestAssuredUtils.getResponse().jsonPath().getString("id"));
    }
    @Then("store token value to {string}")
    public void store_token_value_to(String key) {
        String token = RestAssuredUtils.getResponse().jsonPath().getString("token");
        ConfigReader.setConfigValue(key, token);
    }

}
