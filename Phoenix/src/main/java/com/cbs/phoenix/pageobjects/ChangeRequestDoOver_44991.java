package com.cbs.phoenix.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cbs.phoenix.reports.ExtentTestManager;
import com.cbs.phoenix.utilities.TestDataProvider;
import com.relevantcodes.extentreports.LogStatus;

import java.io.IOException;
import java.util.*;

public class ChangeRequestDoOver_44991 extends BasePage {
		
		@FindBy(xpath = "/html/body/phoenix-wrapper/div[2]/div/div/schedule-wrapper/div/div[1]/div/fieldset/input")
		private WebElement textbox;
				
		@FindBy(xpath = "//li[text()='Custom Range']")
		private WebElement custom ;
		
		@FindBy(xpath = "//button[text()='Cancel']")
		private WebElement cancel ;
		
		@FindBy(xpath = "//button[text()='Apply']")
		private WebElement apply ;
		
		@FindBy(xpath = "//span[@class='user-name text-bold-700 ng-binding']")
		private WebElement userlogin;
		
		@FindBy(xpath = "//a[@class='btn btn-sm btn-info ng-scope']")
		private WebElement switchuserbtn;
		
		@FindBy(xpath = "//*[@placeholder='Search by name or user group name']")
		private WebElement selectuser;
		
		@FindBy(xpath = "//button[@class='dropdown-item ng-binding ng-scope']")
		private WebElement select;
		
		@FindBy(xpath = "//*[text()='Sales Units']")
		private WebElement salesUnits;
		
		@FindBy(xpath = "//*[text()='Yes']")
		private WebElement yesBTN;
		
		@FindBy(xpath = "(//*[text()='None'])[1]")
		private WebElement statusNoneBTN;
		
		@FindBy(xpath = "//*[text()='Approvals']")
		private WebElement approvals;
		
		@FindBy(xpath = "//*[@placeholder='Search approvals']")
		private WebElement searchApprovals;
		
		@FindBy(xpath = "//*[@class='media-list media-bordered']//descendant::a[@class='media']")
		private WebElement searchResult;
		
		@FindBy(xpath = "//*[contains(text(),'Do Over')]")
		private WebElement doOver;

		@FindBy(xpath = "//*[@placeholder='Search by Deal or Order #']")
		private WebElement searchbyDeal;
		
		@FindBy(xpath = "//*[@class='nav-item ng-scope']//descendant::a[contains(text(),'Order')]")
		private WebElement orderLink;
		
		@FindBy(xpath = "//*[@class='d-flex mt-1']//descendant::a[text()='Change Requests']")
		private WebElement changeRequest;
		
		private HashMap<String, String> tcData;
		
		public ChangeRequestDoOver_44991(WebDriver driver) {
			
			super(driver);
			PageFactory.initElements(driver, this);
		}

		public void chgRequestDoOver(TestDataProvider testDataProvider, String testId) throws IOException {

			tcData = testDataProvider.readData(testId);
			
			//UFT STEPS
			
			waitSleep(9);
			userlogin.click();
			
			waitSleep(3);
			switchuserbtn.click(); 
			waitSleep(3);
			 
			selectuser.click(); waitSleep(6);
			/*
			 * Login using Super Approver user
			 */
			  
			selectuser.sendKeys(tcData.get("Super Approver")); 
			waitSleep(6);
			select.click();
			  
			waitSleep(8);				
			approvals.click();
			
			waitSleep(8);
			waitUntilVisible(searchApprovals);
			searchApprovals.sendKeys(tcData.get("OrderNum"));
			
			ExtentTestManager.getTest().log(LogStatus.PASS,"Super Approver can see the Plan Request for Approval");
			System.out.println("Super Approver can see the Plan Request for Approval");
			
			waitSleep(5);
			addScreenShot();
			
			userlogin.click(); 
			waitSleep(3);
			
			switchuserbtn.click(); 
			waitSleep(3);
			 
			selectuser.click(); waitSleep(6);
			
			/*
			 * Login using Daytime DVP user
			 */
			  
			selectuser.sendKeys(tcData.get("Daytime DVP")); 
			waitSleep(6);
			select.click(); 
			  
			waitSleep(8);
			approvals.click();
			
			waitSleep(8);
			searchApprovals.sendKeys(tcData.get("OrderNum"));
			
			ExtentTestManager.getTest().log(LogStatus.PASS,"Daytime DVP can see the Plan Request for Approval");
			System.out.println("Daytime DVP can see the Plan Request for Approval");
			
			waitSleep(5);
			addScreenShot();			
			
			searchResult.click();
			waitToInvisible("//*[text()='Loading ...']");
			
			waitUntilVisible(doOver);
			waitSleep(6);
			
			ExtentTestManager.getTest().log(LogStatus.PASS,"Daytime DVP clicks on DoOver button");
			System.out.println("Daytime DVP clicks on DoOver button");
			doOver.click();
			waitSleep(10);
			addScreenShot();
			
			waitSleep(5);
			searchbyDeal.click();
			
			searchbyDeal.sendKeys(tcData.get("OrderNum"));
			searchbyDeal.sendKeys(Keys.ENTER);
			
			waitSleep(8);
			orderLink.click();
			
			ExtentTestManager.getTest().log(LogStatus.PASS,"Daytime DVP verifies the Status in change request");
			System.out.println("Daytime DVP verifies the Status in change request");
			
			waitSleep(8);
			changeRequest.click();
			
			waitSleep(5);
			addScreenShot();
			
			//UFT STEPS
		}
}