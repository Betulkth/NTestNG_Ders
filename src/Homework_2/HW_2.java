package Homework_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class HW_2 extends CommonMethods {

//	HW2: OrangeHRM Add Employee:
//
//	    Open chrome browser
//	    Go to "https://hrm.neotechacademy.com/"
//	    Login into the application
//	    Click on Add Employee
//	    Verify labels: Employee Full Name*, Employee Id, Location* are displayed
//	    Provide Employee First and Last Name
//	    Select a Location
//	    Verify Employee has been added successfully
//	    Close the browser

	@BeforeMethod
	public static void openBrowser() {

		setUp();
	}

	@AfterMethod
	public static void quitBrowser() {

		tearDown();
	}

	@Test
	public static void verifyAddEmployee() {

		// Login into the application
		sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));
		sendText(driver.findElement(By.id("txtPassword")), ConfigsReader.getProperty("password"));
		click(driver.findElement(By.xpath("//button[@type='submit']")));

//	    Click on Add Employee

		// PIM
		jsClick(driver.findElement(By.xpath("//span[text()='PIM']")));
		// Add Employee
		click(driver.findElement(By.xpath("//span[text()='Add Employee']")));

		waitForVisibility(By.id("first-name-box"));

//	    Verify labels: Employee Full Name*, Employee Id, Location* are displayed

		// Verify Employee Full Name*
		String actualFullName = driver
				.findElement(By.xpath("//div[@class='form-group col-8']//oxd-employee-name-input/label")).getText();
		String expectedFullName = "Employee Full Name*";

		Assert.assertEquals(actualFullName, expectedFullName, "EMPLOYEE FULL NAME is NOT displayed!!");
		wait(2);

		// Verify Employee Id
		WebElement employeeId = driver.findElement(By.xpath("//div[@class='form-group col-3']/label"));
		boolean actualEmployeeId = employeeId.isDisplayed();

		Assert.assertTrue(actualEmployeeId, "EMPLOYEE ID is NOT displayed!!");
		wait(2);

		// Verify Location*
		String actualLocation = driver.findElement(By.xpath("//label[@for='location']")).getText();
		String expectedLocation = "Location*";

		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actualLocation, expectedLocation, "LOCATION is NOT displayed!!");
		wait(2);
		soft.assertAll();

		System.out.println("End of the verify labels test.");

//	    Provide Employee First and Last Name
//	    Select a Location

		sendText(driver.findElement(By.id("first-name-box")), "john");

		sendText(driver.findElement(By.id("last-name-box")), "wick");

		sendText(driver.findElement(By.xpath("//input[@id='employeeId']")), "91718");

		selectDropdown(driver.findElement(By.xpath("//select[@id='location']")), "HQ - CA, USA");
		wait(2);

		click(driver.findElement(By.id("first-name-box")));
		wait(1);

		jsClick(driver.findElement(By.xpath("//button[@id='modal-save-button']")));

	
		wait(2);

//	    Verify Employee has been added successfully
		waitForVisibility(By.xpath("//div[@class='toast-message']"));

		String actualMessage = driver.findElement(By.xpath("//div[text()='Successfully Saved']")).getText();

		String expectedMessage = "Successfully Saved";

		Assert.assertEquals(actualMessage, expectedMessage, "Employee could NOT saved!!!!");

		wait(2);

	}

}
