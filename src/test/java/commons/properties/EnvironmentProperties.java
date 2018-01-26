package commons.properties;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources({ "classpath:conf/environment.properties" })
public interface EnvironmentProperties extends Config {
	@Key(value = "host")
	@DefaultValue("mark7.herokuapp.com")
	String host();
}
