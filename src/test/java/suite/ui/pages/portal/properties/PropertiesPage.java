package suite.ui.pages.portal.properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commons.BasePage;

public class PropertiesPage extends BasePage {

	public PropertiesPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "input#dash_name_edit")
	private WebElement titleInput;
	@FindBy(css = "button#save-prop-dash")
	private WebElement saveButton;

	public PropertiesPage fillInTitle(String title) {
		actions.getElement().fillIn(titleInput, title);
		return this;
	}

	public PropertiesPage clickOnSave() {
		actions.getElement().clickOn(saveButton);
		return this;
	}

}
