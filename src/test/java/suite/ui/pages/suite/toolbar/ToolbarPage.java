package suite.ui.pages.suite.toolbar;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import suite.ui.pages.suite.toolbar.portal.PortalPage;

public class ToolbarPage extends BasePage {

	private PortalPage portal;

	public ToolbarPage(WebDriver driver) {
		super(driver);
		setPortal(new PortalPage(driver));
	}

	public PortalPage getPortal() {
		return portal;
	}

	public void setPortal(PortalPage portal) {
		this.portal = portal;
	}
}
