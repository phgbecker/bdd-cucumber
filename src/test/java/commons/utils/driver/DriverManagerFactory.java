package commons.utils.driver;

import commons.utils.driver.chrome.ChromeDriverManager;
import commons.utils.driver.firefox.FirefoxDriverManager;
import commons.utils.driver.ie.IeDriverManager;
import commons.utils.driver.safari.SafariDriverManager;

public class DriverManagerFactory {

	public static DriverManager getManager(DriverType type) {
		DriverManager driverManager;

		switch (type) {
		case CHROME:
			driverManager = new ChromeDriverManager();
			break;
		case FIREFOX:
			driverManager = new FirefoxDriverManager();
			break;
		case IE:
			driverManager = new IeDriverManager();
			break;
		case SAFARI:
			driverManager = new SafariDriverManager();
			break;
		default:
			driverManager = new ChromeDriverManager();
			break;
		}
		return driverManager;
	}
}
