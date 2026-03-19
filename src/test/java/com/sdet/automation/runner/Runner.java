package com.sdet.automation.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.sdet.automation.cucumberBDD.steps" , "com.java.hooks"},
        tags = "@ADO17"
)

public class Runner extends AbstractTestNGCucumberTests {

}
