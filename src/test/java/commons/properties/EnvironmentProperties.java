package commons.properties;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources({ "classpath:conf/environment.properties" })
public interface EnvironmentProperties extends Config {

	@Key("base.url")
	public String getBaseURL();
	
	@Key("browser")
	public String getBrowser();

}
