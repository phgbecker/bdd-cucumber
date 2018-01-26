package ui.pages.commons.navbar.profile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commons.BasePage;

public class ProfilePage extends BasePage {

	@FindBy(css = "span.profile-address")
	private WebElement profileAddress;

	private ProfilePage(WebDriver driver) {
		super(driver);
	}

	public static ProfilePage init(WebDriver driver) {
		return new ProfilePage(driver);
	}

	public String getProfileAddres() {
		return actions.getExtractors().getElementText(profileAddress);
	}
}
