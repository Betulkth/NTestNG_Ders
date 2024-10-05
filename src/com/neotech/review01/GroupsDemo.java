package com.neotech.review01;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupsDemo {

	// Parameters
			// -> priority
			// 0 is the biggest priority
			// if tests has same priority, alphabetical order will execute

			// -> enabled = true,false
			// blocker olustugu zaman o sirada o testi dahil etmeyip sonraki testlere devam
			// edebilmek icin kullaniriz.
		
		    // -> dependsOnMethods = "test adi"
	       
	        // ->groups
	
	@Test(groups = "smoke")
	public void smokeTest() {
		System.out.println("-> Smoke Test");
	}
	
	
	// We are not including before after test methods into a gruops
	// but when we are not grouping them, they will not execute
	// instead we are saying always run
	@BeforeMethod(alwaysRun = true)
	public void beforeTest() {
		System.out.println("Just before test");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
