package org.authenticationpopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticatedPopup {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJ-M\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		//Syntax to handle authenticated popup
		//http://user:password@webpagelink
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		String text = driver.findElement(By.xpath("(//p[contains(text(),'Congratulations! You must have the proper credenti')])[1]")).getText();
		System.out.println(text);
		
	}

}
