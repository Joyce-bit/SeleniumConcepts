package org.actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvent1 {

	public static void main(String[] args) {
		
		// Drag and Drop By Method in Actions Class
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJ-M\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		Actions action = new Actions(driver);
		driver.get("https://practice.expandtesting.com/horizontal-slider");
		WebElement slider = driver.findElement(By.xpath("(//input[@value='0'])[1]"));
		
		
		
		int xOffset = 10;
		int yOffset = 0;
		action.dragAndDropBy(slider, xOffset , yOffset) .perform();	
		
	}
}
