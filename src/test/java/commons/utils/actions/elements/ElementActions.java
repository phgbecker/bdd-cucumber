package commons.utils.actions.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commons.utils.actions.wait.WaitActions;

/**
 * 
 * @author victor.santos
 *
 */
public class ElementActions {

	private WebDriver driver;
	private WaitActions wait;

	private ElementActions(WebDriver driver) {
		this.driver = driver;
		wait = WaitActions.init(driver);
	}

	public static ElementActions init(WebDriver driver) {
		return new ElementActions(driver);
	}

	public void fillIn(WebElement element, String value) {
		wait.waitForVisibilityOf(element);
		element.sendKeys(value);
	}

	public void clickOn(WebElement element) {
		wait.waitForElementToBeClickable(element);
		element.click();
	}

	public boolean isDisplayed(WebElement element) {
		wait.waitForVisibilityOf(element);
		return element.isDisplayed();
	}

	public void navigateTo(String url) {
		driver.navigate().to(url);
	}

	public String getElementContent(WebElement element) {
		wait.waitForVisibilityOf(element);
		return element.getAttribute("value");
	}
}
