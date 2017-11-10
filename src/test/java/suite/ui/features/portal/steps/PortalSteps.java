package suite.ui.features.portal.steps;

import static org.hamcrest.core.Is.*;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;

import suite.ui.pages.portal.PortalPage;

public class PortalSteps {

	private PortalPage portal;
	
	public PortalSteps(WebDriver driver) {
		portal = new PortalPage(driver);
	}
	
	public PortalSteps clickOnCreatePortal() {
		portal.getToolbar().getPortal().clickOnPortal();
		portal.getToolbar().getPortal().clickOnCreate();
		return this;
	}
	
	public PortalSteps fillInTitlePorperties(String title) {
		portal.getProperties().fillInTitle(title);
		portal.getProperties().clickOnSave();
		return this;
	}
	
	public PortalSteps createPortalWithUniqueLayout(String cardName) {
		portal.getPortalToolbar().selectUnitqueLayout();
		portal.getLayout().getUnique().clickOnAdd();
		selectCard(cardName);
		portal.getPortalToolbar().clickOnExitEdit();
		return this;
	}
	
	public PortalSteps selectCard(String cardName) {
		portal.getCards().fillInSearch(cardName);
		portal.getCards().clickOnCard();
		return this;
	}
	
	public void checkIfPortalTitleIsCorrect(String title) {
		assertThat(portal.getPortalToolbar().getPortalTitle(), is(title));
	}
	
	public void checkIfCardTitleIsCorrect(String cardTitle) {
		assertThat(portal.getCards().getCardTitle(), is(cardTitle));
	}
}
