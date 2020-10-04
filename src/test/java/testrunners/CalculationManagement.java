package testrunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features="src/test/java/com/biancabirsan/cucumbermavenproject/features",
     	glue = "stepdefinitions",
     	tags = {"@ScenariOutlineExample"},
		plugin= {"pretty"},
		dryRun = false,
		monochrome = true)

public class CalculationManagement {


}


