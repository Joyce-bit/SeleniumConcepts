package org.cookies;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {

	public static void main(String[] args) {
		
		// Handling Cookies
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJ-M\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/");
		
		// Capture cookies from browser
		Set<Cookie> cookies = driver.manage().getCookies();
		int cookiesize = cookies.size();
		System.out.println("The size of the cookies : " + cookiesize );   // 3
		
		
		for(Cookie i : cookies) {
			
			System.out.println("Cookie Name : " + i.getName());
			System.out.println("Value of cookie : " + i.getValue());
			System.out.println("Path of cookie : " + i.getPath());
			System.out.println("Expire date of cookie : " + i.getExpiry());
			}
		
		// Add cookies  to the browser
		
		Cookie obj = new Cookie("Mcyookies", "12345");   // Cookie is class and object is created
		driver.manage().addCookie(obj);
		System.out.println("Size of the cookies after adding :  " + cookies.size());  // 4
		
		// Delete specific cookie from the browser
		//driver.manage().deleteCookie(obj);   // to delete the cookie by obj
		
		driver.manage().deleteCookieNamed("Mcyookies");  // to delete the cookie by name
		cookies = driver.manage().getCookies();
		System.out.println("The size of the after deleting cookie which is added  : " + cookies.size() );  // 3
		
		// Delete all cookies from the browser
		driver.manage().deleteAllCookies();
		cookies = driver.manage().getCookies();
		System.out.println("The size of the after deleting all the cookies : " + cookies.size() );  // 0
		
		driver.close();
	
}
}
