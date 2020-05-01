package com.cbs.phoenix.pageobjects;

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
import com.cbs.phoenix.testcases.BaseTest;
import com.cbs.phoenix.utilities.TestDataProvider;
import com.relevantcodes.extentreports.LogStatus;

public class PreemptAiringPage_47753 extends BasePage {

	public PreemptAiringPage_47753(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
		basetest = new BaseTest();
	}

	private HashMap<String, String> tcData;

	Actions actions = new Actions(driver);
	private static WebElement element = null;
	private static List<WebElement> elementsday1 = null;
	private static List<WebElement> elementsday2 = null;
	private static int moveToListIndex;
	private static List<WebElement> showsListReadyToMove = null;
	public  BaseTest basetest;
	
	String ELE1;
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

	@FindBy(xpath = "//a[text()='Preempt']")
	private WebElement Preempt;

	@FindBy(xpath = "//input[@placeholder='Search by Deal or Order #']")
	private WebElement SearchDeal;
	public String date1;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement serachreportpanel;
	//

	public void movedispose(TestDataProvider testDataProvider, String testId) {
		// TODO Auto-generated method stub
		// tcData = testDataProvider.readData(testId);
		Actions actions = new Actions(driver);
		Random rand = new Random();

		waitSleep(10);

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

		// textbox.click();
		// waitSleep(5);

		waitSleep(3);
		NextClick.click();

		waitSleep(5);
		NextClick.click();

		// DATE TO
		waitSleep(5);

		int calendardateTwo = rand.nextInt(CalendarListDateTo.size());
		int index = 0;
		int saturdayIndex = 0;
		int SundayIndex = 0;
		for (WebElement checkweekedElement : weekday) {
			if (checkweekedElement.getText().contentEquals("Sun")) {
				SundayIndex = index;
			} else if (checkweekedElement.getText().contentEquals("Sat")) {
				saturdayIndex = index;
			}

			index++;
		}

		System.out.println(saturdayIndex);
		System.out.println(SundayIndex);

		while (calendardateTwo == saturdayIndex || calendardateTwo == SundayIndex) {
			calendardateTwo = rand.nextInt(CalendarListDateTo.size());
		}

		String randomToWeekDateWithShows = CalendarListDateTo.get(calendardateTwo).getText();
		System.out.println(randomToWeekDateWithShows);

		elementsday2 = driver.findElements(
				By.xpath("//ul[@class='sched-days']/li[" + (calendardateTwo + 1) + "]/ul/li/div/span[1]"));

		waitSleep(3);

		// Choose a random show from the list
		int eleindex = rand.nextInt(elementsday2.size());
		WebElement randomElement2 = elementsday2.get(eleindex);

		actions.moveToElement(randomElement2).perform();
		waitSleep(5);
		ExtentTestManager.getTest().log(LogStatus.PASS, "The corresponding show is selected ");
		System.out.println("The show is selected");
		addScreenShot();
		/*
		 * System.out.println(NAUnits.getText()); while
		 * (!(Double.parseDouble(NAUnits.getText()) > 0.00)) {
		 * 
		 * eleindex = rand.nextInt(elementsday2.size()); randomElement2 =
		 * elementsday2.get(eleindex); actions.moveToElement(randomElement2).perform();
		 * waitSleep(3);
		 * 
		 * }
		 */

		// Get the Show name & Duration
		String ShowName2 = randomElement2.getText();
		waitSleep(3);

		String ShowDuration = driver.findElement(By.xpath("//ul[@class='sched-days']/li[" + (calendardateTwo + 1)
				+ "]/ul/li[" + (eleindex + 1) + "]/div/span[1]//parent::div//parent::li")).getCssValue("height");
		System.out.println(ShowDuration);
		System.out.println("Show Name 2 = " + ShowName2);
		waitSleep(3);

		// GO to View Details Screen of the selected show and get the Date &
		// Show timings
		rightClickOnaShow(randomElement2);
		getRightClickOptions(ViewDetails, randomElement2);

		waitSleep(5);
		retryingFindClick(ViewDetails);
		waitSleep(8);
		System.out.println("Show Name 2 Details = " + fullDate.getText());
		String Show2fullDateString = fullDate.getText();

		ExtentTestManager.getTest().log(LogStatus.PASS, "View details of airing show ");
		System.out.println("View details of the  airing show ");
		addScreenShot();

		ViewDetailscloseIcon.click();

		try {
			parseDate(Show2fullDateString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		waitSleep(5);

		 actions.moveToElement(randomElement2).perform();
		 waitSleep(5);
		// selectOneRightClickOptionsFromShow(Preempt, AiringMove);
		//selectOneRightClickOptionsFromShow(randomElement2, AiringMove, Preempt);

		 actions.contextClick().build().perform();
		 waitSleep(5);
		 actions.moveToElement(AiringMove).build().perform();

		 waitSleep(5);

		 Preempt.click();

		waitSleep(8);

		ExtentTestManager.getTest().log(LogStatus.PASS, "Screenshot of Preempt Airing");
		System.out.println("Screenshot of Preempt Airing");
		addScreenShot();

		Next.click();
		waitSleep(4);

		ExtentTestManager.getTest().log(LogStatus.PASS, "Pop up of Preempt Airing");
		System.out.println("Pop up of Preempt Airing");
		addScreenShot();
		waitSleep(5);

		Yes.click();
		waitSleep(5);
		ExtentTestManager.getTest().log(LogStatus.PASS, " Screenshot of Execute Preempt Airing");
		System.out.println("Screenshot of Execute Preempt Airing");
		addScreenShot();
		waitSleep(2);

		Execute.click();
		waitSleep(50);

		ExtentTestManager.getTest().log(LogStatus.PASS, " The corresponding airing is successfuly preempted");
		System.out.println("The corresponding airing is successfuly preempted");
		addScreenShot();

		// Click on only Scheduled

		driver.findElement(By.xpath(
				"/html/body/phoenix-wrapper/div[2]/div/div[1]/schedule-wrapper/div/div[1]/div/multi-select[1]/div/a"))
				.click();

		waitSleep(5);
		// click on the preempted
		driver.findElement(By.xpath("//li[5]/div/label/i")).click();
		waitSleep(7);

		freeclick.click();
		waitSleep(8);

		// Next and Execute
		// nextAndExecute();

		System.out.println("new date index is " + calendardateTwo);
		elementsday2 = driver.findElements(
				By.xpath("//ul[@class='sched-days']/li[" + (calendardateTwo + 1) + "]/ul/li/div/span[1]"));

		waitSleep(8);

		System.out.println("Show name to compare " + ShowName2);
		System.out.println("Updated show list (date to) is as follow - ");
		
		for (WebElement element : elementsday2) {
			
			try {
				ELE1 = element.getText();
			} catch (Exception e) {
				System.out.println("CAME IN CATCH BLOCK");
				//e.printStackTrace();
			}
			System.out.println("This is the text: "+element.getText());

			if (ELE1.contains(ShowName2)) {

				waitSleep(8);

				rightClickOnaShow(element);

				ExtentTestManager.getTest().log(LogStatus.PASS, " Right click on the preempted show");
				System.out.println("Right click on the preempted show");
				addScreenShot();
				getRightClickOptions(ViewDetails, element);

				retryingFindClick(ViewDetails);
				waitSleep(3);

				System.out.println(fullDate.getText());
				if (fullDate.getText().contains(Show2fullDateString)) {
					System.out.println("MATCH SUCCESS");

					// ViewDetailscloseIcon.click();
					waitSleep(5);
					// break;
				} else {
					System.out.println("NOT MATCHED SUCCESS");
					// ViewDetailscloseIcon.click();
					waitSleep(3);

				}

				ExtentTestManager.getTest().log(LogStatus.PASS, "View Details of the  preempted  show");
				System.out.println("View Details of the  preempted  show");
				addScreenShot();
				// Get the deal
				waitSleep(5);
				String a = driver
						.findElement(By
								.xpath("/html/body/div[1]/div/div/airing-details/div[2]/div/table/tbody/tr[1]/td[10]"))
						.getText();
				String deal = a.substring(0, 5);
				System.out.println(" show deal :" + deal);
				waitSleep(5);
				ViewDetailscloseIcon.click();

				waitSleep(6);
				// Search Deal
				SearchDeal.sendKeys(deal);
				waitSleep(3);

				ExtentTestManager.getTest().log(LogStatus.PASS, "Search Deal");
				System.out.println("Search Deal");
				addScreenShot();
				// Get the deal
				SearchDeal.sendKeys(Keys.ENTER);
				waitSleep(18);

				// Open the Deal

				driver.findElement(
						By.xpath("/html/body/phoenix-wrapper/div[2]/div/div[1]/ui-view/deal/div/div/div[2]/ul/li[4]/a"))
						.click();
				waitSleep(18);

				// Navigate to Order screen

				driver.findElement(By.xpath(
						"/html/body/phoenix-wrapper/div[2]/div/div[1]/ui-view/deal/div/div/div[2]/div/deal-hold-order/div[1]/ul/li[2]/a"))
						.click();
				waitSleep(6);

				ExtentTestManager.getTest().log(LogStatus.PASS, "  Navigated to Order screen for Deal Search ");
				addScreenShot();

				// OrderdetailsLink.click();
				waitSleep(6);

				///// Scroll down to check the deal to come with date.

				// WebElement dealdata=driver.findElement(By.xpath("//*[text()='3/2/20']"));
				System.out.println("DATE1:- " + date1);
				WebElement dealdata = driver.findElement(By.xpath("//*[text()='" + date1 + "']"));

				scrollToElementLoc(dealdata);
				waitSleep(8);
				// ExtentTestManager.getTest().log(LogStatus.PASS," Deal for preempted show is
				// displayed in orange color");
				addScreenShot();

				//

				/// Reports

				ExtentTestManager.getTest().log(LogStatus.INFO, " Creating Airing History Report");
				waitSleep(9);

				//// Airing History Report

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

				// driver.findElement(By.id("mainReportViewer_ctl04_ctl03_txtValue")).sendKeys("3/2/2020");
				driver.findElement(By.id("mainReportViewer_ctl04_ctl03_txtValue")).sendKeys(dateToEnter);

				waitSleep(5);
				driver.findElement(By.id("mainReportViewer_ctl04_ctl07_ddValue")).click();
				waitSleep(5);
				driver.findElement(By.id("mainReportViewer_ctl04_ctl07_ddValue")).sendKeys("Daytime");
				waitSleep(5);
				driver.findElement(By.id("mainReportViewer_ctl04_ctl09_ddValue")).click();
				waitSleep(5);
				driver.findElement(By.id("mainReportViewer_ctl04_ctl09_ddValue")).sendKeys(ShowName2);
				waitSleep(5);
				driver.findElement(By.id("mainReportViewer_ctl04_ctl00")).click();
				waitSleep(6);
				driver.findElement(By.id("mainReportViewer_ctl04_ctl00")).click();
				waitSleep(6);
				driver.findElement(By.xpath("//*[@id='mainReportViewer_ToggleParam_img']")).click();
				waitSleep(3);

				ExtentTestManager.getTest().log(LogStatus.PASS, "  Airing History Report screen ");
				addScreenShot();
				waitSleep(8);
				Save.click();
				waitSleep(15);

			}

		}

	}

	public int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

	void getRightClickOptions(WebElement option, WebElement show) {

		actions.contextClick(show).build().perform();
		waitSleep(4);
		if (!option.isDisplayed()) {

			actions.moveToElement(show).sendKeys(Keys.ARROW_DOWN).perform();
			waitSleep(2);
			actions.contextClick(show).build().perform();
			waitSleep(2);
			if (!option.isDisplayed()) {
				actions.moveToElement(show).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).build().perform();
				waitSleep(2);
				actions.contextClick(show).build().perform();
			}
		}
	}

	void selectOneRightClickOptionsFromShow(WebElement show, WebElement parentOption) {
		selectOneRightClickOptionsFromShow(show, parentOption, null);
	}

	void rightClickOnaShow(WebElement show) {
		waitSleep(4);
		scrollToElementLoc(show);
		waitSleep(4);
		actions.moveToElement(show).contextClick(show).build().perform();
		waitSleep(3);
	}

	void selectOneRightClickOptionsFromShow(WebElement show, WebElement parentOption, WebElement childOption) {
		rightClickOnaShow(show);
		waitSleep(5);
		actions.moveToElement(parentOption).build().perform();
		waitSleep(5);
		if (childOption.isDisplayed() == true) {
			waitSleep(8);
			actions.moveToElement(childOption).click().build().perform();
			System.out.println("ElEMENT IS CLICKED");
			waitSleep(5);

		}
	}

	void enterDateOrtime(WebElement fieldName, String dataToEnter) {
		fieldName.clear();
		fieldName.sendKeys(dataToEnter);
		waitSleep(3);
	}

	void nextAndExecute() {
		Next.click();
		waitSleep(8);
		Yes.click();
		waitSleep(8);
		Dispose.click();
		waitSleep(10);
		Execute.click();
		waitSleep(70);
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

		date1 = dateToEnter.substring(0, 7);
		System.out.println(date1);
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

	
	//public boolean javascriptClick(WebElement webElement) {
		
		
		//JavascriptExecutor executor = (JavascriptExecutor) BaseTest.getDriver();
		//executor.executeScript("arguments[0].click();", webElement); 
		//return result;
	//}
	
	public boolean retryingFindClick(WebElement webElement) {
		boolean result = false;
		int attempts = 0;
		if (webElement.isDisplayed() == true) {
			while (attempts < 2) {
				try {
					webElement.click();
					result = true;
					break;
				} catch (StaleElementReferenceException e) {
				}
				attempts++;
			}
			
		}
		return result;
	}

}
