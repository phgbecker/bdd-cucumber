package suite.ui.pages.portal.cards;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commons.BasePage;

public class CardsPage extends BasePage {

	public CardsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "input.se-field")
	private WebElement searchInput;
	@FindBy(css = "a.clearfix.element")
	private List<WebElement> cards;
	@FindBy(css = "header > h3")
	private WebElement cardTitle;

	public CardsPage fillInSearch(String search) {
		actions.getElement().fillIn(searchInput, search);
		actions.getKeyboard().enter(searchInput);
		return this;
	}

	public CardsPage clickOnCard() {
		for (WebElement card : cards) {
			if (actions.getElement().isDisplayed(card)) {
				actions.getElement().clickOn(card);
				break;
			}
		}
		return this;
	}
	
	public String getCardTitle() {
		return actions.getElement().getElementContent(cardTitle);
	}
}
