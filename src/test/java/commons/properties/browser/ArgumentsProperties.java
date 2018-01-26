package commons.properties.browser;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources({ "classpath:conf/browser/arguments.properties" })
public interface ArgumentsProperties extends Config {

	@Key("browser")
	public String getBrowser();

	@Key("chrome.headless")
	public boolean isChromeHeadless();

	@Key("display")
	public String getDisplay();
}
