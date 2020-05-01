package com.cbs.phoenix.pageobjects;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.cbs.phoenix.utilities.TestDataProvider;

/**
 *
 *
 */

public class SelectPlaneShow_63261 extends BasePage {
		
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
	
	@FindBy(id="p_show")
	private WebElement searchShow;
	
	@FindBy(xpath="//td[@class='ng-binding']")
	private WebElement selectShow;
	
	@FindBy(xpath="(.//*[normalize-space(text()) and normalize-space(.)='Delete'])[1]/preceding::i[1]")
	private WebElement Planechkbox;
	
	 @FindBy(xpath ="//span[contains(text(), 'Select a daypart')]")
     private WebElement daypart;
    
     @FindBy(xpath ="//a[contains(text(), 'Prime')]")
     private WebElement prime;
     
     
     @FindBy(xpath ="/html/body/div[1]/div/div/show-edit/div[1]/h3")
     private WebElement showname;
     
     private HashMap<String, String> tcData;
	
	
	

	
		public SelectPlaneShow_63261(WebDriver driver) {
			super(driver);
			PageFactory.initElements(driver, this);
			
		}

		public void addsearchshow(TestDataProvider testDataProvider, String testId) throws IOException {
			waitSleep(8);
			
			tcData = testDataProvider.readData(testId);
			
			Inventory.click();
			waitSleep(8);
		
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
			
			 daypart.click();
             waitSleep(5);
            
             prime.click();
             waitSleep(5);
	
             String getshowname=showname.getText();
   		  
   		  System.out.println(getshowname);
			waitSleep(8);
			
			
			save.click();
			waitSleep(7);	  
		 
			
			searchShow.sendKeys(getshowname);
			waitSleep(6);
			
			selectShow.click();	
			waitSleep(4);
			
		/*
		 * takeScreenshot("UnselectedPlanecheckbox"); waitSleep(2);
		 */
			
			addScreenShot();
			waitSleep(2);
			
			Planechkbox.click();
			waitSleep(4);
			
			save.click();
			waitSleep(7);
			
			searchShow.clear();
			
			waitSleep(2);
	
			searchShow.sendKeys(getshowname);
			waitSleep(6);
			
			selectShow.click();	
			waitSleep(4);
			
		/*
		 * takeScreenshot("SelectedPlanecheckbox"); waitSleep(2);
		 */
			
			addScreenShot();
			waitSleep(2);
		}
		
		
	/*
	 * public void searchshow() {
	 * 
	 * searchShow.sendKeys(getshowname); waitSleep(6);
	 * 
	 * }
	 */
		
		
		public void selectshow() {
			
			selectShow.click();	
			waitSleep(4);
				
			}
		
	
		
		
		public boolean isCheckboxselected() {
			
			return Planechkbox.isSelected();
		
			
		}

		public void selectplanecheckbox() {
			// TODO Auto-generated method stub
			Planechkbox.click();
			waitSleep(4);
		}

}
