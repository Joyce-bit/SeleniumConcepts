package org.javascriptexecutor;

import java.io.File;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DrawBorder extends ParentClass{
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJ-M\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://demo.nopcommerce.com");
		
		WebElement logo = driver.findElement(By.xpath("(//img[@alt='nopCommerce demo store'])[1]"));
		System.out.println("element is located");
		Thread.sleep(5000);
		
		ParentClass ps = new ParentClass();
		ps.drawBorder(logo, driver);
		System.out.println("method called");
		Thread.sleep(5000);
			
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(".\\screenshots\\logo.png");
		//FileUtils.copyFile(source, target);
		System.out.println("screenshot taken");
		
		Thread.sleep(5000);
	}

}
