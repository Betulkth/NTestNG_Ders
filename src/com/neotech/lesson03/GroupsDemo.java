package com.neotech.lesson03;

import org.testng.annotations.Test;

public class GroupsDemo {

	 // (priority = 1, groups = "smoke"
	@Test(groups="smoke")
	public static void Test1() {
		System.out.println("This is test 1 on GroupDemo class");
	}
	
	@Test(groups= {"smoke", "regression", "sprint6"})
	public static void Test2() {
		System.out.println("This is test 2 on GroupDemo class");
	}
	
	
	@Test(groups="sprint6")
	public static void Test3() {
		System.out.println("This is test 3 on GroupDemo class");
	}
	
	@Test(groups={"smoke", "broken"})
	public static void Test4() {
		System.out.println("This is test 4 on GroupDemo class");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
