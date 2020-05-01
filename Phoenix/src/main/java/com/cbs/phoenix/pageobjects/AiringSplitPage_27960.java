package com.cbs.phoenix.pageobjects;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cbs.phoenix.reports.ExtentTestManager;
import com.cbs.phoenix.utilities.TestDataProvider;
import com.relevantcodes.extentreports.LogStatus;

public class AiringSplitPage_27960 extends BasePage {
	
	
	//Test Case : Automation Regression : Move Airing: Split units between Multiple Shows. Verify that the user is able to split advertisers of a replaced show between multiple moving shows
	
	public AiringSplitPage_27960(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}


	private HashMap<String, String> tcData;

	@FindBy(xpath = "//span[text()='Airing Schedule']")
	private WebElement airingschedule;

	@FindBy(xpath = "//a[text()='View Details']")
	private WebElement viewdetails;

	@FindBy(xpath = "/html/body/div[1]/div/div/airing-details/div[3]/h4[4]")
	private WebElement viewLoadPreMove;

	@FindBy(xpath = "/html/body/div[1]/div/div/airing-details/div[3]/h4[2]")
	private WebElement viewCommercialPreMove;

	@FindBy(xpath = "/html/body/div[1]/div/div/airing-details/div[3]/h4[3]")
	private WebElement viewavailPreMove;

	@FindBy(xpath = "/html/body/div[1]/div/div/airing-details/div[3]/h4[1]")
	private WebElement viewtotalPreMove;

	@FindBy(xpath = "//a[text()='Airing Move']")
	private WebElement AiringMove;

	@FindBy(xpath = "//a[text()='Move']")
	private WebElement Move;

	@FindBy(xpath = "//a[text()='Replace']")
	private WebElement Replace;

	@FindBy(xpath = "(//input[@type='date'])[3]")
	private WebElement startdate;

	@FindBy(xpath = "//input[@type='time']")
	private WebElement start_time;

	@FindBy(xpath = "(//input[@type='time'])[2]")
	private WebElement end_time;

