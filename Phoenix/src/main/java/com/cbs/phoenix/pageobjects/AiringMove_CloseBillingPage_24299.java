package com.cbs.phoenix.pageobjects;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.cbs.phoenix.reports.ExtentTestManager;
import com.cbs.phoenix.utilities.TestDataProvider;
import com.relevantcodes.extentreports.LogStatus;

public class AiringMove_CloseBillingPage_24299 extends BasePage {

	public AiringMove_CloseBillingPage_24299(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	private HashMap<String, String> tcData;

	Actions actions = new Actions(driver);
	private static WebElement element = null;
	private static List<WebElement> elementsday1 = null;
	private static List<WebElement> elementsday2 = null;
	private static int moveToListIndex;
	private static List<WebElement> showsListReadyToMove = null;

	String weekDay;
	String startTime;
	String endTime;
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
	@FindBy(xpath = "//*[@class='toast-message']/div")
	private WebElement toastMSg;

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

	//

	public void movedispose(TestDataProvider testDataProvider, String testId) {
		// TODO Auto-generated method stub
		// tcData = testDataProvider.readData(testId);
		Actions actions = new Actions(driver);
		Random rand = new Random();

		waitSleep(10);
		ExtentTestManager.getTest().log(LogStatus.INFO, " Automation Regression : Unable to Move Airing In a Closed Billing Period");

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

		airingschedule.click();
		waitSleep(6);

		// Daypart

		//daypart.click();
		//waitSleep(5);
		
		  datePicker.clear();
		  waitSleep(5);
			
		datePicker.sendKeys("10/01/2018 - 10/05/2018");
		
		waitSleep(5);
		ExtentTestManager.getTest().log(LogStatus.PASS," Old Date range provided for getting show having closed billing period ");
		addScreenShot();
		
		//datePicker.sendKeys(Keys.ENTER);
		//waitSleep(5);
		applyBTN.click();
		waitSleep(8);
		
		ExtentTestManager.getTest().log(LogStatus.PASS,"  The corresponding shows with respect to date ranged displayed   ");
		addScreenShot();
		
		
		int calendardateTwo = rand.nextInt(CalendarListDateTo.size());
		System.out.println("calendardateTwo: "+calendardateTwo);
		System.out.println("CalendarListDateTo.size():- "+CalendarListDateTo.size());
		while (calendardateTwo == 0) {
			calendardateTwo = rand.nextInt(CalendarListDateTo.size());
		}

		System.out.println("CalendarListDateTo.get(calendardateTwo).getText() "+CalendarListDateTo.get(calendardateTwo).getText());
		
		moveToListIndex = calendardateTwo + 1;
		System.out.println("moveToListIndex:- "+moveToListIndex);
		elementsday2 = driver.findElements(By.xpath("//ul[@class='sched-days']/li[" + moveToListIndex + "]/ul/li/div/span[1]"));
		
		System.out.println("//ul[@class='sched-days']/li[moveToListIndex]/ul/li/div/span[1]:-"+"//ul[@class='sched-days']/li[" + moveToListIndex + "]/ul/li/div/span[1]");
		waitSleep(5);
		System.out.println("day2shows");
		
		waitSleep(3);
		rand = new Random();
		System.out.println("elementsday2.size():- "+elementsday2.size());
		int eleindex = rand.nextInt(elementsday2.size());
		System.out.println("eleindex "+eleindex);
		WebElement randomElement2 = elementsday2.get(eleindex);
		String ShowName2 = randomElement2.getText();
		System.out.println("ShowName2 "+ShowName2);
		waitSleep(3);
		String ShowDuration = driver.findElement(By.xpath("//ul[@class='sched-days']/li[" + moveToListIndex + "]/ul/li["
				+ (eleindex + 1) + "]/div/span[1]//parent::div//parent::li")).getCssValue("height");
		System.out.println(ShowDuration);
		System.out.println("Show Name 2 = " + ShowName2);
		waitSleep(3);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", randomElement2);

		actions.moveToElement(randomElement2).perform();
		waitSleep(2);
		actions.contextClick(randomElement2).build().perform();
		waitSleep(2);
		
		ExtentTestManager.getTest().log(LogStatus.PASS,"  Picked one show and right click on the show   ");
		addScreenShot();
		
		actions.moveToElement(AiringMove).build().perform();
		
		waitSleep(4);
		ExtentTestManager.getTest().log(LogStatus.PASS,"  clicked on Move successfuly  ");
		addScreenShot();
		
		Move.click();
		
		
		/*
		 * Actions act1 = new Actions(driver); WebDriverWait wait1 = new
		 * WebDriverWait(driver, 30); WebElement parent1 =
		 * wait1.until(ExpectedConditions.visibilityOfElementLocated(By.
		 * xpath("//*[text()='Airing Move']"))); act1.moveToElement(parent1).perform();
		 * WebElement child1 = driver.findElement(By.xpath("//*[text()='Preempt']"));
		 * clickXpath(child1)
		 */;
		
		
		waitUntilVisible(toastMSg);
		String ToastMSg=toastMSg.getText();
		waitSleep(3);
		ExtentTestManager.getTest().log(LogStatus.PASS,"  Toaster successfully appeared with proper error message displayed.  ");
		addScreenShot();
		
		Assert.assertEquals(ToastMSg, "The billing period for this airing has been closed.");
		

		
	}
}
