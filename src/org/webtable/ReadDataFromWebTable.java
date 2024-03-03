package org.webtable;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromWebTable {

	public static void main(String[] args) {
		
		//Reading data from Web Table
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJ-M\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("file:///D:/Personal/Joyce/Software%20Testing/SDET-%20QA%20Automation%20Techie%20Mr%20Pavan/Automation%20Testing/Products.html");
		
		// To count number of rows in a web table
		int rows = driver.findElements(By.xpath("html/body/table/tbody/tr")).size();
		System.out.println("Number of rows : " + rows);
		
		int column = driver.findElements(By.xpath("html/body/table/tbody/tr/th")).size();
		System.out.println("Number of columns : " + column);
		
		for(int i=2; i<=rows; i++) {   // Locating the second row
						
			for(int j=1; j<=column; j++) {
				String value = driver.findElement(By.xpath("html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print("  " + value);
			}
			
			System.out.println();
		}
	}
}
