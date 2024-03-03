package org.robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		//Robot Class with Key Events
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJ-M\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

		Robot robot = new Robot();
		driver.get("https://in.linkedin.com/");
		
		
		robot.keyPress(KeyEvent.VK_DOWN);  // to press the down arrow key
		robot.keyRelease(KeyEvent.VK_DOWN);  // to release the down arrow key
		Thread.sleep(2000);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_UP);  // to press the up arrow key
		robot.keyRelease(KeyEvent.VK_UP);  // to release the up arrow key
		
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_UP);
		robot.keyRelease(KeyEvent.VK_UP);
		
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
		
		// Robot Class with Mouse Events
		
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);  // to left click the mouse
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);  // to release the left click on the mouse
		
		Thread.sleep(2000);
		
		robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);  // to right click the mouse
		robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);  // to release the right click on the mouse
	
	}

}
