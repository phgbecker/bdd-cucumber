package suite.ui.features.login;

import org.openqa.selenium.WebDriver;

import commons.utils.driver.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import suite.ui.features.home.steps.HomeSteps;
import suite.ui.features.login.steps.LoginSteps;

public class LoginWithInternalAuthentication {

	private WebDriver driver;
	private DriverFactory driverFactory;
	
	private LoginSteps login;
	private HomeSteps home;

	@Before
	public void beforeScenario() {
		driverFactory = new DriverFactory();
		driver = driverFactory.getDriver();
		login = new LoginSteps(driver);
		home = new HomeSteps(driver);
	}

	@After
	public void afterScenario() {
		driverFactory.destroy();
	}

	@Dado("que eu acesso a pagina de login do SE Suite.")
	public void euAcessoAPaginaDeLoginDoSESuite() {
		login.navigateToPage();
	}

	@Quando("eu realizo o login utilizando como autenticação interna, o usuário (.*) com a (.*).")
	public void euRealizoOLoginUtilizandoComoAutenticacaoInternaOUsuario(String user, String password) {
		login.performInternalLogin(user, password);
	}

	@Então("eu devo realizar o login com sucesso.")
	public void euDevoRealizarOLoginComSucesso() {
		home.isSuccessfullyLogin();
	}
	
	@Dado("que eu realize o login no SE Suite com o usuário SoftExpert.")
	public void iRealizeLoginWithSoftexpertUser() {
		login.navigateToPage();
		login.performInternalLogin("softexpert", "111111");
		home.waitForHomeAreLoaded();
	}
}
