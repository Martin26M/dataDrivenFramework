package com.qa.utils;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.qa.base.TestBase;

public class listeners extends TestBase implements ITestListener {
	ExtentTest  test;
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ExtentReports extent  = TestUtil.reports();
		test= extent.createTest(result.getMethod().getMethodName());
	
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
	test.log(Status.PASS, "Passed");
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	
		try {
			TestUtil.TakeScreenshot(result.getMethod().getMethodName());
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
