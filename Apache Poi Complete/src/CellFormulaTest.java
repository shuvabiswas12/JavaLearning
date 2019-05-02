import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class CellFormulaTest {

	public static void main(String[] args) {
		Workbook workbook = new HSSFWorkbook();
		
		Sheet sheet = workbook.createSheet("CellFormula");
		
		Cell cell1 = sheet.createRow(0).createCell(0); // A1
		Cell cell2 = sheet.createRow(0).createCell(1); // B1
		Cell cell3 = sheet.createRow(0).createCell(2); // C1
		Cell cell4 = sheet.createRow(0).createCell(3); // D1
		Cell cell5 = sheet.createRow(0).createCell(4); // E1
		
		cell1.setCellValue(20);
		cell2.setCellValue(10);
		cell3.setCellValue(30);
		cell4.setCellValue(70);
		cell5.setCellFormula("SUM(A1:D1)");
		
		
		try {
			FileOutputStream uStream = new FileOutputStream("CellFormula.xls");
			workbook.write(uStream);
			uStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
