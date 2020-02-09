package com.syntax.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features="src/test/resources/features"
			,glue="com/hrms/steps"
			,dryRun=false
			,plugin= {"pretty", "html:target/html/cucumber-default"}
			,monochrome=true
			,tags= {"@regression"}
			)

public class RegressionRunner {
}	

