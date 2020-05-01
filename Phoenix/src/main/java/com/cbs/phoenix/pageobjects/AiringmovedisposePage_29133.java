package com.cbs.phoenix.pageobjects;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cbs.phoenix.reports.ExtentTestManager;
import com.cbs.phoenix.utilities.TestDataProvider;
import com.relevantcodes.extentreports.LogStatus;

//Prerequisite to run : pick the 2 shows and provide the date , time and select the day in move screen 


public class AiringmovedisposePage_29133 extends BasePage {

	public AiringmovedisposePage_29133(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub

		PageFactory.initElements(driver, this);
	}

	private HashMap<String, String> tcData;
	
	private static WebElement element = null;
	private static List<WebElement> elementsday1 = null;
	private static List<WebElement> elementsday2 = null;
	private static int moveToListIndex;
	// private static List<WebElement> calendarList1 = null;
	// private static List<WebElement> calendarList2 = null;

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
	
	@FindBy(xpath = "/html[1]/body[1]/phoenix-wrapper[1]/div[2]/div[1]/div[1]/phoenix-login[1]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/input[1]")
	private WebElement selectuser;
	
	@FindBy(xpath = "//button[@class='dropdown-item ng-binding ng-scope']")
	private WebElement select; 
	
	
	@FindBy(xpath = "//a[text()='All Dayparts']")
	private WebElement daypart;

	@FindBy(xpath = "(//button[text()='None'])[2]")
	private WebElement None;

	@FindBy(xpath = "//multi-select[2]/div/div/ul/li[3]/div/label/i")
	private WebElement DayTime;

	// ================= AIR SCHEDULE LOCATRS ==============

	@FindBy(xpath = "//ul[@class='sched-days']/li[2]//ancestor::schedule-calendar/section/div[1]/div[1]/div//h5")
	private List<WebElement> CalendarListDateTo;

	@FindBy(xpath = "//ul[@class='sched-days']/li[1]//ancestor::schedule-calendar/section/div[1]/div[1]/div//h5")
	private List<WebElement> CalendarListDateFrom;

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
	


	public void movedispose(TestDataProvider testDataProvider, String testId) {
		// TODO Auto-generated method stub
		tcData = testDataProvider.readData(testId);
		Actions actions = new Actions(driver);
		Random rand = new Random();	
		

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
			
			
          waitSleep(3);
			
			NextClick.click();  

		  
		  
		

		waitSleep(9);
		airingschedule.click();
		waitSleep(10);

		// DATE TO
		waitSleep(5);

		List<String> dates = new ArrayList<String>();
		for (WebElement element : CalendarListDateTo) {
			dates.add(element.getText());
		}

		int calendardateTwo = rand.nextInt(CalendarListDateTo.size());

		while (calendardateTwo == 0) {
			calendardateTwo = rand.nextInt(CalendarListDateTo.size());
		}

		System.out.println(CalendarListDateTo.get(calendardateTwo).getText());

		moveToListIndex = calendardateTwo + 1;
		elementsday2 = driver
				.findElements(By.xpath("//ul[@class='sched-days']/li[" + moveToListIndex + "]/ul/li/div/span[1]"));

		WebElement calendarDateTo = elementsday2.get(calendardateTwo);
		System.out.println("DateTo = " + calendarDateTo.getText());
		System.out.println("Show Name = " + calendarDateTo.getText());

		waitSleep(5);
		rand = new Random();
		int eleindex = rand.nextInt(elementsday2.size());
		WebElement randomElement2 = elementsday2.get(eleindex);
		System.out.println("Show Name = " + randomElement2.getText());
		waitSleep(5);
		actions.moveToElement(randomElement2).perform();
		waitSleep(5);
		actions.contextClick(randomElement2).perform();
		waitSleep(5);
		ViewDetails.click();
		waitSleep(5);
		ExtentTestManager.getTest().log(LogStatus.PASS,"  View details of the desination show  ");
		addScreenShot();		
		
		System.out.println(fullDate.getText());
		ViewDetailscloseIcon.click();

		try {
			parseDate(fullDate.getText());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		waitSleep(5);

		// DATE FROM

		int calendardateOne = rand.nextInt(CalendarListDateFrom.size());

		while (calendardateOne == 0 && CalendarListDateTo.get(calendardateTwo).getText() == CalendarListDateFrom
				.get(calendardateOne).getText()) {
			calendardateOne = rand.nextInt(CalendarListDateFrom.size());
		}

		// WebElement calendarDateFrom = elementsday1.get(calendardateOne);
		System.out.println("DateTo = " + CalendarListDateFrom.get(calendardateOne).getText());
		int moveToListIndex2 = calendardateOne + 1;

		elementsday1 = driver
				.findElements(By.xpath("//ul[@class='sched-days']/li[" + moveToListIndex2 + "]/ul/li/div/span[1]"));

		waitSleep(3);
		rand = new Random();
		WebElement randomElement1 = elementsday1.get(rand.nextInt(elementsday1.size()));

		// need to add additional logic to check show name is same
		// additional login to selecte same duration show
		String showName1 = randomElement1.getText();

		System.out.println("Show Name = " + showName1);
		waitSleep(5);
		actions.moveToElement(randomElement1).perform();
		waitSleep(5);
		actions.contextClick(randomElement1).perform();
		waitSleep(5);
		ViewDetails.click();
		waitSleep(8);
		ExtentTestManager.getTest().log(LogStatus.PASS,"  View details of the show1 that needs to be moved   ");
		addScreenShot();
		
		  String s1 = viewtotaMove.getText(); String total1 =
		  s1.replaceAll("[^0-9?!\\.]", ""); System.out.println("Total unit Premove:" +
		  total1);
		 
			
		fullDate.getText();
		waitSleep(4);
		ViewDetailscloseIcon.click();
		actions.contextClick(randomElement1).perform();
		waitSleep(4);
		actions.contextClick().build().perform();
		waitSleep(4);
		actions.moveToElement(AiringMove).build().perform();
		waitSleep(4);
		Move.click();
		waitSleep(4);

		startdate.clear();
		startdate.sendKeys(dateToEnter);
		waitSleep(3);

		start_time.clear();
		start_time.sendKeys(startTime);

		waitSleep(3);

		end_time.clear();
		end_time.sendKeys(endTime);

		waitSleep(3);

		Clear.click();
		waitSleep(3);

		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='" + partialWeekDayText + "'])[2]"))
				.click();
		waitSleep(3);
		
