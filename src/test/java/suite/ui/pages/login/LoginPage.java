package suite.ui.pages.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commons.BasePage;

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
		driver.navigate().to(urlPage);
		return this;
	}

	public LoginPage fillInUser(String user) {
		userInput.sendKeys(user);
		return this;
	}

	public LoginPage fillInPassword(String password) {
		passwordInput.sendKeys(password);
		return this;
	}

	public LoginPage clickOnLogin() {
		loginButton.click();
		return this;
	}
}
