package org.waits;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitlyWaits {
	
	// Static Method created for Explicit waits to call for all the element	
	public static WebElement waitForElementPresent(WebDriver driver, By locator , int timeout ) {
		
		WebDriverWait exwait = new WebDriverWait(driver, Duration.ofSeconds(10));
		exwait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return driver.findElement(locator);
		
	}
	
	public static void main(String[] args) {
		
		// Main Method
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJ-M\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
				
		driver.findElement(By.xpath("(//textarea[@id='APjFqb'])[1]")).sendKeys("Selenium");
		driver.findElement(By.xpath("(//textarea[@id='APjFqb'])[1]")).sendKeys(Keys.ENTER);
		
		By elementlocator = By.xpath("(//h3[text() = 'Selenium'])[1]");
		
		waitForElementPresent(driver, elementlocator, 10).click();
		
	}


}
