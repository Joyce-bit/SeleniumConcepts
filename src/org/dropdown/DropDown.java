package org.dropdown;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJ-M\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		WebElement dropdown = driver.findElement(By.name("country"));
				
		Select select = new Select(dropdown);  //Select is a class in selenium that support the dropdown element
				
		boolean multiple = select.isMultiple();  // isMultiple method is used to check the duplicate values in the dropdrop list
		System.out.println(multiple);
				
		select.selectByValue("AUSTRALIA");  // selectByValue method is used to select the option in the web page
		
		List<WebElement> options = select.getOptions();   // getoption is used to get all the values of the dropdown element and store in the list
		
		int count = options.size();
		System.out.println("Number of options in dropdown : " + count);
				
		List list = new ArrayList();  // A new arraylist is created to hold all the values of the dropdown
		
		for(WebElement i:options) {  // for each loop is used to get the text values and save it in the arraylist
			
			list.add(i.getText());
		
		}
		System.out.println(list);  // Print the arraylist
		
		List templist = new ArrayList();   // New Arraylist to copy the existing list
		
		templist=list;
				
		Collections.sort(templist);  // Sorting the templlist
		
		System.out.println("after sorting the list : " + templist);
		
		if(list==templist) {  // if condition to check the sorted list
			
		System.out.println("Dropdown is sorted");
		}
		else
		{
			System.out.println("Dropdown is not sorted");
		
		}
	}

}
