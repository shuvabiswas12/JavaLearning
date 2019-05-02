import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;

public class FormattingCells {

	public static void main(String[] args) {
		
		Workbook workbook = new HSSFWorkbook();
		
		Sheet sheet = workbook.createSheet("FormattingCells");

		Cell cell = sheet.createRow(0).createCell(0);
		
		
		/** resize row and column width and height */
		cell.getRow().setHeightInPoints(30);
		sheet.setColumnWidth(0, 7000);
		
		/**  Resizing & Merging Cells */
		sheet.addMergedRegion(new CellRangeAddress(/**row*/0, 4, /**column*/ 0, 3));
		
		
		/** Create cell style */
		CellStyle style = workbook.createCellStyle();
		style.setFillForegroundColor(IndexedColors.BLUE.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		style.setBorderBottom(BorderStyle.THICK);
		style.setBottomBorderColor(IndexedColors.GREEN.getIndex());
		
		style.setAlignment(HorizontalAlignment.CENTER);
		style.setVerticalAlignment(VerticalAlignment.CENTER);
		
		/** create font */
		Font font = workbook.createFont();
		font.setColor(IndexedColors.YELLOW.getIndex());
		font.setBold(true);
		font.setFontHeightInPoints((short)16);
		font.setUnderline(Font.U_DOUBLE);
		font.setFontName("roboto");
		
		style.setFont(font);
		
		/** Set up the created style */
		cell.setCellStyle(style);
		cell.setCellValue("Scrambled Egg");
	
		
		
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("formattingCells.xls");
			workbook.write(fileOutputStream);
			workbook.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
