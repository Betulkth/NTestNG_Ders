package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.neotech.utils.CommonMethods;

public class AssertDemo extends CommonMethods {

	@BeforeMethod
	public void navigateToBrowser() {

		setUp();
	}

	@AfterMethod
	public void closeToBrowser() {

		tearDown();
	}

	@Test // (enabled = false)
	public void titleValidation() {

		String expected = "OrangeHR";
		String actual = driver.getTitle();

		// First way:
		// Assert.assertEquals(actual, expected);
		// Verify that they are equal

		// Second way:
		Assert.assertEquals(actual, expected, "Title does NOT match!!!");

		// If assertion fails, anything after will not run
		System.out.println("This is the end of title validation test");

	}

	@Test // (priority = 1, dependsOnMethods = "titleValidation")
	public void logoValidation() {

		WebElement logo = driver.findElement(By.xpath("//div[@class='orangehrm-logo']/img"));
		boolean logoExist = logo.isDisplayed();


		// set it to false on purpose for Failing the test
		logoExist = false;

		// 1st way
		// Assert.assertEquals(logoExist, true);

		// 2nd way
		// Assert.assertEquals(logoExist, true, "Logo is NOT displayed!");

		// 3rd way
		Assert.assertTrue(logoExist, "Logo is NOT displayed!");
	}

}
