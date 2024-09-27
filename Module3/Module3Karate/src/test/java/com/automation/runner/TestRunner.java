package com.automation.runner;

import com.intuit.karate.junit5.Karate;

import static com.intuit.karate.junit5.Karate.run;

public class TestRunner {

    //Karate Runner
    @Karate.Test
    Karate testParallel(){
        return run("classpath:features")
                .outputCucumberJson(true)
                .reportDir("Cucumber-karate");
    }
}

