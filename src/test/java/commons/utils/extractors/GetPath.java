package commons.utils.extractors;

import java.io.File;

/**
 * 
 * @author victor.santos
 *
 */
public class GetPath {

	public final static String RESOURCES_PATH = "src/test/resources/";
	public final static String DATA_PATH = RESOURCES_PATH + "/data/";

	public static File getDataFile(String fileName) {
		return new File(DATA_PATH + fileName);
	}
}
