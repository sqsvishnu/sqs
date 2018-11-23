package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "Feature",
glue = {"Stepdefinition"}


)

public class Runner {

}
