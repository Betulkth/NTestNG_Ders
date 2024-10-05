package Homework_2;

import org.testng.annotations.Test;

public class TaskOne_HW1 {

//	HW1: Executing tests using priority and enable attributes

//	Create a class TaskOne that has 5 test methods named:
//	firstMethod
//	firstMethod1
//	secondMethod
//	thirdMethod
//	fourthMethod
//	
//	And each of them printing the method name
//	Run and observe results
//
//	Then, add the needed attributes to print the following result:
//	fourthMethod
//	thirdMethod
//	secondMethod
//	firstMethod
	
	@Test(dependsOnMethods = "secondMethod")
	public void firstMethod() {
		
		System.out.println("This is firstMethod test case");
	}
	
	
	
	@Test(enabled = false)
	public void firstMethod1() {
		
		System.out.println("This is firstMethod1 test case");
	}
	
	
	
	@Test(dependsOnMethods = "thirdMethod")
	public void secondMethod() {
		
		System.out.println("This is secondMethod test case");
	}
	
	
	
	
	@Test(priority = 1)
	public void thirdMethod() {
		
		System.out.println("This is thirdMethod test case");
	}
	
	
	
	@Test()
	public void fourthMethod() {
		
		System.out.println("This is fourthMethod test case");
	}
	
	
	
	
	

}
