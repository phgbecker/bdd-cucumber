package suite.ui.features.portal;

import commons.utils.driver.DriverManager;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import suite.ui.features.portal.steps.PortalSteps;

public class CreateANewPortal {

	private DriverManager driverManager;

	private PortalSteps portal;
	private static String portalTitle, cardTitle;


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
