package commons.utils.extractors;

public class GetDriverFile {

	public static String chromeDriverWindows() {
		return "src/test/resources/drivers/chromedriver.exe";
	}
	
	public static String chromeDriverLinux() {
		return "src/test/resources/drivers/chromedriver";
	}
}
