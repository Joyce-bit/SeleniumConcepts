package org.waits;

import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import com.google.common.base.Function;

public class FluentWait {
	
	/*Error cannot be sorted out
	
	// Static method is created to apply fluent wait for each element
	public static WebElement waitForElementForFluentWait(WebDriver driver, final By locator) {
		
		Wait<WebDriver> fluwait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(30))
			       .pollingEvery(Duration.ofSeconds(5))
			       .ignoring(NoSuchElementException.class);
		
		WebElement element = fluwait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       return driver.findElement(locator);
		     }
		   });
		return element;
		
		}
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJ-M\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
			
		driver.findElement(By.xpath("(//textarea[@id='APjFqb'])[1]")).sendKeys("Selenium");
		driver.findElement(By.xpath("(//textarea[@id='APjFqb'])[1]")).sendKeys(Keys.ENTER);
		
		By elementlocator = By.xpath("(//h3[text() = 'Selenium'])[1]");
		
		waitForElementForFluentWait(driver, elementlocator);
	
	}*/
	
}
