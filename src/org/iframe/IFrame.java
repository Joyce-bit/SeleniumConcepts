package org.iframe;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Handle iframe by switch method
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJ-M\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.findElement(By.xpath("(//a[normalize-space()='Single Iframe'])[1]")).click();
		
		driver.switchTo().frame("singleframe");
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("demo");
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//a[normalize-space()='Iframe with in an Iframe'])[1]")).click();
		
		Thread.sleep(3000);
				
		WebElement outerframe = driver.findElement(By.xpath("//*[@id='Multiple']/iframe"));
		
		driver.switchTo().frame(outerframe);
		
		Thread.sleep(3000);
		
		WebElement innerframe = driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/iframe[1]"));
		
		driver.switchTo().frame(innerframe);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("demodemo");
		
	}

}
