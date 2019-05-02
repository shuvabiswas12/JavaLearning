package com.me;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Start {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		try {
			FileInputStream fileInputStream = new FileInputStream("2nd prof July 2017 Final.xls");
			
			
			// create workbook that refers to .xlsx file
			
			HSSFWorkbook hssfWorkbook = new HSSFWorkbook(fileInputStream);
			

			
			// create a sheet to retrive the sheet
			
			HSSFSheet sheet = hssfWorkbook.getSheetAt(1);
			
			
			// that is for evaluate cell type
			
			FormulaEvaluator formulaEvaluator = hssfWorkbook.getCreationHelper().createFormulaEvaluator();
			
			for(Row row : sheet) {
				for(org.apache.poi.ss.usermodel.Cell cell : row) {
					switch(formulaEvaluator.evaluateInCell(cell).getCellType()) {
					
					// if cell is a numeric format
					case org.apache.poi.ss.usermodel.Cell.CELL_TYPE_NUMERIC:
						System.out.print(cell.getNumericCellValue()+ "\t\t");
						break;
					
					// if cell is a string format
					case org.apache.poi.ss.usermodel.Cell.CELL_TYPE_STRING:
						System.out.print(cell.getStringCellValue()+ "\t\t");
						break;
					}
				}
				
				System.out.println();
			}
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
