package com.test.Batch2Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
public static void smartTV() {
	System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	WebElement flipkart=driver.findElement(By.name("q"));
	flipkart.sendKeys("smartTV");
	flipkart.submit();
	
}
}
