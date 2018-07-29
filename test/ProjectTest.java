package com.FB.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.*;

import org.testng.annotations.*;
import com.FB.genericlib.Driver;
import com.FB.genericlib.ExcelLib;
import com.FB.genericlib.WebDriverCommonLib;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class ProjectTest {
	public WebDriver driver;
	ExcelLib elib=new ExcelLib();
	WebDriverCommonLib wLib=new WebDriverCommonLib();
	
	@Test(priority=0)
	public void setUp() throws InterruptedException{
		/* gecko driver setProperty */
          driver=Driver.getDriver();
       //   WebDriverCommonLib.driver = driver;
		 }
	
	@Test(priority=1)
	public void SignIn() throws InterruptedException, InvalidFormatException, IOException{
		
		String userName=elib.getExcelData("SignIn", 1, 0);
		String passWord=elib.getExcelData("SignIn", 1, 1);
		driver.findElement(By.id("email")).sendKeys(userName);
	    wLib.waitForPageToLoad(driver);
		driver.findElement(By.name("pass")).sendKeys(passWord);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);	
		
	}
    @Test(priority=2)
	public void StatusUpdate() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Compose Post')]")).click();
		wLib.doubleClick(driver);
		driver.findElement(By.xpath("//div[@class='_5yk2']")).sendKeys("Hello World");
		driver.findElement(By.xpath("//button/span[contains(text(),'Post')]")).click();
		Thread.sleep(2000);
		
	}
  @Test(priority=4)
	 public void tearDown(){
		driver.findElement(By.xpath("//a[@id='pageLoginAnchor']"));
		System.out.println("waiting for page to get ele");
		wLib.waitForPageToLoad(driver);
		driver.findElement(By.xpath("//a[@id='pageLoginAnchor']")).click();
		System.out.println(" ele clicked pop up displays");
	    driver.findElement(By.xpath("//ul[@class=\"_54nf\"]/li[12]/a/span/span[contains(text(),'Log Out')]")).click();
	    driver.quit();
	}
}
