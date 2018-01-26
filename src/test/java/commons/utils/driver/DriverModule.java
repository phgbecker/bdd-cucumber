package commons.utils.driver;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;

import commons.utils.driver.chrome.ChromeDriverManager;

/**
 * 
 * @author victor.santos
 *
 */
public class DriverModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(DriverManager.class)
			.to(ChromeDriverManager.class)
			.in(Scopes.SINGLETON);
	}

}
