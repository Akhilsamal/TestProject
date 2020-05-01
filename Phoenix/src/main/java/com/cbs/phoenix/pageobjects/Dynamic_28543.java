package com.cbs.phoenix.pageobjects;

import java.io.IOException;
import java.util.HashMap;
import java.util.function.Function;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cbs.phoenix.utilities.TestDataProvider;

public class Dynamic_28543 extends BasePage {
	
	private HashMap<String, String> tcData;


	public Dynamic_28543(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	
	}
	
	
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
	private WebElement viewtotalPreMove;
	
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
	
	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='F'])[2]")
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
	
	
	public void approval(TestDataProvider testDataProvider, String testId) throws IOException, InterruptedException {
		
		tcData = testDataProvider.readData(testId);
		
		waitSleep(5); 
		airingschedule.click();
		waitSleep(10); 
		
		///////

		  //String UserShowInput = "MAGNUM P.I.";//input show name 
		  //String UserDateInput = "12/20/2019"; //input show date 
		  //String UserTimeInput = "9:00 PM"; //input show time
		
		 String UserShowInput, UserDateInput, UserTimeInput; 
		  UserShowInput = tcData.get("UserShowInput");//input show name 
		  UserDateInput = tcData.get("UserDateInput"); //input show date 
		  UserTimeInput = tcData.get("UserTimeInput"); //input show time
		 		 
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
		  
		  WebDriverWait wait = new WebDriverWait(driver, 30); Function<WebDriver,
		  Boolean> jQueryAvailable = WebDriver -> ((Boolean)
		  js.executeScript("return (typeof jQuery != \"undefined\")"));
		  wait.until(jQueryAvailable);
		  
		  String Xjs = "x"; String Yjs = "y"; String Cjs = ";"; String MyStringjs =
		  "var map123 = $(\".sched-airing\").toArray().map(function (el) {" +
		  "var airing = angular.element(el).scope().airing;" + "return {" +
		  "name: airing.airingName," + "date: airing.airDate.toLocaleDateString()," +
		  "time: airing.startTime," + "rect: el.getBoundingClientRect()" + "}" +
		  "}).find(function (x) { return x.name === \""+UserShowInput+"\" && x.date === \""
		  +UserDateInput+"\" && x.time === \""+UserTimeInput+"\" });" + "return map123.rect.";
		  
		  
		  Object x_axis, y_axis; 
		  
		  System.out.println(MyStringjs+Xjs+Cjs);
		 System.out.println(MyStringjs+Yjs+Cjs);
		  
		  x_axis = js.executeScript(MyStringjs+Xjs+Cjs); 
		  y_axis  = js.executeScript(MyStringjs+Yjs+Cjs);
		  
		  System.out.println(x_axis); 
		  System.out.println(y_axis);
		  
		  String X_NEW = x_axis.toString(); 
		  String Y_NEW = y_axis.toString(); 
		  String X_NEW1; 
		  String Y_NEW1;
		  
		  if (X_NEW.contains("."))
		  { 
			  X_NEW1= X_NEW.split("\\.")[0]; 
			  } 
		  else 
		  { 
			  X_NEW1 =X_NEW.split(" ")[0]; 
			  }
		  
		  if (Y_NEW.contains("."))
		  { 
			  Y_NEW1 = Y_NEW.split("\\.")[0]; 
			  } 
		  else 
		  { 
			  Y_NEW1 =  Y_NEW.split(" ")[0]; 
			  }
		  
		  int xint=Integer.parseInt(X_NEW1); 
		  int yint=Integer.parseInt(Y_NEW1);
		  
		  waitSleep(3); 
		
		  Actions builder = new Actions(driver); 
		  builder.moveByOffset(xint,yint).click().build().perform();
		  
		  
		  
		 
		  
		  System.out.println(xint); System.out.println(yint);
		  
		  ///////
		  
		  waitSleep(3); 
		  
		  builder.contextClick().build().perform();
		  
		  waitSleep(4);
		  
		  viewdetails.click();
		  
		  waitSleep(4);
		  
		  
		  
		  String s1=viewLoadPreMove.getText();
		String Load1=s1.replaceAll("[^0-9?!\\.]","");
		System.out.println("Load Premove:"+Load1);
			 
		String s2=viewCommercialPreMove.getText();
		String communit1=s2.replaceAll("[^0-9?!\\.]","");
		System.out.println("Commercial Premove:"+communit1);
				 
		String s3=viewavailPreMove.getText();
		String avail1=s3.replaceAll("[^0-9?!\\.]","");
		System.out.println("Avails Premove:"+avail1);
					 
		String s4=viewtotalPreMove.getText();
		String total1=s4.replaceAll("[^0-9?!\\.]","");
		System.out.println("Total Premove:"+total1);
			 
		
			builder.sendKeys(Keys.ESCAPE).build().perform();	
			
			
			waitSleep(4);
			
			builder.contextClick().build().perform();
			
			waitSleep(4);
			
			builder.moveToElement(AiringMove).build().perform();
			
			waitSleep(4);
			
			Move.click();
			
			waitSleep(4);			
			
			startdate.sendKeys(tcData.get("MoveStartDate"));
			waitSleep(3);
			
			System.out.println(tcData.get("MoveStartDate"));
			
			start_time.sendKeys(tcData.get("MoveStartTime"));
			
			waitSleep(3);
			System.out.println(tcData.get("MoveStartTime"));
			
			end_time.sendKeys(tcData.get("MoveEndTime"));
			
			waitSleep(3);
			System.out.println(tcData.get("MoveEndTime"));
			
			
			Clear.click();
			waitSleep(3);
			
			SelectDay.click();
			waitSleep(3);
			
			Next.click();
			waitSleep(3);
			Yes.click();
			waitSleep(3);
			Execute.click();
			waitSleep(45);
			
			
			waitSleep(5);
			driver.navigate().refresh();
			waitSleep(5);

			
			//String UserShowInput = "MAGNUM P.I.";//input show name 
			  //String UserDateInput = "12/20/2019"; //input show date 
			  //String UserTimeInput = "9:00 PM"; //input show time 10:30 PM
			
			
			
			String UserShowInput2, UserDateInput2, UserTimeInput2; 
			  UserShowInput2 = tcData.get("UserShowInput");//input show name 
			  UserDateInput2 = tcData.get("MoveStartDate"); //input show date 
			  //UserTimeInput2 = tcData.get("UserTimeInput"); //input show time
			  UserTimeInput2 = "10:00 PM"; //input show time 10:30 PM
			 		 
			 System.out.println(UserShowInput2);
			 System.out.println(UserDateInput2);
			 System.out.println(UserTimeInput2);
					 	
				  
			String Time_Hour2 = UserTimeInput2.split(" ")[0];
			String Time_AMPM2 = UserTimeInput2.split(" ")[1];
			Time_Hour2 = Time_Hour2.split(":")[0];
				  
			System.out.println(Time_AMPM2);
			System.out.println(Time_Hour2);
				  
			  
			waitSleep(4); 
			  
			  JavascriptExecutor js2 = (JavascriptExecutor) driver;
			  
			  WebDriverWait wait2 = new WebDriverWait(driver, 30); Function<WebDriver,
			  Boolean> jQueryAvailable2 = WebDriver -> ((Boolean)
			  js2.executeScript("return (typeof jQuery != \"undefined\")"));
			  wait2.until(jQueryAvailable2);
			  
			  String Xjs2 = "x"; String Yjs2 = "y"; String Cjs2 = ";"; String MyStringjs2 =
			  "var map123 = $(\".sched-airing\").toArray().map(function (el) {" +
			  "var airing = angular.element(el).scope().airing;" + "return {" +
			  "name: airing.airingName," + "date: airing.airDate.toLocaleDateString()," +
			  "time: airing.startTime," + "rect: el.getBoundingClientRect()" + "}" +
			  "}).find(function (x) { return x.name === \""+UserShowInput2+"\" && x.date === \""
			  +UserDateInput2+"\" && x.time === \""+UserTimeInput2+"\" });" + "return map123.rect.";
			  
			  
			  Object x_axis2, y_axis2; 
			  
			  System.out.println(MyStringjs2+Xjs2+Cjs2);
			 System.out.println(MyStringjs2+Yjs2+Cjs2);
			  
			  x_axis2 = js2.executeScript(MyStringjs2+Xjs2+Cjs2); 
			  y_axis2  = js2.executeScript(MyStringjs2+Yjs2+Cjs2);
			  
			  System.out.println(x_axis2); 
			  System.out.println(y_axis2);
			  
			  String X_NEW2 = x_axis2.toString(); 
			  String Y_NEW2 = y_axis2.toString(); 
			  String X_NEW12; 
			  String Y_NEW12;
			  
			  if (X_NEW2.contains("."))
			  { 
				  X_NEW12= X_NEW2.split("\\.")[0]; 
				  } 
			  else 
			  { 
				  X_NEW12 =X_NEW2.split(" ")[0]; 
				  }
			  
			  if (Y_NEW2.contains("."))
			  { 
				  Y_NEW12 = Y_NEW2.split("\\.")[0]; 
				  } 
			  else 
			  { 
				  Y_NEW12 =  Y_NEW2.split(" ")[0]; 
				  }
			  
			  int xint2=Integer.parseInt(X_NEW12); 
			  int yint2=Integer.parseInt(Y_NEW12);
			  
			  waitSleep(3); 
			
			  //Actions builder = new Actions(driver); 
			  builder.moveByOffset(xint2,yint2).click().build().perform();
			 
			  
			  System.out.println(xint2); System.out.println(yint2);
			  
			  waitSleep(3); 
			  
			  builder.contextClick().build().perform();
			  
			  waitSleep(4);
			  
			  viewdetails.click();
			  
			  waitSleep(4);
			  
			 
			  
			
			
//			ShowMoved.click();
//			
//			builder.moveToElement(ShowMoved).build().perform();
//			waitSleep(3);
//			 builder.contextClick().build().perform();
//			 waitSleep(3);
//			
//			 
//			 viewdetails.click();
//			 waitSleep(6);
//			 
//			 
			 
			 String t1=viewLoadPreMove.getText();
				String Load2=t1.replaceAll("[^0-9?!\\.]","");
				System.out.println("Load Postmove:"+Load2);
					 
				String t2=viewCommercialPreMove.getText();
				String communit2=t2.replaceAll("[^0-9?!\\.]","");
				System.out.println("Commercial Unit Postmove:"+communit2);
						 
				String t3=viewavailPreMove.getText();
				String avail2=t3.replaceAll("[^0-9?!\\.]","");
				System.out.println("Avails Postmove:"+avail2);
							 
				String t4=viewtotalPreMove.getText();
				String total2=t4.replaceAll("[^0-9?!\\.]","");
				 System.out.println("Total Postmove:"+total2);
				
			 
			 
			 if (Load1.equals(Load2))
			 {System.out.println("Paased -load");}
			 
			 if(communit1.equals(communit2)) {
				 System.out.println("Passed-Commercial Units");
			 }
			 
			 if(avail1.equals(avail2))
			 {
				 System.out.println("passed-avails");
			 }
			 
			 if(total1.equals(total2))
			 {
				 System.out.println("passed-Totals");
				 }
			 
			
			 builder.sendKeys(Keys.ESCAPE).build().perform();
			 
			 waitSleep(6);
			 
			 
			 
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
			 
			 FromDateClick.sendKeys(tcData.get("MoveEndDate"));
			 
			 waitSleep(3);
			 
			 ToDateClick.click();
			 
			 waitSleep(3);
			 
			 ToDateClick.clear();
			 
			 waitSleep(2);
			 
			 ToDateClick.sendKeys(tcData.get("MoveEndDate"));
			 
			 waitSleep(3);
			 
			 Save.click();
			 waitSleep(5);
			 
        
		  
	}
}
