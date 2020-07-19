package com.hrms.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		features = "@target/failed.txt",// specify which feature file to run
	glue="com/hrms/steps",// where we can find implementation code for gherkin steps?
							//we specify just package
		
		monochrome=true,
		plugin= {
				"pretty",//, "html:/cucumber-default-reports",//prints gherkin steps in console while running
				//,"html:target/cucumber-default-report",
				"rerun:target/failed.txt"//generate file to note failed scenarios
		}
		
		)

public class FailedRunner {

}
