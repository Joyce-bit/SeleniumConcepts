package org.brokenlinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJ-M\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("http://www.deadlinkcity.com/");
		
		List<WebElement>links = driver.findElements(By.tagName("a"));  // locate all the links and save it in list of webelement
		
		int brokenlinks = 0;
		
		for(WebElement element : links) {  // for each loop
			
			String url = element.getAttribute("href");  // get the attribute of each link using href save as string
				
			if(url==null || url.isEmpty()) {  // check if the links are null or empty using if condition
				
				System.out.println("URL is empty");
				continue;
			}
			
			URL link = new URL(url);  // import from java.net package  // create a object for URL class and pass all the attribute(url)
			
			try {  // surrond with try block
				HttpURLConnection httpcon = (HttpURLConnection) link.openConnection(); // create object for HttpURLConnection class to open the connection
				httpcon.connect();  // connect all open connection
				if(httpcon.getResponseCode()>=400)  // check if the respose code of the connection > = 400 
				{			
					System.out.println(httpcon.getResponseCode() + " is broken link ");  // print all the broken links
					brokenlinks++;  // increment a variable to count the broken links
				}
				else
				{
					System.out.println(httpcon.getResponseCode() + " Valid link ");  // print all the normal links
				}
			
			} catch(Exception e) {  // catch with the exception
				e.printStackTrace();
			}
		
		}
		
		System.out.println("No of broken links" + brokenlinks);
	
	}

}
