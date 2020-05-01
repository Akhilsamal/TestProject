/**
 * 
 */
package com.cbs.phoenix.browsermanager;

import org.openqa.selenium.WebDriver;

/**
 * This abstract class gets the driver instance
 *
 */

public abstract class DriverManager {
	
	protected WebDriver driver;
	protected abstract void startBrowserService();
	protected abstract void stopBrowserService();
	protected abstract void createDriver();
	
	
	public WebDriver getDriver() {
		
		if(driver==null) {
			startBrowserService();
			createDriver();
		}
		
		return driver;
	}
	
	
	public void quitDriver() {
		if(driver != null) {
			driver.quit();
			driver = null;
			
		}
	}
	
	
	

}
