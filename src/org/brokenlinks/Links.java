package org.brokenlinks;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {
		
		// Handling Links with Selenium
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJ-M\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
	
		//driver.findElement(By.linkText("Today's Deals")).click();
		// driver.findElement(By.partialLinkText("Today's")).click(); // to locate the link in the web page and click on
		
		List <WebElement> links = driver.findElements(By.tagName("a"));  // capture all the links in the web page
		
		System.out.println(links.size());  // print number of links in the web page
		
		//Normal for loop
		/*for(int i=0; i<links.size(); i++) {
			
			System.out.println(links.get(i).getText());   // get the name of the link
			System.out.println(links.get(i).getAttribute("href"));  // get the href attribute
			
		}*/
		
		// For each loop
		for(WebElement i : links) {
			
			System.out.println(i.getText());
			System.out.println(i.getAttribute("href"));
			
		}
	
	}

}
