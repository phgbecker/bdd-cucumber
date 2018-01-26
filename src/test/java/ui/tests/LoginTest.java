package ui.tests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import commons.BaseSuiteTest;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import ui.data.LoginData;
import ui.pages.commons.navbar.NavbarPage;
import ui.steps.LoginStep;

/**
 * 
 * @author victor.santos
 *
 */
@Epic(value = "Mark7")
@Feature(value = "Login")
public class LoginTest extends BaseSuiteTest {

	private LoginStep login;
	private LoginData data;

	@BeforeMethod(description = "Realizando configurações iniciais.")
	public void beforeEachScenario() {
		login = new LoginStep(getDriver());
	}

	@Test(description = "Quando é efetuado com sucesso.")
	@Description(value = "Após login, tela de tarefa deve ser apresentada.")
	public void whenLoginWasSuccessful() throws IOException {
		data = LoginData.init("successful");
		login.performLoginWith(data.getUsername(), data.getPassword());
		assertThat(data.getUsername(), is(NavbarPage.init(getDriver()).getProfile().getProfileAddres()));
	}

}
