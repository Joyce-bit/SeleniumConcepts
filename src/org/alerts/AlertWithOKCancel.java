package org.alerts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithOKCancel {
	
	public static void main(String[] args) throws InterruptedException {
		
		// Alert with OK and CANCEL Button
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJ-M\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		
		String exptext1 = "You pressed Ok";
		String exptext2 = "You Pressed Cancel";
		
		driver.findElement(By.xpath("(//a[normalize-space()='Alert with OK & Cancel'])[1]")).click();
		
		driver.findElement(By.xpath("(//button[normalize-space()='click the button to display a confirm box'])[1]")).click();
		
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		
		// Handle alert with OK Button  -----> Scenario 1
		/*driver.switchTo().alert().accept();
		
		String actText1 = driver.findElement(By.xpath("(//p[@id='demo'])[1]")).getText();
		System.out.println(actText1);
		
		if(exptext1.equals(actText1)) {
			
			System.out.println("Test Passed");
		}
		else {
			
			System.out.println("Test Failed");
		}*/
		
		// Handle alert with Cancel button ----> Scenario 2
		
		driver.switchTo().alert().dismiss();
		
		String actText2 = driver.findElement(By.xpath("(//p[@id='demo'])[1]")).getText();
		System.out.println(actText2);
		
		if(exptext2.equals(actText2)) {
			
			System.out.println("Test Passed");
		}
		else {
			
			System.out.println("Test Failed");

		}

	}
}
