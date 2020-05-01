/**
 * 
 */
package com.cbs.phoenix.browsermanager;

/**
 *This Factory class works on the principle of Factory Design Patterns.
 *A particular WebDriver is instantiated based on the type of browser selected.
 *
 */
public class DriverManagerFactory {
	
	public static DriverManager getdriveManager(DriverType type) {
		
		DriverManager driverManager;
		
		switch (type) {
		
		case CHROME:
			driverManager = new ChromeDriverManager();
			break;
		case FIREFOX:
			driverManager = new FireFoxDriverManager();
			break;
			
			default:
			driverManager = new ChromeDriverManager();
			break;
		}
		
		return driverManager;
	}

}
