package commons.utils.actions.keyboard;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commons.utils.actions.wait.WaitActions;

/**
 * 
 * @author victor.santos
 *
 */
public class KeyboardActions {

	private WaitActions wait;

	private KeyboardActions(WebDriver driver) {
		wait = WaitActions.init(driver);
	}

	public static KeyboardActions init(WebDriver driver) {
		return new KeyboardActions(driver);
	}

	public void enter(WebElement element) {
		wait.waitForVisibilityOf(element);
		element.sendKeys(Keys.ENTER);
	}
}
