package com.test.Batch2Maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQa   {
	public   void rundemo (WebDriver driver ) {
		
        WebElement login=driver.findElement(By.id("login"));
		boolean presentOfLogin=login.isDisplayed();
		System.out.println("Is login present?"+presentOfLogin);
		
		
//		List<WebElement> column=driver.findElements(By.tagName("th"));
//		int noOfColumns= column.size();
//		System.out.println( "columns:"+noOfColumns);
		
		
		WebElement image=driver.findElement(By.xpath("//div[@class='rt-resizable-header-content']"));
		boolean presentOfImage=image.isDisplayed();
		System.out.println("image:"+presentOfImage);
		
		
		WebElement author=driver.findElement(By.xpath("//div[text()='Author']"));
		boolean presentOfAuthor=author.isDisplayed();
		System.out.println("author:"+presentOfAuthor);
		
		
		WebElement title=driver.findElement(By.xpath("//div[text()='Title']"));
		boolean presentOfTitle=title.isDisplayed();
		System.out.println("title:"+presentOfTitle);
		
		
		WebElement publisher=driver.findElement(By.xpath("//div[text()='Publisher']"));
		boolean presentOfPublisher=publisher.isDisplayed();
		System.out.println("publisher:"+presentOfPublisher);
	}
	public void search()
	{
		System.setProperty("webdriver.chrome.driver","D:\\selinum\\chromedriver.exe");
	    WebDriver driver1=new ChromeDriver();
	    driver1.get("https://demoqa.com/books");
	    WebElement searchBox=driver1.findElement(By.xpath("//input[@type='text']"));
	    searchBox.sendKeys("Speaking Javascript");
	    String sb=searchBox.getAttribute("value");
	    System.out.println(sb);
        searchBox.clear();
        
        
	    WebElement search=driver1.findElement(By.xpath("//input[@type='text']"));
	    search.sendKeys("You Don't know JS");
	    String s=search.getAttribute("value");
	    System.out.println(s);
	



				
		
		
		
		 
		 
		
		
		
		
		
	}

}
