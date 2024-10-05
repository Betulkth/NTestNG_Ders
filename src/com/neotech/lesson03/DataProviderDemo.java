package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class DataProviderDemo extends CommonMethods {

	// getData da olabilir
	@Test(dataProvider = "userData")
	public void loginFunctionality(String username, String password) {

		sendText(driver.findElement(By.id("txtUsername")), username );
		sendText(driver.findElement(By.id("txtPassword")), password);

		click(driver.findElement(By.xpath("//button")));
	}

	// testing the functionality using data (which can come from different files,
	// db)
	// to create data driven tests in TestNG we use @DataProvider annotation

	@DataProvider(name = "userData")
	public Object[][] getData(){

		// 1st test : Admin, Neotech123 {Admin, Neotech123}
		// 2dn test : Mona, Mona123 {Mona, Mona123}
		// 3rd test : Betul, betul123 {Betul, betul123}

		Object [][] credentials = {
				{"Admin","Neotech@123"},
				{"Admin","Neotech@123"},
				{"Admin","Neotech@123"}};
		return credentials;

	}

}
