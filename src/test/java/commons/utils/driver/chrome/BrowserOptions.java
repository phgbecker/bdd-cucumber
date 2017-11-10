package commons.utils.driver.chrome;

import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserOptions {
	
	public static ChromeOptions chrome() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("test-type");
		options.addArguments("--no-sandbox");
		options.addArguments("--start-maximized");
		options.addArguments("--disable-infobars");
		return options;
	}
}
