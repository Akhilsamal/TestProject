package com.cbs.phoenix.pageobjects;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cbs.phoenix.reports.ExtentTestManager;
import com.cbs.phoenix.utilities.TestDataProvider;
import com.relevantcodes.extentreports.LogStatus;

public class Notification_MSUApprovePage_45049 extends BasePage {
	
	public Notification_MSUApprovePage_45049(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}


	
	@FindBy(xpath = "//span[contains(text(),'Notifications')]")
	private WebElement notification;

	@FindBy(xpath = "//span[contains(text(),'Approvals')]")
	private WebElement approvals;

	@FindBy(xpath = "//input[@placeholder='Search approvals']")
	private WebElement searchapprovals;
	
	@FindBy(xpath = "//input[@placeholder='Search notifications']")
	private WebElement searchnotifications;
	
	@FindBy(xpath = "//a[@class='media']")
	private WebElement selectdeal;
	
	@FindBy(xpath = "//span[@class='user-name text-bold-700 ng-binding']")
	private WebElement userlogin;

	@FindBy(xpath = "//a[contains(text(),'Switch User')]")
	private WebElement switchuserbtn;
	
	@FindBy(xpath = "//button[@class='dropdown-item ng-binding ng-scope']")
	private WebElement select;
		
	@FindBy(xpath = "//input[@placeholder='Search by name or user group name']")
	private WebElement selectuser;

	@FindBy(xpath = "//button[1]")
	private WebElement clickYesBtn;
	
	@FindBy(xpath = "(//button[@type='button'])[2]")
	private WebElement clickRejectbtn;
	
