package uk.co.heartbingo.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * Created by NP
 */
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "uk/co/heartbingo/steps",
        plugin = {"html:target/cucumber-reports/cucumber.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        tags = "@regression"
)
public class RunCukeTest extends AbstractTestNGCucumberTests{
        }