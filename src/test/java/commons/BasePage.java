package commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import commons.utils.WaitElementUtils;

public class BasePage {

	protected WaitElementUtils wait;
	protected WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
		wait = new WaitElementUtils(this.driver);
		PageFactory.initElements(this.driver, this);
	}
}
