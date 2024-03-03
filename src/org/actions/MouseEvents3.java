package org.actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvents3 {

	
	public static void main(String[] args) {

		// Resizing the element using drag and drop by method
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJ-M\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		driver.get("https://jqueryui.com/resizable/");
		
		Actions action = new Actions(driver);
		
		WebElement frameele = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frameele);
		
		WebElement resize = driver.findElement(By.xpath("//body[1]/div[1]/div[3]"));
		
		action.dragAndDropBy(resize, 100, 100).perform();
		
	}
}
