package com.test.Batch2Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWithMaven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","D:\\selinum\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://www.instagram.com/accounts/login/");
		WebElement username=Driver.findElement(By.name("username"));
		username.sendKeys("bhava_barani");
		WebElement password=Driver.findElement(By.name("password"));
		password.sendKeys("1234bh"); 
		WebElement loginButton=Driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button/div"));
		loginButton.click();
		WebElement forgetpassword=Driver.findElement(By.linkText("forget Password"));
		forgetpassword.click();
		Driver.close();
		
	}

}
