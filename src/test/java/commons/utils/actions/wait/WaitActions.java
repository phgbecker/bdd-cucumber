package commons.utils.actions.wait;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 * @author victor.santos
 *
 */
public class WaitActions {

	private WebDriverWait wait;

	private WaitActions(WebDriver driver) {
		wait = new WebDriverWait(driver, 10);
	}

	public static WaitActions init(WebDriver driver) {
		return new WaitActions(driver);
	}

	public void waitForVisibilityOf(WebElement element) {
		wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOf(element));
	}

	public void waitForElementToBeClickable(WebElement element) {
		wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(element));
	}
}
