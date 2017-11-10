package suite.ui.pages.portal.toolbar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commons.BasePage;

public class ToolbarPage extends BasePage {

	public ToolbarPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "input#editPanelName")
	private WebElement potalNameInput;
	@FindBy(css = "a[data-value='STRUCTURAL_UNIQUE']")
	private WebElement unitqueLayout;
	@FindBy(css = "span.btn-exit-edit")
	private WebElement exitEditButton;
	@FindBy(css = "h3.dashname") private WebElement portalTitle;

	public ToolbarPage selectUnitqueLayout() {
		actions.getElement().clickOn(unitqueLayout);
		return this;
	}
	
	public ToolbarPage clickOnExitEdit() {
		actions.getElement().clickOn(exitEditButton);
		return this;
	}
	
	public String getPortalTitle() {
		return actions.getElement().getElementContent(portalTitle);
	}
}
