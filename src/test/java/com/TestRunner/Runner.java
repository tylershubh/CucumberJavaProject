package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/Feature/LoginF.feature"},
		glue = {"StepDefinition"},
		plugin = {"pretty", "html:target/htmlreport.html",// Report generation
		"html:target/cucumber-reports/cucumber.html", // HTML report location
        "json:target/cucumber-reports/cucumber.json"
		}
		)

public class Runner {

	
	
	
}
