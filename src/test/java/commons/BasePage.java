package commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import commons.utils.WaitElementUtils;

public class BasePage {

	protected WaitElementUtils wait;
	
	public BasePage(WebDriver driver) {
		wait = new WaitElementUtils(driver);
		PageFactory.initElements(driver, this);
	}
}
