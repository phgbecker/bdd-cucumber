package commons.utils.actions;

import org.openqa.selenium.WebDriver;

import commons.utils.actions.elements.ElementActions;
import commons.utils.actions.keyboard.KeyboardActions;
import commons.utils.actions.wait.WaitElementUtils;

/**
 * 
 * @author victor.santos
 *
 */
public class ActionsUtils {

	private ElementActions element;
	private KeyboardActions keyboard;
	private WaitElementUtils wait;
	
	public ActionsUtils(WebDriver driver) {
		setElement(new ElementActions(driver));
		setKeyboard(new KeyboardActions(driver));
		setWait(new WaitElementUtils(driver));
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

	public WaitElementUtils getWait() {
		return wait;
	}

	public void setWait(WaitElementUtils wait) {
		this.wait = wait;
	}

}
