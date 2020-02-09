package com.syntax.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

public class RegressionRunner {
	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features="src/test/resources/features"
			,glue="com/hrms/steps"
			,dryRun=false
			,plugin= {"pretty", "html:target/html/cucumber-default"}
			,monochrome=true
			,tags= {"@regression"}
			)
}
