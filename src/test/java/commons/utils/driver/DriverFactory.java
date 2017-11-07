package commons.utils.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

	private WebDriver driver;

	public DriverFactory() {
		initialize();
	}

	public void initialize() {
		if (driver == null)
			createNewChromeDriverInstance();
	}

	private void createNewChromeDriverInstance() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver(Capabilities.chromeOptions());
	}

	public WebDriver getDriver() {
		return driver;
	}
	
	public void destroy() {
		driver.quit();
		driver = null;
	}
}
