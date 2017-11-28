package suite.ui.tests;

import org.junit.runner.RunWith;

import courgette.api.CourgetteOptions;
import courgette.api.CourgetteRunLevel;
import courgette.api.junit.Courgette;
import cucumber.api.CucumberOptions;

@RunWith(Courgette.class)
@CourgetteOptions(
		threads = 3, 
		runLevel = CourgetteRunLevel.SCENARIO, 
		rerunFailedScenarios = true, 
		showTestOutput = true,
		cucumberOptions = @CucumberOptions( 
				features = "src/test/resources/features",
				glue = "suite/ui/features", 
				plugin = { 
						"pretty", 
						"json:target/cucumber-report/cucumber.json"}, 
				tags = "~@wip"
				) 
		)
public class RunCukeTests {

}
