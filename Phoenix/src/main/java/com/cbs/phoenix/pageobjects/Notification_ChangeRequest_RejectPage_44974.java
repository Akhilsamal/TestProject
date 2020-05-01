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

public class Notification_ChangeRequest_RejectPage_44974 extends BasePage {
	public Notification_ChangeRequest_RejectPage_44974(WebDriver driver) {
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

		// TC_44974(Automation Regression : Web Approvals_Change Request_Reject - Must-Have Traffic Instruction DOA)

		//Login with SA to check notification only
			
		 waitSleep(9); 
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
		  
		   
		   approvals.click(); 
		  waitSleep(5);
		 
		  searchapprovals1.sendKeys(tcData.get("DealNum")); 
		  waitSleep(5);
		 
			 
		 ExtentTestManager.getTest().log(LogStatus.PASS,"Super Approver got the notification");
		 addScreenShot(); 
		 waitSleep(4);
		 
	
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
		  waitSleep(5);
		  
		  ExtentTestManager.getTest().log(LogStatus.PASS,"Daytime DVP got the notification");
		  addScreenShot(); 
		  waitSleep(4);
		 
		  selectdeal.click();
		  waitSleep(25);
		  
		  ExtentTestManager.getTest().log(LogStatus.PASS,"User is on Approval Page ");
		  addScreenShot(); 
		  waitSleep(4);
		  
		//  commenttab.click();
		 // waitSleep(5);
		  
		  //comments.sendKeys("Test Automation- CR is Rejected");
		  //waitSleep(5);
		  
		 WebElement dateofair= driver.findElement(By.xpath("//*[@id='sideGridRight']/table/tbody/tr[2]/td[2]/span"));
		 
		 Actions act= new Actions(driver);
		 
		 act.moveToElement(dateofair).build().perform();
		 waitSleep(2);
		 
		 ExtentTestManager.getTest().log(LogStatus.PASS,"Day of air tool tip populated successfully ");
		  addScreenShot();
		  
		  waitSleep(5);
		  commenttab.click();
		 waitSleep(5);
			  
		  comments.sendKeys("Test Automation- CR is Rejected");
		  waitSleep(5);
		   clickRejectbtn.click();
		  waitSleep(50);
		  
		  searchdeal.click();
		  waitSleep(5);
		  searchdeal.sendKeys(tcData.get("DealNum"));
		  waitSleep(5);
		  
		  searchdeal.sendKeys(Keys.ENTER);
		  waitSleep(20);
		  
		  //verify CR status
		  
		  clickOrder.click();
		  waitSleep(5);
		  
		  CR.click();
		  waitSleep(5);
		  
		  ExtentTestManager.getTest().log(LogStatus.PASS,"CR status is changed from Submitted to Rejected");
		  addScreenShot();
		  waitSleep(8);	  
		  
		  
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

			ExtentTestManager.getTest().log(LogStatus.PASS, "  Airing Moves Report screen validation successful ");
			addScreenShot();

			waitSleep(3);

			JavascriptExecutor jsx = (JavascriptExecutor) driver;
			jsx.executeScript("window.scrollBy(0,600)", "");

			addScreenShot();

			// Save.click();
			waitSleep(5);

			

		  
		  
		  /////UFT Integration.......mail notification
	

	}


}
