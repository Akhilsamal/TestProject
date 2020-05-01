package com.cbs.phoenix.pageobjects;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.cbs.phoenix.reports.ExtentTestManager;
import com.relevantcodes.extentreports.LogStatus;

public class AiringSchedulePage_61361 extends BasePage {
	
	

	@FindBy(xpath = "//span[text()='Airing Schedule']")
	private WebElement airingschedule;

	@FindBy(xpath = "/html/body/phoenix-wrapper/div[2]/div/div/schedule-wrapper/div/div[1]/div/fieldset/input")
	private WebElement textbox;

	@FindBy(xpath = "//li[text()='Today']")
	private WebElement today;

	@FindBy(xpath = "//li[text()='This Week']")
	private WebElement thisweek;

	@FindBy(xpath = "//li[text()='This Month']")
	private WebElement thismonth;

	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Users'])[1]/following::input[1]")
	private WebElement inputTxt;

	@FindBy(xpath = "//li[text() ='Next 5 Days']")
	private WebElement next5DaysLink;

	@FindBy(xpath = "//li[text() ='Next 10 Days']")
	private WebElement next10DaysLink;

	@FindBy(xpath = "//li[text() ='Next 30 Days']")
	private WebElement next30DaysLink;

	@FindBy(xpath = "/html/body/phoenix-wrapper/nav/div/div[2]/div")
	private WebElement freeclick;

	@FindBy(xpath = "//li[text()='Custom Range']")
	private WebElement custom;

	@FindBy(xpath = "//td[text()='26']")
	private WebElement startdate;

	@FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/table/tbody/tr[5]/td[5]")
	private WebElement enddate;

	@FindBy(xpath = "//button[text()='Cancel']")
	private WebElement cancel;

	@FindBy(xpath = "//button[text()='Apply']")
	private WebElement apply;

	@FindBy(xpath = "//a[text()='All Dayparts']")
	private WebElement daypart;

	@FindBy(xpath = "/html/body/phoenix-wrapper/div[2]/div/div/schedule-wrapper/div/div[1]/div/multi-select[2]/div/div/ul/li[6]/div[1]/label")
	private WebElement primeremove;

	@FindBy(xpath = "//button[text()='All']")
	private WebElement allbtn;

	@FindBy(xpath = "//a[text()='Only Scheduled, TPT']")
	private WebElement statusbtn;

	@FindBy(xpath = "/html/body/phoenix-wrapper/div[2]/div/div/schedule-wrapper/div/div[1]/div/multi-select[1]/div/div/ul/li[1]/div/label")
	private WebElement scheduleremove;

	@FindBy(xpath = "/html/body/phoenix-wrapper/div[2]/div/div/schedule-wrapper/div/div[1]/div/ul/li[1]/a")
	private WebElement leftarrow;

	@FindBy(xpath = "/html/body/phoenix-wrapper/div[2]/div/div/schedule-wrapper/div/div[1]/div/ul/li[2]/a/i")
	private WebElement rightarrow;

	@FindBy(xpath = "//*[@id=\"sched\"]/div[2]/ul/li[6]/ul/li[5]/div")
	private WebElement elementclick;

	@FindBy(xpath = "/html/body/ul/li[1]/a")
	private WebElement viewdetails;

	@FindBy(xpath = "//a[@class='nav-link']")
	private WebElement airingconstraintlink;

	@FindBy(xpath = "/html/body/div[1]/div/div/airing-details/div[1]/div[3]/ul/li[3]/a")
	private WebElement pendingrequestslink;

	@FindBy(xpath = "//i[@class='ft-settings']")
	private WebElement settingbtn;

	@FindBy(xpath = "//button[@class='btn btn-outline-info']")
	private WebElement tablebtn;
	
	
	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Thick Borders'])[1]/following::i[1]")
	private WebElement thickborderchkbox;
	
	

	/*
	 * @FindBy(xpath = "//input[@value='theme-gradient']") private WebElement
	 * gradientchkbox ;
	 * 
	 * @FindBy(xpath = "//input[@value='theme-na']") private WebElement
	 * oversoldchkbox ;
	 * 
	 * @FindBy(xpath = "//input[@value='theme-avails']") private WebElement
	 * availschkbox ;
	 */

	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Color Options'])[1]/following::label[2]")
	private WebElement gradientchkbox;

	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Loading ...'])[1]/preceding::label[2]")
	private WebElement oversoldchkbox;

	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Loading ...'])[1]/preceding::label[1]")
	private WebElement availschkbox;

