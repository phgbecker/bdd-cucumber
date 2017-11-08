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
	
	public LoginSteps performInternalLogin(String user, String password) {
		fillInAuthenticationInfo(user, password);
		login.clickOnLogin();
		return this;
	}
	
	public LoginSteps fillInAuthenticationInfo(String user, String password) {
		login.fillInUser(user);
		login.fillInPassword(password);
		return this;
	}

}
