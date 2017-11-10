package suite.ui.features.login;

import commons.utils.driver.DriverManager;
import commons.utils.driver.DriverManagerFactory;
import commons.utils.driver.DriverType;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import suite.ui.features.home.steps.HomeSteps;
import suite.ui.features.login.steps.LoginSteps;

public class LoginWithInternalAuthentication {

	private DriverManager driverManager;

	private LoginSteps login;
	private HomeSteps home;

	@Before
	public void beforeScenario() {
		driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
		login = new LoginSteps(driverManager.getDriver());
		home = new HomeSteps(driverManager.getDriver());
	}

	@After
	public void afterScenario() {
		driverManager.quitDriver();
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
		home.checkIfLoginWasSuccessfully();
	}

	@Dado("que eu realize o login no SE Suite com o usuário SoftExpert.")
	public void iRealizeLoginWithSoftexpertUser() {
		login.navigateToPage();
		login.performInternalLogin("softexpert", "111111");
		home.waitForHomeAreLoaded();
	}
}