		ExtentTestManager.getTest().log(LogStatus.PASS,"Move Details ");
		 addScreenShot();
		Next.click();
		waitSleep(3);
		Yes.click();
		waitSleep(3);
		
		Dispose.click();
		waitSleep(3);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Disposing the show  ");
		addScreenShot();
		waitSleep(30);
		Execute.click();
		waitSleep(100);

		elementsday2 = driver
				.findElements(By.xpath("//ul[@class='sched-days']/li[" + moveToListIndex + "]/ul/li/div/span[1]"));

		for (WebElement element : elementsday2) {
			String ELE1 = element.getText();

			if (ELE1.contentEquals(showName1)) {

				waitSleep(3);
				actions.moveToElement(element).perform();
				waitSleep(3);
				actions.contextClick(element).perform();
				waitSleep(3);
				ViewDetails.click();
				waitSleep(8);
				ExtentTestManager.getTest().log(LogStatus.PASS," View details of post to move   ");
				  addScreenShot();
				
				  String s2 = viewtotaMove.getText(); String total2 =
				  s2.replaceAll("[^0-9?!\\.]", ""); System.out.println("Total Unit Postmove:" +
				  total2);
				 
				
				System.out.println(fullDate.getText());
				
				ViewDetailscloseIcon.click();
				waitSleep(5);

				// add additional logic to match time incase of same show names
				break;

			}

		}
		
		//Airing Moves Report
		waitSleep(8);
		ReportingLink.click();
		 waitSleep(4);
		
		 
		 JavascriptExecutor jsx = (JavascriptExecutor)driver;
		 jsx.executeScript("window.scrollBy(0,1100)", "");
		 
		 waitSleep(3);
		 
		 AiringMovesReport.click();
		 
		 waitSleep(3);
		 
		 driver.switchTo().frame(0);
		 
		 waitSleep(3);
		 FromDateClick.clear();
		 
		 
		 waitSleep(3);
		 
		 FromDateClick.sendKeys(dateToEnter);
		 
		 waitSleep(3);
		 
		 ToDateClick.click();
		 
		 waitSleep(3);
		 
		 ToDateClick.clear();
		 
		 waitSleep(2);
		 
		 ToDateClick.sendKeys(dateToEnter);
		 
		 waitSleep(3);
		 
		 Save.click();
		 waitSleep(5);
	}

	void parseDate(String text) throws ParseException {
		String month = text.split(",")[1].trim().split(" ")[0];
		String monthDay = text.split(",")[1].trim().split(" ")[1];

		System.out.println("month-- " + month);
		System.out.println("monthDay-- " + monthDay);

		Date date = new SimpleDateFormat("MMMM").parse(month);
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		String monthInNumber = String.valueOf(cal.get(Calendar.MONTH) + 1);
		System.out.println(monthInNumber);
		dateToEnter = monthInNumber + "/" + monthDay + "/2020";
		System.out.println(dateToEnter);
		String weekDay = text.split(",")[0].trim();
		startTime = text.split(",")[3].trim().split("-")[0].replaceAll("\\s+", "").replaceAll("[^a-zA-Z0-9_-]", "");
		if (startTime.length() == 5) {
			startTime = "0" + startTime;
			System.out.println(startTime);
		} else {
			System.out.println(startTime);
		}

		endTime = text.split(",")[3].trim().split("-")[1].replaceAll("\\s+", "").replaceAll("[^a-zA-Z0-9_-]", "");
		if (endTime.length() == 5) {
			endTime = "0" + endTime;
			System.out.println(endTime);
		} else {
			System.out.println(endTime);
		}

		System.out.println("weekDay: " + weekDay);
		partialWeekDayText = getweekSelection(weekDay);

		System.out.println("Partial Text: " + partialWeekDayText);
	}

	static String getweekSelection(String weekDay) {
		String partialText = "";
		switch (weekDay) {
		case "Monday":
			partialText = "M";
			break;
		case "Tuesday":
			partialText = "T";
			break;
		case "Wednesday":
			partialText = "W";
			break;
		case "Thursday":
			partialText = "Th";
			break;
		case "Friday":
			partialText = "F";
			break;
		case "Saturday":
			partialText = "Sa";
			break;
		case "Sunday":
			partialText = "Su";
			break;

		default:
			break;
		}

		return partialText;	
	
	}
}