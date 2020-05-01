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

public class UpfrontOrderWebapprovalpage_44324 extends BasePage{

	
	@FindBy(xpath = "//span[@class='menu-title'][contains(text(),'Notifications')]")
	private WebElement notification;

	@FindBy(xpath = "//span[contains(text(),'Approvals')]")
	private WebElement approvals;

	@FindBy(xpath = "//input[@placeholder='Search approvals']")
	private WebElement searchapprovals;

	

	@FindBy(xpath = "//span[@class='user-name text-bold-700 ng-binding']")
	private WebElement userlogin;

	@FindBy(xpath = "//a[contains(text(),'Switch User')]")
	private WebElement switchuserlink;

	@FindBy(xpath = "/html[1]/body[1]/phoenix-wrapper[1]/div[2]/div[1]/div[1]/phoenix-login[1]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/input[1]")
	private WebElement selectuser;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement Loginbtn;

	@FindBy(xpath = "//div/div/div/i")
	private WebElement searchicon;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement searchiconnotification;
	
	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='PhoenixSupport05'])[1]/following::p[1]")
	private WebElement clickDeal;
	
	@FindBy(xpath = "//button[1]")
	private WebElement clickYesBtn;
	
	@FindBy(xpath = "(//button[@type='button'])[2]")
	private WebElement clickRejectbtn;
	
	
	@FindBy(xpath = "//button[@type='button'][1]")
	private WebElement clickApprovebtn;
	
	@FindBy(xpath = "//a[@class='media']")
    private WebElement selectdeal;
	
	
	@FindBy(xpath = "//button[@class='dropdown-item ng-binding ng-scope']")
	private WebElement select;
	
	


	public UpfrontOrderWebapprovalpage_44324(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	
	private HashMap<String, String> tcData;

	public void approval(TestDataProvider testDataProvider, String testId) throws IOException {

		tcData = testDataProvider.readData(testId);

		// TC_44324: Automation Regression : Upfront deal - Upfront Order Web Approval
		
		////UFT/////////////

		// Login with planner

		waitSleep(5);

		userlogin.click();
		waitSleep(5);

		switchuserlink.click();
		waitSleep(6);

		selectuser.click();
		waitSleep(6);

		selectuser.sendKeys(tcData.get("Planner"));
		waitSleep(6);
		select.click();

		waitSleep(6);
		
		ExtentTestManager.getTest().log(LogStatus.PASS,"Logged in to web with Planner");
		System.out.println("Logged in to web with Planner");
        addScreenShot();		

		notification.click();
		waitSleep(8);

		searchiconnotification.sendKeys(tcData.get("DealNum"));
		waitSleep(5);
		searchicon.click();

		waitSleep(3);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Planner should not see the plan for approval");
		System.out.println("Planner should not see the plan for approval");
        addScreenShot();
		

		// Login with AE
		
		  waitSleep(5);
		  
		  userlogin.click(); 
		  waitSleep(5);
		  
		  switchuserlink.click(); 
		  waitSleep(6);
		  
		  selectuser.click(); 
		  waitSleep(6);
		  
		  selectuser.sendKeys(tcData.get("Daytime AE")); 
		  waitSleep(6); 
		  select.click();		 
		  waitSleep(6);	  
		  
		  
		  ExtentTestManager.getTest().log(LogStatus.PASS,"Logged in with AE");
		  System.out.println("Logged in with AE");
	      addScreenShot();
		  
		  notification.click(); 
		  waitSleep(8);
		  
		  searchiconnotification.sendKeys(tcData.get("DealNum")); 
		  waitSleep(5);
		  searchicon.click();		 
		  waitSleep(5);
		  ExtentTestManager.getTest().log(LogStatus.PASS,"AE should not see the plan for approval");
		  System.out.println("AE should not see the plan for approval");
	      addScreenShot();
		  waitSleep(5);
		 
		// Login with SUPER APPROVER

		waitSleep(5);

		userlogin.click();
		waitSleep(5);

		switchuserlink.click();
		waitSleep(6);

		selectuser.click();
		waitSleep(6);

		selectuser.sendKeys(tcData.get("Super Approver"));
		waitSleep(6);	
		
		select.click();
		waitSleep(6);			
		ExtentTestManager.getTest().log(LogStatus.PASS,"Logged in with SA");
		System.out.println("Logged in with SA");
        addScreenShot();
		notification.click();
		waitSleep(8);
		approvals.click();
		waitSleep(5);
		searchapprovals.click();
		waitSleep(3);
		searchapprovals.sendKeys(tcData.get("DealNum"));
		waitSleep(5);
		searchicon.click();
		waitSleep(5);
		  ExtentTestManager.getTest().log(LogStatus.PASS,"SA should  see the plan for approval");
		  System.out.println("SA should  see the plan for approval");
	      addScreenShot();
		  waitSleep(5);
		/*
		 * clickDeal.click(); waitSleep(9); clickRejectbtn.click(); waitSleep(5);
		 * clickYesBtn.click(); waitSleep(9);
		 */
		
		  
		  
		  //Login with DVP , Reject
		  
		    waitSleep(5);
		    userlogin.click();
			waitSleep(5);

			switchuserlink.click();
			waitSleep(6);

			selectuser.click();
			waitSleep(6);
	       
			selectuser.sendKeys(tcData.get("Daytime DVP"));
			waitSleep(6);
			
			select.click();
			waitSleep(6);
			
			ExtentTestManager.getTest().log(LogStatus.PASS,"Logged in to web with DVP");
			System.out.println("Logged in to web with DVP");
	        addScreenShot();		

			notification.click();
			waitSleep(8);
			approvals.click();
			waitSleep(5);
			searchapprovals.click();
			waitSleep(3);
			searchapprovals.sendKeys(tcData.get("DealNum"));
			waitSleep(5);	

			searchicon.click();			
			waitSleep(4);			
			ExtentTestManager.getTest().log(LogStatus.PASS,"DVP should  see the plan for approval");
			System.out.println("DVP should  see the plan for approval");
			addScreenShot();	        
	        selectdeal.click();
	        waitSleep(5); 
			clickRejectbtn.click(); 
			waitSleep(5);
			ExtentTestManager.getTest().log(LogStatus.PASS,"Reject Plan Approval");
			System.out.println("Reject Plan Approval");
		    addScreenShot();
			clickYesBtn.click(); 
			waitSleep(9);
			  
			  
			  ////////UFT//////////
			 

		//Login with DVP and approve 		
		
			    waitSleep(5);
			    userlogin.click();
				waitSleep(5);

				switchuserlink.click();
				waitSleep(6);

				selectuser.click();
				waitSleep(6);
		      
				selectuser.sendKeys(tcData.get("Daytime DVP"));
				waitSleep(6);
				
				select.click();
				waitSleep(6);

				
				ExtentTestManager.getTest().log(LogStatus.PASS,"Logged in to web with DVP");
				System.out.println("Logged in to web with DVP");
		        addScreenShot();
			

				notification.click();
				waitSleep(8);

				approvals.click();
				waitSleep(5);

				searchapprovals.click();
				waitSleep(3);
				searchapprovals.sendKeys(tcData.get("DealNum"));
				waitSleep(5);
				
				searchicon.click();				
				waitSleep(4);
				
				ExtentTestManager.getTest().log(LogStatus.PASS,"DVP should  see the plan for approval");
				System.out.println("DVP should  see the plan for approval");
				addScreenShot();       
		        
		         selectdeal.click(); 
				 waitSleep(5);
				 ExtentTestManager.getTest().log(LogStatus.PASS,"Approve the Plan");
				 System.out.println("Approve the Plan");
				 clickApprovebtn.click();				  
				  waitSleep(9);
				  
				  //////////UFT///////////
				  
				  
		        
		        
		        
		
		
	}
}
