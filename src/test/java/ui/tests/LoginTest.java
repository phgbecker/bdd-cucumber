package ui.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import commons.BaseSuiteTest;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;

@Epic(value = "Mark7")
@Feature(value ="Login")
public class LoginTest extends BaseSuiteTest {

	@Test(description = "Teste com sucesso")
	public void firstTest() throws InterruptedException {
		getDriver().navigate().to("https://www.google.com.br/");
		Thread.sleep(1000);
		Assert.assertTrue(true);
	}

	@Test(description = "Teste com falha")
	public void secondTest() throws InterruptedException {
		getDriver().navigate().to("https://www.google.com.br/");
		Thread.sleep(1000);
		Assert.assertTrue(false);
	}

}
