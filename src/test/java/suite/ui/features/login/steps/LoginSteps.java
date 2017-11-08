package suite.ui.features.login.steps;

import org.openqa.selenium.WebDriver;

import suite.ui.pages.login.LoginPage;

public class LoginSteps {
	
	private LoginPage login;
	
	public LoginSteps(WebDriver driver) {
		login = new LoginPage(driver);
	}
	
	public LoginSteps navigateToPage() {
		login.navitageToPage();
		return this;
	}
	
	public LoginSteps performLogin(String user, String password) {
		login.fillInUser(user);
		login.fillInPassword(password);
		login.clickOnLogin();
		return this;
	}

}
