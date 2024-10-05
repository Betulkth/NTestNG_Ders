package com.neotech.lesson03;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.neotech.utils.CommonMethods;

public class TaskAddEmployeeWithDataProvider extends CommonMethods {

	/*
 	--- Add 3 Employees with using DataProvider  ---
	Open chrome browser and navigate to Orange HRM website
	Login with valid credentials
	Navigate to addEmployee tab
	Add 3 different employees using data Provider 
 
 */
	
	@Test(dataProvider="employees")
	public void addEmployeeFunctionality(String firstName, String lastName, String location) {
		
		
		// we can check if the data is coming properly from the data provider
		System.out.println(firstName + "_" + lastName );
		
		// login
		// navigate to PIM menu
		// click on Add Employee
		// send employee Data
		// save employee
		// validate employee is there(no need to search in the list, just check the details after save
		
		
	}
	
	
	
	@DataProvider(name= "employees")
	public Object[][] employeeData(){
		
		Object[][] data = {{"Madi", "Johnson", "HQ - CA, USA"},
				           {"Zoe", "Johnson", "HQ - CA, USA"},
				           {"Max", "Johnson", "HQ - CA, USA"}};
		
		// fill out the data 2D
		// isim, soyisim, employee ID, location
		
		return data;
		
	}
	
	
}
