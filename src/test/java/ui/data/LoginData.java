package ui.data;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

import commons.utils.extractors.GetPath;

/**
 * 
 * @author victor.santos
 *
 */
public class LoginData {

	private String username;
	private String password;

	@JsonProperty
	public String getUsername() {
		return username;
	}

	@JsonProperty
	public String getPassword() {
		return password;
	}

	public static LoginData init(String fileName) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.readValue(GetPath.getDataFile("login/" + fileName + ".json"), LoginData.class);
		} catch (IOException e) {
			e.printStackTrace();
			throw e;
		}
	}
}
