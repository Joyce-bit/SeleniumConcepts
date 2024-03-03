package org.webtable;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadAllDataFromWebTable {
	
	public static void main(String[] args) {
		
		//Read all the data from a web table
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJ-M\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://w3schools.com/html/html_tables.asp");
		driver.findElements(By.xpath("//table[@id='customers']"));
		
		int rows = driver.findElements(By.xpath("(//table[@id='customers'])[1]/tbody/tr")).size();
		System.out.println("Total Number of rows : " + rows);
		
		int columns = driver.findElements(By.xpath("(//table[@id='customers'])[1]/tbody/tr/th")).size();
		System.out.println("Total number of columns : " + columns);
		
			
		driver.close();
		
		for(int i=1; i<=rows; i++) {
			
			String values = driver.findElement(By.xpath("//table[@id='customers'])[1]/tbody/tr["+i+"]/")).getText();
			System.out.println("  " + values);
		}
	}
}


