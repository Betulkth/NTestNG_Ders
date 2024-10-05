package com.neotech.lesson01;

import org.testng.annotations.Test;

public class TestNGDemo {

	@Test(groups="smoke")
	public void test1() {
		System.out.println("Test one!");
	}
	
	
	@Test
	public void test2() {
		System.out.println("Test two!");
	}
	
	
	@Test
	public void test3() {
		System.out.println("Test three!");
	}
	
	
	// testler alfabetik siraya gore konsola yazilir.
	
	
	
}
