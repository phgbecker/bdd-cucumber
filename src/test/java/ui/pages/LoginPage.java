package ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commons.BasePage;

/**
 * 
 * @author victor.santos
 *
 */
public class LoginPage extends BasePage {

	@FindBy(css = "input#login_email")
	private WebElement usernameInput;

	@FindBy(css = "input#login_password")
	private WebElement passwordInput;

	@FindBy(css = "button")
	private WebElement loginButton;

	private LoginPage(WebDriver driver) {
		super(driver);
	}

	public static LoginPage init(WebDriver driver) {
		return new LoginPage(driver);
	}

	public LoginPage fillInUsername(String username) {
		actions.getElement().fillIn(usernameInput, username);
		return this;
	}

	public LoginPage fillInPassword(String password) {
		actions.getElement().fillIn(passwordInput, password);
		return this;
	}

	public LoginPage clickOnLogin() {
		actions.getElement().clickOn(loginButton);
		return this;
	}

}
