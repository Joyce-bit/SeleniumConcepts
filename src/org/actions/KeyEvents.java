package org.actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyEvents {
	
	public static void main(String[] args) {
		
		// Key Up and Key Down methods in Actions class
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJ-M\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		driver.get("https://omayo.blogspot.com/");
		
		Actions action = new Actions(driver);
		
		WebElement link = driver.findElement(By.linkText("onlytestingblog"));
		
		action.moveToElement(link).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
	
	}

}
