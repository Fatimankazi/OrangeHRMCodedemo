package StepDef;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",glue= {"StepDef"},
plugin= {"pretty","html:Target/HTMLReport"},
tags="@regression")

public class Runner {

	
	
	public static void main(String[] args) {
		

	}

}
