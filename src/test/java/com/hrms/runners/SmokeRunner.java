package com.hrms.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
	features="src/test/resources/features/",// specify which feature file to run
	glue="com/hrms/steps",// where we can find implementation code for gherkin steps?
							//we specify just package
	dryRun=false,
	//if set to true it will quickly scan that all gherkin steps have implementation code
	//if set to true no actual execution will happen 
	//so if we don’t want to waste time on missing steps, we should dryRun=true first when everything has implementation good we can dryRun=false
		
		monochrome=true,
		//strict=true,
		tags="@SQL_LastNameValidation"//setting groups for 
		,plugin= {
				"pretty"//, "html:/cucumber-default-reports",//prints gherkin steps in console while running
				,"html:target/cucumber-default-report"
				,"json:target/cucumber-json",
		}
		
		)
public class SmokeRunner {

}
