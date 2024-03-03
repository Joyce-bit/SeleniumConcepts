package org.seleniumdatadrivenexcel;

import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDatatoExcel {
	
	public static void main(String[] args) throws IOException {
		// The path of file output stream will create a new excel file
		FileOutputStream file = new FileOutputStream("D:\\Personal\\Joyce\\Software Testing\\SDET- QA Automation Techie Mr Pavan\\Automation Testing\\Test1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet1 = workbook.createSheet("Dataset1");  // sheet1 is created in the workbook
		XSSFSheet sheet2 = workbook.createSheet("Dataset2");  // sheet2 is created in the workbook
		
		for(int i=0; i<=5;i++) {
			
			XSSFRow row1 = sheet1.createRow(i);    // 6 rows are created
			XSSFRow row2 = sheet2.createRow(i);   // 6 rows are created
			
			for(int j=0; j<=3; j++) {
				
				row1.createCell(j).setCellValue("xyz");  // value set in 4 cells in a row
				row2.createCell(j).setCellValue("abc");  // value set in 4 cells in a row
			}
		}
		workbook.write(file);
		file.close();
		System.out.println("Data is writtern");
	}

}
