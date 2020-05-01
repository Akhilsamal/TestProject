/**
 * 
 */
package com.cbs.phoenix.testcases;

import java.util.HashMap;
import java.util.function.Function;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.cbs.phoenix.browsermanager.DriverManager;
import com.cbs.phoenix.browsermanager.DriverManagerFactory;
import com.cbs.phoenix.browsermanager.DriverType;
import com.cbs.phoenix.config.Constants;
import com.cbs.phoenix.reports.ExtentManager;
import com.cbs.phoenix.reports.ExtentTestManager;
import com.relevantcodes.extentreports.LogStatus;

/**
 * 
 *
 */
public class BaseTest {

	private DriverManager driverManager;
	public WebDriver driver;
	//public TestDataProvider testDataProvider;
	private static HashMap<Long, WebDriver> driverThreadMap = new HashMap<Long, WebDriver>();

	public static WebDriver getDriver() {

		return driverThreadMap.get(Thread.currentThread().getId());
	}

	/**
	 * @return the driverManager
	 */
	public DriverManager getDriverManager() {
		return driverManager;
	}

	/**
	 * @param driver the driver to set
	 */
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	
	@BeforeSuite
	public void beforesuit() {
		
		//ExtentTestManager.startTest("Application open", "Phoenix Application Launching");
		//ExtentTestManager.startTest("", "");
		//ExtentTestManager.getTest().log(LogStatus.INFO, "");
		//ExtentTestManager.getTest().log(LogStatus.INFO, "Application is up and running");
	}
	
	
	
	

	/*
	 * This setup method instantiate the chrome driver
	 */
	
	
	
	@BeforeMethod
	public void setUp() {
		
		//ExtentTestManager.startTest("Phoenix Application", "Phoenix Application Launching");
		//ExtentTestManager.startTest("", "");

		driverManager = DriverManagerFactory.getdriveManager(DriverType.CHROME);
		
		

		driverThreadMap.put(Thread.currentThread().getId(), 
		driverManager.getDriver());

		setDriver(driverThreadMap.get(Thread.currentThread().getId()));
		
		//ExtentTestManager.getTest().log(LogStatus.PASS, "Browser Started");

	}
	
	@AfterMethod
	public void afterMethod() {
		
		ExtentTestManager.getTest().log(LogStatus.PASS, "Browser Closed Successfully");
		
		ExtentManager.getReporter().flush();

		//driverManager.quitDriver();
	}
	

	@AfterSuite
	public void aftersuite() {
		
		//ExtentTestManager.getTest().log(LogStatus.PASS, "Browser Closed Successfully");
		
		ExtentManager.getReporter().flush();

	//	driverManager.quitDriver();
	}

	/*@BeforeSuite(dependsOnMethods = { "setUp" })
	public void Launch_Phoenix_Application() {
		
		
		getDriver().get(Constants.APP_URL);

		getDriver().manage().window().maximize();

		waitForPageLoad(5);
		
		ExtentTestManager.getTest().log(LogStatus.PASS, "Application is up and running");
	}*/
	
	@BeforeMethod(dependsOnMethods = { "setUp" })
	public void Launch_Phoenix_Application() {
		
		//ExtentTestManager.getTest().log(LogStatus.PASS, "Browser Started");

	
		getDriver().get(Constants.APP_URL);

		getDriver().manage().window().maximize();

		waitForPageLoad(5);
		
		//ExtentTestManager.getTest().log(LogStatus.PASS, "Application is up and running");
	}

	public void waitForPageLoad(long seconds) {

		Wait<WebDriver> wait = new WebDriverWait(driver, seconds);
		wait.until(new Function<WebDriver, Boolean>() {
			public Boolean apply(WebDriver driver) {

				return String.valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState"))
						.equals("complete");
			}
		});
	}

	/*
	 * @BeforeMethod(alwaysRun = true) public void beforeTest(Method method) {
	 * 
	 * testDataProvider = new TestDataProvider("TD_Demo");
	 * 
	 * Test testClass = method.getAnnotation(Test.class);
	 * 
	 * for(int i=0; i < testClass.groups().length; i++) {
	 * 
	 * switch(testClass.groups()[i]) {
	 * 
	 * } }
	 * 
	 * 
	 * }
	 */
}
