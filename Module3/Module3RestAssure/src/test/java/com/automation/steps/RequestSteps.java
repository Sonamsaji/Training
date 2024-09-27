package com.automation.steps;

import com.automation.utils.ConfigReader;
import com.automation.utils.RestAssuredUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class RequestSteps {
    @Given("user wants to call {string} end point")
    public void user_wants_to_call_end_point(String endPoint) {
        if (endPoint.contains("@id")) {
            endPoint = endPoint.replace("@id", "3");
        }
        RestAssuredUtils.setEndPoints(endPoint);
    }
    @When("user performs get call")
    public void user_performs_get_call() {
        RestAssuredUtils.get();
    }

    @Given("set header {string} to {string}")
    public void set_header_to(String key, String value) {
        RestAssuredUtils.setHeader(key, value);
    }
    @Given("set request body from the file {string}")
    public void set_request_body_from_the_file(String fileName) {
        RestAssuredUtils.setBody(fileName);

    }
    @When("user performs post call")
    public void user_performs_post_call() {
        RestAssuredUtils.post();
    }

//    @When("user performs put call")
//    public void user_performs_put_call() {
//        String postId = ConfigReader.getConfigValue("post.id");
//        RestAssuredUtils.setUpdateEndpoint(postId);
//        Response response = RestAssuredUtils.put();
//        response.then().log().all();
//    }

    @And("user performs put call")
    public void userPerformsPutCall() {
        RestAssuredUtils.put();
    }


}
