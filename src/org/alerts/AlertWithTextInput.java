package org.alerts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithTextInput {
	
	public static void main(String[] args) {
		
		// Alert with Text input box and buttons OK, Cancel
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJ-M\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		String exptext1 = "Hello Joe How are you today";
		String exptext2 = "";
		
		
		driver.findElement(By.xpath("(//a[normalize-space()='Alert with Textbox'])[1]")).click();
		
		driver.findElement(By.xpath("(//button[normalize-space()='click the button to demonstrate the prompt box'])[1]")).click();
		
		// Handle alert by sending keys into text input box and cick on OK -------> Scenario 1
		
		/*driver.switchTo().alert().sendKeys("Joe");
		
		driver.switchTo().alert().accept();
		
		String acttext = driver.findElement(By.xpath("(//p[@id='demo1'])[1]")).getText();
		
		if(exptext.equals(acttext)) {
			
			System.out.println("Test Passed");
		}
		else {
			
			System.out.println("Test Failed");
		}*/
		
		// Handle alert by clicking on cancel without keys -------> Scenario 1
		
		driver.switchTo().alert().dismiss();
		
		String acttext2 = driver.findElement(By.xpath("(//p[@id='demo1'])[1]")).getText();
		
		if(exptext2.equals(acttext2)) {
			
			System.out.println("Test Passed");
		}
		else {
			
			System.out.println("Test Failed");
		}
		
	
	}

}
