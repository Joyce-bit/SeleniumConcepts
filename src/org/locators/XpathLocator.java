package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJ-M\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		//Absolute Xpath
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("Admin");
		
		// Relative Xpath
		//driver.findElement(By.xpath("(//input[@placeholder='Username'])[1]")).sendKeys("Admin");
		
		//Xpath with OR operator
		// driver.findElement(By.xpath("//input[@placeholder='Username' or @name='username']")).sendKeys("Admin");
		
		// Xpath with AND operator
		//driver.findElement(By.xpath("//input[@placeholder='Username' and @name='username']")).sendKeys("Admin");
		
		// Xpath with contains method
		// driver.findElement(By.xpath("//button[contains(@type, 'sub')]")).click();
		
		// XPath with stars-with method
		// driver.findElement(By.xpath("//input[starts-with(@name, 'user')]")).sendKeys("Admin");
		
		// Xpath using text method
		//driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		
		// Chained Xpath with parent and child tags
		driver.findElement(By.xpath("//div[@class='oxd-form-actions orangehrm-login-action']//button[@type='submit']")).click();
		
	}

}
