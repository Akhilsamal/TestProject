package com.cbs.phoenix.pageobjects;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cbs.phoenix.reports.ExtentTestManager;
import com.cbs.phoenix.utilities.TestDataProvider;
import com.relevantcodes.extentreports.LogStatus;

public class Notification_OptionChangeRejectPage_55471 extends BasePage {
	
	public Notification_OptionChangeRejectPage_55471(WebDriver driver) {
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
	
	@FindBy(xpath = "//a[@class='nav-link py-0 ng-binding active']")
	private WebElement CR;	
	
	@FindBy(xpath = "//a[@class='nav-link ng-binding ng-scope active']")
	private WebElement verificationCR;
	
	/*
	 * @FindBy(xpath = "(//a[contains(text(),'Order')])[5]") private WebElement
	 * OrderLink ;
	 */
	
	@FindBy(xpath = "/html[1]/body[1]/phoenix-wrapper[1]/div[2]/div[1]/div[1]/ui-view[1]/deal[1]/div[1]/div[1]/div[2]/div[1]/deal-hold-order[1]/div[1]/ul[1]/li[3]/a[1]")
	private WebElement ChangeRequest ;
	
	@FindBy(xpath = "/html/body/phoenix-wrapper/div[2]/div/div[1]/ui-view/change-request/div/div[1]/div[1]/div[3]/div/button[3]")
	private WebElement DoOver;
	
	@FindBy(xpath = "/html/body/phoenix-wrapper/div[2]/div/div[1]/ui-view/deal/div/div/div[2]/div/deal-hold-order/div[1]/ul/li[2]/a")
	private WebElement OrderDetails ;
	
	@FindBy(xpath = "/html/body/phoenix-wrapper/div[2]/div/div[1]/ui-view/deal/div/div/div[2]/ul/li[4]/a")
	private WebElement	 OrderLink ;
	
	@FindBy(xpath = "/html/body/phoenix-wrapper/div[2]/div/div[1]/ui-view/deal-option-change/div/div[2]/div/div[1]/h2")
	private WebElement	 cutbacks ;	
	

	
	private HashMap<String, String> tcData;



	public void approval(TestDataProvider testDataProvider, String testId) throws IOException {

		tcData = testDataProvider.readData(testId);

		
		
		/////////////........UFT........////////////

		 
	
		//Login with DVP and Reject the deal
		
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
		  
		  
		  ExtentTestManager.getTest().log(LogStatus.PASS,"Logged in with DVP ");
		  addScreenShot();
		  
		  approvals.click(); 
		  waitSleep(5);
		 
		  searchapprovals1.sendKeys(tcData.get("DealNum")); 
		 // searchapprovals1.sendKeys("43800");
		  waitSleep(7);
		  
		  ExtentTestManager.getTest().log(LogStatus.PASS," Search Deal successfully with user DVP ");
		  addScreenShot();
		 
		  selectdeal.click();
		  waitSleep(20); 
		  
		  ExtentTestManager.getTest().log(LogStatus.PASS,"Approval page opened .");
		  addScreenShot();
		  
		  clickRejectbtn.click(); 
		  waitSleep(50);		  
		  ExtentTestManager.getTest().log(LogStatus.PASS,"  Reject the deal "); 
		  
		  
		  ///////UFT Integration
		  
		  
		  
		  
		  
		  
		//Login with DVP and Reject the deal
		  
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
		  
		  
		  ExtentTestManager.getTest().log(LogStatus.PASS,"Logged in with DVP ");
		  addScreenShot();
		  
		  approvals.click(); 
		  waitSleep(5);
		 
		  searchapprovals1.sendKeys(tcData.get("DealNum")); 
		  //searchapprovals1.sendKeys("43800");
		  waitSleep(7);
		  
		  ExtentTestManager.getTest().log(LogStatus.PASS," Search Deal successfully with user DVP ");
		  addScreenShot();
		 
		  selectdeal.click();
		  waitSleep(20); 
		  
		  ExtentTestManager.getTest().log(LogStatus.PASS,"Approval page opened .");
		  addScreenShot();
		  
		  String cutbackvalue= cutbacks.getText();
			 System.out.println(cutbackvalue);
		  
		  clickRejectbtn.click(); 
		  waitSleep(50);		  
		  ExtentTestManager.getTest().log(LogStatus.PASS,"  Reject the deal "); 		  
		  
		 
		  
		  /////////////.....UFT integration .....////////////////
		 
		  
	}


}
