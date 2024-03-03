package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorsLocator {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJ-M\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
				
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		// Tag and ID
		driver.findElement(By.cssSelector("input#email")).sendKeys("abc@gmail.com");
		
		// Tag and Attribute
		driver.findElement(By.cssSelector("input[name=pass]")).sendKeys("12345");
		
		// Tag and Attribute
		driver.findElement(By.cssSelector("button[name=login]")).click();
		
	}

}

