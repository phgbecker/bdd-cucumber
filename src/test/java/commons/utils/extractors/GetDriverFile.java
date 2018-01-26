package commons.utils.extractors;

public class GetDriverFile {

	private static final String BASE_DRIVER_DIR = "src/test/resources/drivers"; 
	
	public static String chromeDriverWindows() {
		return BASE_DRIVER_DIR + "/chromedriver.exe";
	}
	
	public static String chromeDriverLinux() {
		return BASE_DRIVER_DIR + "/chromedriver";
	}
}
