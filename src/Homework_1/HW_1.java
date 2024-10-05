package Homework_1;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.neotech.utils.CommonMethods;

public class HW_1 extends CommonMethods {

	// Testimizden once, setup gerceklesicek

	@BeforeMethod
	public void openAndNavigate() {

		setUp();
	}

	// Test bitince browseri kapat

	@AfterMethod
	public void quitBrowser() {

		tearDown();
	}

	@Test
	public void negativeLoginTest() {

		sendText(driver.findElement(By.id("txtUsername")), "Admin");
		sendText(driver.findElement(By.id("txtPassword")), "");
		click(driver.findElement(By.xpath("//button[@type='submit']")));

		wait(2);

		String expected = "Password cannot be empty";
		String actual = driver.findElement(By.id("txtPassword-error")).getText();

		if (actual.equals(expected)) {

			System.out.println("Test passed");
		} else {

			System.out.println("Test Failed!");
		}

	}

}
