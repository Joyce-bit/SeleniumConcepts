package org.javascriptexecutor;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickElement extends ParentClass {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJ-M\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		driver.get("https://demo.nopcommerce.com");
		
		WebElement register = driver.findElement(By.xpath("(//a[normalize-space()='Register'])[1]"));
		
		ParentClass ps = new ParentClass();
		
		ps.clickElement(register, driver);
	
	}

}
