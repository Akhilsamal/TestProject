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

public class Airing_ReplacePage_28048 extends BasePage {
	
	public Airing_ReplacePage_28048(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@class='user-name text-bold-700 ng-binding']")
	private WebElement userlogin; 
	
	@FindBy(xpath = "//a[contains(text(),'Switch User')]")
	private WebElement switchuserbtn;
	
	@FindBy(xpath = "/html[1]/body[1]/phoenix-wrapper[1]/div[2]/div[1]/div[1]/phoenix-login[1]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/input[1]")
	private WebElement selectuser;	
	
	@FindBy(xpath = "//button[@class='dropdown-item ng-binding ng-scope']")
	private WebElement select; 
	
	@FindBy(xpath = "//span[text()='Airing Schedule']")
	private WebElement airingschedule;
	
	@FindBy(xpath = "//a[text()='All Dayparts']")
	private WebElement daypart;

	@FindBy(xpath = "(//button[text()='None'])[2]")
	private WebElement None;

	@FindBy(xpath = "//multi-select[2]/div/div/ul/li[3]/div/label/i")
	private WebElement DayTime;

	@FindBy(xpath = "/html/body/phoenix-wrapper/nav/div/div[2]/div")
	private WebElement freeclick;

	@FindBy(xpath = "/html/body/phoenix-wrapper/div[2]/div/div/schedule-wrapper/div/div[1]/div/fieldset/input")
	private WebElement textbox;

	@FindBy(xpath = "//li[text()='Custom Range']")
	private WebElement custom;	

	@FindBy(xpath = "//button[text()='Apply']")
	private WebElement apply;
	
	@FindBy(xpath = "//div/div/div/ul/li[2]/a/i")
	private WebElement NextClick;
	
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
	
	@FindBy(xpath = "/html/body/div[1]/div/div/airing-details/div[3]/h4[6]")
	private WebElement NAUnitsPreMove;
	
	
	

	@FindBy(xpath = "//a[text()='Airing Move']")
	private WebElement AiringMove;

	@FindBy(xpath = "//a[text()='Move']")
	private WebElement Move;

	@FindBy(xpath = "(//input[@type='date'])[3]")
	private WebElement movestartdate;

	@FindBy(xpath = "//input[@type='time']")
	private WebElement start_time;

	@FindBy(xpath = "(//input[@type='time'])[2]")
	private WebElement end_time;

