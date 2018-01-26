package ui.pages.commons.navbar;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import ui.pages.commons.navbar.profile.ProfilePage;

public class NavbarPage extends BasePage {

	private ProfilePage profile;

	private NavbarPage(WebDriver driver) {
		super(driver);
		setProfile(ProfilePage.init(driver));
	}

	public static NavbarPage init(WebDriver driver) {
		return new NavbarPage(driver);
	}

	public ProfilePage getProfile() {
		return profile;
	}

	public void setProfile(ProfilePage profile) {
		this.profile = profile;
	}

}