	@FindBy(xpath = "(//a[contains(text(),'Clear')])[2]")
	private WebElement Clear;
	final String Day = "F";

	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='" + Day + "'])[2]")
	
	private WebElement SelectDay;

	@FindBy(xpath = "//button[text()='Next']")
	private WebElement Next;

	@FindBy(xpath = "/html/body/div[1]/div/div/airing-moves-confirm/div[3]/div/div/button[1]")
	private WebElement Yes;

	@FindBy(xpath = "//button[text()='Execute']")
	private WebElement Execute;

	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='BLUE BLOODS'])[1]")
	private WebElement ShowMoved;

	@FindBy(xpath = "//span[text()='Reporting']")
	private WebElement ReportingLink;

	@FindBy(xpath = "(//a[contains(text(),'Airing Moves Report')])[2]")
	private WebElement AiringMovesReport;

	@FindBy(id = "mainReportViewer_ctl04_ctl05_txtValue")
	private WebElement FromDateClick;

	@FindBy(id = "mainReportViewer_ctl04_ctl07_txtValue")
	private WebElement ToDateClick;

	@FindBy(id = "mainReportViewer_ctl04_ctl03_txtValue")
	private WebElement FromDateClickshow;

	@FindBy(id = "mainReportViewer_ctl04_ctl05_txtValue")
	private WebElement ToDateClickshow;

	@FindBy(id = "btnSave")
	private WebElement Save;

	/*
	 * @FindBy(xpath = "//input[@name='disposeUnits']") private WebElement
	 * disposeUnitschkbox;
	 */

	@FindBy(xpath = "//div[2]/label/i")
	private WebElement disposeUnitschkbox;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement serachreportpanel;

	@FindBy(xpath = "(//a[contains(text(),'Units for a Show Report')])[2]")
	private WebElement unitforshowreportlink;

	@FindBy(id = "mainReportViewer_ctl04_ctl11_ddValue")
	private WebElement Show;

	@FindBy(xpath = "//span[@class='user-name text-bold-700 ng-binding']")
	private WebElement userlogin;

	@FindBy(xpath = "//a[@class='btn btn-sm btn-info ng-scope']")
	private WebElement switchuserbtn;

	@FindBy(xpath = "/html[1]/body[1]/phoenix-wrapper[1]/div[2]/div[1]/div[1]/phoenix-login[1]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/input[1]")
	private WebElement selectuser;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement Loginbtn;


	@FindBy(xpath = "//select[@name='shows']")
	private WebElement Selectshow1;

	@FindBy(xpath = "(//select[@name='shows'])[2]")
	private WebElement Selectshow2;

	@FindBy(xpath = "(//input[@type='time'])[2]")
	private WebElement EndTime;

	@FindBy(name = "showLoad")
	private WebElement Load1;

	@FindBy(name = "showBreaks")
	private WebElement Breaks1;

	@FindBy(xpath = "//label/i")
	private WebElement preempt;

	@FindBy(xpath = "//a[2]/i")
	private WebElement Add;

	@FindBy(xpath = "/html/body/div[1]/div/div/airing-moves/div[1]/div[3]/table/tbody/tr[1]/td[4]/select")
	private WebElement ReplaceUnit1;

	@FindBy(xpath = "/html/body/div[1]/div/div/airing-moves/div[1]/div[3]/table/tbody/tr[2]/td[4]/select")
	private WebElement ReplaceUnit2;

	@FindBy(xpath = "/html/body/div[1]/div/div/airing-moves/div[1]/div[3]/table/tbody/tr[3]/td[5]/label/i")
	private WebElement PreemptUnit1;

	@FindBy(xpath = "/html/body/div[1]/div/div/airing-moves/div[1]/div[3]/table/tbody/tr[4]/td[5]/label/i")
	private WebElement PreemptUnit2;

	@FindBy(xpath = "//span[contains(text(),'Deals')]")
	private WebElement deal;

	@FindBy(xpath = "//input[@placeholder='Search by Deal or Order #']")
	private WebElement SearchDeal;

	@FindBy(xpath = "(//a[contains(text(),'Order')])[5]")
	private WebElement OrderLink;

	@FindBy(xpath = "(//a[text()='Order Details'])[2]")
	private WebElement OrderdetailsLink;

	@FindBy(xpath = "/html[1]/body[1]/phoenix-wrapper[1]/div[2]/div[1]/div[1]/ui-view[1]/deal[1]/div[1]/div[1]/div[2]/div[1]/deal-hold-order[1]/div[1]/ul[1]/li[3]/a[1]")
	private WebElement CR;
	
	
	@FindBy(xpath = "//button[@class='dropdown-item ng-binding ng-scope']")
	private WebElement select;
	
	@FindBy(xpath = "//*[text()='All Dayparts']")
	private WebElement dayParts;

	@FindBy(xpath = "//*[text()='Dayparts']//following-sibling::button[text()='None']")
	private WebElement noneBTN;
	
	@FindBy(xpath = "//multi-select[2]/div/div/ul/li[3]/div/label/i")
	private WebElement selectDaytime;
	
	
	@FindBy(xpath = "//div/div/div/ul/li[2]/a/i")
	private WebElement selectNextweek;
	

	public void replace(TestDataProvider testDataProvider, String testId) throws IOException, InterruptedException {

		tcData = testDataProvider.readData(testId);
		

		  waitSleep(9);
		  userlogin.click(); 
		  waitSleep(5);
		  
		  switchuserbtn.click(); 
		  waitSleep(5);
		  
		  selectuser.click(); 
		  waitSleep(6);
		  
		  selectuser.sendKeys("Rader"); 
		  waitSleep(6);
		  select.click(); 
		  waitSleep(6);
		  
		  ExtentTestManager.getTest().log(LogStatus.PASS,"  Logged in with Inventory Management ");
		  addScreenShot();
		  
		  airingschedule.click();
		  
		  waitSleep(5);
		  
		 dayParts.click();
		 waitSleep(4);

		 noneBTN.click();
		 waitSleep(5);
		 
		 
		 selectDaytime.click();
		 
		 waitSleep(5);
		 selectNextweek.click();
			
		 waitSleep(5);
		 
		 ExtentTestManager.getTest().log(LogStatus.PASS,"  All Day time shows screen appeared ");
		 addScreenShot();
		 
		 /////////////Dynamic Data Logic /////////////
		  // Identify 1st show ---Require dynamic concept	  
		
		 //Prerequisite:  pick the show that is 1 hr duration

			  
			  Actions builder = new Actions(driver);
			  //builder.moveByOffset(xint,yint).click().build().perform();
			  
			  waitSleep(4); 
			  builder.contextClick().build().perform(); 
			  waitSleep(3);
			  viewdetails.click();			  
			  waitSleep(4);
			  ExtentTestManager.getTest().log(LogStatus.PASS,"  View detail Screen of the 1st show ");
				addScreenShot();    
		  
		  
		
		 
		  
		  String s = viewtotalPreMove.getText(); 
		  String total1 =s.replaceAll("[^0-9?!\\.]", ""); 
		  int totalshow1 = Integer.parseInt(total1);
		  System.out.println("Total Premove:" + totalshow1);
		  
		  builder.sendKeys(Keys.ESCAPE).build().perform();
		  
		  waitSleep(4);
		  
		  builder.contextClick().build().perform();
		  
		  waitSleep(4);
		  
		  
		  
		  ////Pick the show and break the show to 2 shows as mentioned in the test steps ...requires dynamic data/////	 
		 

		////// Need dynamic concept to pick both the replaced shows/////////

		// Pick the show1 and do view details , take screenshot
		  
		  //Get the deal of the show1 
		    String a=driver.findElement(By.xpath("/html/body/div[1]/div/div/airing-details/div[2]/div/table/tbody/tr[1]/td[10]")).getText();
			  
			String deal1= a.substring(0, 5);
			System.out.println("1st show deal :" +deal1 );

		// Pick the show2 and do view details , take screenshot
			
		//Get the deal of the show2
		String b=driver.findElement(By.xpath("/html/body/div[1]/div/div/airing-details/div[2]/div/table/tbody/tr[1]/td[10]")).getText();
			  
		String deal2= b.substring(0, 5);
		System.out.println("2nd show deal :" +deal2 );	
		  
		

		// Search Deal for show1 for CR

		deal.click();
		waitSleep(6);	

		SearchDeal.sendKeys(deal1);
		waitSleep(3);
		SearchDeal.sendKeys(Keys.ENTER);
		waitSleep(5);

		OrderLink.click();
		waitSleep(6);
		
		ExtentTestManager.getTest().log(LogStatus.PASS,"  Navigated to Order screen for Deal1 ");
		addScreenShot();

		OrderdetailsLink.click();
		waitSleep(4);

		CR.click();
		waitSleep(5);
		
		ExtentTestManager.getTest().log(LogStatus.PASS,"  Navigated to CR page for Deal1 ");
		addScreenShot(); 
		
		
		
		// Search Deal for show2 for CR

				deal.click();
				waitSleep(6);			

				SearchDeal.sendKeys(deal2);
				waitSleep(3);
				SearchDeal.sendKeys(Keys.ENTER);
				waitSleep(5);

				OrderLink.click();
				waitSleep(6);
				
				ExtentTestManager.getTest().log(LogStatus.PASS,"  Navigated to Order screen for Deal2 ");
				addScreenShot();

				OrderdetailsLink.click();
				waitSleep(4);

				CR.click();
				waitSleep(5);
				
				ExtentTestManager.getTest().log(LogStatus.PASS,"  Navigated to CR page for Deal2 ");
				addScreenShot();
				 
				
		
		
		
		// Reports-Move

		ReportingLink.click();
		
		ExtentTestManager.getTest().log(LogStatus.PASS,"  Click on Report Link ");
		
		addScreenShot();
		waitSleep(4);

		JavascriptExecutor jsx = (JavascriptExecutor) driver;
		jsx.executeScript("window.scrollBy(0,1100)", "");

		waitSleep(3);

		AiringMovesReport.click();

		waitSleep(6);
		
		ExtentTestManager.getTest().log(LogStatus.PASS,"  Report screen opened ");
		addScreenShot();

		driver.switchTo().frame(0);

		waitSleep(3);
		FromDateClick.clear();

		waitSleep(3);

		FromDateClick.sendKeys(tcData.get("MoveStartDate"));

		waitSleep(3);

		ToDateClick.click();

		waitSleep(3);

		ToDateClick.clear();

		waitSleep(2);

		ToDateClick.sendKeys(tcData.get("MoveStartDate"));

		waitSleep(3);
		
		driver.findElement(By.id("mainReportViewer_ctl04_ctl00")).click();	
		waitSleep(30);	
		
		
		driver.findElement(By.id("mainReportViewer_ToggleParam_img")).click();
		waitSleep(3);
		
		
		ExtentTestManager.getTest().log(LogStatus.PASS,"  Airing Moves Report Screen opened ");
		addScreenShot();		

		Save.click();
		waitSleep(30);
		
		
		//Mail Notification part..... 
		 
		
		
	

	}

}
