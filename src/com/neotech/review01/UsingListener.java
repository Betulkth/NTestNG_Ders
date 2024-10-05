package com.neotech.review01;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class UsingListener{

	// other way to import
	// @Listeners(com.neotech.utils.Listener.class)
	// public class UsingListener {
	
	
	@BeforeMethod
	public void before() {
		System.out.println("Before");
	}
	
	
	@AfterMethod
	public void after() {
		System.out.println("After");
	}
	
	
	@Test
	public void testMethod1() {
		
		System.out.println(" -> testMethod1");
		
		Assert.assertTrue(false);   // assertTrue -> false olacagini bekliyor, test will fail
	}
	
	
	
	@Test
	public void testMethod2() {
		
		System.out.println(" -> testMethod2");
		
		Assert.assertEquals("A","A");  // assertEquals -> esit mi diye kontrol ediyor, test will pass
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
