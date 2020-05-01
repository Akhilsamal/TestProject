/**
 * 
 */
package com.cbs.phoenix.pageobjects;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cbs.phoenix.reports.ExtentTestManager;
import com.relevantcodes.extentreports.LogStatus;

/**
 * This class contains all the reusable method that will be used by the various page class
 *
 */
public class BasePage {
	
	public WebDriver driver;
	
	@FindBy(xpath= "//input[@id='searchText']")
	private WebElement searchBox;
	

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	/**
	 * @return the searchBox
	 */
	public WebElement getSearchBox() {
		return searchBox;
	}


	/*
	 * Scroll to the Bottom of the Page
	 */
	public void scrollToPageBottom() {
		
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	
	/*
	 * Scroll to the specific element of the page
	 */
	public void scrollToElementLoc(WebElement element) {
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	
	/*
	 * Scroll to the Top of the page
	 */
	public void scrollToPageTop() {
		
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0,0)");
	}
	
	
	
	/*
	 * This test method waits for page to load it's dom hierarchy completely
	 */
	public void waitForPageLoad(long seconds) {

	    Wait<WebDriver> wait = new WebDriverWait(driver, seconds);
	    wait.until(new Function<WebDriver, Boolean>() {
	        public Boolean apply(WebDriver driver) {
	           
	            return String
	                .valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState"))
	                .equals("complete");
	        }
	    });
	}
	
	public void waitSleep(int seconds) {
		
		try {
			int secs = seconds * 1000;
			Thread.sleep(secs);
		}catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		
	}
	
	public void implicitWait(long seconds) {
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
		
	}
	
	
	public String replaceString(String str) {
		
		return str = str.replaceAll("\\\\", "/");
		
	}
	
	public void searchBox(WebElement dropdown, String searchTxt) {
		
		dropdown.click();
		
		waitSleep(2);
		
		searchBox.sendKeys(searchTxt);
		
		driver.findElement(By.xpath("//a/span[text()='"+searchTxt+"']")).click();
	}
	
	
	public void clickElement(WebElement element) {
		while(true) {
			try {
				element.click();
				
				break;
				
			}catch(Exception e) {
				try {
					Thread.sleep(200);
				}catch(InterruptedException ex) {
					ex.printStackTrace();
				}
			}
		}
	}
	
	/*
	* Waits for the element to be visible
	*/
	public void waitUntilVisible(WebElement element){
	System.out.println("Waiting for the element to be visible");
	new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(element));
	System.out.println("Element is visible");
	}


	/*
	* Waits for the element to be invisible
	*/
	public void waitToInvisible(String xpathName){
	System.out.println("Waiting for the element to be invisible");
	new WebDriverWait(driver, 30).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpathName)));
	System.out.println("Element is invisible");
	}

	
	
	public void addScreenShot(){
		
		  String url = driver.getCurrentUrl();
		  String base64Screenshot = "data:image/png;base64,"+((TakesScreenshot)driver).
              getScreenshotAs(OutputType.BASE64);

	        //ExtentTestManager.getTest().log(LogStatus.PASS,"TestCase ScreenShot: "+ExtentTestManager.getTest().addBase64ScreenShot(base64Screenshot));
	        
	        ExtentTestManager.getTest().log(LogStatus.PASS,ExtentTestManager.getTest().addBase64ScreenShot(base64Screenshot));
	        
	       //ExtentTestManager.getTest().log(LogStatus.FAIL,"Failed TestCase URL: <a href="+url+">LUM Application Link</a>");
		
	}
	
	
	public  void Failedscreenshot() {
		
		 String url = driver.getCurrentUrl();
		  String base64Screenshot = "data:image/png;base64,"+((TakesScreenshot)driver).
             getScreenshotAs(OutputType.BASE64);

	        //ExtentTestManager.getTest().log(LogStatus.PASS,"TestCase ScreenShot: "+ExtentTestManager.getTest().addBase64ScreenShot(base64Screenshot));
	        
	        ExtentTestManager.getTest().log(LogStatus.FAIL,ExtentTestManager.getTest().addBase64ScreenShot(base64Screenshot));
		
		 //String url = driver.getCurrentUrl();
		  //String base64Screenshot = "data:image/png;base64,"+((TakesScreenshot)driver).
            // getScreenshotAs(OutputType.BASE64);
		  //ExtentTestManager.getTest().log(LogStatus.FAIL,"Failed TestCase URL: <a href="+url+">LUM Application Link</a>");
		
	}


}
