package commons.utils.actions.keyboard;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commons.utils.actions.wait.WaitElementUtils;

/**
 * 
 * @author victor.santos
 *
 */
public class KeyboardActions {

	private WaitElementUtils wait;

	public KeyboardActions(WebDriver driver) {
		wait = new WaitElementUtils(driver);
	}

	public void enter(WebElement element) {
		wait.waitForVisibilityOf(element);
		element.sendKeys(Keys.ENTER);
	}
}
