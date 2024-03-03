package org.locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJ-M\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.automationpractice.pl/index.php");
		
		// ID and Name Locators
		WebElement search = driver.findElement(By.id("search_query_top"));
		search.sendKeys("t-shirts");
		
		WebElement searchbtn = driver.findElement(By.name("submit_search"));
		searchbtn.click();
		
		// LinkText locator
		driver.findElement(By.linkText("Blouse")).click();
		
		// Tag name locator
		int links = driver.findElements(By.tagName("a")).size();
		System.out.println(links);
		
		// class name locator
		int sliders = driver.findElements(By.className("homeslider-container")).size();
		System.out.println(sliders);
		
		
	}

}
