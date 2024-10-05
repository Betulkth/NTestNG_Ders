package com.neotech.lesson01;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGMoreAnnotations {

	
	
	
	@AfterTest
	public void afterTest() {

		System.out.println("After test");
	}

	@BeforeTest
	public void beforeTest() {

		System.out.println("Before test");
	}

	@Test
	public void testOne() {

		System.out.println("Test case 1..............");
	}

	@Test
	public void testTwo() {

		System.out.println("Test case 2..............");
	}

	
	@BeforeClass
	public void beforeClass() {

		System.out.println("Before Class");
	}

	
	@AfterClass
	public void afterClass() {

		System.out.println("Ater Class");
	}

	@BeforeMethod
	public void beforeMethod() {

		System.out.println("Before Method");
	}

	@AfterMethod
	public void afterMethod() {

		System.out.println("After Method");
	}

	
	/*  
	 *   before test
	 *    before class
	 *    before method
	 *    test-1
	 *    after method 
	 *    
	 *    before method
	 *    test-2
	 *    after method
	 *    after class
	 *    after test
	 * 
	 */
	
	/*
	 * Before Test! ---> this does not mean before Test method!!! It means before TEST BATCH
	 *  Test-class-method--Logo Validation--method-class-test
	 * 
	 */
	
	
	
	
	
	
	
	
	
	
	
	
}
