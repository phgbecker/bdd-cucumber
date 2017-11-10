package suite.ui.features.portal;

import commons.utils.driver.DriverManager;
import commons.utils.driver.DriverManagerFactory;
import commons.utils.driver.DriverType;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import suite.ui.features.portal.steps.PortalSteps;

public class CreateANewPortal {

	private DriverManager driverManager;

	private PortalSteps portal;
	private static String portalTitle, cardTitle;

	@Before
	public void beforeScenario() {
		driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
		portal = new PortalSteps(driverManager.getDriver());
	}

	@After
	public void afterScenario() {
		driverManager.quitDriver();
	}

	@Quando("eu crio um novo potal com título (.*).")
	public void euCrioUmNovoPortal(String title) {
		portalTitle = title;
		portal.clickOnCreatePortal();
		portal.fillInTitlePorperties(portalTitle);
	}

	@E("seleciono o portal (.*) com layout Único")
	public void selecionOPortalComLayout(String cardName) {
		cardTitle = cardName;
		portal.createPortalWithUniqueLayout(cardTitle);
	}

	@Então("eu devo ver que o título configurado está correto.")
	public void euDevoVerQueOTituloConfiguradoEstaCorreto() {
		portal.checkIfPortalTitleIsCorrect(portalTitle);
	}

	@E("que o portal selecionado é apresentado corretamente.")
	public void queOPortalSelecionadoEApresentadoCorretamente() {
		portal.checkIfCardTitleIsCorrect(cardTitle);
	}
}
