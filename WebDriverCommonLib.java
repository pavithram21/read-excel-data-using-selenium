package com.FB.genericlib;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class WebDriverCommonLib {
	
	public static WebDriver driver;
	
	public void waitForPageToLoad(WebDriver driver1) {
		driver1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
    public void waitForElementToClick(WebDriver driver1) {
    WebDriverWait wait= new WebDriverWait(driver1, 20);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul/li[14]/a[@class='_54nc']/span/span")));
    }
    
    public void doubleClick(WebDriver driver1) {
    	WebElement element = driver1.findElement(By.xpath("//div[@class='_5yk2']"));
    	Actions a = new Actions(driver1);
    	a.moveToElement(element).perform();
    	a.moveToElement(element).click().perform();
    }
    
 // This method is called internally by WebRobot
 	// It gets resolved object. No need to call again resolveGUIObject
 	public WebElement getElement(String locator) {
 		if (locator.startsWith("css=")) {
 			return driver.findElement(By.cssSelector(locator.substring(4)));
 		}

 		if (locator.startsWith("//")) {
 			return driver.findElement(By.xpath(locator));
 		}

 		if (locator.startsWith("name=")) {
 			return driver.findElement(By.name(locator.substring(5)));
 		}

 		if (locator.startsWith("link=")) {
 			// return driver.findElement(By.linkText(locator.substring(5)));
 			return driver.findElement(By.partialLinkText(locator.substring(5)));
 		}

 		if (locator.startsWith("class=")) {
 			return driver.findElement(By.className(locator.substring(6)));
 		}

 		return driver.findElement(By.id(locator));
 	}
    
    
}
