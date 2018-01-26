package commons;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import commons.utils.driver.DriverManager;
import commons.utils.driver.DriverManagerFactory;
import commons.utils.driver.DriverType;
import commons.utils.extractors.GetURL;
import io.qameta.allure.Attachment;

public class BaseSuiteTest {

	private static DriverManager driverManager;

	@BeforeClass(description = "Abrindo o navegador e acessando a aplicação.")
	public static void beforeAllScenarios() {
		driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
		getDriver().navigate().to(GetURL.getBaseURL());
	}

	@AfterMethod(description = "Caso cenário esteja com erro, evidência do problema será anexada abaixo.")
	public static void afterEachMethod(ITestResult testResult) throws IOException {
		if (testResult.getStatus() == ITestResult.FAILURE)
			createAttachment(((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES));
		getDriver().navigate().to(GetURL.getBaseURL());
	}

	@Attachment(value = "Tela onde ocorreu o problema.")
	private static byte[] createAttachment(byte[] attachment) {
		return attachment;
	}

	@AfterClass(description = "Fechando o navegador.")
	public static void afterAllScenarios() {
		driverManager.quitDriver();
	}

	public static WebDriver getDriver() {
		return driverManager.getDriver();
	}
}
