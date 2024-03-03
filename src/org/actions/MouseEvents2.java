package org.actions;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvents2 {
		
	public static void main(String[] args) {
		
		// Click and Hold, move to element and release. drag and drop methods in Actions Class
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJ-M\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		Actions action = new Actions(driver);
		
		WebElement oslo = driver.findElement(By.id("box1"));
		//action.clickAndHold(oslo).perform();
		
		WebElement norway = driver.findElement(By.id("box101"));
		//action.moveToElement(norway).release().build().perform();
		
		action.dragAndDrop(oslo, norway);
	
	}

}
