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
import org.openqa.selenium.support.ui.Select;

import com.cbs.phoenix.reports.ExtentTestManager;
import com.cbs.phoenix.utilities.TestDataProvider;
import com.relevantcodes.extentreports.LogStatus;

public class AORDOOverPage_43576 extends BasePage {
	
	
	public AORDOOverPage_43576(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[contains(text(),'Notifications')]")
	private WebElement notification;

	@FindBy(xpath = "//span[contains(text(),'Approvals')]")
	private WebElement approvals;

	@FindBy(xpath = "//input[@placeholder='Search approvals...']")
	private WebElement searchapprovals;
			
	@FindBy(xpath = "/html[1]/body[1]/phoenix-wrapper[1]/div[2]/div[1]/div[1]/user-approvals[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
	private WebElement searchapprovals1;
			
	@FindBy(xpath = "//input[@placeholder='Search notifications']")
	private WebElement searchnotifications;
	    
	@FindBy(xpath = "/html[1]/body[1]/phoenix-wrapper[1]/div[2]/div[1]/div[1]/user-approvals[1]/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/a[1]")
	private WebElement selectAor;
	
	
	@FindBy(xpath = "/html/body/phoenix-wrapper/div[2]/div/div[1]/user-approvals/div/div[2]/section/table/tbody/tr/td[6]/a")
	private WebElement selectAor1;
	
	//html/body/phoenix-wrapper/div[2]/div/div[1]/user-approvals/div/div[2]/section/table/tbody/tr/td[6]/a
	
	//html/body/phoenix-wrapper/div[2]/div/div[1]/user-approvals/div/div[2]/section/table/tbody/tr/td[6]/a
						 
	@FindBy(xpath = "/html[1]/body[1]/phoenix-wrapper[1]/div[2]/div[1]/div[1]/user-inbox[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/user-approval[1]/section[1]/div[1]/div[1]/div[1]/a[1]/div[2]/p[1]")
	private WebElement selectdeal;

	@FindBy(xpath = "//span[@class='user-name text-bold-700 ng-binding']")
	private WebElement userlogin;

	@FindBy(xpath = "//a[@class='btn btn-sm btn-info ng-scope']")
	private WebElement switchuserbtn;

	@FindBy(xpath = "/html[1]/body[1]/phoenix-wrapper[1]/div[2]/div[1]/div[1]/phoenix-login[1]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/input[1]")
	private WebElement selectuser;

	@FindBy(xpath = "//button[1]")
	private WebElement clickYesBtn;

	@FindBy(xpath = "//button[@class='btn btn-danger btn-sm']")
	private WebElement clickRejectbtn;

	@FindBy(xpath = "//button[@class='btn btn-success btn-sm']")
	private WebElement clickApprovebtn;
	
	@FindBy(xpath = "//span[contains(text(),'Deals')]")
	private WebElement deal;
	
	@FindBy(xpath = "//button[@class='dropdown-item ng-binding ng-scope']")
	private WebElement select;
	
	@FindBy(xpath = "//select[@id='p_dealType']")
	private WebElement dealtype;
		
	@FindBy(xpath = "//span[contains(text(),'Select a daypart')]")
	private WebElement daypart;
	
	@FindBy(xpath = "//a[contains(text(),'Prime')]")
	private WebElement prime ;
		
	@FindBy(xpath = "//a[contains(text(),'Daytime')]")
	private WebElement daytime ;	
	
	@FindBy(xpath = "/html[1]/body[1]/phoenix-wrapper[1]/div[2]/div[1]/div[1]/ui-view[1]/deal-search[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[9]/div[1]/label[4]")
	private WebElement partialorder ;
	
	@FindBy(xpath = "/html[1]/body[1]/phoenix-wrapper[1]/div[2]/div[1]/div[1]/ui-view[1]/deal-search[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/button[1]")
	private WebElement search ;
	               
	@FindBy(xpath = "/html[1]/body[1]/phoenix-wrapper[1]/div[2]/div[1]/div[1]/ui-view[1]/deal-search[1]/div[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]")
	private WebElement order ;
	
	@FindBy(xpath = "/html[1]/body[1]/phoenix-wrapper[1]/div[2]/div[1]/div[1]/ui-view[1]/deal[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/a[1]")
	private WebElement partialorderclick ;
		
	@FindBy(xpath = "//button[@class='btn btn-sm btn-outline-secondary ng-binding ng-scope']")
	private WebElement AORChange ;

	@FindBy(xpath = "/html/body/div[1]/div/div/aor-change/div[2]/div[3]/div[1]/phoenix-dropdown/div")
	private WebElement buyingagency ;
	
	/*@FindBy(xpath = "//a[contains(text(),'8 TEN INC. - NASHVILLE - 3310')]")
	private WebElement buyingagencyselect ;*/
	
	@FindBy(xpath = "//a[contains(text(),'360 i - NEW YORK - 32 A')]")
	private WebElement buyingagencyselect ;
	
	
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/aor-change[1]/div[3]/button[1]")
	private WebElement next ;
		
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/aor-change[1]/div[3]/button[2]")
	private WebElement submit ;
	
	@FindBy(xpath = "//span[contains(text(),'Planner_Dropdown')]")
	private WebElement selectdvp ;

	@FindBy(xpath = "//a[@class='nav-link py-0 ng-binding'][contains(text(),'Partial Order Details')]")
	private WebElement partialorderdetails ;

	@FindBy(xpath = "//a[@class='nav-link py-0 ng-binding active'][contains(text(),'Change Requests')]")
	private WebElement CRTab ;
		
	@FindBy(xpath = "/html[1]/body[1]/phoenix-wrapper[1]/div[2]/div[1]/div[1]/ui-view[1]/deal[1]/div[1]/div[1]/div[2]/div[1]/deal-hold-order[1]/div[1]/ul[1]/li[3]/a[1]")
	private WebElement CR ;

	@FindBy(xpath = "//input[@placeholder='Search by Deal or Order #']")
	private WebElement SearchDeal ;
	
	@FindBy(xpath = "/html[1]/body[1]/phoenix-wrapper[1]/nav[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/span[1]/button[2]")
	private WebElement selectorder ;
	
	
	@FindBy(xpath = "/html/body/phoenix-wrapper/div[2]/div/div[1]/ui-view/deal-search/div[1]/div/div/form/div[2]/div[9]/div/label[3]/i")
	private WebElement Orderchkbox ;
	
	
	@FindBy(xpath = "(//a[contains(text(),'Order')])[5]")
	private WebElement OrderLink ;
	
	
	@FindBy(xpath = "(//a[text()='Order Details'])[2]")
	private WebElement OrderdetailsLink ;
	
	
	@FindBy(xpath = "/html/body/phoenix-wrapper/div[2]/div/div[1]/ui-view/change-request/div/div[1]/div[1]/div[3]/div/button[3]")
	private WebElement DoOver;
	
	
	@FindBy(xpath = "//h4[@class='ng-binding']")
	private WebElement AllocationSummary ;
	
	
	
	//html/body/phoenix-wrapper/div[2]/div/div[1]/ui-view/deal/div/div/div[2]/div/deal-hold-order/div[2]/div/div[1]/h4[2]
	
	//h4[@class='ng-binding']
	
	
	private HashMap<String, String> tcData;



	public void approval(TestDataProvider testDataProvider, String testId) throws IOException {

		tcData = testDataProvider.readData(testId);

		// TC_43576 (Automation Regression : Automation Regression : AOR: DVP gets notification on AOR change and can Do Over CR)

		// Login with inventory management

		
		
		  waitSleep(9);
		  userlogin.click(); 
		  waitSleep(5);
		  
		  switchuserbtn.click(); 
		  waitSleep(5);
		  
		  selectuser.click(); 
		  waitSleep(6);
		  
		  selectuser.sendKeys(tcData.get("Inventory Management")); waitSleep(6);
		  select.click(); waitSleep(6);
		  
		  deal.click(); waitSleep(6);
		  
		  Select dealtype = new Select(driver.findElement(By.id("p_dealType")));
		  dealtype.selectByVisibleText("Scatter"); waitSleep(4);
		  
		  daypart.click(); waitSleep(8);
		  
		  daytime.click(); waitSleep(10);
		  
		  
		  
		  Orderchkbox.click(); waitSleep(4);
		  
		  Select season = new Select(driver.findElement(By.id("p_season")));
		  season.selectByVisibleText("2019-2020"); waitSleep(6);
		  
		  JavascriptExecutor jse = (JavascriptExecutor)driver;
		  jse.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
		  waitSleep(10);
		  
		  search.click(); 
		  
		  ExtentTestManager.getTest().log(LogStatus.PASS,"  Search Deals successfully  ");
		  waitSleep(8);
		  
		  String winHandleBefore = driver.getWindowHandle(); String a=order.getText();
		  System.out.println(a); order.click(); waitSleep(8);
		  
		  for(String winHandle : driver.getWindowHandles()){
		  driver.switchTo().window(winHandle); }
		  
		  //partialorderclick.click();
		  
		  OrderLink.click(); waitSleep(6);
		  
		  //partialorderdetails.click();
		  
		  OrderdetailsLink.click(); String Expected =AllocationSummary.getText();
		  System.out.println("Expected Allocation Summary:"+Expected);
		  
		  ExtentTestManager.getTest().log(LogStatus.PASS,"  Order Deatails navigated  successfully ");
		  
		  waitSleep(4);
		  
		  addScreenShot(); waitSleep(4);
		  
		  CR.click(); waitSleep(4);
		  
		  ExtentTestManager.getTest().log(LogStatus.PASS,"  CR navigated  successfully ");
		  
		  addScreenShot(); waitSleep(4);
		  
		  
		  driver.switchTo().window(winHandleBefore);
		  
		  AORChange.click(); waitSleep(4);
		  
		  
		  
		  order.click(); waitSleep(4);
		  
		  
		  Select changetype = new Select(driver.findElement(By.xpath(
		  "//div[@class='modal-content']//div[1]//select[1]")));
		  changetype.selectByVisibleText("Incorrect Agency"); waitSleep(6);
		  
		  buyingagency.click(); waitSleep(4);
		  
		  buyingagencyselect.click(); waitSleep(4);
		  
		  Select buyingcontact = new Select(driver.findElement(By.xpath(
		  "/html[1]/body[1]/div[1]/div[1]/div[1]/aor-change[1]/div[2]/div[3]/div[2]/select[1]"
		  ))); buyingcontact.selectByVisibleText("John Doe"); waitSleep(6);
		  
		  Select billingcontact = new
		  Select(driver.findElement(By.xpath("//div[4]//div[2]//select[1]")));
		  billingcontact.selectByVisibleText("John Doe"); waitSleep(6);
		  
		  next.click(); waitSleep(4);
		  
		  submit.click(); waitSleep(50);
		 
		  ExtentTestManager.getTest().log(LogStatus.PASS,"  Submit AOR done  successfully ");
		  
		 
		// Login with DVP
		
		waitSleep(5);
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
		 ExtentTestManager.getTest().log(LogStatus.PASS,"  Logged in with DVP successfully ");
		approvals.click();
		waitSleep(5);
		//////////////
		//String a ="41604";
		  //searchapprovals1.sendKeys(tcData.get("OrderNum")); 
		
		  searchapprovals1.sendKeys(a); 
		  waitSleep(5);
		  
		  selectAor.click();
		  
		 waitSleep(6);
		  
		  
		  //capture new deal created
		  
		  
		  
		  String txt = driver.findElement(By.xpath("/html/body/phoenix-wrapper/div[2]/div/div[1]/ui-view/change-request/div/div[1]/div[2]/div[1]/span")).getText(); 
		  String str2=txt.substring(txt.indexOf(',')+1);
		  System.out.println("THE STRING IS "+str2);
		  
		  
		 
		  
		  DoOver.click(); 
		  waitSleep(160);
		  
		  ExtentTestManager.getTest().log(LogStatus.PASS,"  DO OVER the AOR  successfully ");
		 
		  ///////////
		  
		  
		//open the old deal and confirm the units
		  
		  
		//SearchDeal.sendKeys(tcData.get("OrderNum"));
		  
		  SearchDeal.sendKeys(a);
		SearchDeal.sendKeys(Keys.ENTER);
		waitSleep(5);
		  
		
		//selectorder.click(); 
		//waitSleep(5);
		  
		
		
		
		  OrderLink.click();
		  waitSleep(6);
		  
		//partialorderdetails.click();  
		//waitSleep(4);
		  
		  
		  OrderdetailsLink.click();
		  waitSleep(4);
		  ExtentTestManager.getTest().log(LogStatus.PASS,"  ORDER Details navigated  successfully ");
		addScreenShot(); 
		waitSleep(4);
		String Actual =AllocationSummary.getText();
		System.out.println("Expected Allocation Summary :"+Actual);
		
		/*
		 * if(Actual.equals(Expected)) { System.out.println(" Test Case Passed"); }
		 */
		CR.click(); 
		waitSleep(4);
		
		String Status =driver.findElement(By.xpath("/html/body/phoenix-wrapper/div[2]/div/div[1]/ui-view/deal/div/div/div[2]/div/deal-hold-order/div[2]/div/deal-change-request-list/div/table/tbody/tr[1]/td[3]")).getText();
		 System.out.println("Status is :"+Status);
		 ExtentTestManager.getTest().log(LogStatus.PASS,"  CR navigated  successfully ");
		addScreenShot(); 
		waitSleep(4);
		
		
		
		
		
		

	}

}
