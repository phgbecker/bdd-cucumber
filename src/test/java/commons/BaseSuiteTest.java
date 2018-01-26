package commons;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.openqa.selenium.WebDriver;

import commons.screenshot.ScreenshotOnFailure;
import commons.utils.driver.DriverManager;
import commons.utils.driver.DriverManagerFactory;
import commons.utils.driver.DriverType;
import io.qameta.allure.junit4.DisplayName;

public class BaseSuiteTest {

	private static DriverManager driverManager;

	@Rule
	public ScreenshotOnFailure failure = new ScreenshotOnFailure(getDriver());

	@BeforeClass
	@DisplayName(value = "Abrindo o navegador e acessando a aplicação.")
	public static void beforeAllScenarios() {
		driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
		// getDriver().navigate().to(GetURL.getBaseURL());
	}

	@AfterClass
	@DisplayName(value = "Fechando o navegador.")
	public static void afterAllScenarios() {
		driverManager.quitDriver();
	}

	public static WebDriver getDriver() {
		return driverManager.getDriver();
	}
}
