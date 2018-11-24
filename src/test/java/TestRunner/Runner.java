package TestRunner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {"usage", "html:target/cucumber-html-report", "json:target/cucumber.json",
        "pretty:target/cucumber-pretty.txt",
        "junit:target/cucumber-results.xml"},
        features = "Feature",
        glue = {"Stepdefinition"},
        monochrome = true)

public class Runner {
}
