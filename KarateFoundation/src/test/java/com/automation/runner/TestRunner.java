package com.automation.runner;

import com.intuit.karate.junit5.Karate;
import org.junit.jupiter.api.Test;

public class TestRunner {

    @Karate.Test
    Karate testParallel() {
        return Karate.run("classpath:features")
                .outputCucumberJson(true)
                .reportDir("Cucumber-karate");
    }


}
