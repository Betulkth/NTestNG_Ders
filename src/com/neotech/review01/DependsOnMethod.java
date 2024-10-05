package com.neotech.review01;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {

	// Parameters
		// -> priority
		// 0 is the biggest priority
		// if tests has same priority, alphabetical order will execute

		// -> enabled = true,false
		// blocker olustugu zaman o sirada o testi dahil etmeyip sonraki testlere devam
		// edebilmek icin kullaniriz.
	
	    // -> dependsOnMethods = "test adi"
	
	
	@Test
	public void firstTest() {
		
		System.out.println("-> The First Test method");
		Assert.assertEquals("a", "b");  // failing on purpose
	}
	
	
	@Test(dependsOnMethods = "firstTest")
	public void secondTest() {
		
		System.out.println("-> The Second Test method");
	}
	
	// The first test will be executed
	// The first test will fail
	// The second test will be skipped
	// one test fails, one test is skipped
	
	// even we put high priority to secondTest, its not matter
	// secondTes still deponds on first one
	// depensOn has high priority
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
