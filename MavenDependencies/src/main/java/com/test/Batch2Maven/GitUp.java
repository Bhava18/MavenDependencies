package com.test.Batch2Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://github.com/login");
WebElement username=driver.findElement(By.name("login"));
username.sendKeys("Bhava18");
/*WebElement password=driver.findElement(By.id("password"));
password.sendKeys("Bhava2021");
WebElement button=driver.findElement(By.name("commit"));
button.click();*/
WebElement forgetpassword=driver.findElement(By.partialLinkText("Forget password?"));
forgetpassword.submit();
//WebElement createaccount=driver.findElement(By.linkText("Create an account"));
//createaccount.click();
	}

}
