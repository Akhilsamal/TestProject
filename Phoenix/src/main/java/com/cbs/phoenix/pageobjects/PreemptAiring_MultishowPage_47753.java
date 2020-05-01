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

public class PreemptAiring_MultishowPage_47753 extends BasePage {
	
	public PreemptAiring_MultishowPage_47753(WebDriver driver) {
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

	/*
	 * @FindBy(xpath = "//td[text()='20']") private WebElement startdate;
	 * 
	 * @FindBy(xpath = "//td[text()='24']") private WebElement enddate;
	 */

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
	
	
	@FindBy(xpath = "//a[text()='Preempt']")
	private WebElement Preempt;
	
	@FindBy(xpath = "//a[contains(text(),'Only Scheduled')")
	private WebElement linkSceduled;
	
	@FindBy(xpath = "//input[@placeholder='Search by Deal or Order #']")
	private WebElement SearchDeal;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement serachreportpanel;
	
	
	
	


	

	private HashMap<String, String> tcData;

	

	public void move(TestDataProvider testDataProvider, String testId) throws IOException, InterruptedException {

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

		   waitSleep(5);

		   airingschedule.click();
		   waitSleep(6);		
		 
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

			textbox.click();
			waitSleep(5);

			//custom.click();
			//waitSleep(5);	

			//apply.click();

			waitSleep(3);
			
			NextClick.click();

			waitSleep(3);

			NextClick.click();
			
			waitSleep(5);
			//Actions act = new Actions(driver);
			
			//////
			
//Pick shows needs dynamic logic........
			
			//*[@id="sched"]/div[2]/ul/li[1]/ul/li[3]/div
			
			//*[@id="sched"]/div[2]/ul/li[2]/ul/li[3]/div
			
			WebElement show =driver.findElement(By.xpath("//*[@id='sched']/div[2]/ul/li[2]/ul/li[3]/div"));
			
			Actions act = new Actions(driver);
			
			act.moveToElement(show).build().perform();
			
			waitSleep(5);
			
			ExtentTestManager.getTest().log(LogStatus.PASS,"The multiple airing show picked up successfully");
			System.out.println("The multiple airing show picked up successfully");
			addScreenShot();
			
			act.contextClick().build().perform();
			
			waitSleep(4);

			viewdetails.click();
			
			waitSleep(4);
			
			ExtentTestManager.getTest().log(LogStatus.PASS,"The detail of airing show ");
			System.out.println("The detail of the  airing show ");
			addScreenShot();
			

			 act.sendKeys(Keys.ESCAPE).build().perform();		 
			  waitSleep(5);
			
			
			
			act.moveToElement(show).build().perform();
			waitSleep(4);
			act.contextClick().build().perform();
			waitSleep(5);
			act.moveToElement(AiringMove).build().perform();

			waitSleep(4);

			Preempt.click();
			
			waitSleep(4);
			
			//String Date=driver.findElement(By.xpath("/html/body/div[1]/div/div/airing-moves/div[1]/div/div[1]/input")).getText();
			
			//System.out.println(Date);
			waitSleep(4);
			
			ExtentTestManager.getTest().log(LogStatus.PASS,"Screenshot of Preempt Airing");
			System.out.println("Screenshot of Preempt Airing");
			addScreenShot();
			
			Next.click();
			waitSleep(4);
			
			ExtentTestManager.getTest().log(LogStatus.PASS,"Pop up of Preempt Airing");
			System.out.println("Pop up of Preempt Airing");
			addScreenShot();
			waitSleep(5);
			
			Yes.click();
			waitSleep(5);
			ExtentTestManager.getTest().log(LogStatus.PASS," Screenshot of Execute Preempt Airing");
			System.out.println("Screenshot of Execute Preempt Airing");
			addScreenShot();			
			waitSleep(2);
			
			Execute.click();
			waitSleep(50);
			
			ExtentTestManager.getTest().log(LogStatus.PASS," The corresponding airing is successfuly preempted");
			System.out.println("The corresponding airing is successfuly preempted");
			addScreenShot();
			
			 // Click on only Scheduled
			     // Daypart
			
			
			//////
			
			driver.findElement(By.xpath("/html/body/phoenix-wrapper/div[2]/div/div[1]/schedule-wrapper/div/div[1]/div/multi-select[1]/div/a")).click();
			
			//linkSceduled.click();
			 waitSleep(5);
			 //click on the preempted 
			driver.findElement(By.xpath("//li[5]/div/label/i")).click();
			 waitSleep(5);
			 
			 
			 
			 //Pick the Preempted Show - Need Dynamic logic......................
			 
			//*[@id="sched"]/div[2]/ul/li[1]/ul/li[3]/div
			 
			 WebElement preemptedshow =driver.findElement(By.xpath("//*[@id='sched']/div[2]/ul/li[2]/ul/li[3]/div"));
			 
			 act.moveToElement(preemptedshow).build().perform();
				
				waitSleep(5);
				
				ExtentTestManager.getTest().log(LogStatus.PASS,"The preempted airing show picked up successfully");
				System.out.println("The preempted airing show picked up successfully");
				addScreenShot();
				
				act.contextClick().build().perform();
				
				waitSleep(4);

				viewdetails.click();				
				waitSleep(4);
				
				ExtentTestManager.getTest().log(LogStatus.PASS,"View Details of the  preempted  show");
				System.out.println("View Details of the  preempted  show");
				addScreenShot();
				
				// Get the preempted Deal
				
				  String a=driver.findElement(By.xpath("/html/body/div[1]/div/div/airing-details/div[2]/div/table/tbody/tr[1]/td[10]")).getText();				  
				  String deal= a.substring(0, 5);
				  System.out.println(" show deal :" + deal );
				  waitSleep(5);
				  act.sendKeys(Keys.ESCAPE).build().perform();		 
				  waitSleep(5);
				  
					//deal.click();
					waitSleep(6);	

					SearchDeal.sendKeys(deal);
					waitSleep(3);
					SearchDeal.sendKeys(Keys.ENTER);
					waitSleep(18);
					
					//Open the Deal
					
					 driver.findElement(By.xpath("/html/body/phoenix-wrapper/div[2]/div/div[1]/ui-view/deal/div/div/div[2]/ul/li[4]/a")).click();
					  waitSleep(10);

					//OrderLink.click();
					waitSleep(6);
					driver.findElement(By.xpath("/html/body/phoenix-wrapper/div[2]/div/div[1]/ui-view/deal/div/div/div[2]/div/deal-hold-order/div[1]/ul/li[2]/a")).click();
					waitSleep(6);
					
					
					ExtentTestManager.getTest().log(LogStatus.PASS,"  Navigated to Order screen for Deal ");
					addScreenShot();

					//OrderdetailsLink.click();
					waitSleep(4);
					
					/////Scroll down to check the deal to come as orange color with date. 
					
					WebElement dealdata=driver.findElement(By.xpath("//*[text()='3/2/20']"));
					
					scrollToElementLoc(dealdata) ;
					waitSleep(5);
					addScreenShot();
				///Mail Notification
					
					// Need Dynamic Data
				  
				  
			 /////

						
			///Reports
					
					
					ExtentTestManager.getTest().log(LogStatus.INFO, " Creating Airing History Report");

					waitSleep(9);

					//// Reports
					
					////Airing History Report

					ReportingLink.click();
					waitSleep(4);
					serachreportpanel.click();
					waitSleep(2);
					serachreportpanel.sendKeys("Airing History");
					waitSleep(8);
					JavascriptExecutor jsw = (JavascriptExecutor) driver;
					jsw.executeScript("window.scrollBy(0,600)", "");
					waitSleep(6);
					ExtentTestManager.getTest().log(LogStatus.PASS, "  Airing History ");
					addScreenShot();
					driver.findElement(By.xpath("//strong")).click();
					waitSleep(10);
					

					driver.switchTo().frame(0);

					driver.findElement(By.id("mainReportViewer_ctl04_ctl03_txtValue")).sendKeys("3/2/2020");

					waitSleep(5);
					
					driver.findElement(By.id("mainReportViewer_ctl04_ctl07_ddValue")).click();
					waitSleep(5);
					driver.findElement(By.id("mainReportViewer_ctl04_ctl07_ddValue")).sendKeys("Daytime");

					waitSleep(5);		
					
					driver.findElement(By.id("mainReportViewer_ctl04_ctl09_ddValue")).click();
					waitSleep(5);

					driver.findElement(By.id("mainReportViewer_ctl04_ctl09_ddValue")).sendKeys("LET'S MAKE A DEAL 1");
					waitSleep(5);
					
					
					driver.findElement(By.id("mainReportViewer_ctl04_ctl00")).click();
					waitSleep(6);

					driver.findElement(By.id("mainReportViewer_ctl04_ctl00")).click();
					waitSleep(6);


					driver.findElement(By.xpath("//*[@id='mainReportViewer_ToggleParam_img']")).click();
					waitSleep(3);
					//*[@id="mainReportViewer_ToggleParam_img"]

					ExtentTestManager.getTest().log(LogStatus.PASS, "  Airing History Report screen ");
					addScreenShot();

					waitSleep(3);
					//driver.switchTo().defaultContent();
					waitSleep(5);

					//JavascriptExecutor jsx = (JavascriptExecutor) driver;
					//jsw.executeScript("window.scrollBy(0,800)", "");
					
					
					waitSleep(4);
					//addScreenShot();

				   Save.click();
					waitSleep(15);

			
			
			
	}

}
