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
		if (System.getProperty("os.name").toLowerCase().indexOf("win") >= 0) {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");			
		} else {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
		}
		driver = new ChromeDriver(BrowserOptions.chrome());
	}

	public WebDriver getDriver() {
		return driver;
	}
	
	public void destroy() {
		driver.quit();
		driver = null;
	}
}
