package com.cbs.phoenix.pageobjects;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cbs.phoenix.reports.ExtentTestManager;
import com.cbs.phoenix.utilities.TestDataProvider;
import com.relevantcodes.extentreports.LogStatus;

public class Notification_ChangeRequestPage_44977 extends BasePage {
	public Notification_ChangeRequestPage_44977(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "/html[1]/body[1]/phoenix-wrapper[1]/div[1]/phoenix-nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
	private WebElement notification;
	
	@FindBy(xpath = "//span[contains(text(),'Approvals')]")
	private WebElement approvals;

	@FindBy(xpath = "//input[@placeholder='Search approvals...']")
	private WebElement searchapprovals;

	@FindBy(xpath = "//input[@placeholder='Search notifications']")
	private WebElement searchnotifications;
	
	@FindBy(xpath = "//a[@class='btn btn-sm btn-info ng-scope']")
	private WebElement switchuserbtn;

	@FindBy(xpath = "/html[1]/body[1]/phoenix-wrapper[1]/div[2]/div[1]/div[1]/phoenix-login[1]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/input[1]")
	private WebElement selectuser;
	
	@FindBy(xpath = "//span[@class='user-name text-bold-700 ng-binding']")
	private WebElement userlogin;
	
	@FindBy(xpath = "//button[@class='dropdown-item ng-binding ng-scope']")
	private WebElement select;
	
	@FindBy(xpath = "//span[contains(text(),'Planner_Dropdown')]")
	private WebElement selectdvp ;	
	
	@FindBy(xpath = "/html[1]/body[1]/phoenix-wrapper[1]/div[2]/div[1]/div[1]/user-approvals[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
	private WebElement searchapprovals1;
	
	@FindBy(xpath = "/html[1]/body[1]/phoenix-wrapper[1]/div[2]/div[1]/div[1]/user-approvals[1]/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/a[1]/div[2]")
	private WebElement selectdeal;	
	
	@FindBy(xpath = "//button[@class='btn btn-danger btn-sm']")
	private WebElement clickRejectbtn;

	@FindBy(xpath = "//button[contains(text(),'Comments')]")
	private WebElement commenttab;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter comments...']")
	private WebElement comments;
	
	@FindBy(xpath = "//input[@placeholder='Search by Deal or Order #']")
	private WebElement searchdeal;		
	
	@FindBy(xpath = "/html/body/phoenix-wrapper/div[2]/div/div[1]/ui-view/deal/div/div/div[2]/div/deal-hold-order/div[1]/ul/li[3]/a")
	private WebElement CR;	
	
	@FindBy(xpath = "/html/body/phoenix-wrapper/div[2]/div/div[1]/ui-view/deal/div/div/div[2]/ul/li[4]/a")
	private WebElement clickOrder;
	
	@FindBy(xpath = "//span[text()='Reporting']")
	private WebElement ReportingLink;
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement serachreportpanel;
	

	
	private HashMap<String, String> tcData;

	

	public void approval(TestDataProvider testDataProvider, String testId) throws IOException {

		tcData = testDataProvider.readData(testId);
		
		
		///////UFT Integration ........
		 
	
		//Login with DVP and reject the deal
		
		 waitSleep(9); 
		  userlogin.click(); 
		  waitSleep(5);
		  
		  switchuserbtn.click(); 
		  waitSleep(5);
		  
		  selectuser.click(); 
		  waitSleep(6);
		  
		  selectuser.sendKeys(tcData.get("Daytime DVP")); 
		  waitSleep(6);
		  selectdvp.click(); 
		  waitSleep(8);
		  
		  ExtentTestManager.getTest().log(LogStatus.PASS,"Logged in with DVP");
		  addScreenShot(); 
		  
		  approvals.click(); 
		  waitSleep(5);
		 
		  searchapprovals1.sendKeys(tcData.get("DealNum")); 
		  //searchapprovals1.sendKeys("43725");
		  
		  waitSleep(5);
		  
		 
		  
		  ExtentTestManager.getTest().log(LogStatus.PASS,"Daytime DVP got the notification");
		  addScreenShot(); 
		  waitSleep(4);
		 
		  selectdeal.click();
		  waitSleep(25);
		  
		  ExtentTestManager.getTest().log(LogStatus.PASS,"User is on Approval Page ");
		  addScreenShot(); 
		  waitSleep(4);  
		
		  
		  waitSleep(5);
		  commenttab.click();
		  waitSleep(5);
			  
		  comments.sendKeys("Test Automation- CR is Rejected");
		  waitSleep(5);
		  ExtentTestManager.getTest().log(LogStatus.PASS,"Reject the deal with commentline ");
		  addScreenShot(); 
		  clickRejectbtn.click();
		  waitSleep(50); 
		  ExtentTestManager.getTest().log(LogStatus.PASS,"User rejected the deal  ");
		  

		  
		  
		  /////UFT Integration.......mail notification
	

	}

}
