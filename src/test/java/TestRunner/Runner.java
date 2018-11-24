package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {"html:target/cucumber-html-report", "json:target/cucumber.json",
        "pretty:target/cucumber-pretty.txt",
        "junit:target/cucumber-results.xml"},
        features = "Feature",
        glue = {"Stepdefinition"})

public class Runner {
}
