package org.seleniumdatadrivenexcel;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PassVaueFromExcelToWebpage {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJ-M\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
				
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
		
		FileInputStream file = new FileInputStream("D:\\\\Personal\\\\Joyce\\\\Software Testing\\\\SDET- QA Automation Techie Mr Pavan\\\\Automation Testing\\\\DataForSeleniumDataDriven.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("simpleinterest");
		
		int rowcount = sheet.getLastRowNum();
		System.out.println("Total number of rows : " + rowcount);
		
		int cellcount = sheet.getRow(0).getLastCellNum();
		System.out.println("Total number of cell in a single row : " + cellcount);
		
		for(int i=0; i<rowcount; i++) {
			
			XSSFRow row = sheet.getRow(i);
			
			XSSFCell prin = row.getCell(0);	
			int principle = (int) prin.getNumericCellValue();  // type casting
			
			XSSFCell roi = row.getCell(1);	
			int rateofinterest = (int) roi.getNumericCellValue();
			
			XSSFCell per = row.getCell(2);	
			int period = (int) per.getNumericCellValue();
			
			XSSFCell fre = row.getCell(3);	
			String freq = fre.getStringCellValue();
			
			XSSFCell matval = row.getCell(4);	
			int maturityvalue = (int) matval.getNumericCellValue();
			
			
			driver.findElement(By.id("principal")).sendKeys(String.valueOf(principle));
			driver.findElement(By.id("interest")).sendKeys(String.valueOf(rateofinterest));
			driver.findElement(By.id("tenure")).sendKeys(String.valueOf(period));
			
			Select periodin = new Select (driver.findElement(By.id("tenurePeriod")));
			periodin.selectByVisibleText("year(s)");
			
			Select frequency = new Select (driver.findElement(By.id("frequency")));
			frequency.selectByVisibleText(freq);
			
			driver.findElement(By.xpath("//body[1]/div[12]/div[2]/div[1]/div[5]/div[1]/div[1]/div[3]/form[1]/div[2]/a[1]/img[1]")).click();
			
			String actual_mvalue = driver.findElement(By.xpath("//body[1]/div[12]/div[2]/div[1]/div[5]/div[1]/div[1]/div[4]/div[1]/div[2]/span[2]/strong[1]")).getText();
			
			if(Double.parseDouble(actual_mvalue) == maturityvalue){
				
				System.out.println("Test Passed");
			}
			else
			{
				System.out.println("Test failed");
			}
			
			driver.findElement(By.xpath("//body[1]/div[12]/div[2]/div[1]/div[5]/div[1]/div[1]/div[3]/form[1]/div[2]/a[2]/img[1]")).click();
		
		}
	
	}
}
