package commons.utils.actions.extractor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commons.utils.actions.wait.WaitActions;


public class ExtractorActions {

	private WaitActions wait;

	private ExtractorActions(WebDriver driver) {
		wait = WaitActions.init(driver);
	}
	
	public static ExtractorActions init(WebDriver driver) {
		return new ExtractorActions(driver);
	}
	
	public String getElementText(WebElement element) {
		wait.waitForVisibilityOf(element);
		return element.getText();
	}
}
