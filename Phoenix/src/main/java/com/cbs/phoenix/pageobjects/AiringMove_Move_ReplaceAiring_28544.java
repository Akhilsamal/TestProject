package com.cbs.phoenix.pageobjects;

import java.io.IOException;
import java.util.HashMap;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cbs.phoenix.reports.ExtentTestManager;
import com.cbs.phoenix.utilities.TestDataProvider;
import com.relevantcodes.extentreports.LogStatus;

import java.util.function.Function;
//import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AiringMove_Move_ReplaceAiring_28544 extends BasePage {

	
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


	

	private HashMap<String, String> tcData;

	public AiringMove_Move_ReplaceAiring_28544(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void move(TestDataProvider testDataProvider, String testId) throws IOException, InterruptedException {

		tcData = testDataProvider.readData(testId);

		// TC_28544(Automation Regression : Move Airing: Move an airing with opt to dispose of units into the destination timeslot and then Replace the airing.)

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

			textbox.click();
			waitSleep(5);

			custom.click();
			waitSleep(5);

		

			apply.click();

			waitSleep(3);
			
			NextClick.click();

			waitSleep(3);

			// String UserShowInput = "MAGNUM P.I.";//input show name
			// String UserDateInput = "12/20/2019"; //input show date
			// String UserTimeInput = "9:00 PM"; //input show time

			String UserShowInput, UserDateInput, UserTimeInput;
			UserShowInput = tcData.get("UserShowInput");// input show name
			UserDateInput = tcData.get("UserDateInput"); // input show date
			UserTimeInput = tcData.get("UserTimeInput"); // input show time

			System.out.println(UserShowInput);
			System.out.println(UserDateInput);
			System.out.println(UserTimeInput);

			String Time_Hour = UserTimeInput.split(" ")[0];
			String Time_AMPM = UserTimeInput.split(" ")[1];
			Time_Hour = Time_Hour.split(":")[0];

			System.out.println(Time_AMPM);
			System.out.println(Time_Hour);

			waitSleep(4);

			JavascriptExecutor js = (JavascriptExecutor) driver;

			WebDriverWait wait = new WebDriverWait(driver, 30);
			Function<WebDriver, Boolean> jQueryAvailable = WebDriver -> ((Boolean) js
					.executeScript("return (typeof jQuery != \"undefined\")"));
			wait.until(jQueryAvailable);

			String Xjs = "x";
			String Yjs = "y";
			String Cjs = ";";
			String MyStringjs = "var map123 = $(\".sched-airing\").toArray().map(function (el) {"
					+ "var airing = angular.element(el).scope().airing;" + "return {" + "name: airing.airingName,"
					+ "date: airing.airDate.toLocaleDateString()," + "time: airing.startTime,"
					+ "rect: el.getBoundingClientRect()" + "}" + "}).find(function (x) { return x.name === \""
					+ UserShowInput + "\" && x.date === \"" + UserDateInput + "\" && x.time === \"" + UserTimeInput
					+ "\" });" + "return map123.rect.";

			Object x_axis, y_axis;

			System.out.println(MyStringjs + Xjs + Cjs);
			System.out.println(MyStringjs + Yjs + Cjs);

			x_axis = js.executeScript(MyStringjs + Xjs + Cjs);
			y_axis = js.executeScript(MyStringjs + Yjs + Cjs);

			System.out.println(x_axis);
			System.out.println(y_axis);

			String X_NEW = x_axis.toString();
			String Y_NEW = y_axis.toString();
			String X_NEW0;
			String Y_NEW0;

			if (X_NEW.contains(".")) {
				X_NEW0 = X_NEW.split("\\.")[0];
			} else {
				X_NEW0 = X_NEW.split(" ")[0];
			}

			if (Y_NEW.contains(".")) {
				Y_NEW0 = Y_NEW.split("\\.")[0];
			} else {
				Y_NEW0 = Y_NEW.split(" ")[0];
			}

			int xint = Integer.parseInt(X_NEW0);
			int yint = Integer.parseInt(Y_NEW0);

			waitSleep(3);

			Actions builder = new Actions(driver);

			builder.moveByOffset(xint, yint).click().build().perform();

			System.out.println(xint);
			System.out.println(yint);

			waitSleep(3);

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

			builder.sendKeys(Keys.ESCAPE).build().perform();

			waitSleep(4);
			
		
		
		 
			
			//start
			//second scenario
			
			// String UserShowInput = "MAGNUM P.I.";//input show name
						// String UserDateInput = "12/20/2019"; //input show date
						// String UserTimeInput = "9:00 PM"; //input show time

			String UserShowInput1, UserDateInput1, UserTimeInput1;
			UserShowInput1 = tcData.get("MoveShowInput");// input show name
			UserDateInput1 = tcData.get("MoveStartDate"); // input show date
			UserTimeInput1 = tcData.get("MoveStartTime"); // input show time

			System.out.println(UserShowInput1);
			System.out.println(UserDateInput1);
			System.out.println(UserTimeInput1);

			String Time_Hour1 = UserTimeInput1.split(" ")[0];
			String Time_AMPM1 = UserTimeInput1.split(" ")[1];
			Time_Hour1 = Time_Hour1.split(":")[0];

			System.out.println(Time_AMPM1);
			System.out.println(Time_Hour1);

			waitSleep(4);

			JavascriptExecutor js1 = (JavascriptExecutor) driver;

			WebDriverWait wait1 = new WebDriverWait(driver, 30);
			Function<WebDriver, Boolean> jQueryAvailable1 = WebDriver -> ((Boolean) js1
			.executeScript("return (typeof jQuery != \"undefined\")"));
			wait1.until(jQueryAvailable1);

			String Xjs1 = "x";
			String Yjs1 = "y";
			String Cjs1 = ";";
			String MyStringjs1 = "var map123 = $(\".sched-airing\").toArray().map(function (el) {"
			+ "var airing = angular.element(el).scope().airing;" + "return {" + "name: airing.airingName,"
			+ "date: airing.airDate.toLocaleDateString()," + "time: airing.startTime,"
			+ "rect: el.getBoundingClientRect()" + "}" + "}).find(function (x) { return x.name === \""
			+ UserShowInput1 + "\" && x.date === \"" + UserDateInput1 + "\" && x.time === \"" + UserTimeInput1
			+ "\" });" + "return map123.rect.";

			Object x_axis1, y_axis1;

			System.out.println(MyStringjs1 + Xjs1 + Cjs1);
			System.out.println(MyStringjs1 + Yjs1 + Cjs1);

			x_axis1 = js1.executeScript(MyStringjs1 + Xjs1 + Cjs1);
			y_axis1 = js1.executeScript(MyStringjs1 + Yjs1 + Cjs1);

			System.out.println(x_axis1);
			System.out.println(y_axis1);

			String X_NEW1 = x_axis1.toString();
			String Y_NEW1 = y_axis1.toString();
			String X_NEW11;
			String Y_NEW11;

			if (X_NEW1.contains(".")) {
				X_NEW11 = X_NEW1.split("\\.")[0];
			} else {
							X_NEW11 = X_NEW1.split(" ")[0];
						}

						if (Y_NEW1.contains(".")) {
							Y_NEW11 = Y_NEW1.split("\\.")[0];
						} else {
							Y_NEW11 = Y_NEW1.split(" ")[0];
						}

						int xint1 = Integer.parseInt(X_NEW11);
						int yint1 = Integer.parseInt(Y_NEW11);
						
						waitSleep(3);

						//Actions builder = new Actions(driver);

						builder.moveByOffset(-xint, -yint).click().build().perform();

						waitSleep(3);

						//Actions builder = new Actions(driver);

						builder.moveByOffset(xint1, yint1).click().build().perform();

						System.out.println(xint1);
						System.out.println(yint1);

						waitSleep(3);

						builder.contextClick().build().perform();

						waitSleep(4);

						viewdetails.click();

						waitSleep(4);

						String s11 = viewLoadPreMove.getText();
						String Load11 = s11.replaceAll("[^0-9?!\\.]", "");
						System.out.println("Load Premove:" + Load11);

						String s21 = viewCommercialPreMove.getText();
						String communit11 = s21.replaceAll("[^0-9?!\\.]", "");
						System.out.println("Commercial Premove:" + communit11);

						String s31 = viewavailPreMove.getText();
						String avail11 = s31.replaceAll("[^0-9?!\\.]", "");
						System.out.println("Avails Premove:" + avail11);

						String s41 = viewtotalPreMove.getText();
						String total11 = s41.replaceAll("[^0-9?!\\.]", "");
						System.out.println("Total Premove:" + total11);

						builder.sendKeys(Keys.ESCAPE).build().perform();

						waitSleep(4);	
						
						builder.moveByOffset(-xint1, -yint1).click().build().perform();

						waitSleep(4);	
						
						builder.moveByOffset(xint, yint).click().build().perform();

						
						waitSleep(4);		

			
			
			//end

			builder.contextClick().build().perform();

			waitSleep(4);

			builder.moveToElement(AiringMove).build().perform();

			waitSleep(4);

			Move.click();

			// ((JavascriptExecutor) driver).executeScript("arguments[0].click();", Move);

			waitSleep(4);

			// Date format

			String MoveStartDate_format = tcData.get("MoveStartDate");

			String[] MoveStartDate_format_dateParts = MoveStartDate_format.split("/");

			String MoveStartDate_format_Day, MoveStartDate_format_Month, MoveStartDate_format_Year;
			String MoveStartDate_format_padded = null, MoveStartDate_format_padded1 = null, MoveStartDate_format_Final;

			MoveStartDate_format_Month = MoveStartDate_format_dateParts[0];
			MoveStartDate_format_Day = MoveStartDate_format_dateParts[1];
			MoveStartDate_format_Year = MoveStartDate_format_dateParts[2];

			int da = Integer.parseInt(MoveStartDate_format_Day);
			int mo = Integer.parseInt(MoveStartDate_format_Month);

			if (mo < 10) {
				MoveStartDate_format_padded = String.format("%02d", mo);

			} else {
				MoveStartDate_format_padded = MoveStartDate_format_Month;

			}

			if (da < 10) {
				MoveStartDate_format_padded1 = String.format("%02d", da);

			} else {
				MoveStartDate_format_padded1 = MoveStartDate_format_Day;

			}

			MoveStartDate_format_Month = MoveStartDate_format_padded;
			MoveStartDate_format_Day = MoveStartDate_format_padded1;

			MoveStartDate_format_Final = MoveStartDate_format_Month + "/" + MoveStartDate_format_Day + "/"
					+ MoveStartDate_format_Year;

			System.out.println(MoveStartDate_format_Final);

			movestartdate.sendKeys(MoveStartDate_format_Final);
			// ((JavascriptExecutor) driver).executeScript("arguments[0].value='" +
			// tcData.get("MoveStartDate") + "'", movestartdate);
			// ((JavascriptExecutor) driver).executeScript("arguments[0].value='1/13/2020'",
			// movestartdate);
			System.out.println("sam   " + "arguments[0].value='" + tcData.get("MoveStartDate") + "'");
			waitSleep(3);

			System.out.println(tcData.get("MoveStartDate"));

			start_time.sendKeys(tcData.get("MoveStartTime"));
			// ((JavascriptExecutor) driver).executeScript("arguments[0].value='" +
			// tcData.get("MoveStartTime") + "'", start_time);

			waitSleep(3);
			System.out.println(tcData.get("MoveStartTime"));

			end_time.sendKeys(tcData.get("MoveEndTime"));
			// ((JavascriptExecutor) driver).executeScript("arguments[0].value='" +
			// tcData.get("MoveEndTime") + "'", end_time);

			waitSleep(3);
			System.out.println(tcData.get("MoveEndTime"));

			Clear.click();
			// ((JavascriptExecutor) driver).executeScript("arguments[0].click();", Clear);

			waitSleep(3);

			SelectDay.click();
			// ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
			// SelectDay);

			waitSleep(3);

			Next.click();
			// ((JavascriptExecutor) driver).executeScript("arguments[0].click();", Next);

			waitSleep(3);
			Yes.click();
			// ((JavascriptExecutor) driver).executeScript("arguments[0].click();", Yes);

			waitSleep(3);
			
			Dispose.click();
			
			waitSleep(3);
			Execute.click();
			// ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
			// Execute);

			waitSleep(60);
			
			waitSleep(9);
			//System.setProperty("webdriver.chrome.driver", "D:\\Users\\sdgajb0930\\workspace\\PhoenixTestAutomation\\src\\main\\resources\\chromedriver.exe"); 
			
			System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe"); 
			
			WebDriver driver1=new ChromeDriver(); 
			
			
		     
		     //driver1.navigate().to(application_path);   
			
			driver1.navigate().to("http://localhost/phoenix-main/#!/login");
		     
		     waitSleep(3);
		     //Maximize the browser  
		      driver1.manage().window().maximize(); 
		     // driver1.manage().window();
		      
		      //waitSleep(3);
		      
		      //userlogin
		     // driver1.findElement(By.xpath("//span[@class='user-name text-bold-700 ng-binding']")).click(); 
			 // waitSleep(5);
			  
			  //switchuserbtn
			 // driver1.findElement(By.xpath("//a[contains(text(),'Switch User')]")).click(); 
			  waitSleep(5);
			  
			  //selectuser
			  driver1.findElement(By.xpath("/html[1]/body[1]/phoenix-wrapper[1]/div[2]/div[1]/div[1]/phoenix-login[1]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/input[1]")).click(); 
			  waitSleep(6);
			  
			  //selectuser 
			  driver1.findElement(By.xpath("/html[1]/body[1]/phoenix-wrapper[1]/div[2]/div[1]/div[1]/phoenix-login[1]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/input[1]")).sendKeys("Rader");
			  waitSleep(6);

			  //select
			  driver1.findElement(By.xpath("//button[@class='dropdown-item ng-binding ng-scope']")).click(); 
			  
			  waitSleep(6);
		      
		      
		      
		      //Thread.sleep(5000);
		       //airingschedul
		      
		      driver1.findElement(By.xpath("//span[text()='Airing Schedule']")).click();
		      waitSleep(10);
		      
		      //daypart	      
		      driver1.findElement(By.xpath("//a[text()='All Dayparts']")).click();
		      waitSleep(5);
		      
		      
		      //None
		      driver1.findElement(By.xpath("(//button[text()='None'])[2]")).click();
		      waitSleep(3);
		      
		      
		    /// Daytime
		      driver1.findElement(By.xpath("//multi-select[2]/div/div/ul/li[3]/div/label/i")).click();
		      waitSleep(2);
		      
		      //freeclick
		      driver1.findElement(By.xpath("/html/body/phoenix-wrapper/nav/div/div[2]/div")).click();
		      waitSleep(2);
		      
		      
		      //textbox
		      driver1.findElement(By.xpath("/html/body/phoenix-wrapper/div[2]/div/div/schedule-wrapper/div/div[1]/div/fieldset/input")).click();;
		      waitSleep(5);
				
				
				//custom
		      driver1.findElement(By.xpath("//li[text()='Custom Range']")).click();;
		      waitSleep(5);
		      
		/*
		 * //startdate driver1.findElement(By.xpath("//td[text()='20']")).click();;
		 * waitSleep(4);
		 * 
		 * //enddate driver1.findElement(By.xpath("//td[text()='24']")).click();;
		 * waitSleep(4);
		 */
		      
		      //apply
				
		      driver1.findElement(By.xpath("//button[text()='Apply']")).click();;
		      waitSleep(3);
		      
		    //NextCLICK
				
		      driver1.findElement(By.xpath("//div/div/div/ul/li[2]/a/i")).click();;
		      waitSleep(3);
		      
			 //			
			  
			  String UserShowInput2, UserDateInput2, UserTimeInput2; 
			  UserShowInput2 = tcData.get("UserShowInput");//input show name 
			  UserDateInput2 = tcData.get("MoveStartDate"); //input show date 
			  UserTimeInput2 = tcData.get("MoveStartTime"); //input show time
			  
			  
			  System.out.println(UserShowInput2); 
			  System.out.println(UserDateInput2);
			  System.out.println(UserTimeInput2);
			  
			  
			  String Time_Hour2 = UserTimeInput2.split(" ")[0]; 
			  String Time_AMPM2 = UserTimeInput2.split(" ")[1]; 
			  Time_Hour2 = Time_Hour2.split(":")[0];
			  
			  System.out.println(Time_AMPM2); 
			  System.out.println(Time_Hour2);
			  
			  
			  waitSleep(4);
			  
			  JavascriptExecutor js2 = (JavascriptExecutor) driver1;
			  
			  WebDriverWait wait2 = new WebDriverWait(driver1, 30); Function<WebDriver,
			  Boolean> jQueryAvailable2 = WebDriver -> ((Boolean)
			  js2.executeScript("return (typeof jQuery != \"undefined\")"));
			  wait2.until(jQueryAvailable2);
			  
			  String Xjs2 = "x"; String Yjs2 = "y"; String Cjs2 = ";"; String MyStringjs2 =
			  "var map123 = $(\".sched-airing\").toArray().map(function (el) {" +
			  "var airing = angular.element(el).scope().airing;" + "return {" +
			  "name: airing.airingName," + "date: airing.airDate.toLocaleDateString()," +
			  "time: airing.startTime," + "rect: el.getBoundingClientRect()" + "}" +
			  "}).find(function (x) { return x.name === \""
			  +UserShowInput2+"\" && x.date === \""
			  +UserDateInput2+"\" && x.time === \""+UserTimeInput2+"\" });" +
			  "return map123.rect.";
			  
			  
			  Object x_axis2, y_axis2;
			  
			  System.out.println(MyStringjs2+Xjs2+Cjs2);
			  System.out.println(MyStringjs2+Yjs2+Cjs2);
			  
			  x_axis2 = js2.executeScript(MyStringjs2+Xjs2+Cjs2); y_axis2 =
			  js2.executeScript(MyStringjs2+Yjs2+Cjs2);
			  
			  System.out.println(x_axis2); System.out.println(y_axis2);
			  
			  String X_NEW2 = x_axis2.toString(); String Y_NEW2 = y_axis2.toString();
			  String X_NEW12; String Y_NEW12;
			  
			  if (X_NEW2.contains(".")) { X_NEW12= X_NEW2.split("\\.")[0]; } else { X_NEW12
			  =X_NEW2.split(" ")[0]; }
			  
			  if (Y_NEW2.contains(".")) { Y_NEW12 = Y_NEW2.split("\\.")[0]; } else {
			  Y_NEW12 = Y_NEW2.split(" ")[0]; }
			  
			  int xint2=Integer.parseInt(X_NEW12);
			  int yint2=Integer.parseInt(Y_NEW12);
			  System.out.println(xint2); 
			  System.out.println(yint2);
			  
			  waitSleep(3);
			  
			  Actions builder1 = new Actions(driver1);

			builder1.moveByOffset(xint2,yint2).click().build().perform();

			 
			waitSleep(3);

			builder1.contextClick().build().perform();

			waitSleep(4);
			
			driver1.findElement(By.xpath("//a[text()='View Details']")).click();
		     
			waitSleep(4);

			String t1 = driver1.findElement(By.xpath("/html/body/div[1]/div/div/airing-details/div[3]/h4[4]")).getText();
			String Load2 = t1.replaceAll("[^0-9?!\\.]", "");
			System.out.println("Load Postmove:" + Load2);

			String t2 = driver1.findElement(By.xpath("/html/body/div[1]/div/div/airing-details/div[3]/h4[2]")).getText();
			String communit2 = t2.replaceAll("[^0-9?!\\.]", "");
			System.out.println("Commercial Unit Postmove:" + communit2);

			String t3 = driver1.findElement(By.xpath("/html/body/div[1]/div/div/airing-details/div[3]/h4[3]")).getText();
			String avail2 = t3.replaceAll("[^0-9?!\\.]", "");
			System.out.println("Avails Postmove:" + avail2);

			String t4 = driver1.findElement(By.xpath("/html/body/div[1]/div/div/airing-details/div[3]/h4[1]")).getText();
			String total2 = t4.replaceAll("[^0-9?!\\.]", "");
			System.out.println("Total Postmove:" + total2);
			
			System.out.println("calculation");
			
			 float FinalLoad = Float.parseFloat(Load1)+Float.parseFloat(Load11); 
			 String FinalLoadstr = String.valueOf(FinalLoad);
			 float Finalcommunit =Float.parseFloat(communit1)+Float.parseFloat(communit11); 
			 String Finalcommunitstr = String.valueOf(Finalcommunit); 
			 float Finalavail = Float.parseFloat(avail1)+Float.parseFloat(avail11); 
			 String Finalavailstr = String.valueOf(Finalavail); 
			 float Finaltotal = Float.parseFloat(total1)+Float.parseFloat(total11); 
			 String Finaltotalstr = String.valueOf(Finaltotal);
			 
				
			

				if (FinalLoadstr.equals(Load2)) {
					System.out.println("Paased -load");
				}

				if (Finalcommunitstr.equals(communit2)) {
					System.out.println("Passed-Commercial Units");
				}

				if (Finalavailstr.equals(avail2)) {
					System.out.println("passed-avails");
				}

				if (Finaltotalstr.equals(total2)) {
					System.out.println("passed-Totals");
				}
				
				waitSleep(4);
				
			
			builder1.sendKeys(Keys.ESCAPE).build().perform();
			waitSleep(4);
			
			builder1.contextClick().build().perform();

			waitSleep(4);
			
			builder1.moveToElement(driver1.findElement(By.xpath("//a[text()='Airing Move']"))).build().perform();
			
			
			//driver1.findElement(By.xpath("//a[text()='Airing Move']")).click();
		     
			waitSleep(4);
			
			driver1.findElement(By.xpath("//a[text()='Replace']")).click();
			
			
			//builder1.sendKeys(Keys.ESCAPE).build().perform();
			waitSleep(4);
			
			driver1.findElement(By.xpath("/html/body/div[1]/div/div/airing-moves/div[1]/div[2]/table/tbody/tr/td[1]/select")).sendKeys(tcData.get("UserShowReplace"));
			waitSleep(3);

			  //driver1.findElement(By.xpath("/html/body/div[1]/div/div/airing-moves/div[1]/div[2]/table/tbody/tr/td[1]/select")).sendKeys("PRICE IS RIGHT 2");
			  //waitSleep(3);
			  
			  driver1.findElement(By.xpath("/html/body/div[1]/div/div/airing-moves/div[2]/div/div[2]/button[1]")).click();
			  waitSleep(3);
			  
			  driver1.findElement(By.xpath("/html/body/div[1]/div/div/airing-moves-confirm/div[3]/div/div/button[1]")).click();
			  waitSleep(3);
			  
			  driver1.findElement(By.xpath("/html/body/div[1]/div/div/airing-moves/div[2]/div/div[3]/button[1]")).click();
			  waitSleep(60);
			  
			  
			  String UserShowInput3, UserDateInput3, UserTimeInput3; 
			  UserShowInput3 = tcData.get("UserShowReplace");//input show name 
			  UserDateInput3 = tcData.get("MoveStartDate"); //input show date 
			  UserTimeInput3 = tcData.get("MoveStartTime"); //input show time
			  
			  
			  System.out.println(UserShowInput3); 
			  System.out.println(UserDateInput3);
			  System.out.println(UserTimeInput3);
			  
			  
			  String Time_Hour3 = UserTimeInput3.split(" ")[0]; 
			  String Time_AMPM3 = UserTimeInput3.split(" ")[1]; 
			  Time_Hour3 = Time_Hour3.split(":")[0];
			  
			  System.out.println(Time_AMPM3); 
			  System.out.println(Time_Hour3);
			  
			  
			  waitSleep(4);
			  
			  JavascriptExecutor js3 = (JavascriptExecutor) driver1;
			  
			  WebDriverWait wait3 = new WebDriverWait(driver1, 30); Function<WebDriver,
			  Boolean> jQueryAvailable3 = WebDriver -> ((Boolean)
			  js3.executeScript("return (typeof jQuery != \"undefined\")"));
			  wait3.until(jQueryAvailable3);
			  
			  String Xjs3 = "x"; String Yjs3 = "y"; String Cjs3 = ";"; String MyStringjs3 =
			  "var map123 = $(\".sched-airing\").toArray().map(function (el) {" +
			  "var airing = angular.element(el).scope().airing;" + "return {" +
			  "name: airing.airingName," + "date: airing.airDate.toLocaleDateString()," +
			  "time: airing.startTime," + "rect: el.getBoundingClientRect()" + "}" +
			  "}).find(function (x) { return x.name === \""
			  +UserShowInput3+"\" && x.date === \""
			  +UserDateInput3+"\" && x.time === \""+UserTimeInput3+"\" });" +
			  "return map123.rect.";
			  
			  
			  Object x_axis3, y_axis3;
			  
			  System.out.println(MyStringjs3+Xjs3+Cjs3);
			  System.out.println(MyStringjs3+Yjs3+Cjs3);
			  
			  x_axis3 = js3.executeScript(MyStringjs3+Xjs3+Cjs3); y_axis3 =
			  js3.executeScript(MyStringjs3+Yjs3+Cjs3);
			  
			  System.out.println(x_axis3); System.out.println(y_axis3);
			  
			  String X_NEW3 = x_axis3.toString(); String Y_NEW3 = y_axis3.toString();
			  String X_NEW13; String Y_NEW13;
			  
			  if (X_NEW3.contains(".")) { X_NEW13= X_NEW3.split("\\.")[0]; } else { X_NEW13
			  =X_NEW3.split(" ")[0]; }
			  
			  if (Y_NEW3.contains(".")) { Y_NEW13 = Y_NEW3.split("\\.")[0]; } else {
			  Y_NEW13 = Y_NEW3.split(" ")[0]; }
			  
			  int xint3=Integer.parseInt(X_NEW13);
			  int yint3=Integer.parseInt(Y_NEW13);
			  System.out.println(xint3); 
			  System.out.println(yint3);
			  
			  waitSleep(3);
			  
			  Actions builder2 = new Actions(driver1);

				builder2.moveByOffset(xint3,yint3).click().build().perform();

			 
			waitSleep(3);

			builder2.contextClick().build().perform();

			waitSleep(4);
			
			driver1.findElement(By.xpath("//a[text()='View Details']")).click();
		     
			waitSleep(4);

			  
			String rt1 = driver1.findElement(By.xpath("/html/body/div[1]/div/div/airing-details/div[3]/h4[4]")).getText();
			String rLoad2 = rt1.replaceAll("[^0-9?!\\.]", "");
			System.out.println("Load Replace:" + rLoad2);

			String rt2 = driver1.findElement(By.xpath("/html/body/div[1]/div/div/airing-details/div[3]/h4[2]")).getText();
			String rcommunit2 = rt2.replaceAll("[^0-9?!\\.]", "");
			System.out.println("Commercial Unit Replace:" + rcommunit2);

			String rt3 = driver1.findElement(By.xpath("/html/body/div[1]/div/div/airing-details/div[3]/h4[3]")).getText();
			String ravail2 = rt3.replaceAll("[^0-9?!\\.]", "");
			System.out.println("Avails Replace:" + ravail2);

			String rt4 = driver1.findElement(By.xpath("/html/body/div[1]/div/div/airing-details/div[3]/h4[1]")).getText();
			String rtotal2 = rt4.replaceAll("[^0-9?!\\.]", "");
			System.out.println("Total Replace:" + rtotal2);
			  
 
			waitSleep(4);
			
			
			driver1.quit();
			

			
			
			waitSleep(6);
			
			
		     
			


   
	}
}

		  