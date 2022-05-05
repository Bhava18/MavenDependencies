package com.test.Batch2Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Leafground {
	public WebDriver driver;
	
	@BeforeTest
	public void openframes() {
		System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
	}
	@AfterTest
	public void closeurl() {
		driver.quit();
	}
		
	}


