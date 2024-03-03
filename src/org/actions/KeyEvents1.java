package org.actions;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyEvents1 {
	
	public static void main(String[] args) {
		
		// send keys, pause and click methods
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJ-M\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		Actions action = new Actions(driver);
		
		driver.findElement(By.id("input-firstname")).sendKeys("joe");
		
		action.sendKeys(Keys.TAB).pause(Duration.ofSeconds(1))
			.sendKeys("sam")
			.sendKeys(Keys.TAB).pause(Duration.ofSeconds(1))
			.sendKeys("abc@gmail.com")
			.sendKeys(Keys.TAB).pause(Duration.ofSeconds(1))
			.sendKeys("123456789")
			.sendKeys(Keys.TAB).pause(Duration.ofSeconds(1))
			.sendKeys("12345")
			.sendKeys(Keys.TAB).pause(Duration.ofSeconds(1))
			.sendKeys("12345")
			.sendKeys(Keys.TAB).pause(Duration.ofSeconds(1))
			.sendKeys(Keys.TAB).pause(Duration.ofSeconds(1))
			.sendKeys(Keys.TAB).pause(Duration.ofSeconds(1))
			.sendKeys(Keys.SPACE)
			.sendKeys(Keys.TAB).pause(Duration.ofSeconds(1))
			.sendKeys(Keys.ENTER)
			.build().perform();
	
	}

}
