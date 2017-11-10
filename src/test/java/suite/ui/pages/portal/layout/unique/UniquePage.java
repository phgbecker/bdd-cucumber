package suite.ui.pages.portal.layout.unique;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commons.BasePage;

public class UniquePage extends BasePage {

	public UniquePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css = "a.add") private WebElement addButton;
	
	public UniquePage clickOnAdd() {
		actions.getElement().clickOn(addButton);
		return this;
	}

}
