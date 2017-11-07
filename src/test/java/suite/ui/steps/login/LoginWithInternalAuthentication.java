package suite.ui.steps.login;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import commons.utils.driver.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import suite.ui.pages.home.HomePage;
import suite.ui.pages.login.LoginPage;

public class LoginWithInternalAuthentication {

	private WebDriver driver;
	private DriverFactory driverFactory;
	
	private LoginPage login;
	private HomePage home;

	@Before
	public void beforeScenario() {
		driverFactory = new DriverFactory();
		driver = driverFactory.getDriver();
	}

	@After
	public void afterScenario() {
		driverFactory.destroy();
	}

	@Dado("que eu acesso a pagina de login do SE Suite.")
	public void euAcessoAPaginaDeLoginDoSESuite() {
		login = new LoginPage(driver);
		login.navitageToPage();
	}

	@Quando("eu realizo o login utilizando como autenticação interna, o usuário (.*) com a (.*).")
	public void euRealizoOLoginUtilizandoComoAutenticacaoInternaOUsuario(String user, String password) {
		login.fillInUser(user);
		login.fillInPassword(password);
		login.clickOnLogin();
	}

	@Então("eu devo realizar o login com sucesso.")
	public void euDevoRealizarOLoginComSucesso() {
		home = new HomePage(driver);
		assertTrue(home.isCorrectLogin());
	}
}
