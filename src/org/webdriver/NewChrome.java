package org.webdriver;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewChrome {
	public static void main(String[] args) {
		
		// System is a class in java lang package and setProperty is a method of the class System.
		System.setProperty("webdrver.chrome.driver", "C:\\Users\\AJ-M\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		//WebDriver is an interface. ChromeDriver is a class of that interace. drive is a reference name created.
		WebDriver driver = new ChromeDriver();
		
		// manage, window and maximize are abstract methods to maximize the web page
		driver.manage().window().maximize();
		
		// get is a abstract method to pass the url to the web page
		driver.get("https://www.facebook.com/");
		
		// getTitle is an abstract method to get the title of the web page
		String title = driver.getTitle();
		System.out.println(title);
		
		// getCurrenturl is an abstract method to get the current url of the web page
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		
		// quit is an abstract method to close the web page
		driver.quit();
		
	}

}
