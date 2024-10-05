package com.neotech.review01;

import org.testng.annotations.Test;

public class TestParameters {

	        // Parameters
				// -> priority
				// 0 is the biggest priority
				// if tests has same priority, alphabetical order will execute

				// -> enabled = true,false
				// blocker olustugu zaman o sirada o testi dahil etmeyip sonraki testlere devam
				// edebilmek icin kullaniriz.
			
			    // -> dependsOnMethods = "test adi"
		       
		        // ->groups

	@Test(priority = 4, groups = "regression")
	public void MethodA() {
		System.out.println("-> Running Test Method A");
	}

	@Test(priority = 1, enabled = false, groups = "regression")
	public void MethodB() {
		System.out.println("-> Running Test Method B");
	}

}
