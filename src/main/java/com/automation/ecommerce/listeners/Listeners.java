package com.automation.ecommerce.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners implements ITestListener{

	public void onTestStart(ITestResult result) {
		Reporter .log("Test case is Started"+result.getMethod().getMethodName());
		
	}

	public void onTestSuccess(ITestResult result) {
		Reporter .log("Test case is Passed"+result.getMethod().getMethodName());
		if(result.isSuccess()) {
			
		}
		
	}

	public void onTestFailure(ITestResult result) {
		Reporter .log("Test case is Failed"+result.getMethod().getMethodName());
		
	}

	public void onTestSkipped(ITestResult result) {
		Reporter .log("Test case is Skipped"+result.getMethod().getMethodName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
