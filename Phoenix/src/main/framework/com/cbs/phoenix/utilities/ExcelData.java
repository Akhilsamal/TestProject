/**
 * 
 */
package com.cbs.phoenix.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author abuppa0930
 *
 */
public class ExcelData {

	private String excelFilePath;

	private String testFlag;

	public ExcelData(String name) {

		excelFilePath = name;
		testFlag = "Yes";
	}

	public HashMap<String, String> readExcelData(String testCaseId) {

		HashMap<String, String> dataMap = new HashMap<String, String>();

		XSSFWorkbook workbook;

		try {

		workbook = new XSSFWorkbook(new FileInputStream(excelFilePath));

		XSSFSheet sheet = workbook.getSheet(testCaseId);

		int rowIndex = 0;

		for (Row row : sheet) {

			if (row.getCell(1).getStringCellValue().equalsIgnoreCase(testFlag)) {

				rowIndex = row.getRowNum();
				break;
			}
		}

		int columnCount = sheet.getRow(0).getLastCellNum();

		for (int columnIndex = 0; columnIndex < columnCount; columnIndex++) {
			if (sheet.getRow(rowIndex).getCell(columnIndex) == null) {
				break;
			} else {
				
				String key = sheet.getRow(0).getCell(columnIndex).getStringCellValue().toString();
				
				DataFormatter formatter = new DataFormatter();
		        String value = formatter.formatCellValue(sheet.getRow(rowIndex).getCell(columnIndex));
				
				System.out.println("key : : " +key+ " Value : : "+value );

				dataMap.put(key, value);

			}
		}

		XSSFFormulaEvaluator.evaluateAllFormulaCells(workbook);
		new FileInputStream(excelFilePath).close();

		
		  }catch (Exception e) { 
			  e.printStackTrace(); 
			  }
		  
		return dataMap;
	}

	public void writeExcelData(String testId, String columnName, String text) {

		Object lock = new Object();

		XSSFWorkbook workbook;

		try {

			FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
			workbook = new XSSFWorkbook(new FileInputStream(excelFilePath));

			XSSFSheet sheet = workbook.getSheet(testId);

			int rowIndex = 0;

			for (Row row : sheet) {

				if (row.getCell(1).getStringCellValue().equalsIgnoreCase(testFlag)) {

					rowIndex = row.getRowNum();
					break;
				}
			}

			int columnCount = sheet.getRow(0).getLastCellNum();

			for (int columnIndex = 0; columnIndex < columnCount; columnIndex++) {

				DataFormatter format = new DataFormatter();

				if (format.formatCellValue(sheet.getRow(0).getCell(columnIndex)).equalsIgnoreCase(columnName)) {
					sheet.getRow(rowIndex).createCell(columnIndex);
					sheet.getRow(rowIndex).getCell(columnIndex).setCellValue(text);
					break;
				}

			}

			XSSFFormulaEvaluator.evaluateAllFormulaCells(workbook);

			inputStream.close();

			synchronized (lock) {

				FileOutputStream outputStream = new FileOutputStream(excelFilePath, false);
				workbook.write(outputStream);
				outputStream.flush();
				outputStream.close();

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void updateAllSheet(List<String> testIds, String columnName, String text) {

		Object lock = new Object();

		XSSFWorkbook workbook;

		try {

			FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
			workbook = new XSSFWorkbook(new FileInputStream(excelFilePath));

			for (String testId : testIds) {

				XSSFSheet sheet = workbook.getSheet(testId);

				int rowIndex = 0;

				for (Row row : sheet) {

					if (row.getCell(1).getStringCellValue().equalsIgnoreCase(testFlag)) {

						rowIndex = row.getRowNum();
						break;
					}
				}

				int columnCount = sheet.getRow(0).getLastCellNum();

				for (int columnIndex = 0; columnIndex < columnCount; columnIndex++) {

					DataFormatter format = new DataFormatter();

					if (format.formatCellValue(sheet.getRow(0).getCell(columnIndex)).equalsIgnoreCase(columnName)) {
						sheet.getRow(rowIndex).createCell(columnIndex);
						sheet.getRow(rowIndex).getCell(columnIndex).setCellValue(text);
						break;
					}

				}
			}

			XSSFFormulaEvaluator.evaluateAllFormulaCells(workbook);

			inputStream.close();

			synchronized (lock) {

				FileOutputStream outputStream = new FileOutputStream(excelFilePath, false);
				workbook.write(outputStream);
				outputStream.flush();
				outputStream.close();

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
