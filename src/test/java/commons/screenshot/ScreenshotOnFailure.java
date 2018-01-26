package commons.screenshot;

import org.junit.rules.MethodRule;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.qameta.allure.Attachment;

public class ScreenshotOnFailure implements MethodRule {

	private WebDriver driver;

	public ScreenshotOnFailure(WebDriver driver) {
		this.driver = driver;
	}

	@Override
	public Statement apply(Statement statement, FrameworkMethod frameworkMethod, Object object) {
		return new Statement() {
			@Override
			public void evaluate() throws Throwable {
				try {
					statement.evaluate();
				} catch (Throwable t) {
					createAttachment();
					throw t;
				}
			}

			@Attachment(value = "Tela onde ocorreu o problema.")
			private byte[] createAttachment() {
				return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			}
		};
	}
}
