package org.alerts;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithOK {
	
	public static void main(String[] args) {
		
		//Alert with only OK button
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJ-M\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
			
		driver.findElement(By.xpath("//a[normalize-space()='Alert with OK']")).click();
			
		driver.findElement(By.xpath("(//button[contains(text(),'click the button to display an')])[1]")).click();
		
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		
		driver.switchTo().alert().accept();
		
		System.out.println("Test Passed");
		
	}

}
