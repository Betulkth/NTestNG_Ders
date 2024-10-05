package com.neotech.lesson04;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ListenerDemo {

	@BeforeMethod
	public void before() {

		System.out.println("Before method");
	}

	@AfterMethod
	public void after() {

		System.out.println("After method");
	}

	@Test
	public void test1() {

		System.out.println("This is test1");
		
		// pass this test
		Assert.assertTrue(true);
	}

	@Test
	public void test2() {

		System.out.println("This is test1");
		
		// fail this test
		Assert.assertTrue(false);
	}

}
