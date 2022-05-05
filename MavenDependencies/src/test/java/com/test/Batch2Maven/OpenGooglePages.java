package com.test.Batch2Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGooglePages {
	
	public void amgs()
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	       driver.get("https://www.amazon.in/");
	       driver.manage().window().maximize();
	       WebElement googlesearch=driver.findElement(By.id("twotabsearchtextbox"));
	       googlesearch.sendKeys("iphone");
	       googlesearch.submit();
	       driver.close();
	}

	
       
 
	}

