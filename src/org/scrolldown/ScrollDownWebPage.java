package org.scrolldown;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownWebPage {
	
	// Scroll the web page in three methods
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJ-M\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		driver.manage().window().maximize();
		
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		
		//1. scrolling by using pixel
		JavascriptExecutor js = (JavascriptExecutor) driver;   // JavascriptExecutor is an interface in selenium
		js.executeAsyncScript("window.scrollBy(0, 1000)", "");		
	
		// 2. Scrolling the page till we find the element
		WebElement india = driver.findElement(By.xpath("//*[@id='content']/div[2]/div[2]/table[1]/tbody/tr[86]/td[1]/img"));
		js.executeScript("arguments[0].scrollIntoView();", india);
	
		
		//3. Scroll page till bottom
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	

}

