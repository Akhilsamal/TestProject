/**
 * 
 */
package com.cbs.phoenix.utilities;

import java.util.HashMap;
import java.util.List;

/**
 * 
 *
 */
public class TestDataProvider {
	
	public static final ThreadLocal<ExcelData> testDataObj = new ThreadLocal<ExcelData>();
	
	public TestDataProvider(String name) {
		ExcelData excelData = new ExcelData(name);
		testDataObj.set(excelData);
	}
	
	public HashMap<String, String> readData(String testId) {
		
		return testDataObj.get().readExcelData(testId);
	}
	
	public void writeData(String testId, String columnName, String text) {
		testDataObj.get().writeExcelData(testId,columnName,text);
	}
	
	public void updateAllSheet(List<String> testIds, String columnName, String text) {
		testDataObj.get().updateAllSheet(testIds,columnName,text);
	}

}
