package suite.ui.pages.portal;

import org.openqa.selenium.WebDriver;

import suite.ui.pages.portal.cards.CardsPage;
import suite.ui.pages.portal.layout.LayoutPage;
import suite.ui.pages.portal.properties.PropertiesPage;
import suite.ui.pages.portal.toolbar.ToolbarPage;
import suite.ui.pages.suite.SuitePage;

public class PortalPage extends SuitePage {

	private PropertiesPage properties;
	private ToolbarPage toolbar;
	private LayoutPage layout;
	private CardsPage cards;

	public PortalPage(WebDriver driver) {
		super(driver);
		setProperties(new PropertiesPage(driver));
		setPortalToolbar(new ToolbarPage(driver));
		setLayout(new LayoutPage(driver));
		setCards(new CardsPage(driver));
	}

	public PropertiesPage getProperties() {
		return properties;
	}

	public void setProperties(PropertiesPage properties) {
		this.properties = properties;
	}

	public ToolbarPage getPortalToolbar() {
		return toolbar;
	}

	public void setPortalToolbar(ToolbarPage toolbar) {
		this.toolbar = toolbar;
	}

	public LayoutPage getLayout() {
		return layout;
	}

	public void setLayout(LayoutPage layout) {
		this.layout = layout;
	}

	public CardsPage getCards() {
		return cards;
	}

	public void setCards(CardsPage cards) {
		this.cards = cards;
	}

}
