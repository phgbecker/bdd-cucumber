package suite.ui.pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commons.BasePage;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css = "#dashTarget")
	private WebElement mainPortal;
	
	@FindBy(css = "#companyLogo")
	private WebElement companyLogo;
	
	public HomePage waitForHomeAreLoaded() {
		wait.waitForVisibilityOf(mainPortal);
		return this;
	}
	
	public String isCorrectLogin() {
		waitForHomeAreLoaded();
		return companyLogo.isDisplayed() ? "Login was successful" : "Login wasn't successful";
	}

}
