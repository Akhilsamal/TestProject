package com.cbs.phoenix.pageobjects;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cbs.phoenix.reports.ExtentTestManager;
import com.cbs.phoenix.utilities.TestDataProvider;
import com.relevantcodes.extentreports.LogStatus;

public class AiringMovePagelatest_29133 extends BasePage {
	
	public AiringMovePagelatest_29133(WebDriver driver) {
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
		  
		  daypart.click(); waitSleep(5);
		  
		  /// None
		  
		  None.click(); waitSleep(3);
		  
		  /// Daytime
		  
		  DayTime.click();
		  
		  waitSleep(2); freeclick.click(); waitSleep(2);
		  
		  textbox.click(); waitSleep(5);
		  
		  
		  waitSleep(3); NextClick.click();
		 

		  
		  

		waitSleep(5);
		//airingschedule.click();
		//waitSleep(10);

		// DATE TO
		waitSleep(5);

		int calendardateTwo = rand.nextInt(CalendarListDateTo.size());

		while (calendardateTwo == 0) {
			calendardateTwo = rand.nextInt(CalendarListDateTo.size());
		}

		System.out.println(CalendarListDateTo.get(calendardateTwo).getText());

		moveToListIndex = calendardateTwo + 1;
		elementsday2 = driver
				.findElements(By.xpath("//ul[@class='sched-days']/li[" + moveToListIndex + "]/ul/li/div/span[1]"));

		System.out.println("day2shows");
		WebElement calendarDateTo = elementsday2.get(calendardateTwo);
		/*
		 * for (WebElement day2showsElement : elementsday2) {
		 * 
		 * System.out.println(day2showsElement.getText());
		 * 
		 * } System.out.println(" ");
		 */
		waitSleep(3);
		rand = new Random();
		int eleindex = rand.nextInt(elementsday2.size());
		WebElement randomElement2 = elementsday2.get(eleindex);
		String ShowName2 = randomElement2.getText();
		waitSleep(3);
		String ShowDuration = driver.findElement(By.xpath("//ul[@class='sched-days']/li[" + moveToListIndex + "]/ul/li["
				+ (eleindex + 1) + "]/div/span[1]//parent::div//parent::li")).getCssValue("height");
		System.out.println(ShowDuration);
		System.out.println("Show Name 2 = " + ShowName2);
		waitSleep(3);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", randomElement2);

		actions.moveToElement(randomElement2).perform();
		waitSleep(5);
		actions.contextClick(randomElement2).build().perform();
		waitSleep(5);
		if (!ViewDetails.isDisplayed()) {

			actions.moveToElement(randomElement2).sendKeys(Keys.ARROW_DOWN).perform();
			waitSleep(2);
			actions.contextClick(randomElement2).build().perform();
			waitSleep(2);
			if (!ViewDetails.isDisplayed()) {
				actions.moveToElement(randomElement2).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).build().perform();
				waitSleep(2);
				actions.contextClick(randomElement2).build().perform();
			}
		}

		waitSleep(5);

		retryingFindClick(ViewDetails);
		
		waitSleep(5);
		ExtentTestManager.getTest().log(LogStatus.PASS,"  View details of the desination show  ");
		addScreenShot();
		System.out.println("Show Name 2 Details = " + fullDate.getText());
		String Show2fullDateString = fullDate.getText();
		ViewDetailscloseIcon.click();

