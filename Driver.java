package com.FB.genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Driver {
	
	public static WebDriver driver;
	public static String baseURL="https://www.facebook.com";
	
	public static WebDriver getDriver() throws InterruptedException{	
		/* gecko driver setProperty */
	 System.setProperty("webdriver.chrome.driver","D:/LearningAuto/UMFramework/lib/chromedriver.exe");
	 ChromeOptions options = new ChromeOptions();
	 options.addArguments("--disable-notifications");
	 driver = new ChromeDriver(options);
	 driver.manage().window().maximize();
	 driver.get(baseURL);
	
     return driver;
	}
	
}
