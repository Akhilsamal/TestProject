package com.cbs.phoenix.pageobjects;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cbs.phoenix.reports.ExtentTestManager;
import com.cbs.phoenix.utilities.TestDataProvider;
import com.relevantcodes.extentreports.LogStatus;

public class AiringGeneratePage_50175 extends BasePage {
	
	public AiringGeneratePage_50175(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}


	Actions actions = new Actions(driver);
	private static WebElement element = null;
	private static List<WebElement> elementsday1 = null;
	private static List<WebElement> elementsday2 = null;
	private static int moveToListIndex;
	private static List<WebElement> showsListReadyToMove = null;

	String weekDay;
	//String startTime;
	//String endTime;
	String dateToEnter;
	String partialWeekDayText;

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
	private WebElement viewtotaMove;

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

	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Sa'])[2]")
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

	@FindBy(id = "btnSave")
	private WebElement Save;

	@FindBy(xpath = "//span[@class='user-name text-bold-700 ng-binding']")
	private WebElement userlogin;

	@FindBy(xpath = "//a[contains(text(),'Switch User')]")
	private WebElement switchuserbtn;

	@FindBy(xpath = "//input[@placeholder='Search by name or user group name']")
	private WebElement selectuser;

	@FindBy(xpath = "//button[@class='dropdown-item ng-binding ng-scope']")
	private WebElement select;

	@FindBy(xpath = "//a[text()='All Dayparts']")
	private WebElement daypart;

	@FindBy(xpath = "(//button[text()='None'])[2]")
	private WebElement None;

	@FindBy(xpath = "//multi-select[2]/div/div/ul/li[3]/div/label/i")
	private WebElement DayTime;
	
	@FindBy(xpath = "//*[contains(@options,'range.options')]")
	private WebElement datePicker;
	
	@FindBy(xpath = "//*[text()='Apply']")
	private WebElement applyBTN;
	
	
	@FindBy(xpath = "//div[@class='col-md-4 form-group-sm']//select[@name='shows']")
	private WebElement selectshow;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement dateRange;
	
	@FindBy(xpath = "//div[@class='col-md-5 form-group-sm ng-scope']//a[contains(text(),'M-F')]")
	private WebElement daysweek;
	
	@FindBy(xpath = "//span[contains(text(),'Inventory')]")
	private WebElement clickInventory;
	
	@FindBy(xpath = "//li[@class='ng-scope is-shown']//a[@class='menu-item ng-binding'][contains(text(),'Airings')]")
	private WebElement clickAiring;
	
	@FindBy(xpath = "//button[@class='btn btn-sm btn-outline-success ng-scope']")
	private WebElement clickGenerateAiring;
	
	
	@FindBy(xpath = "//input[@name='startTime']")
	private WebElement startTime;
	
	
	@FindBy(xpath = "//input[@name='endTime']")
	private WebElement endTime;
	
	@FindBy(xpath = "//phoenix-dropdown/div/div")
	private WebElement daypartdropdown;
	
	@FindBy(xpath = "//a[contains(text(),'News')]")
	private WebElement selectNews;
	
	@FindBy(xpath = "//input[@name='breaks']")
	private WebElement breaks;
	
	@FindBy(xpath = "//input[@name='amount']")
	private WebElement load;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement clickSavebtn;
	
	@FindBy(xpath = "//button[contains(text(),'Continue')]")
	private WebElement clickContinuebtn;
	
	@FindBy(xpath = "//button[@class='btn btn-outline-secondary']")
	private WebElement clickCancelbtn;
	
	@FindBy(xpath = "//select[@name='shows']")
	private WebElement selectShow;
	
	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement date;
	
	@FindBy(xpath = "//button[@class='btn btn-sm btn-secondary']")
	private WebElement clickSearch;
	
	@FindBy(xpath = "//button[contains(text(),'Delete')]")
	private WebElement deleteAiring;
	
	@FindBy(xpath = "//button[@class='btn btn-secondary ng-binding']")
	private WebElement clickOKbtn;
	
	
	//button[@class='btn btn-secondary ng-binding']
	
	
	
	//button[contains(text(),'Delete')]
	
	//button[@class='btn btn-sm btn-secondary']
	
	
	
	
	
	
	
	
	
	

	// ================= AIR SCHEDULE LOCATRS ==============

	@FindBy(xpath = "//ul[@class='sched-days']/li[2]//ancestor::schedule-calendar/section/div[1]/div[1]/div//h5")
	private List<WebElement> CalendarListDateTo;

	@FindBy(xpath = "//ul[@class='sched-days']/li[1]//ancestor::schedule-calendar/section/div[1]/div[1]/div//h5")
	private List<WebElement> CalendarListDateFrom;

	@FindBy(xpath = "//ul[@class='sched-days']/li[1]//ancestor::schedule-calendar/section/div[1]/div[1]/div//h5/preceding-sibling::span")
	private List<WebElement> weekday;

	@FindBy(xpath = "//ul[@class='dropdown-menu airing-menu']//a[contains(text(),\"View Details\")]")
	private WebElement ViewDetails;

	@FindBy(xpath = "//airing-details/div[1]//h3/small")
	private WebElement fullDate;

	@FindBy(xpath = "//div[@class='modal-header border-0']//i[@class='ft-x']")
	private WebElement ViewDetailscloseIcon;

	@FindBy(xpath = "	/html/body/div[1]/div/div/airing-moves/div[2]/div/div[2]/div[2]/div[2]/label/i")
	private WebElement Dispose;

