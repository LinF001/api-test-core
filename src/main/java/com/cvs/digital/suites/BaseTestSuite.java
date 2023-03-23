package com.cvs.digital.suites;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/main/resources/features",
        glue = "com.cvs.digital.stepDefinitions", monochrome = true,
        tags = "@base and not @Ignore and not @blocked"
)
public class BaseTestSuite {
}
