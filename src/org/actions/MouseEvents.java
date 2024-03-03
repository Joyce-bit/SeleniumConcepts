package org.actions;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvents {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Actions Class and its methods move to element, click, build and perform
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJ-M\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		driver.get("https://omayo.blogspot.com/");
			
		Actions action = new Actions(driver);
		
		
		// Moving the mouse to a element
		WebElement blog = driver.findElement(By.id("blogsmenu"));
		action.moveToElement(blog).perform();
		
		
		WebElement option3 = driver.findElement(By.xpath("//body[1]/div[4]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/ul[1]/li[3]/a[1]/span[1]"));
		action.moveToElement(option3).click().build().perform();
	
		
	}

}
