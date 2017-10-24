package commons;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Capabilities {

	public static DesiredCapabilities desiredCapabilities() {
		new DesiredCapabilities();
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setPlatform(Platform.WINDOWS);
		return capabilities;
	}
	
	public static ChromeOptions chromeOptions() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("test-type");
		options.addArguments("--no-sandbox");
		options.addArguments("--start-maximized");
		options.addArguments("--disable-infobars");
		return options;
	}
}
