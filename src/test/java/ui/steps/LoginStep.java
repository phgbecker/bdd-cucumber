package ui.steps;

import org.openqa.selenium.WebDriver;

import io.qameta.allure.Step;
import ui.pages.LoginPage;

/**
 * 
 * @author victor.santos
 *
 */
public class LoginStep {

	private LoginPage login;

	public LoginStep(WebDriver driver) {
		login = LoginPage.init(driver);
	}

	@Step(value = "Realizando login com usuário {username} e senha {password}.")
	public LoginStep performLoginWith(String username, String password) {
		login.fillInUsername(username);
		login.fillInPassword(password);
		login.clickOnLogin();	
		return this;
	}
}
