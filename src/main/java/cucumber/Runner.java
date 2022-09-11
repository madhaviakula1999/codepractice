package cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources", tags = "@test1", glue = "stepdefinitions")
public class Runner extends AbstractTestNGCucumberTests {
}
