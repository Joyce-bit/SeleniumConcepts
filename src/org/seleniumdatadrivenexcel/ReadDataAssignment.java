package org.seleniumdatadrivenexcel;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataAssignment {
	
	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream("D:\\Personal\\Joyce\\Software Testing\\SDET- QA Automation Techie Mr Pavan\\Automation Testing\\DataForSeleniumDataDriven.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);	
		
		XSSFSheet sheet = workbook.getSheet("Sheet2");
		
		int rowcount = sheet.getLastRowNum();
		System.out.println("Total rows in Sheet2 : " + rowcount);
		
		int cellcount = sheet.getRow(0).getLastCellNum();
		System.out.println("Total cells in one row : " + cellcount);
		
		for(int i = 0; i<rowcount; i++) {
			
			XSSFRow currentrow = sheet.getRow(i);
			for(int j = 0; j<cellcount; j++) {
				
				String value = currentrow.getCell(j).toString();
				System.out.print("  " + value);
			}
			
			System.out.println();
		}
	
	}
}
	