/**
 * 
 */
package com.cbs.phoenix.browsermanager;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.cbs.phoenix.config.Constants;

/**
 *This webdriver class extends the driver manager class to instantiate the driver according
 *to the required desired capabilities and environments.
 *
 */

public class ChromeDriverManager extends DriverManager{
	
	private ChromeDriverService chromeService;

	@Override
	protected void startBrowserService() {

		if(chromeService == null) {
			
			 try {
				 chromeService = new ChromeDriverService.Builder()
					        .usingDriverExecutable(new File(Constants.CHROME_DRIVER_PATH))
					        .usingAnyFreePort()
					        .build();
				 chromeService.start();
			 } catch(Exception e) {
				 e.printStackTrace();
			 }
		}
		
	}

	@Override
	protected void stopBrowserService() {
		if(chromeService != null && chromeService.isRunning()) {
			chromeService.stop();
		}
		
	}

	@Override
	protected void createDriver() {

		Map<String, Object> chromePreferences = new HashMap<String, Object>();
		
		chromePreferences.put("profile.default_content_settings.popups", "0");
		chromePreferences.put("download.prompt_for_download", "false");
		chromePreferences.put("download.directory_upgrade", "true");
		
		chromePreferences.put("download.default_directory",Constants.DOWNLOAD_FILES_PATH);
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setExperimentalOption("prefs", chromePreferences);
		chromeOptions.addArguments("test-type");
		chromeOptions.addArguments("start-maximized");
		chromeOptions.addArguments("disable-infobars");
		
		// Create an object of desired capabilities class with Chrome driver
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		// Set the pre defined capability – ACCEPT_SSL_CERTS value to true
		capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		chromeOptions.merge(capabilities);
		
		driver = new ChromeDriver(chromeService, chromeOptions);
		
	}

}
