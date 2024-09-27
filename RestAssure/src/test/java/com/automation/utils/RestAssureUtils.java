package com.automation.utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RestAssureUtils {
    static RequestSpecification requestSpecification = RestAssured.given();
    static String endPoint;
    static Response response;

    public static void setEndPoint(String endPoint) {
        RestAssureUtils.endPoint = endPoint;
    }

    public static Response post() {
        requestSpecification.log().all();
        response = requestSpecification.post(endPoint);
        response.then().log().all();
        return response;
    }

    public static Response get() {
        requestSpecification.log().all();
        response = requestSpecification.get(endPoint);
        response.then().log().all();
        return response;
    }
    public static void setHeader(String key, String value){
        requestSpecification = requestSpecification.header(key, value);
    }
    public static void setBody(String fileName){
        String jsonFolderPath = ConfigReader.getConfigValue("json.file.path");
        requestSpecification = requestSpecification.body(getDataFromFile(jsonFolderPath + fileName));

    }
    public static int getStatusCode(){
        return response.getStatusCode();
    }
    public static String getDataFromFile(String filePath) {
        String content=null;
        try {
            content = new Scanner(new FileInputStream(filePath)).useDelimiter("\\z").next();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return content;
    }

}
