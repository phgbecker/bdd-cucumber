package ui.pages.task;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import ui.pages.commons.navbar.NavbarPage;

public class TaskPage extends BasePage {

	private NavbarPage navbar;

	private TaskPage(WebDriver driver) {
		super(driver);
		setNavbar(NavbarPage.init(driver));
	}

	public static TaskPage init(WebDriver driver) {
		return new TaskPage(driver);
	}

	public NavbarPage getNavbar() {
		return navbar;
	}

	public void setNavbar(NavbarPage navbar) {
		this.navbar = navbar;
	}

}