		try {
			parseDate(Show2fullDateString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		waitSleep(3);

		// DATE FROM

		int calendardateOne = rand.nextInt(CalendarListDateFrom.size());

		while (CalendarListDateTo.get(calendardateTwo).getText()
				.contentEquals(CalendarListDateFrom.get(calendardateOne).getText())) {
			calendardateOne = rand.nextInt(CalendarListDateFrom.size());
		}

		System.out.println("DateTo = " + CalendarListDateFrom.get(calendardateOne).getText());
		int moveToListIndex2 = calendardateOne + 1;

		elementsday1 = driver
				.findElements(By.xpath("//ul[@class='sched-days']/li[" + moveToListIndex2 + "]/ul/li/div/span[1]"));
		System.out.println("day1shows");
		/*
		 * for (WebElement day1showsElement : elementsday1) {
		 * 
		 * System.out.println(day1showsElement.getText());
		 * 
		 * } System.out.println(" ");
		 */
		waitSleep(3);
		rand = new Random();

		int eleindex2 = rand.nextInt(elementsday1.size());
		WebElement randomElement1 = elementsday1.get(eleindex2);
		waitSleep(3);
		String ShowDuration1 = driver.findElement(By.xpath("//ul[@class='sched-days']/li[" + moveToListIndex2
				+ "]/ul/li[" + (eleindex2 + 1) + "]/div/span[1]//parent::div//parent::li")).getCssValue("height");

		while (randomElement1.getText().contentEquals(ShowName2) || !ShowDuration1.contentEquals(ShowDuration)) {

			eleindex2 = rand.nextInt(elementsday1.size());
			randomElement1 = elementsday1.get(eleindex2);

			ShowDuration1 = driver.findElement(By.xpath("//ul[@class='sched-days']/li[" + moveToListIndex2 + "]/ul/li["
					+ (eleindex2 + 1) + "]/div/span[1]//parent::div//parent::li")).getCssValue("height");

		}
		System.out.println(" Show 1 Duration" + ShowDuration1);
		String showName1 = randomElement1.getText();

		System.out.println("Show Name 1  = " + showName1);
		waitSleep(3);

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", randomElement1);
		actions.moveToElement(randomElement1).perform();
		waitSleep(3);
		actions.contextClick(randomElement1).build().perform();
		waitSleep(5);

		if (!ViewDetails.isDisplayed()) {

			actions.moveToElement(randomElement1).sendKeys(Keys.ARROW_DOWN).perform();
			waitSleep(2);
			actions.contextClick(randomElement1).build().perform();
			waitSleep(2);
			if (!ViewDetails.isDisplayed()) {
				actions.moveToElement(randomElement1).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).build().perform();
				waitSleep(2);
				actions.contextClick(randomElement1).build().perform();
			}
		}

		waitSleep(5);
		retryingFindClick(ViewDetails);
		waitSleep(8);
		String s1 = viewtotaMove.getText(); String total1 =
				  s1.replaceAll("[^0-9?!\\.]", ""); System.out.println("Total unit Premove:" +
				  total1);
		ExtentTestManager.getTest().log(LogStatus.PASS,"  View details of the show1 that needs to be moved   ");
		addScreenShot();

		System.out.println("Show Name 1 Details  = " + fullDate.getText());
		waitSleep(4);
		ViewDetailscloseIcon.click();
		waitSleep(4);
		actions.moveToElement(randomElement1).contextClick(randomElement1).build().perform();
		waitSleep(4);
		actions.moveToElement(AiringMove).build().perform();
		waitSleep(4);
		actions.moveToElement(Move).click().perform();
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

		driver.findElement(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='" + partialWeekDayText + "'])[2]"))
				.click();
		waitSleep(3);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Move Details ");
		 addScreenShot();
		Next.click();
		waitSleep(3);
		Yes.click();
		waitSleep(3);
		Dispose.click();
		waitSleep(10);
		ExtentTestManager.getTest().log(LogStatus.PASS,"Disposing the show  ");
		addScreenShot();
		Execute.click();
		waitSleep(100);
		System.out.println("new date index is " + moveToListIndex);
		elementsday2 = driver
				.findElements(By.xpath("//ul[@class='sched-days']/li[" + moveToListIndex + "]/ul/li/div/span[1]"));
		System.out.println("Show name to compare " + showName1);
		System.out.println("Updated show list (date to) is as follow - ");
		for (WebElement element : elementsday2) {
			String ELE1 = element.getText();
			System.out.println(element.getText());

			if (ELE1.contentEquals(showName1)) {

				waitSleep(5);
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
				actions.moveToElement(element).perform();
				waitSleep(5);
				actions.contextClick(element).build().perform();
				waitSleep(5);
				retryingFindClick(ViewDetails);	
				ExtentTestManager.getTest().log(LogStatus.PASS," View details of post to move   ");
				  addScreenShot();
				waitSleep(8);
				  String s2 = viewtotaMove.getText(); String total2 =
						  s2.replaceAll("[^0-9?!\\.]", ""); System.out.println("Total Unit Postmove:" +
						  total2);
				
				System.out.println(fullDate.getText());
				if (fullDate.getText().contentEquals(Show2fullDateString)) {
					System.out.println("MATCH SUCCESS");
					ViewDetailscloseIcon.click();
					waitSleep(3);
					break;
				} else {
					System.out.println("NOT MATCHED SUCCESS");
					ViewDetailscloseIcon.click();
					waitSleep(3);

				}
				
				

			}

		}
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

	public boolean retryingFindClick(WebElement webElement) {
		boolean result = false;
		int attempts = 0;
		while (attempts < 2) {
			try {
				webElement.click();
				result = true;
				break;
			} catch (StaleElementReferenceException e) {
			}
			attempts++;
		}
		return result;
	}

}