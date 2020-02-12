package com.syntax.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="@target/failed.txt"
		,glue="com/syntax/steps"
		,monochrome=true
		,plugin="pretty"
		)
public class FailedRunner {

}