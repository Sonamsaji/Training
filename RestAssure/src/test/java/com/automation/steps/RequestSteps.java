package com.automation.steps;

import com.automation.utils.RestAssureUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RequestSteps {
    @Given("user wants to call {string} end point")
    public void user_wants_to_call_end_point(String endPoint) {
        RestAssureUtils.setEndPoint(endPoint);
    }
    @Given("set header {string}  to {string}")
    public void set_header_to(String key, String value) {
        RestAssureUtils.setHeader(key, value);
    }
    @Given("set request from the file {string}")
    public void set_request_from_the_file(String fileName) {
        RestAssureUtils.setBody(fileName);
    }
    @When("user performs post call")
    public void user_performs_post_call() {
        RestAssureUtils.post();
    }

}