	@FindBy(xpath = "//i[@class='ft-maximize']")
	private WebElement maxbtn;

	@FindBy(xpath = "//i[@class='ft-minimize']")
	private WebElement minbtn;

	@FindBy(xpath = "//i[@class='ft-refresh-cw']")
	private WebElement refreshbtn;
	
	@FindBy(xpath = "//button[text()='Reset']")
	private WebElement Resetbtn;
	
	@FindBy(xpath = "//i[@class='ft-printer']")
	private WebElement printbtn;


	

	public AiringSchedulePage_61361(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void clickAiringduration() throws IOException {
		
	
		
		ExtentTestManager.getTest().log(LogStatus.INFO," Testcase Decription: Verify Airing schedule is displayed all visible data correct");
		
		
		
		waitSleep(8);
		
		airingschedule.click();;
		waitSleep(5);

		textbox.click();
		waitSleep(4);

		today.click();
		waitSleep(4);
		
		ExtentTestManager.getTest().log(LogStatus.PASS,"  Airing Display  Today is successful ");
		System.out.println("Airing Display  Today is successful");
		
		addScreenShot();
		
		
		
		//ExtentTestManager.getTest().log(LogStatus.PASS,"New show - "+tcData.get("LongName")+" added successfully");	
		waitSleep(2);

		textbox.click();
		waitSleep(3);

		thisweek.click();
		waitSleep(4);	

		freeclick.click();
		waitSleep(3);
		
		//takeScreenshot("This week");		
		//waitSleep(2);
		
		
		ExtentTestManager.getTest().log(LogStatus.PASS,"  Airing Display  This week successful ");
		System.out.println("Display of  Airing  This week successful");
		addScreenShot();
		waitSleep(2);
		
		
		waitSleep(3);

		textbox.click();
		waitSleep(5);

		thismonth.click();
		waitSleep(9);
		
		freeclick.click();
		waitSleep(4);
		
		//takeScreenshot("This month");		
		//waitSleep(2);	
		
		ExtentTestManager.getTest().log(LogStatus.PASS,"  Airing Display  This month is successful ");
		System.out.println("Airing Display of  Airing  This month successful");
		
		addScreenShot();
		waitSleep(2);
		
		inputTxt.click();

		waitSleep(4);

		next5DaysLink.click();
		waitSleep(7);
		
		freeclick.click();
		waitSleep(4);
		
		/*
		 * takeScreenshot("Next5days"); waitSleep(2);
		 */
		
		
		ExtentTestManager.getTest().log(LogStatus.PASS,"  Airing Display  next 5 days successful ");
		System.out.println("Airing Display  next 5 days successful");
		addScreenShot();
		waitSleep(2);

		inputTxt.click();
		waitSleep(4);

		next10DaysLink.click();
		waitSleep(4);
		
		freeclick.click();
		waitSleep(3);
		
		/*
		 * takeScreenshot("Next10days"); waitSleep(2);
		 */
		
		ExtentTestManager.getTest().log(LogStatus.PASS,"  Airing Display  next 10 days is successful ");
		System.out.println("Airing Display  next 10 days is successful");
		
		addScreenShot();
		waitSleep(2);


		
		inputTxt.click();
		waitSleep(5);

		next30DaysLink.click();
		waitSleep(8);
		
		freeclick.click();
		waitSleep(3);
		
		
		/*
		 * takeScreenshot("Next30days"); waitSleep(2);
		 */
		
		ExtentTestManager.getTest().log(LogStatus.PASS,"  Airing Display  next 30 days is successful ");
		System.out.println("Airing Display  next 30 days successful");
		addScreenShot();
		waitSleep(2);
		
		

		
		}
		
		

	

	public void customrange() throws IOException {

		waitSleep(5);
		airingschedule.click();
		waitSleep(5);

		textbox.click();
		waitSleep(5);

		/*
		 * freeclick.click(); waitSleep(6);
		 * 
		 * textbox.click(); waitSleep(5);
		 */

		custom.click();
		waitSleep(5);

		startdate.click();
		waitSleep(4);

		enddate.click();
		waitSleep(4);
		
		/*
		 * takeScreenshot("custom  days"); waitSleep(2);
		 */

		//addScreenShot();
		waitSleep(2);

		
		cancel.click();
		waitSleep(5);
		//ExtentTestManager.getTest().log(LogStatus.PASS,"  click on Cancel button of  Custom Range Airing Display is  successful ");
		textbox.click();
		waitSleep(5);

		custom.click();
		waitSleep(5);

		startdate.click();
		waitSleep(5);

		enddate.click();
		waitSleep(5);
		
		ExtentTestManager.getTest().log(LogStatus.PASS,"  Select Custom Range Airing start date and end date is successful ");
		System.out.println("Select Custom Range Airing start date and end date is successful");
        addScreenShot();
		apply.click();
		waitSleep(5);
		
		/* takeScreenshot("Applied customrange"); */
		
		ExtentTestManager.getTest().log(LogStatus.PASS,"  Custom Range Airing Display successful ");
		System.out.println("Custom Range Airing Display successful");
		
		addScreenShot();
		waitSleep(2);

		
	}

	public void removeprimetime() throws IOException {

		waitSleep(5);
		airingschedule.click();
		waitSleep(8);

		daypart.click();
		waitSleep(5);

		primeremove.click();
		waitSleep(5);
		
		ExtentTestManager.getTest().log(LogStatus.PASS," Deselect Remove Prime Time checkbox is  successful ");
		System.out.println("Remove Prime Time is successful");
		addScreenShot();
		waitSleep(2);
		freeclick.click();
		waitSleep(6);
		
		/*
		 * takeScreenshot("Removeprime"); waitSleep(3);
		 */
		//ExtentTestManager.getTest().log(LogStatus.PASS," Remove Prime Time successful ");
		//System.out.println("Remove Prime Time successful");
		
		//addScreenShot();
		//waitSleep(2);

	
		
	}

	public void removescheduleairing() throws IOException {

		waitSleep(5);
		airingschedule.click();
		waitSleep(8);

		statusbtn.click();
		waitSleep(5);

		allbtn.click();
		waitSleep(5);

		scheduleremove.click();
		waitSleep(5);
		
		ExtentTestManager.getTest().log(LogStatus.PASS," Deselect schedule checkbox is successful ");
		System.out.println("Remove schedule is successful");
		
		addScreenShot();
		
		freeclick.click();
		waitSleep(5);
		
		/*
		 * takeScreenshot("removeschedule"); waitSleep(3);
		 */
		
		
		//ExtentTestManager.getTest().log(LogStatus.PASS," Remove schedule successful ");
		//System.out.println("Remove schedule successful");
		
		//addScreenShot();
		//waitSleep(2);

	
		

	}

	public void arrowclick() throws IOException {

		waitSleep(5);
		airingschedule.click();
		waitSleep(8);
		/* takeScreenshot("rightarrowbefore"); */
		
		//addScreenShot();
		//waitSleep(2);


		rightarrow.click();
		waitSleep(8);
		
		//takeScreenshot("rightarrowafter");
		ExtentTestManager.getTest().log(LogStatus.PASS," Clicking  right arrow is successful");
		System.out.println("Clicking  right arrow is successful");
		
		addScreenShot();
		waitSleep(2);
	

		leftarrow.click();
		waitSleep(8);
		
		//takeScreenshot("default postleftarrow");
		
		ExtentTestManager.getTest().log(LogStatus.PASS," Clicking left arrow successful");
		System.out.println("Click left arrow successful");
		
		addScreenShot();
		waitSleep(2);



	}

	public void viewdetailsairing() throws IOException {

		waitSleep(5);
		airingschedule.click();
		waitSleep(8);

		Actions act = new Actions(driver);
		act.moveToElement(elementclick).build().perform();
		act.contextClick().build().perform();
		waitSleep(8);
		
		ExtentTestManager.getTest().log(LogStatus.PASS," Selecting and right click of a show is successful ");
		addScreenShot();
		System.out.println("Selecting and right click of a show is successful");
		
		//takeScreenshot("view detail");
		//addScreenShot();
		waitSleep(2);

		
		
		viewdetails.click();
		waitSleep(8);
		ExtentTestManager.getTest().log(LogStatus.PASS," clicking of  View Detail of  a show is successful ");
		
		//takeScreenshot("Sales Unit");
		addScreenShot();
		waitSleep(2);

		

		airingconstraintlink.click();
		waitSleep(8);
		ExtentTestManager.getTest().log(LogStatus.PASS," clicking of airingconstraintLink of  a show is successful ");
		//takeScreenshot("airingconstraint");
		addScreenShot();
		waitSleep(2);

		

		pendingrequestslink.click();
		waitSleep(8);
		
		//takeScreenshot("pendingrequest");
		ExtentTestManager.getTest().log(LogStatus.PASS," clicking of pendingrequestslink of  a show is successful ");
		addScreenShot();
		waitSleep(2);

		
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).build().perform();
		waitSleep(6);
		
		
		
	}
	
