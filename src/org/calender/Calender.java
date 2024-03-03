package org.calender;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJ-M\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElement(By.id("datepicker")).click();
		
		String currentmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		
		String currentyear = driver.findElement(By.className("ui-datepicker-year")).getText();
		
		while(!(currentmonth.equals("July")&& currentyear.equals("2024"))) {
			driver.findElement(By.xpath("//a[@data-handler='next']")).click();
			currentmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
			currentyear = driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		
		driver.findElement(By.xpath("//td[@data-handler='selectDay']/a[text()='5']")).click();
	
	}

}
