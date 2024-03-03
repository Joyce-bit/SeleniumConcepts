package org.windowshandling;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabHandling {
	
	// Multiple tab handling in window handling
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJ-M\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		String pwindow = driver.getWindowHandle();
		driver.get("https://omayo.blogspot.com");
		driver.findElement(By.id("selenium143")).click();
		Thread.sleep(5000);
		
		Set<String> cwindow = driver.getWindowHandles();
		
		for(String i : cwindow) {
			
			System.out.println(cwindow);
			
			if(!i.equals(pwindow)) {
				driver.switchTo().window(i);
				String text = driver.findElement(By.linkText("What is Selenium?")).getText();
				System.out.println(text);
				Thread.sleep(5000);
				driver.close();
			}
			
		}
		
		driver.switchTo().window(pwindow);
		}
}
