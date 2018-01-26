package commons.utils.actions;

import org.openqa.selenium.WebDriver;

import commons.utils.actions.elements.ElementActions;
import commons.utils.actions.extractor.ExtractorActions;
import commons.utils.actions.keyboard.KeyboardActions;
import commons.utils.actions.wait.WaitActions;

/**
 * 
 * @author victor.santos
 *
 */
public class ActionsUtils {

	private ElementActions element;
	private ExtractorActions extractor;
	private KeyboardActions keyboard;
	private WaitActions wait;

	private ActionsUtils(WebDriver driver) {
		setElement(ElementActions.init(driver));
		setExtractors(ExtractorActions.init(driver));
		setKeyboard(KeyboardActions.init(driver));
		setWait(WaitActions.init(driver));
	}

	public static ActionsUtils init(WebDriver driver) {
		return new ActionsUtils(driver);
	}

	public ElementActions getElement() {
		return element;
	}

	public void setElement(ElementActions element) {
		this.element = element;
	}

	public KeyboardActions getKeyboard() {
		return keyboard;
	}

	public void setKeyboard(KeyboardActions keyboard) {
		this.keyboard = keyboard;
	}

	public WaitActions getWait() {
		return wait;
	}

	public void setWait(WaitActions wait) {
		this.wait = wait;
	}

	public ExtractorActions getExtractors() {
		return extractor;
	}

	public void setExtractors(ExtractorActions extractor) {
		this.extractor = extractor;
	}

}
