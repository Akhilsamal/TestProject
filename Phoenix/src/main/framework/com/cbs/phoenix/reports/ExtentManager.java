/**
 * 
 */
package com.cbs.phoenix.reports;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.testng.IResultMap;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

/**
 * 
 *
 */
public class ExtentManager {
	
	private static ExtentReports extent;
	
	public static ExtentReports getReporter() {
		
		if(extent == null) {
			
			String fileName = "D://Reports//"+ "Phoenix_Reports_" + dateTimeGenerator() +".html" ;
			
			//String fileName = "src/main/resources/Reports/"+ "Phoenix_Reports_" + dateTimeGenerator() +".html" ;
			
			
			
			extent = new ExtentReports(fileName, true);
			
			//extent.loadConfig(new File("D:\\extent-config.xml"));
			//loadConfig(new File("C:\HelloWorld\extent-config.xml"));
		}
		
		return extent;
		
	}
	
	
	public static String dateTimeGenerator()
	{
	Format formatter = new SimpleDateFormat("dd-MMM-yyyy_HH-mm-ss.SSS");
	Date date = new Date(System.currentTimeMillis());
	return formatter.format(date);
	}
	
	
	
	
	

}
