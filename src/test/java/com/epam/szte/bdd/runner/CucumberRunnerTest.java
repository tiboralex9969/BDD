package com.epam.szte.bdd.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/features"}, 
		glue = {"com.epam.szte.bdd.hooks", "com.epam.szte.bdd.steps"},
		plugin = {"html:target/cucumber", "json:target/cucumber-json-report.json","pretty"},
		publish = true
		//tags = "@shop"
)
public class CucumberRunnerTest {

}
