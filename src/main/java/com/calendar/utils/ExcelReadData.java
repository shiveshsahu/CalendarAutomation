package com.calendar.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadData {

	public static String TESTDATA_SHEET_PATH = "C:\\Users\\shivesh.sahu\\Desktop\\Calendar1.xlsx";

	private static XSSFWorkbook book;
	private static XSSFSheet sheet;
	private static XSSFCell Cell;
	//static Object[][] data;

	public static Object[][] getTestData(String sheetName) throws InvalidFormatException, IOException {
		//String[][] data = null;
		FileInputStream fis= new FileInputStream(TESTDATA_SHEET_PATH);
		book=new XSSFWorkbook(fis);
		sheet=book.getSheet(sheetName);
		//int totalRow = sheet.getPhysicalNumberOfRows();
		int totalRow = sheet.getLastRowNum()+1;
		int totalCol = sheet.getRow(0).getLastCellNum();
		System.out.println(totalRow);
		System.out.println(totalCol);
		Object[][] data = new Object[totalRow-1][totalCol];
		//data=new String[totalRow][totalCol];
		
		
		for (int i = 1; i <totalRow; i++) {
			for (int k = 0; k <totalCol; k++) {
				data[i-1][k] = getCellData(i, k);
				System.out.println(data[i-1][k]);
				//added to github
				
			}
		}
		
		return (data);

	}
	

	public static String getCellData(int totalRow, int totalCol) { 
		Cell =sheet.getRow(totalRow).getCell(totalCol); 
		String CellData = Cell.getStringCellValue();
  
		return CellData; 
	}
 
		
		
}
