package commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import commons.utils.actions.ActionsUtils;

public class BasePage {

	protected WebDriver driver;
	protected ActionsUtils actions;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		actions = new ActionsUtils(driver);
		PageFactory.initElements(this.driver, this);
	}
}
