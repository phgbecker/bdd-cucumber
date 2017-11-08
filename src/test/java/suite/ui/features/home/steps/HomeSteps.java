package suite.ui.features.home.steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import suite.ui.pages.home.HomePage;

public class HomeSteps {

	private HomePage home;
	
	public HomeSteps(WebDriver driver) {
		home = new HomePage(driver);
	}
	
	public void isSuccessfullyLogin() {
		Assert.assertSame("Login was successful", home.isCorrectLogin());
	}
}
