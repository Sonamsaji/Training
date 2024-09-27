package com.automation.demo;

import io.restassured.RestAssured;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RestDemo {
    public static void main(String[] args) throws FileNotFoundException {
        //get method
//        RestAssured.given().baseUri(
//                "https://restful-booker.herokuapp.com")
//                .log().all().when().get("/booking")
//                .then().log().all().assertThat().statusCode(200);

        //post method
        String body=getDataFromFile("src/test/resources/json/create_booking.json");
        RestAssured.given().baseUri(
                        "https://restful-booker.herokuapp.com")
                .body(body)
                .contentType("application/json")
                .log().all().when().post("/booking")
                .then().log().all().assertThat().statusCode(200);
    }
    public static String getDataFromFile(String filePath)throws FileNotFoundException {
        String content=new Scanner(new FileInputStream(filePath)).useDelimiter("\\z").next();
        return content;
    }
}
