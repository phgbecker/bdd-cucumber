package commons.utils.driver.chrome;

import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import commons.utils.driver.DriverManager;
import commons.utils.extractors.GetDriverFile;
import commons.utils.extractors.GetSO;

public class ChromeDriverManager extends DriverManager {

	private ChromeDriverService chromeService;

	@Override
	protected void startService() {
		if (chromeService == null) {
			try {
				chromeService = new ChromeDriverService.Builder().usingDriverExecutable(new File(
						GetSO.isWindows() ? GetDriverFile.chromeDriverWindows() : GetDriverFile.chromeDriverLinux()))
						.usingAnyFreePort().build();
				chromeService.start();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	protected void createDriver() {
		driver = new ChromeDriver(chromeService, BrowserOptions.chrome());
		try {
			throw new RuntimeException();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void stopService() {
		if (chromeService != null && chromeService.isRunning()) {
			chromeService.stop();
		}
	}
}
