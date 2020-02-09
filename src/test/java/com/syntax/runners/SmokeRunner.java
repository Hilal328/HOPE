package com.syntax.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features"
		,glue="com.syntax.steps"
		,dryRun=false
		,plugin= {"pretty", "html:target/html/cucumber-default", "json:target/cucumber.json", "rerun:target/failed.txt"}
		,monochrome=true
		,tags= {"@test"}
		)

public class SmokeRunner {

	
}
