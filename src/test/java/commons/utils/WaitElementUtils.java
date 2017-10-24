package commons.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitElementUtils {

	private WebDriverWait wait;
	
	public WaitElementUtils(WebDriver driver) {
		wait = new WebDriverWait(driver, 10);
	}
	
	public void waitForVisibilityOf(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
}
