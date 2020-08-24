package com.qa.ohrm.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/com/qa/ohrm/features",
		glue = "com/qa/ohrm/stepdefs",
		plugin = { "pretty", "html:target/cucumber-reports/cucumber-pretty"},
		monochrome = true, 
		dryRun = false)
public class TestRunner {

}
