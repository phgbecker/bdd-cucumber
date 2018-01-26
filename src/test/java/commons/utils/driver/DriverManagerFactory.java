package commons.utils.driver;

import commons.utils.driver.chrome.ChromeDriverManager;

/**
 * 
 * @author victor.santos
 *
 */
public class DriverManagerFactory {

	public static DriverManager getManager(DriverType type) {
		DriverManager driverManager;

		switch (type) {
		case CHROME:
			driverManager = new ChromeDriverManager();
			break;
		default:
			driverManager = new ChromeDriverManager();
			break;
		}
		return driverManager;
	}
}
