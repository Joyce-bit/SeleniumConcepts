package org.locators;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxes {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJ-M\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		
		//Self - Select the current node
		String text = driver.findElement(By.xpath("//a[contains(text(),'Fineotex Chemical Lt')]/self::a")).getText();
		System.out.println(text);
		
		// Parent - Select the parent of the current node
		String txt = driver.findElement(By.xpath("//a[contains(text(),'Fineotex Chemical Lt')]/parent::td")).getText();
		System.out.println(txt);
		
		// Child
		List<WebElement> child = driver.findElements(By.xpath("//a[contains(text(),'Fineotex Chemical Lt')]/ancestor::tr/child::td"));
		System.out.println("Number of child elements : " + child.size());
		
		//Ancestor
		String tx = driver.findElement(By.xpath("//a[contains(text(),'Fineotex Chemical Lt')]/ancestor::tr")).getText();
		System.out.println(tx);
		
		//Descendant
		List<WebElement> des = driver.findElements(By.xpath("//a[contains(text(),'Fineotex Chemical Lt')]/ancestor::tr/descendant::*"));
		System.out.println("Number of Descendant nodes are : " + des.size());
		
		//Following - Select everything in the document after the closing tag of the current node
		List<WebElement> fol = driver.findElements(By.xpath("//a[contains(text(),'Fineotex Chemical Lt')]/ancestor::tr/following::tr"));
		System.out.println("Number of following nodes are : " + fol.size());
		
		// Following-Siblings - Select all the siblings after the current node
		List<WebElement> fsib = driver.findElements(By.xpath("//a[contains(text(),'Fineotex Chemical Lt')]/ancestor::tr/following-sibling::tr"));
		System.out.println("Number of following siblings nodes are : " + fsib.size());
		
		// Preceding - Selects all nodes that appear before the current node in the document
		List<WebElement> pre = driver.findElements(By.xpath("//a[contains(text(),'Fineotex Chemical Lt')]/ancestor::tr/preceding::tr"));
		System.out.println("Number of Preceding nodes are : " + pre.size());
		
		//Preceding-Siblings - Select all siblings before the current node
		List<WebElement> presib = driver.findElements(By.xpath("//a[contains(text(),'Fineotex Chemical Lt')]/ancestor::tr/preceding-sibling::tr"));
		System.out.println("Number of Preceding Siblings nodes are : " + presib.size());
	
	}

}
