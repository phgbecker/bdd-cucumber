package com.mastercard.hooks;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	plugin = { 
		"pretty", 
		"html:target/cucumber" 
	},
	monochrome = true, 
	features = "src/test/resources/features", 
	glue = "com/mastercard/steps"
//	, tags = { "@fast" }
)
public class RunCucumberTest {
}
