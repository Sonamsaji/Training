package com.automation.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void setUp(){
        System.out.println("Before Scenario");
    }
    @After
    public void cleanUp(){
        System.out.println("After Scenario");
    }
}
