package com.neotech.utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public static WebDriver driver;

	@BeforeMethod(alwaysRun=true)
	public static void setUp() {
		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
		String browser = ConfigsReader.getProperty("browser");

		ChromeOptions co = new ChromeOptions();
		co.setBrowserVersion("127");
		
		// System.out.println(browser);
		switch (browser.toLowerCase()) {

		case "chrome": 
			driver = new ChromeDriver(co);
			break;
			
		case "firefox":
			driver = new FirefoxDriver();
			break;
			
		case "safari":
			driver = new SafariDriver();
			break;

		
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
	        // Optionally, you can handle an unknown browser case here, such as:
			throw new RuntimeException("Unsupported web browser!!!");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.IMPLICIT_WAIT_TIME));
		String url = ConfigsReader.getProperty("url");
		driver.get(url);
		
		
				
		
	}

	@AfterMethod(alwaysRun=true)
	public static void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
	
}
