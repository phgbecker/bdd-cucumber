package suite.ui.pages.login;

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

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	private final String urlPage = "https://bombril.softexpert.com/softexpert/login";

	@FindBy(css = "#user")
	private WebElement userInput;
	@FindBy(css = "#password")
	private WebElement passwordInput;
	@FindBy(css = ".loginbtn")
	private WebElement loginButton;

	public LoginPage navitageToPage() {
		actions.getElement().navigateTo(urlPage);
		return this;
	}

	public LoginPage fillInUser(String user) {
		actions.getElement().fillIn(userInput, user);
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
