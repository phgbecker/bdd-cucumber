package suite.ui.pages.suite;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import suite.ui.pages.suite.toolbar.ToolbarPage;

public class SuitePage extends BasePage {

	private ToolbarPage toolbar;

	public SuitePage(WebDriver driver) {
		super(driver);
		setToolbar(new ToolbarPage(driver));
	}

	public ToolbarPage getToolbar() {
		return toolbar;
	}

	public void setToolbar(ToolbarPage toolbar) {
		this.toolbar = toolbar;
	}

}
