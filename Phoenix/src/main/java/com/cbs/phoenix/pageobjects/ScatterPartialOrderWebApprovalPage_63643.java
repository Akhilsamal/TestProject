package com.cbs.phoenix.pageobjects;

import java.io.IOException;
import java.util.HashMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.cbs.phoenix.utilities.TestDataProvider;


public class ScatterPartialOrderWebApprovalPage_63643 extends BasePage {

	@FindBy(xpath = "//span[@class='menu-title ng-binding'][contains(text(),'Notifications')]")
	private WebElement notification;

	@FindBy(xpath = "//a[@class='list-group-item list-group-item-action border-0 ng-binding ng-scope active']")
	private WebElement approvals;

	@FindBy(xpath = "//input[@placeholder='Search approvals...']")
	private WebElement searchapprovals;
	
	@FindBy(xpath = "//input[@placeholder='Search notifications...']")
	private WebElement searchnotifications;
	
	@FindBy(xpath = "/html[1]/body[1]/phoenix-wrapper[1]/div[2]/div[1]/div[1]/user-inbox[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/user-approval[1]/section[1]/div[1]/div[1]/div[1]/a[1]/div[2]/p[1]")
	private WebElement selectdeal;
	
	@FindBy(xpath = "//span[@class='user-name text-bold-700 ng-binding']")
	private WebElement userlogin;
		
	@FindBy(xpath = "//a[contains(text(),'Switch User')]")
	private WebElement switchuserbtn;
		
	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Select a different user'])[1]/following::select[1]")
	private WebElement selectuser;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement Loginbtn;
	
	@FindBy(xpath = "//button[1]")
	private WebElement clickYesBtn;
	
	@FindBy(xpath = "(//button[@type='button'])[2]")
	private WebElement clickRejectbtn;
	
	@FindBy(xpath = "//button[@type='button'][1]")
	private WebElement clickApprovebtn;
	
		
	private HashMap<String, String> tcData;

	public ScatterPartialOrderWebApprovalPage_63643(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void approval3(TestDataProvider testDataProvider, String testId) throws IOException {

		tcData = testDataProvider.readData(testId);

		// TC_63643(Automation Regression : Scatter partial order web approval)

		//Login with DVP
		
		waitSleep(9);
		userlogin.click();
		waitSleep(5);
		
		switchuserbtn.click();
		waitSleep(5);
				
		selectuser.click();
		waitSleep(6);

		selectuser.sendKeys(tcData.get("Daytime DVP"));
		waitSleep(6);
		selectuser.click();
		waitSleep(6);

		Loginbtn.click();
		waitSleep(6);
		
		notification.click();
		waitSleep(8);

		approvals.click();
		waitSleep(5);
		
		searchapprovals.click();
		waitSleep(3);
		searchapprovals.sendKeys(tcData.get("DealNum"));
		waitSleep(5);

		
		//Login with Planner
		
		
		userlogin.click();
		waitSleep(5);
		
		switchuserbtn.click();
		waitSleep(5);
				
		selectuser.click();
		waitSleep(6);

		selectuser.sendKeys(tcData.get("Planner"));
		waitSleep(6);
		selectuser.click();
		waitSleep(6);

		Loginbtn.click();
		waitSleep(6);
		
		notification.click();
		waitSleep(8);
		
		searchnotifications.click();
		waitSleep(3);
		searchnotifications.sendKeys(tcData.get("DealNum"));
		waitSleep(5);
	
		//Login with Daytime AE
		
		
		userlogin.click();
		waitSleep(5);
		
		switchuserbtn.click();
		waitSleep(5);
				
		selectuser.click();
		waitSleep(6);

		selectuser.sendKeys(tcData.get("Daytime AE"));
		waitSleep(6);
		selectuser.click();
		waitSleep(6);

		Loginbtn.click();
		waitSleep(6);
		
		notification.click();
		waitSleep(8);
		
		searchnotifications.click();
		waitSleep(3);
		searchnotifications.sendKeys(tcData.get("DealNum"));
		waitSleep(5);
		
		
		//Login with Super Approver
		
		
		userlogin.click();
		waitSleep(5);
		
		switchuserbtn.click();
		waitSleep(5);
				
		selectuser.click();
		waitSleep(6);

		selectuser.sendKeys(tcData.get("Super Approver"));
		waitSleep(6);
		selectuser.click();
		waitSleep(6);

		Loginbtn.click();
		waitSleep(6);
		
		notification.click();
		waitSleep(8);
		
		searchnotifications.click();
		waitSleep(3);
		searchnotifications.sendKeys(tcData.get("DealNum"));
		waitSleep(5);		
		
		selectdeal.click(); waitSleep(10);
		
		/*
		 * clickRejectbtn.click(); waitSleep(5); clickYesBtn.click(); waitSleep(9);
		 */
		
		
		//5th step for approval by DVP
		
		
		userlogin.click();
		waitSleep(5);
		
		switchuserbtn.click();
		waitSleep(5);
				
		selectuser.click();
		waitSleep(6);

		selectuser.sendKeys(tcData.get("Daytime DVP"));
		waitSleep(6);
		selectuser.click();
		waitSleep(6);

		Loginbtn.click();
		waitSleep(6);
		
		notification.click();
		waitSleep(8);

		approvals.click();
		waitSleep(5);
		
		searchapprovals.click();
		waitSleep(3);
		searchapprovals.sendKeys(tcData.get("DealNum"));
		waitSleep(5);

		/*
		 * selectdeal.click(); waitSleep(10);
		 * 
		 * clickApprovebtn.click(); waitSleep(5); clickYesBtn.click(); waitSleep(9);
		 */
	}
}
