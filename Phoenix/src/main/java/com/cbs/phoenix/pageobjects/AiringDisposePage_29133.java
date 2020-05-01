package com.cbs.phoenix.pageobjects;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
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

public class AiringDisposePage_29133 extends BasePage {

	
	
	public AiringDisposePage_29133(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
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

		textbox.click();
		waitSleep(5);

		waitSleep(3);
		NextClick.click();

		waitSleep(5);

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

		// Choose a randon show from the list
		int eleindex = rand.nextInt(elementsday2.size());
		WebElement randomElement2 = elementsday2.get(eleindex);

		actions.moveToElement(randomElement2).perform();
		waitSleep(3);
		System.out.println(NAUnits.getText());
		while (!(Double.parseDouble(NAUnits.getText()) > 0.00)) {

			eleindex = rand.nextInt(elementsday2.size());
			randomElement2 = elementsday2.get(eleindex);
			actions.moveToElement(randomElement2).perform();
			waitSleep(3);

		}

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

		waitSleep(2);
		retryingFindClick(ViewDetails);
		waitSleep(8);
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

		int calendarFromdate = rand.nextInt(CalendarListDateFrom.size());

		while (calendarFromdate == saturdayIndex || calendarFromdate == SundayIndex
				|| CalendarListDateFrom.get(calendarFromdate).getText().contentEquals(randomToWeekDateWithShows)) {
			calendarFromdate = rand.nextInt(CalendarListDateFrom.size());
		}

		String randomFromWeekDateWithShows = CalendarListDateFrom.get(calendarFromdate).getText();

		System.out.println("DateTo = " + CalendarListDateFrom.get(calendarFromdate).getText());
		int moveToListIndex2 = calendarFromdate + 1;

		showsListReadyToMove = driver
				.findElements(By.xpath("//ul[@class='sched-days']/li[" + moveToListIndex2 + "]/ul/li/div/span[1]"));

		waitSleep(5);

		int eleindex2 = rand.nextInt(showsListReadyToMove.size());
		WebElement randomShowReadyToMoveFrom = showsListReadyToMove.get(eleindex2);
		waitSleep(5);

		actions.moveToElement(randomShowReadyToMoveFrom).perform();
		waitSleep(5);
		System.out.println(NAUnits.getText());
		while (!(Double.parseDouble(NAUnits.getText()) > 0.00)) {

			eleindex2 = rand.nextInt(showsListReadyToMove.size());
			randomShowReadyToMoveFrom = showsListReadyToMove.get(eleindex2);
			actions.moveToElement(randomShowReadyToMoveFrom).perform();
			waitSleep(3);

		}

		String ShowDuration1 = driver.findElement(By.xpath("//ul[@class='sched-days']/li[" + moveToListIndex2
				+ "]/ul/li[" + (eleindex2 + 1) + "]/div/span[1]//parent::div//parent::li")).getCssValue("height");

		while (randomShowReadyToMoveFrom.getText().contentEquals(ShowName2)
				|| !ShowDuration1.contentEquals(ShowDuration)) {

			eleindex2 = rand.nextInt(showsListReadyToMove.size());
			randomShowReadyToMoveFrom = showsListReadyToMove.get(eleindex2);

			ShowDuration1 = driver.findElement(By.xpath("//ul[@class='sched-days']/li[" + moveToListIndex2 + "]/ul/li["
					+ (eleindex2 + 1) + "]/div/span[1]//parent::div//parent::li")).getCssValue("height");

		}
		System.out.println(" Show 1 Duration" + ShowDuration1);
		String showName1 = randomShowReadyToMoveFrom.getText();

		System.out.println("Show Name 1  = " + showName1);
		waitSleep(3);

		rightClickOnaShow(randomShowReadyToMoveFrom);
		getRightClickOptions(ViewDetails, randomShowReadyToMoveFrom);

		waitSleep(5);
		retryingFindClick(ViewDetails);

		waitSleep(8);
		System.out.println("Show Name 1 Details  = " + fullDate.getText());
		waitSleep(5);
		ViewDetailscloseIcon.click();
		waitSleep(4);

		selectOneRightClickOptionsFromShow(randomShowReadyToMoveFrom, AiringMove, Move);
		waitSleep(4);
		enterDateOrtime(startdate, dateToEnter);
		enterDateOrtime(start_time, startTime);
		enterDateOrtime(end_time, endTime);

		Clear.click();
		waitSleep(3);

		driver.findElement(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='" + partialWeekDayText + "'])[2]"))
				.click();
		waitSleep(5);

		// Next and Execute
		nextAndExecute();

		System.out.println("new date index is " + calendardateTwo);
		elementsday2 = driver.findElements(
				By.xpath("//ul[@class='sched-days']/li[" + (calendardateTwo + 1) + "]/ul/li/div/span[1]"));
		System.out.println("Show name to compare " + showName1);
		System.out.println("Updated show list (date to) is as follow - ");
		for (WebElement element : elementsday2) {
			String ELE1 = element.getText();
			System.out.println(element.getText());

			if (ELE1.contentEquals(showName1)) {

				waitSleep(3);

				rightClickOnaShow(element);
				getRightClickOptions(ViewDetails, element);

				retryingFindClick(ViewDetails);
				waitSleep(3);
				System.out.println(fullDate.getText());
				if (fullDate.getText().contentEquals(Show2fullDateString)) {
					System.out.println("MATCH SUCCESS");

					// ViewDetailscloseIcon.click();
					waitSleep(5);
					break;
				} else {
					System.out.println("NOT MATCHED SUCCESS");
					// ViewDetailscloseIcon.click();
					waitSleep(3);

				}
				ViewDetailscloseIcon.click();
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
		scrollToElementLoc(show);
		actions.moveToElement(show).contextClick(show).build().perform();
		waitSleep(3);
	}

	void selectOneRightClickOptionsFromShow(WebElement show, WebElement parentOption, WebElement childOption) {
		rightClickOnaShow(show);
		waitSleep(4);
		actions.moveToElement(parentOption).build().perform();
		waitSleep(4);
		if (childOption != null) {
			actions.moveToElement(childOption).click().perform();
			waitSleep(4);
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