	@FindBy(xpath = "//button[@type='button'][1]")
	private WebElement clickApprovebtn;
	@FindBy(xpath = "/html[1]/body[1]/phoenix-wrapper[1]/div[2]/div[1]/div[1]/user-approvals[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
	private WebElement searchapprovals1;
	
	@FindBy(xpath = "/html/body/phoenix-wrapper/div[2]/div/div[1]/ui-view/deal/div/div/div[2]/div/deal-hold-order/div[1]/ul/li[2]/a")
	private WebElement OrderDetails ;
	
	@FindBy(xpath = "/html/body/phoenix-wrapper/div[2]/div/div[1]/ui-view/deal/div/div/div[2]/ul/li[4]/a")
	private WebElement	 OrderLink ;
	
	@FindBy(xpath = "/html[1]/body[1]/phoenix-wrapper[1]/div[2]/div[1]/div[1]/ui-view[1]/deal[1]/div[1]/div[1]/div[2]/div[1]/deal-hold-order[1]/div[1]/ul[1]/li[3]/a[1]")
	private WebElement ChangeRequest ;
	
	@FindBy(xpath = "//input[@placeholder='Search by Deal or Order #']")
	private WebElement searchdeal;	
	
	@FindBy(xpath = "//span[text()='Reporting']")
	private WebElement ReportingLink;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement serachreportpanel;
	
	
	@FindBy(xpath = "/html/body/phoenix-wrapper/div[2]/div/div[1]/user-notifications/div[1]/div[1]/div[2]/div[1]/div/input")
	private WebElement serachnotification;
	
	
	


	
	

	
		
	private HashMap<String, String> tcData;


	public void approval2(TestDataProvider testDataProvider, String testId) throws IOException {

		tcData = testDataProvider.readData(testId);

		// TC_45049 (Automation Regression : Web Approvals - MSU - Flip unit on Scatter Order)

		
		
		
		
		//UFT INTEGRATION***********************
		
		
		
		
		//Login with SA to check notification
		
		 waitSleep(9);		 
		 ExtentTestManager.getTest().log(LogStatus.INFO," Automation Regression : Web Approvals - MSU - Flip unit on Scatter Order");
		 userlogin.click(); 
		 waitSleep(5);
		  
		 switchuserbtn.click(); 
		 waitSleep(5);
		  
		 selectuser.click(); 
	     waitSleep(6);
		  
		 selectuser.sendKeys(tcData.get("Super Approver"));
	    
		 waitSleep(6);
		 select.click(); 
		 waitSleep(4);
		 
		 ExtentTestManager.getTest().log(LogStatus.PASS,"Logged in with SA");
		 addScreenShot();
		  
		// notification.click();
		 //waitSleep(4);
		 
		 approvals.click(); 
		 waitSleep(5);
		 
		 searchapprovals1.sendKeys(tcData.get("DealNum")); 
		  waitSleep(5);	 
		 
		 ExtentTestManager.getTest().log(LogStatus.PASS,"  SA received notification for approval in web ");
		 addScreenShot();		
		
		  // for approval by DVP
		  waitSleep(9); 
		  userlogin.click(); 
		  waitSleep(5);
		  
		  switchuserbtn.click(); 
		  waitSleep(5);
		  
		  selectuser.click(); 
		  waitSleep(6);
		  
		  selectuser.sendKeys(tcData.get("Daytime DVP")); 
		  waitSleep(6);
		  
		  select.click(); 
		  waitSleep(8);
		  
		  
		  ExtentTestManager.getTest().log(LogStatus.PASS,"Logged in with DVP ");
		  addScreenShot();
		  
		  approvals.click(); 
		  waitSleep(5);
		 
		  searchapprovals1.sendKeys(tcData.get("DealNum")); 
		  waitSleep(7);
		  
		  ExtentTestManager.getTest().log(LogStatus. PASS,"DVP got the notification for approval");
		  addScreenShot();
		  System.out.println("DVP got the notification for approval");
		  selectdeal.click();
		  waitSleep(20); 	
		
		  
		  ExtentTestManager.getTest().log(LogStatus. PASS,"Change Request Details  Page opened");		 	  
		  addScreenShot(); 
		  waitSleep(2);   
		 
		  clickApprovebtn.click(); 
		  waitSleep(40);
		  
		  ExtentTestManager.getTest().log(LogStatus.PASS,"DVPaccepted the Plan Request" ); 
		  System.out.println("DVP accepted the Plan Request");
		  
		  addScreenShot(); 
		  waitSleep(2);
		  
		  searchdeal.click();
		  waitSleep(5);
		  searchdeal.sendKeys(tcData.get("DealNum"));
		  waitSleep(5);		 
		  searchdeal.sendKeys(Keys.ENTER);
		  waitSleep(20);		 
		  OrderLink.click();
		  waitSleep(6);	  
		  ExtentTestManager.getTest().log(LogStatus.PASS," OrderLink opened successfully. ");
		  addScreenShot();
		  waitSleep(6);
		  
		  //verify CR Status
		  OrderDetails.click();
		  ExtentTestManager.getTest().log(LogStatus.PASS,"Order Details validated successfully .");
		  addScreenShot();
		  
		  waitSleep(5);		  
		  ChangeRequest.click();
		  waitSleep(5);		  
		  ExtentTestManager.getTest().log(LogStatus.PASS,"CR Status validated successfully .");
		  addScreenShot();
		  
		  
		//Login with SA again to check notification should not be there
			
			 waitSleep(5);	
			 
			 userlogin.click(); 
			 waitSleep(5);
			  
			 switchuserbtn.click(); 
			 waitSleep(5);
			  
			 selectuser.click(); 
		     waitSleep(6);
			  
			 selectuser.sendKeys(tcData.get("Super Approver"));
		    
			 waitSleep(6);
			 select.click(); 
			 waitSleep(4);
			 
			 ExtentTestManager.getTest().log(LogStatus.PASS,"Logged in with SA");
			 addScreenShot();
			  
			// notification.click();
			 //waitSleep(5);
			 
			 approvals.click(); 
			 waitSleep(5);
			 
			 searchapprovals1.sendKeys(tcData.get("DealNum")); 
			  waitSleep(5);	 
			 
			 ExtentTestManager.getTest().log(LogStatus.PASS,"  SA should not receive notification  ");
			 addScreenShot();	
		  
			//Login as Submitter to check notification should  be there 
			 
            waitSleep(5);	
			 
			 userlogin.click(); 
			 waitSleep(5);
			  
			 switchuserbtn.click(); 
			 waitSleep(5);
			  
			 selectuser.click(); 
		     waitSleep(6);
			  
			 selectuser.sendKeys(tcData.get("Planner"));
		    
			 waitSleep(6);
			 select.click(); 
			 waitSleep(4);
			 
			 ExtentTestManager.getTest().log(LogStatus.PASS,"Logged in with planner");
			 addScreenShot();
			  
			 notification.click();
			 waitSleep(5);
			 
			 //approvals.click(); 
			 //waitSleep(5);
			 
			 serachnotification.sendKeys(tcData.get("DealNum")); 
			  waitSleep(5);	 
			 
			 ExtentTestManager.getTest().log(LogStatus.PASS,"  Planner should  receive notification  ");
			 addScreenShot();	
		  
		  
		  
		  
		  
		  
		  
		  
		 
		//// Reports

			ReportingLink.click();
			waitSleep(4);
			serachreportpanel.click();
			waitSleep(2);
			serachreportpanel.sendKeys("Change Request");
			waitSleep(8);
			JavascriptExecutor jsw = (JavascriptExecutor) driver;
			jsw.executeScript("window.scrollBy(0,1000)", "");
			waitSleep(6);
			driver.findElement(By.xpath("//strong")).click();
			waitSleep(10);
			driver.switchTo().frame(0);

			driver.findElement(By.id("mainReportViewer_ctl04_ctl05_txtValue")).sendKeys(tcData.get("DealNum"));

			waitSleep(3);

			driver.findElement(By.id("mainReportViewer_ctl04_ctl00")).click();

			waitSleep(3);

			driver.findElement(By.id("mainReportViewer_ctl04_ctl00")).click();
			waitSleep(20);

			driver.findElement(By.id("mainReportViewer_ToggleParam_img")).click();
			waitSleep(3);

			ExtentTestManager.getTest().log(LogStatus.PASS, "  Airing Moves Report screen ");
			addScreenShot();

			waitSleep(3);

			JavascriptExecutor jsx = (JavascriptExecutor) driver;
			jsx.executeScript("window.scrollBy(0,600)", "");

			addScreenShot();

			// Save.click();
			waitSleep(5);
		  	  
		  
		  
		  
		
		  //UFT INTEGRATION with mail notification***********************
		  
		  
	
	}

}
