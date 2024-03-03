package org.waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaits {
	
	public static void main(String[] args) {
		
		// Waits in Selenium
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJ-M\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
				
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		 //Impplicitly Wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("(//textarea[@id='APjFqb'])[1]")).sendKeys("Selenium");
		driver.findElement(By.xpath("(//textarea[@id='APjFqb'])[1]")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//h3[text() = 'Selenium'])[1]")).click();
		
		driver.close();
		
	}

}
