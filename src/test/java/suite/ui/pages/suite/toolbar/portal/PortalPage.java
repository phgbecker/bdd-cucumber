package suite.ui.pages.suite.toolbar.portal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commons.BasePage;

public class PortalPage extends BasePage {

	public PortalPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "span.seicon-dashboard")
	private WebElement portalButton;
	@FindBy(css = "ul.portalListBtns")
	private WebElement createButton;

	public PortalPage clickOnPortal() {
		actions.getElement().clickOn(portalButton);
		return this;
	}

	public PortalPage clickOnCreate() {
		clickOnPortal();
		actions.getElement().clickOn(createButton);
		return this;
	}
}
