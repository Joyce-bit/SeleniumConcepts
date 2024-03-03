package org.seleniumdatadrivenexcel;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.*;

public class ReadDataFromExcel {
	
	public static void main(String[] args) throws IOException {
				
		FileInputStream file = new FileInputStream("D:\\Personal\\Joyce\\Software Testing\\SDET- QA Automation Techie Mr Pavan\\Automation Testing\\DataForSeleniumDataDriven.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");  // sheet name
		
		// XSSFSheet sheet = workbook.getSheetAt(0);  sheet index number starts from 0
		
		// getLastRowNum method is used to cound the number of rows from a sheet
		int rowcount = sheet.getLastRowNum();
		System.out.println("Total number of rows : " + rowcount);
		
		// getrow and getLastCellNum methods will get all the value from a row
		int cellcount = sheet.getRow(0).getLastCellNum();
		System.out.println("Total number of cell in one row  " + cellcount);
		
		for (int i=0; i<rowcount; i++) {
			
			XSSFRow currentrow = sheet.getRow(i);  // current row
			
			for(int j=0; j<cellcount; j++) {
				
				String value = currentrow.getCell(j).toString(); // read the value from a cell
				System.out.print(" " + value);
			}
			System.out.println();
		}
	}

}
