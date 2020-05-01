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

public class AiringMovePage_29133 extends BasePage {
	
	
	//TestCase : Automation Regression : Move Airing: Move an airing and dispose of units into the destination timeslot airing.
	
	
	public AiringMovePage_29133(WebDriver driver) {
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

	@FindBy(xpath = "(//input[@type='date'])[3]")
	private WebElement startdate;

	@FindBy(xpath = "//input[@type='time']")
	private WebElement start_time;

	@FindBy(xpath = "(//input[@type='time'])[2]")
	private WebElement end_time;

	@FindBy(xpath = "(//a[contains(text(),'Clear')])[2]")
	private WebElement Clear;	
	
	final String Day= "F";
	

	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='"+Day+"'])[2]")
	
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
	
	@FindBy(xpath ="//div[2]/label/i")
	private WebElement disposeUnitschkbox;
	
	
	@FindBy(xpath ="(//input[@type='text'])[2]")
	private WebElement serachreportpanel;	
	
	@FindBy(xpath ="(//a[contains(text(),'Units for a Show Report')])[2]")
	private WebElement unitforshowreportlink;
	
	@FindBy(id = "mainReportViewer_ctl04_ctl11_ddValue")
	private WebElement Show;	
	
	@FindBy(xpath = "//span[@class='user-name text-bold-700 ng-binding']")
	private WebElement userlogin;

	@FindBy(xpath = "//a[contains(text(),'Switch User')]")
	private WebElement switchuserbtn;
		
	@FindBy(xpath = "/html[1]/body[1]/phoenix-wrapper[1]/div[2]/div[1]/div[1]/phoenix-login[1]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/input[1]")
	private WebElement selectuser;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement Loginbtn;
	
	
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
	
	
	
	

	


	public void movedispose(TestDataProvider testDataProvider, String testId) throws IOException, InterruptedException {

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
		 
		 //////////Dynamic Logic Required//////////////
		 
		 
		 // Identify 1st show ---Require dynamic concept---		
		
	
		  //Right click and view  Details of 1st show
		  Actions builder = new Actions(driver);
		 		  
		  waitSleep(4); 
		  builder.contextClick().build().perform(); 
		  waitSleep(3);
		  viewdetails.click();		  
		  waitSleep(4);
		  ExtentTestManager.getTest().log(LogStatus.PASS,"  View detail Screen of the 1st show ");
			addScreenShot();
			
			  String s = viewtotalPreMove.getText(); 
			  String total1 = s.replaceAll("[^0-9?!\\.]", ""); 
			  int totalshow1 = Integer.parseInt(total1);
			  System.out.println("Total Premove:" + totalshow1);
		  
		 
		  builder.sendKeys(Keys.ESCAPE).build().perform();		 
		  waitSleep(5);
		  
//////////Dynamic Logic Required//////////////
		
		// Identify 2nd show (destination show)-----Require dynamic concept	 				
			  		  

		
		  //right click and view details the 2nd show
		  waitSleep(4);
		  builder.contextClick().build().perform();
		
		 waitSleep(4);

		viewdetails.click();
		waitSleep(4);
		ExtentTestManager.getTest().log(LogStatus.PASS,"  View detail Screen of the 2nd  show ");
		addScreenShot();
		
		
		String t = viewtotalPreMove.getText();
		String total2 = t.replaceAll("[^0-9?!\\.]", "");
		int totalshow2 = Integer.parseInt(total2);
		System.out.println("Total Premove:" + totalshow2);

		int expTotal = totalshow1 + totalshow2;

	    System.out.println("Expected Total :" + expTotal);

		builder.sendKeys(Keys.ESCAPE).build().perform();

		waitSleep(4);

		// Pick the 1st show, dispose  and move-----Require Dynamic Data logic
		
		 
		  
		//Below is the previous code which is not applicable as suggested , so commented it out  

		/*
		 * waitSleep(4); builder.contextClick().build().perform();
		 * 
		 * waitSleep(4);
		 * 
		 * 
		 * Thread.sleep(2000); builder.moveToElement(AiringMove).build().perform();
		 * 
		 * waitSleep(4);
		 * 
		 * Move.click();
		 * 
		 * waitSleep(4);
		 * 
		 * startdate.sendKeys(tcData.get("MoveStartDate"));
		 * 
		 * waitSleep(3);
		 * 
		 * start_time.sendKeys(tcData.get("MoveStartTime"));
		 * 
		 * waitSleep(3); end_time.sendKeys(tcData.get("MoveEndTime"));
		 * 
		 * waitSleep(3);
		 * 
		 * System.out.println(tcData.get("MoveStartDate"));
		 * 
		 * System.out.println(tcData.get("MoveStartTime"));
		 * 
		 * System.out.println(tcData.get("MoveEndTime")); waitSleep(3); Clear.click();
		 * waitSleep(3); SelectDay.click();
		 * 
		 * waitSleep(3);
		 * 
		 * Next.click(); waitSleep(5); Yes.click(); waitSleep(5);
		 * 
		 * disposeUnitschkbox.click();
		 * 
		 * waitSleep(5); Execute.click(); waitSleep(58);
		 */
		
		
		waitSleep(6);
		

		// Open the moved show----Require Dynamic logic 
		
		 
		
		
		
		
		//builder.moveToElement(secondshow).build().perform();
		
		//View Details of the moved show
		waitSleep(3);
		builder.contextClick().build().perform();
		waitSleep(3);

		viewdetails.click();
		waitSleep(3);
		
		ExtentTestManager.getTest().log(LogStatus.PASS,"  View detail Screen of the moved show ");
		addScreenShot();
		
		
		
		String t4 = viewtotalPreMove.getText();
		String total3 = t4.replaceAll("[^0-9?!\\.]", "");
		int actualTotal = Integer.parseInt(total3);
		System.out.println("Total Postmove:" + actualTotal);
		
		if (actualTotal == expTotal) 
		{ 
			System.out.println("passed"); 
			
		}	
		 

		builder.sendKeys(Keys.ESCAPE).build().perform();

		waitSleep(4);


		// Reports-Move

		ReportingLink.click();
		waitSleep(4);

		JavascriptExecutor jsx = (JavascriptExecutor) driver;
		jsx.executeScript("window.scrollBy(0,1100)", "");

		waitSleep(3);

		AiringMovesReport.click();
		
        waitSleep(3);
		ExtentTestManager.getTest().log(LogStatus.PASS," Airing Moves Report screen opened ");
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
		waitSleep(60);
		
		
		driver.findElement(By.id("mainReportViewer_ToggleParam_img")).click();
		waitSleep(3);		
		
		ExtentTestManager.getTest().log(LogStatus.PASS,"  Airing Moves Report screen ");
		addScreenShot();		

		Save.click();
		waitSleep(10);
		
		
		//Mail Notification part..... 
		 
	}


}
