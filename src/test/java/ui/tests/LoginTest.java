package ui.tests;

import org.junit.Assert;
import org.junit.Test;

import commons.BaseSuiteTest;
import io.qameta.allure.junit4.DisplayName;

public class LoginTest extends BaseSuiteTest {

	@Test
	@DisplayName(value = "Teste com sucesso")
	public void firstTest() throws InterruptedException {
		getDriver().navigate().to("https://www.google.com.br/");
		Thread.sleep(1000);
		Assert.assertTrue(true);
	}
	@Test
	@DisplayName(value = "Teste com falha")
	public void secondTest() throws InterruptedException {
		getDriver().navigate().to("https://www.google.com.br/");
		Thread.sleep(1000);
		Assert.assertTrue(false);
	}

}
