package suite.ui.steps.login;

import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;

import commons.Hooks;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import suite.ui.pages.home.HomePage;
import suite.ui.pages.login.LoginPage;

public class LoginWithDifferentUsersSteps {
	
	private WebDriver driver;
	private LoginPage login;
	private HomePage home;
	
	public LoginWithDifferentUsersSteps() {
		driver = Hooks.driver;
		login = new LoginPage(driver);
		home = new HomePage(driver);
	}
	
	@Dado("que eu acesso a pagina de login do SE Suite.")
	public void euAcessoAPaginaDeLoginDoSESuite() {
		driver.navigate().to("https://bombril.softexpert.com/softexpert/login");
	}
	
    @Quando("eu realizo o login utilizando como autenticação interna, o usuário (.*) com a (.*).")
    public void euRealizoOLoginUtilizandoComoAutenticacaoInternaOUsuario(String user, String password) {
    	login.fillInUser(user);
    	login.fillInPassword(password);
    	login.clickOnLogin();
    }
    
    @Então("eu devo realizar o login com sucesso.")
    public void euDevoRealizarOLoginComSucesso() {
    	assertTrue(home.isCorrectLogin());
    }
}
