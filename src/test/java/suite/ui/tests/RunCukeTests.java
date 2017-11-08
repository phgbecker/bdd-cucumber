package suite.ui.tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "suite/ui/features", 
		plugin = { 
				"pretty", 
				"json:target/cucumber-report/cucumber.json" })
public class RunCukeTests {

}
