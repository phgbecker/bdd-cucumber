package commons.utils.driver.chrome;

import org.openqa.selenium.chrome.ChromeOptions;

/**
 * 
 * @author victor.santos
 *
 */
public class BrowserOptions {

	public static ChromeOptions chrome() {
		return new ChromeOptions().addArguments("test-type", "no-sandbox", "start-maximized", "disable-infobars");
	}
}
