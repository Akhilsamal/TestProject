package com.cbs.phoenix.pageobjects;

import java.util.HashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.cbs.phoenix.reports.ExtentTestManager;
import com.cbs.phoenix.utilities.TestDataProvider;
import com.relevantcodes.extentreports.LogStatus;


public class AddShowPage extends BasePage {
		
	@FindBy(xpath = "//a[@title='Inventory']/span")
	private WebElement Inventory;
	
	
	@FindBy(xpath = "//a[@title='Shows']")
	private WebElement shows;

	
	@FindBy(xpath = "//button[text()='Add Show']")
	private WebElement addshowbtn;
	
	
	@FindBy(xpath = "//input[@name='longName']")
	private WebElement longname;	
	
	
	@FindBy(xpath = "//input[@name='shortName']")
	private WebElement shortname;	
	
	@FindBy(xpath = "//button[contains(text(),'Save')]")
	private WebElement save;	
	
	private HashMap<String, String> tcData;
	
	
		public AddShowPage(WebDriver driver) {
			super(driver);
			PageFactory.initElements(driver, this);
			
		}

		public void addshowpage(TestDataProvider testDataProvider, String testId) {
			
			tcData = testDataProvider.readData(testId);
			
			waitSleep(8);
			
			//clickElement(Inventory);
			Inventory.click();
			waitSleep(8);
		
			//clickElement(shows);
			shows.click();
			waitSleep(5);
			
			addshowbtn.click();
			waitSleep(5);
			
			longname.sendKeys(tcData.get("LongName"));
			waitSleep(3);
			
			shortname.sendKeys(tcData.get("ShortName"));
			waitSleep(3);
			
			Select freQuency = new Select(driver.findElement(By.xpath("//select[@name='frequency']")));
			freQuency.selectByIndex(1);
	
			waitSleep(5);
			
			save.click();
			
			addScreenShot();
			
			 ExtentTestManager.getTest().log(LogStatus.PASS,"New show - "+tcData.get("LongName")+" added successfully");
			
			waitSleep(3);
			
		}

}
