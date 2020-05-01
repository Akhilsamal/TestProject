package com.cbs.phoenix.pageobjects;
	
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.cbs.phoenix.utilities.TestDataProvider;

public class EditSalesShowPage_53511 extends BasePage {
				
	@FindBy(xpath = "//a[@title='Inventory']/span")
	private WebElement Inventory;
			
	@FindBy(xpath = "//a[@title='Airings']") 
	private WebElement Airings;
			
	@FindBy(xpath = "//a[@title='Shows']")
	private WebElement shows;

	@FindBy(name = "shows")
	private WebElement searchshow;		
			
	@FindBy(xpath = "//input[@id=\"p_show\"]")
	private WebElement searchshowbox;	
			
	@FindBy(xpath = "/html/body/phoenix-wrapper/div[2]/div/div/show-search/div/div[3]/table/tbody/tr[2]/td[1]")
	private WebElement showselect;
					
	@FindBy(xpath = "//input[@name='longName']")
	private WebElement longname;	
					
	@FindBy(xpath = "//input[@name='shortName']")
	private WebElement shortname;	
			
	@FindBy(xpath = "//button[contains(text(),'Save')]")
	private WebElement save;	
	
	@FindBy(xpath = "//input[@class='form-control ng-pristine ng-untouched ng-valid ng-not-empty ng-valid-required ng-valid-maxlength']")
	private WebElement durationbtn;
		
	private HashMap<String, String> tcData;
				
	
	public EditSalesShowPage_53511(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);		
				}
						
	public void editshowpage(TestDataProvider testDataProvider, String testId) {
				
			tcData = testDataProvider.readData(testId);
				
				waitSleep(9);
				Inventory.click();
				waitSleep(8);
				
				shows.click();
				waitSleep(5);			
			
				searchshowbox.sendKeys(tcData.get("LongName"));
				waitSleep(7);
					
				showselect.click();
				waitSleep(5);
					
				/*longname.clear();
				longname.sendKeys(tcData.get("EditedName"));
				waitSleep(5);
					
				shortname.clear();
				shortname.sendKeys(tcData.get("EditedShortName"));
				waitSleep(5);*/
		
				
				durationbtn.clear();
				durationbtn.sendKeys(tcData.get("EditedDuration"));
				waitSleep(5);
				
				
				Select freQuency4 = new Select(driver.findElement(By.xpath("//select[@name='frequency']")));
				freQuency4.selectByVisibleText(tcData.get("EditedFrequency"));
				waitSleep(5);
					
				save.click();
				waitSleep(8);
					
				searchshowbox.clear();
				searchshowbox.sendKeys(tcData.get("LongName"));
				waitSleep(7);
					
				searchshowbox.clear();
				searchshowbox.sendKeys(tcData.get("EditedName"));
				waitSleep(7);
			}		
}
