package com.FreeeCRM.testWithout.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Owner\\eclipse-workspace\\FreeCRM\\src\\test\\resources\\Feature\\signUp.feature"
, glue=""
, monochrome=true
, plugin= {"pretty", "html:test-output" }
, dryRun=false)

public class signUpRunner {
	
}
