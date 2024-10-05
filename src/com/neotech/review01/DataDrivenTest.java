package com.neotech.review01;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.neotech.utils.ExcelUtility;

public class DataDrivenTest {

	
	@BeforeMethod
	public void before() {
		System.out.println(" ***Before the Test Method*** ");
	}
	@Test(dataProvider = "data2")
	public void loginTest(String name, String company, String jobPosition) {
	
		
		System.out.println(name + " - " + company);
		System.out.println("He/She works as -> " + jobPosition);
		System.out.println("--------------------------------------------------");
		
	}
	
	
	
	
	// Hard coding way:
	@DataProvider
	public Object[][] createData(){
		
		Object[][] data = {{"Paul", "Neotech", "Student"}, {"Betul", "Google", "QA"}, {"Umut", "Facebook", "Scrummaster"} };
		
		return data;
	}
	
	
	@DataProvider(name = "data2")
	public Object[][] createFromExcel(){
		
		String filePath = System.getProperty("user.dir") + "/testdata/Employees.xlsx";
		
		String sheetName = "Position";
		
		return ExcelUtility.excelIntoArray(filePath, sheetName);
		
		
	}
	
	
	
	
	
	
}
