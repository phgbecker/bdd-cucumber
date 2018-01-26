package commons.utils.extractors;

import org.aeonbits.owner.ConfigFactory;

import commons.properties.EnvironmentProperties;

/**
 * 
 * @author victor.santos
 *
 */
public class GetURL {

	private EnvironmentProperties environment;
	
	public GetURL() {
		environment = ConfigFactory.create(EnvironmentProperties.class);
	}

	public String getBaseURL() {
		return "http://" + environment.host();
	}

}
