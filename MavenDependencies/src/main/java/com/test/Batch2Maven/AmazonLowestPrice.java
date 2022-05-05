package com.test.Batch2Maven;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonLowestPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selinum\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        String firstWindow=driver.getWindowHandle();
        driver.manage().window().maximize();
        WebElement lowestpricemobile=driver.findElement(By.id("twotabsearchtextbox"));
        lowestpricemobile.sendKeys("samsung mobile under 2000");
        lowestpricemobile.submit();
        driver.findElement(By.linkText("Samsung Guru 1200 (GT-E1200, White)")).click();
        Set<String> secondWindow=driver.getWindowHandles();
        for(String newWindows:secondWindow) {
        	driver.switchTo().window(newWindows);
        }
        WebElement quantity= driver.findElement(By.xpath("//select[@id='quantity']"));
        Select numbers=new Select(quantity);
        numbers.selectByVisibleText("2");
               
        WebElement addToCart=driver.findElement(By.id("add-to-cart-button"));
        addToCart.click();
        driver.quit();
    
       
       
   
	}
}


