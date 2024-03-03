package org.javascriptexecutor;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Up_And_Down extends ParentClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJ-M\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		driver.get("https://demo.nopcommerce.com");
		
		ParentClass ps = new ParentClass();
		Thread.sleep(3000);
		
		ps.Scroll_Down(driver);
		
		Thread.sleep(3000);
		ps.Scroll_Up(driver);
	
	}
}
