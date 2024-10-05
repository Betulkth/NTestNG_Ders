package com.neotech.review01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoAnnotations {

	
	 // testNG does not need main method
	// testNG works with annotations
	// import org.testng.annotations.*;    -> hepsini kapsar(tum annotationslari)
	
	
	// BeforeTest >> BeforeMethod >> Test1 << AfterMethod << AfterTest
	
	// @BeforeTest
	//
	// @Before Method
	// @Test1
	// @After Method
    //
	// @Before Method
	// @Test2
	// @After Method
	// 
	// @After Test
	
	@BeforeMethod
	public void beforeM() {
		System.out.println("Just before the Test Method");
	}
    // 	@BeforeMethod Will excecute before every Test 
	
	@AfterMethod
	public void afterM() {
		System.out.println("Just after the Test Method");
	}
	
	@BeforeTest
	public void beforeT() {
		
		System.out.println("Just before the Functionality Test");
	}
	// runs only ONE-TIME
	
	@AfterTest
	public void afterT() {
		System.out.println("Just after the Functionality Test");
		
	}
	
	
	@Test(groups = {"smoke", "regression"})
	public void test1() {
		
		System.out.println("-> Review Test1");
	}
	
	
	@Test(groups = {"regression"})
	public void test2() {
		
		System.out.println("-> Review Test2");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