	@FindBy(xpath = "(//a[contains(text(),'Clear')])[2]")
	private WebElement Clear;

	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='W'])[2]")
	private WebElement SelectDay;

	@FindBy(xpath = "//button[text()='Next']")
	private WebElement Next;

	@FindBy(xpath = "/html/body/div[1]/div/div/airing-moves-confirm/div[3]/div/div/button[1]")
	private WebElement Yes;

	@FindBy(xpath = "	/html/body/div[1]/div/div/airing-moves/div[2]/div/div[2]/div[2]/div[2]/label/i")
	private WebElement Dispose;

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

	@FindBy(id = "btnSave")
	private WebElement Save;
	
	@FindBy(id = "mainReportViewer_ctl04_ctl00")
	private WebElement viewReport;
	
	@FindBy(xpath = "//a[text()='Replace']")
	private WebElement Replace;
	
	@FindBy(xpath = "//select[@name='shows']")
	private WebElement Selectshow1;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement serachreportpanel;
	
	@FindBy(xpath = "//strong")
	private WebElement searchReport;
	
	@FindBy(id = "mainReportViewer_ctl04_ctl00")
	private WebElement clickViewReport;
	


	

	private HashMap<String, String> tcData;



	public void move(TestDataProvider testDataProvider, String testId) throws IOException, InterruptedException {

		tcData = testDataProvider.readData(testId);

		// TC_28048(Automation Regression : Replace Airing: Replace Airing: NA and Oversold units in a Replaced Show. Verify that if the replaced show contains NA units, the same units will be NA in the replacing show even if there is availability in the new airing.)

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
		  waitSleep(5);
		 airingschedule.click();
		 waitSleep(4);
		 
		    // Daypart

			daypart.click();
			waitSleep(5);

			/// None

			None.click();
			waitSleep(3);

			/// Daytime

			DayTime.click();

			waitSleep(2);
			freeclick.click();
			waitSleep(2);

		/*
		 * textbox.click(); waitSleep(5);
		 * 
		 * custom.click(); waitSleep(5);
		 * 
		 * apply.click();
		 * 
		 * waitSleep(3);
		 */
			
			NextClick.click();

			waitSleep(3);
			
			
		//Pick a  show with  NA and oversold units----Need Dynamic Logic-----
			
			
			
			
			
			
			
			
   WebElement show =driver.findElement(By.xpath("//*[@id='sched']/div[2]/ul/li[2]/ul/li[3]/div"));
			
			Actions builder = new Actions(driver);
			
			builder.moveToElement(show).build().perform();
			
			waitSleep(5);
			
			ExtentTestManager.getTest().log(LogStatus.PASS,"The show picked up successfully");
			System.out.println("The multiple airing show picked up successfully");
			addScreenShot();		
		
			
			
			//Take the view details of the show by making right click action 
			
			

			builder.contextClick().build().perform();

			waitSleep(4);

			viewdetails.click();

			waitSleep(4);

			String s1 = viewLoadPreMove.getText();
			String Load1 = s1.replaceAll("[^0-9?!\\.]", "");
			System.out.println("Load Premove:" + Load1);

			String s2 = viewCommercialPreMove.getText();
			String communit1 = s2.replaceAll("[^0-9?!\\.]", "");
			System.out.println("Commercial Premove:" + communit1);

			String s3 = viewavailPreMove.getText();
			String avail1 = s3.replaceAll("[^0-9?!\\.]", "");
			System.out.println("Avails Premove:" + avail1);

			String s4 = viewtotalPreMove.getText();
			String total1 = s4.replaceAll("[^0-9?!\\.]", "");
			System.out.println("Total Premove:" + total1);
			
			String s5 = NAUnitsPreMove.getText();
			String NAUnits1 = s4.replaceAll("[^0-9?!\\.]", "");
			System.out.println("NA Unit:" + NAUnits1);
			
			
			
			
			ExtentTestManager.getTest().log(LogStatus.PASS,"The detail of airing show ");
			System.out.println("The detail of the  airing show ");
			addScreenShot();

			builder.sendKeys(Keys.ESCAPE).build().perform();

			waitSleep(4);
			
			
			//right click on the show and replace the show 
			
			
			builder.contextClick().build().perform();

			waitSleep(4);

			builder.moveToElement(AiringMove).build().perform();

			waitSleep(4);

			Replace.click();
			waitSleep(4);			
			 Selectshow1.sendKeys("3M OPEN");			  
			  waitSleep(6);
			  ExtentTestManager.getTest().log(LogStatus.PASS, "  Repalce Airing details provided  ");
			  addScreenShot();
			  
			  Next.click(); 
			  waitSleep(5);
			  addScreenShot();
			  Yes.click(); 
			  waitSleep(5);
			  ExtentTestManager.getTest().log(LogStatus.PASS, "  Details of Replace Airing   ");
			  addScreenShot();
			  Execute.click();
			  waitSleep(58);
			  
			  
			  //Pick the Replaced show , right click and do the view details 
			  
			 waitSleep(4);

			viewdetails.click();

			waitSleep(4);
			ExtentTestManager.getTest().log(LogStatus.PASS,"The detail of replaced airing show ");
			System.out.println("The detail of replaced airing show ");
			addScreenShot();
			
			String s55 = NAUnitsPreMove.getText();
			String NAUnits2 = s55.replaceAll("[^0-9?!\\.]", "");
			System.out.println("NA Unit:" + NAUnits2);

			builder.sendKeys(Keys.ESCAPE).build().perform();

			waitSleep(4);
			
			
			//Reports
			
		////Playlist Standard Report///////
			waitSleep(9);
			
			ReportingLink.click();
			waitSleep(4);
			serachreportpanel.click();
			waitSleep(2);
			serachreportpanel.sendKeys("Playlist Standard Report");
			waitSleep(8);
			JavascriptExecutor jsy = (JavascriptExecutor) driver;
			jsy.executeScript("window.scrollBy(0,800)", "");
			waitSleep(6);
			ExtentTestManager.getTest().log(LogStatus.PASS, "  Search Playlist Standard Report ");
			addScreenShot();
			//driver.findElement(By.xpath("//strong")).click();
			searchReport.click();
			waitSleep(10);	
			driver.switchTo().frame(0);
			
			driver.findElement(By.id("mainReportViewer_ctl04_ctl03_txtValue")).clear();
			waitSleep(3);		
			//Start Date
			
			driver.findElement(By.id("mainReportViewer_ctl04_ctl03_txtValue")).sendKeys("2/27/2020");		
			waitSleep(3);
			driver.findElement(By.id("mainReportViewer_ctl04_ctl05_txtValue")).clear();
			waitSleep(3);
			driver.findElement(By.id("mainReportViewer_ctl04_ctl05_txtValue")).clear();
			//End Date
			waitSleep(3);
			driver.findElement(By.id("mainReportViewer_ctl04_ctl05_txtValue")).sendKeys("2/27/2020");
			waitSleep(5);
			
			//Day Time 
			//driver.findElement(By.xpath("//input[@id='mainReportViewer_ctl04_ctl11_ddDropDownButton']")).click();
			//waitSleep(5);
			driver.findElement(By.xpath("//input[@id='mainReportViewer_ctl04_ctl11_ddDropDownButton']")).click();
			waitSleep(5);
			driver.findElement(By.xpath("//input[@id='mainReportViewer_ctl04_ctl11_ddDropDownButton']")).click();
			waitSleep(5);
			driver.findElement(By.xpath("//label[contains(text(),'Daytime')]")).click();
			waitSleep(5);	
			
			//driver.findElement(By.id("mainReportViewer_ctl04_ctl00")).click();
			clickViewReport.click();
			waitSleep(5);
			//driver.findElement(By.id("mainReportViewer_ctl04_ctl00")).click();
			clickViewReport.click();
			waitSleep(20);
			driver.findElement(By.xpath("//*[@id='mainReportViewer_ToggleParam_img']")).click();
			waitSleep(3);
			ExtentTestManager.getTest().log(LogStatus.PASS, "    Playlist Standard Report ");
			addScreenShot();
			waitSleep(5);
		    Save.click();
		    waitSleep(15);
			
			
			
			
		}
			
			
			 
			
		

}