	public void pagerefresh() {
		
		waitSleep(4);
		Resetbtn.click();
		waitSleep(4);
		
	}

	public void airingsettingoptions() throws IOException {

		
		waitSleep(5);
		airingschedule.click();
		waitSleep(8);

		settingbtn.click();
		waitSleep(5);

		/*
		 * tablebtn.click(); waitSleep(4);
		 */
		thickborderchkbox.click();
		waitSleep(5);
	
		
		
		/*
		 * takeScreenshot("Classic"); waitSleep(2);
		 */
		
		ExtentTestManager.getTest().log(LogStatus.PASS," Thick border selected  properly ");
		System.out.println("Thick border selected  properly");
		
		addScreenShot();
		waitSleep(2);
		
		
		gradientchkbox.click();
		waitSleep(4);
		
		/*
		 * takeScreenshot("gradient"); waitSleep(2);
		 */
		
		ExtentTestManager.getTest().log(LogStatus.PASS," Gradient  selected successfully ");
		System.out.println("Gradient  selected successfully ");
		addScreenShot();
		waitSleep(2);
		

		oversoldchkbox.click();
		waitSleep(4);
		
		/*
		 * takeScreenshot("oversold"); waitSleep(2);
		 */
		
		ExtentTestManager.getTest().log(LogStatus.PASS," Oversold selected successfully ");
		System.out.println("Oversold selected successfully  ");
		addScreenShot();
		waitSleep(2);
		

		availschkbox.click();
		waitSleep(4);
		
		/*
		 * takeScreenshot("avails"); waitSleep(2);
		 */
		
		ExtentTestManager.getTest().log(LogStatus.PASS," Avails selected successfully");
		System.out.println(" Avails selected successfully ");
		
		addScreenShot();
		waitSleep(2);
		
		
	}

