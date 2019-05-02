import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import javax.swing.JFileChooser;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class SheetIterator {

	public static void main(String[] args) {
		
		JFileChooser fileChooser = new JFileChooser();
		int value = fileChooser.showOpenDialog(null);
		
		if (value == fileChooser.APPROVE_OPTION) {
			try {
				Workbook workbook = new HSSFWorkbook(new FileInputStream(fileChooser.getSelectedFile()));
				Sheet sheet = workbook.getSheetAt(0);
				
				for (Iterator<Row> rIterator = sheet.rowIterator(); rIterator.hasNext(); ) {
					Row row = rIterator.next();
					
					for (Iterator<Cell> cIterator = row.cellIterator(); cIterator.hasNext(); ) {
						Cell cell = cIterator.next();
						cell.setCellType(CellType.STRING);
						System.out.print(cell.getStringCellValue() + "\t");
					}
					System.out.println();
					
					/*// we can write a for each loop instead of for loop
					
					for (Row row2 : sheet) {
						for (Cell cell : row2) {
							cell.setCellType(CellType.STRING);
							System.out.print(cell.getStringCellValue()+ "\t");
						}
						System.out.println();
					}*/
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

}
