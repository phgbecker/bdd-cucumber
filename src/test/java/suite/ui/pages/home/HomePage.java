package suite.ui.pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commons.BasePage;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css = "#companyLogo")
	private WebElement companyLogo;
	
	public boolean isCorrectLogin() {
		wait.waitForVisibilityOf(companyLogo);
		return companyLogo.isDisplayed();
	}

}
