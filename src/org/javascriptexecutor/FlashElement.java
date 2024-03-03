package org.javascriptexecutor;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlashElement extends ParentClass {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJ-M\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		driver.get("https://demo.nopcommerce.com");
		
		WebElement logo = driver.findElement(By.xpath("(//img[@alt='nopCommerce demo store'])[1]"));
		
		
		ParentClass ps= new ParentClass();
		
		ps.FlashElement(logo, driver);
		
	}

}
