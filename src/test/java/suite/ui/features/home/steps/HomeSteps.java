package suite.ui.features.home.steps;

import static org.hamcrest.core.Is.*;
import static org.junit.Assert.*;

import org.openqa.selenium.WebDriver;

import suite.ui.pages.home.HomePage;

public class HomeSteps {

	private HomePage home;

	public HomeSteps(WebDriver driver) {
		home = new HomePage(driver);
	}

	public void isSuccessfullyLogin() {
		assertThat(home.isCorrectLogin(), is("Login was successful"));
	}
}
