package com.neotech.lesson02;

import org.testng.annotations.Test;

public class DependsDemo {

	@Test(priority = 1)
	public void firstTest() throws Exception {

		System.out.println("firstTest");
		//throw new Exception();
	}

	
	
	@Test(priority = 2, enabled = true)
	public void secondTest() throws Exception {

		System.out.println("secondTest");
		throw new Exception();
	}
	
	

	@Test(dependsOnMethods = {"firstTest", "secondTest"})
	public void thirdTest() {

		System.out.println("thirdTest");
	}
	
	

	@Test(dependsOnMethods = "firstTest")
	public void fourthTest() throws Exception {

		System.out.println("fourthTest");
		throw new Exception();
	}
}

// priority yoksa, priority=0 demektir