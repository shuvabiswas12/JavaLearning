import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.omg.CORBA.ShortHolder;

public class RowAndCell {

	public static void main(String[] args) {
		
		Workbook workbook = new HSSFWorkbook();
		
		Sheet sheet1 = workbook.createSheet("RowAndCell.xls"); // creating an xls file
		
		/** creating row and then cell in an xls file ----------------------- */
		Row row = sheet1.createRow(0);
		Cell cell = row.createCell(3); // A=0, B=1, C=2, D=3
		cell.setCellValue("Hi There");
		
		
		
		/** -----------------  we can also write as this in one line --------------*/
		// Cell cell = sheet1.createRow(0).createCell(3);
		
		
		/** To print the data from xls file ---------------- */
		System.out.println(cell.getRichStringCellValue().toString());
		
		
		
		
		try {
			FileOutputStream outputStream = new FileOutputStream("newFile.xls");
			workbook.write(outputStream);
			outputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
