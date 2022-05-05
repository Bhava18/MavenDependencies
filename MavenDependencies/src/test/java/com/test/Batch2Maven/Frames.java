package com.test.Batch2Maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Frames extends Leafground {
	
	public void frames(WebDriver driver) {
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[@id='Click']")).click();
		
		
		driver.switchTo().defaultContent();
		
		
		driver.switchTo().frame(1);
		driver.switchTo().frame(2);
		
		
		WebElement nestedFrames=driver.findElement(By.xpath("//button[@id='Click1']"));
		nestedFrames.click();
	    String value=nestedFrames.getTagName();
		System.out.println(value);
		
		driver.switchTo().defaultContent();
		List<WebElement> noOfFrames=	driver.findElements(By.tagName("iframe"));
		 int totalFrames=noOfFrames.size();
		 System.out.println(totalFrames);
		
		
		  
		  
		  
		 
		
		
		
		
	
		
	}

}