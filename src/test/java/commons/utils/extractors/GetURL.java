package commons.utils.extractors;

import org.aeonbits.owner.ConfigFactory;

import commons.properties.EnvironmentProperties;

/**
 * 
 * @author victor.santos
 *
 */
public class GetURL {

	private static EnvironmentProperties environment = ConfigFactory.create(EnvironmentProperties.class);

	public static String getBaseURL() {
		return environment.getBaseURL();
	}

}
