package com.cbs.phoenix.pageobjects;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.cbs.phoenix.utilities.TestDataProvider;

public class Notification_ChangeRequest_RejectPage_44964 extends BasePage {

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
	

	
	private HashMap<String, String> tcData;

	public Notification_ChangeRequest_RejectPage_44964(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void approval(TestDataProvider testDataProvider, String testId) throws IOException {

		tcData = testDataProvider.readData(testId);
		
		///////UFT Integration.......

		// TC_44964(Automation Regression : Web Approvals_Change Request_Reject - Transfer with add comments Scatter order)

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
		  
		 notification.click();
		 waitSleep(4);
		 
		 searchnotifications.sendKeys(tcData.get("OrderNum"));
		 waitSleep(6);
		 
	
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
		  
		  approvals.click(); 
		  waitSleep(5);
		 
		  searchapprovals1.sendKeys(tcData.get("OrderNum")); 
		  waitSleep(5);
		 
		  selectdeal.click();
		  waitSleep(20);
		  
		  commenttab.click();
		  waitSleep(5);
		  
		  comments.sendKeys("Test Automation- CR is Rejected");
		  waitSleep(5);
		  
		  clickRejectbtn.click();
		  waitSleep(100);
		  
		  searchdeal.click();
		  waitSleep(5);
		  searchdeal.sendKeys("OrderNum");
		  waitSleep(5);
		  
		  searchdeal.sendKeys(Keys.ENTER);
		  waitSleep(20);
		  
		  //verify same unit is not in provisional status is pending
		  
		  verificationCR.click();
		  waitSleep(5);
		  
		  CR.click();
		  waitSleep(5);
	

	}}		

			  