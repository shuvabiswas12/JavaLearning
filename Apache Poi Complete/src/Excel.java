import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.WorkbookUtil;

public class Excel {

	public static void main(String[] args) {
		
		Workbook workbook = new HSSFWorkbook();
		
		
		
		
		/** Creating sheet in an xls file -------------------   */
		Sheet sheet1 = workbook.createSheet();
		Sheet pancake = workbook.createSheet("pancake");
		Sheet unknownSheet = workbook.createSheet(WorkbookUtil.createSafeSheetName("??765[]"));
		
		
		
		
		/** For creating an .xls file ------------------------------    */
		
		try {
			FileOutputStream outputFile = new FileOutputStream("Test1.xls");
			workbook.write(outputFile);
			outputFile.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