	@FindBy(xpath = "/html/body/phoenix-wrapper/nav/div/div[2]/div")
	private WebElement freeclick;

	@FindBy(xpath = "/html/body/phoenix-wrapper/div[2]/div/div/schedule-wrapper/div/div[1]/div/fieldset/input")
	private WebElement textbox;

	@FindBy(xpath = "//div/div/div/ul/li[2]/a/i")
	private WebElement NextClick;

	@FindBy(xpath = "//div[@class='tooltip-inner']//div[contains(text(),\"NA Units: \")]/b")
	private WebElement NAUnits;
	
	
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	private WebElement okbtn;
	
	//button[contains(text(),'OK')]	
	

	//

	private HashMap<String, String> tcData;
	public void movedispose(TestDataProvider testDataProvider, String testId) {
		// TODO Auto-generated method stub
		// tcData = testDataProvider.readData(testId);
		tcData = testDataProvider.readData(testId);
		Actions actions = new Actions(driver);
		Random rand = new Random();

		waitSleep(10);
		ExtentTestManager.getTest().log(LogStatus.INFO, " Test Case 50175: Automation Regression : E2E_Inventory_Generate Airings_Generate Airings for M-F Show for Season with Network Load ");

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

		ExtentTestManager.getTest().log(LogStatus.PASS, "  Logged in with Inventory Management ");
		addScreenShot();

		waitSleep(5);
		clickInventory.click();
		waitSleep(5);
		clickAiring.click();
		waitSleep(5);		
		ExtentTestManager.getTest().log(LogStatus.PASS, "Clicked on Airing ");
		System.out.println("Click on Airing");
		addScreenShot();
		clickGenerateAiring.click();
		waitSleep(5);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Clicked on Generate Airing ");
		System.out.println("Clicked on Generate Airing");
		addScreenShot();
		selectshow.sendKeys("Demo News");
		//selectshow.sendKeys("CBS THIS MORNING 1");
		//selectshow.sendKeys(tcData.get("ShowName"));
		waitSleep(5);
		daypartdropdown.click();
		waitSleep(5);
		selectNews.click();
		waitSleep(5);
		dateRange.click();
		waitSleep(5);
		dateRange.sendKeys("09/22/2019 - 09/19/2020");
		waitSleep(5);
		daysweek.click();
		waitSleep(5);
		startTime.click();
		waitSleep(5);
		startTime.sendKeys("1100AM");
		waitSleep(5);
		//startTime.sendKeys(tcData.get("StartTime"));
		//waitSleep(5);
		//endTime.sendKeys(tcData.get("EndTime"));
		//waitSleep(5);
		endTime.sendKeys("1130AM");
		waitSleep(5);
		ExtentTestManager.getTest().log(LogStatus.PASS, "provided relevant data");
		System.out.println("provided relevant data");
		addScreenShot();
		breaks.click();
		waitSleep(3);
		breaks.sendKeys("3");
		waitSleep(5);
		load.clear();
		waitSleep(3);
		load.sendKeys("17");
		waitSleep(5);
		clickSavebtn.click();
		waitSleep(25);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Schedule confilts page will be displayed ");
		System.out.println("Schedule confilts page will be displayed");
		addScreenShot();
		clickContinuebtn.click();
		waitSleep(5);
		okbtn.click();
		waitSleep(5);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Generate Airing is successful ");
		System.out.println("Schedule confilts page will be displayed");
		//addScreenShot();
		waitSleep(25);
		clickCancelbtn.click();
		waitSleep(5);
		//selectShow.click();
		waitSleep(5);
		//selectShow.sendKeys("Demo News");
		//selectshow.sendKeys("CBS THIS MORNING 1");
driver.findElement(By.xpath("//select[@name='shows']")).sendKeys("Demo News");
		//driver.findElement(By.xpath("//select[@name='shows']")).sendKeys(tcData.get("ShowName"));
		waitSleep(5);
		freeclick.click();
		waitSleep(5);
		date.clear();
		waitSleep(5);
		date.sendKeys("09/22/2019 - 09/19/2020");
		waitSleep(5);
		freeclick.click();
		waitSleep(5);
		clickSearch.click();
		waitSleep(8);		
		ExtentTestManager.getTest().log(LogStatus.PASS, "The respective airings searched  successfully ");
		System.out.println("The respective airings searched  successfully");
		addScreenShot();
		waitSleep(6);
		scrollToPageBottom();
		waitSleep(4);
		addScreenShot();		
		 airingschedule.click(); 
		 waitSleep(6);		  
		 driver.findElement(By.xpath("//div[@class='timeline']//li[17]//span[1]")).click();		 
		  waitSleep(5);
		  ExtentTestManager.getTest().log(LogStatus.PASS, "In Airing Schedule screen The respective airings  displayed successfully  ");
		  System.out.println("In Airing Schedule screen The respective airings  displayed successfully");
		  addScreenShot();
		  NextClick.click();
		  waitSleep(5);
		  driver.findElement(By.xpath("//div[@class='timeline']//li[17]//span[1]")).click();
		  waitSleep(5);
		  addScreenShot();
		  NextClick.click();
		  waitSleep(5);
		  driver.findElement(By.xpath("//div[@class='timeline']//li[17]//span[1]")).click();
		  waitSleep(5);
		  addScreenShot();
		  
		 
		
		
		
}
}
