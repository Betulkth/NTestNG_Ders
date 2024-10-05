package com.neotech.utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {

	public void onStart(ITestContext context) {

		System.out.println("Functionality test started!");
	} 

	public void onFinish(ITestContext contex) {

		System.out.println("Functionality test finished!");
	}

	// onStart - onFinish is about Test suite in the xml file
	
	 
	
	public void onTestStart(ITestResult result) {

		System.out.println(result.getName() + " test is starting");
	}

	public void onTestSuccess(ITestResult result) {

		System.out.println(result.getName() + " test just passed");
	}

	public void onTestFailure(ITestResult result) {

		System.out.println(result.getName() + " test just failed");

	}
	
	// These 3 methods about the test method in the class(AddEmployee)
	
	
	
	
	
	
	
	
	
	
	
	
	
}