	public void heightscroll() throws IOException {

		waitSleep(3);
		airingschedule.click();
		waitSleep(4);

		settingbtn.click();
		waitSleep(5);
		
		/*
		 * takeScreenshot("default height"); waitSleep(2);
		 */
		//ExtentTestManager.getTest().log(LogStatus.PASS," increasing height scroll is successful ");
		//addScreenShot();
		waitSleep(2);
		

		WebElement myElement = (new WebDriverWait(driver, 30)).until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/phoenix-wrapper/div[2]/div/div/schedule-wrapper/div/div[2]/div/div[3]/input")));
		myElement.click();
		Actions move = new Actions(driver);
		move.moveToElement(myElement).clickAndHold();
		move.moveByOffset(70, 0);
		move.release();
		move.perform();
		waitSleep(5);
		
		/*
		 * takeScreenshot("increase height"); waitSleep(2);
		 */
		
		ExtentTestManager.getTest().log(LogStatus.PASS," Scrolls working successfully");
		System.out.println(" Scrolls working successfully ");
		
		addScreenShot();
		waitSleep(2);
		
		move.moveToElement(myElement).clickAndHold();
		move.moveByOffset(0, 70);
		move.release();
		move.perform();
		waitSleep(5);

	}

	public void maxmin() throws IOException {

		waitSleep(5);
		airingschedule.click();
		waitSleep(5);
		maxbtn.click();
		waitSleep(5);
		/*
		 * takeScreenshot("maxscreen"); waitSleep(2);
		 */
		
		ExtentTestManager.getTest().log(LogStatus.PASS," Screen Maximized successfully");
		System.out.println(" Screen Maximized successfully");
		
		addScreenShot();
		waitSleep(2);
		
		minbtn.click();
		waitSleep(5);
		//takeScreenshot("minscreen");
		addScreenShot();
		waitSleep(2);
		
		refreshbtn.click();
		waitSleep(5);
		

	}
	
	public void  printoption() throws IOException  {
        
        waitSleep(8);
        airingschedule.click();
        waitSleep(5);
       
        printbtn.click();
        waitSleep(5);
       
        //takeScreenshot("printscr");
        
        addScreenShot();
		waitSleep(2);
       /* File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);                   
        FileHandler.copy(screenshotFile, new File("D:\\Screenshot\\S1.png"));
*/
}
}