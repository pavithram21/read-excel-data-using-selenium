package com.FB.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.io.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/* Creating Chome driver intance */
		 /*System.setProperty("webdriver.chrome.driver","D:/Learning Auto/UMFramework/lib/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		
//			System.setProperty("webdriver.gecko.driver","D:/Learning Auto/UMFramework/lib/geckodriver.exe");
//			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.gmail.com");
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.id("identifierId")).sendKeys("pravana.mallikarjuna@gmail.com");
			driver.findElement(By.xpath("//div[@id='identifierNext']/content/span")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.name("password")).sendKeys("Pravana21");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='passwordNext']/content/span")).click();
			//driver.findElement(By.xpath("//div[@id=':2l']")).click();
			String Msg="Primary";
			String TextMsg=driver.findElement(By.xpath("//div[@id=':2l']")).getText();
			System.out.println("Xpath message: "+TextMsg);
		    Assert.assertEquals(TextMsg,Msg,"Both are same");
		    driver.findElement(By.xpath("//img[@id=':e1']")).click();
			driver.quit();			*/
}
}
			

	


