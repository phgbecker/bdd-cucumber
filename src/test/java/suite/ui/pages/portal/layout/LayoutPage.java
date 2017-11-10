package suite.ui.pages.portal.layout;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import suite.ui.pages.portal.layout.unique.UniquePage;

public class LayoutPage extends BasePage{

	private UniquePage unique;
	
	public LayoutPage(WebDriver driver) {
		super(driver);
		setUnique(new UniquePage(driver));
	}

	public UniquePage getUnique() {
		return unique;
	}

	public void setUnique(UniquePage unique) {
		this.unique = unique;
	}

}
