package com.qa.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.common.collect.Table.Cell;
import com.qa.base.TestBase;

public class TestUtil extends TestBase {

	
	public static long Page_load_timeout= 10;
	public static long Implicitly_wait = 5;
	

	
	// Data Driven Util from excel 
	public Map<String, String> readExcel(String sheetname) throws IOException {
	
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\docs\\DataFile.xlsx");
		
		Map<String,String> map = new HashMap<String,String>();
		
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
	
	XSSFSheet sheet=    workbook.getSheet(sheetname);
	
	Row r1= sheet.getRow(0);
	
	Row r2=sheet.getRow(1);
	
	for (int i =0; i<r1.getLastCellNum() ; i++)
	{
		
	  
		map.put(r1.getCell(i).getStringCellValue(), r2.getCell(i).getStringCellValue());
	}
	return map;	
	
	
	
	}
	
	
 public static  ExtentReports reports() {
		
		
		
		ExtentSparkReporter reporter  = new ExtentSparkReporter("./reports/index.html");
		ExtentReports extent = new ExtentReports();
		reporter.config().setReportName("Martin Automation");
		reporter.config().setDocumentTitle("MartinsAuto");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "MArtin");
		
		
		return extent;
	}
 

	
 
 public static void  TakeScreenshot(String MethodName) throws IOException {
	 
	 
	 
	 File src  =  ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	 
	 FileUtils.copyFile(src, new File (System.getProperty("user.dir")+"\\Screenshots"+MethodName+".jpg"));
	 
	 
 }
	
}
