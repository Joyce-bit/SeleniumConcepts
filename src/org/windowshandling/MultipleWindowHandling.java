package org.windowshandling;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {
	
	// Handling multiple windows
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJ-M\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parentwindow = driver.getWindowHandle();
		System.out.println("Parent Windows is handled " + parentwindow);

		driver.findElement(By.id("newWindowBtn")).click();
		
		Set<String> childwindow = driver.getWindowHandles();
		
		System.out.println("These are the parent and child windows : " + childwindow);
		
		for(String i : childwindow) {
			
			System.out.println(childwindow);
			
			if(!i.equals(parentwindow)) {
				driver.switchTo().window(i);
				driver.manage().window().maximize();
				driver.findElement(By.id("firstName")).sendKeys("joe");
				Thread.sleep(5000);
				driver.close();
			}
		
		}
		
		driver.switchTo().window(parentwindow);
		driver.findElement(By.id("name")).sendKeys("text");
		
		Thread.sleep(10000);
		driver.quit();
	
	}

}
