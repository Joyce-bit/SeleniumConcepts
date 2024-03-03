package org.hashmap;

import java.time.Duration;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HashMap {
	
	// Static method for Creating HashMap 
	
	public static java.util.HashMap<String, String> loginData(){
		
		java.util.HashMap<String, String> hm = new java.util.HashMap<String, String>();
		hm.put("x", "mercury@mercury");
		hm.put("y", "mercury1@mercury1");
		hm.put("z", "mercury2@mercury2");
		
		return hm;
	}

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJ-M\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		String title = driver.getTitle();
		System.out.println(title);
		
		//Login the key x
		String xlogin = loginData().get("x");  // Getting the key x
		
		String[] xarray = xlogin.split("@");  // splitting the values of x and saving into an array
		
		System.out.println(Arrays.toString(xarray));  // printing the values of array
		
		driver.findElement(By.xpath("(//input[@name='userName'])[1]")).sendKeys(xarray[0]); // passing 1st value of x to the element
		driver.findElement(By.xpath("(//input[@name='password'])[1]")).sendKeys(xarray[1]);  // passing 2nd value of x to the element
		driver.findElement(By.xpath("(//input[@name='submit'])[1]")).click();  // click on submit button
		driver.findElement(By.linkText("SIGN-OFF")).click(); // click on sign off link to get the home page again
			
		
	}

}
