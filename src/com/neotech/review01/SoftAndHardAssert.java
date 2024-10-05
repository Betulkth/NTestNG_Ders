package com.neotech.review01;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAndHardAssert {

	
	@Test
	public void testHardAssert() {
		
		// Hard asserti nerde kullaniriz, diyelim ki login fail etti
		// add emp adimina devam etmek istemiyorsam hard assert kullanirim
		
		System.out.println("Step 1");
		System.out.println("Step 2");
		System.out.println("Step 3");
		
		String expectedAccount = "Jacqueline";
		String actualAccount = "Aaron";
		
		Assert.assertEquals(actualAccount, expectedAccount, "The account name is wrong");
		
		System.out.println("Step 4");
		// After Hard Assert fails, the next tests stops executing
		// Hard assert is static so we dont need to create an object from it
		
	}
	
	
	
	@Test
	public void TestsoftAssert() {
		
		// Sift assertionu nerede kullaniyoruz?
		// Diyelim hem logo validation hem login hem de add emp validation kontrol ediyoruz
		// Logo validation pass etse de login ve sonrasi icin devam etmek istiyoruz
		// bu yuzden soft assertion kullaniriz
		
		
		// evde cocuklarin tasklerini yapip yapmadigini ornek verebilirz :D anne-soft baba-hard
		
		System.out.println("Step1");
		System.out.println("Step 2");
		System.out.println("Step 3");
		
		SoftAssert soft = new SoftAssert();
		// In the soft assert we need to create an object from it
		
		String expectedAccount = "Jacqueline";
		String actualAccount = "Aaron";
		
		soft.assertEquals(actualAccount, expectedAccount);
		
		System.out.println("Step4");
		// After soft assert fails, the next tests will not stop execution
		
		soft.assertTrue(true);
		
		System.out.println("Step5");
		
		// This will collect all the soft assertions
		// And will decide if the test methods will pass or fail
		// If all the assertions pass, the test method will pass
		// If one of them fails, the test will fail
		soft.assertAll();
		// assertAll() yazmadan soft assert tamamlanmaz!!
		
		System.out.println("Step5");
		// this will not execute because assertAll() -> will decide fail
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
