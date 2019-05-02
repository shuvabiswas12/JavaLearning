package newTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class TestProject {

	public static void main(String[] args) {
		try {
			
			FileInputStream fileInputStream = new FileInputStream(new File("F:\\eclipse project\\Apache Poi Complete\\rotatory_Report.xls"));
			
			Workbook workbook = new HSSFWorkbook(fileInputStream);
			
			Sheet sheet1 = workbook.getSheetAt(0);
			
			// id and date row ----->>
	        Row id_date_row = sheet1.getRow(5);

	        Cell idCell = id_date_row.getCell(3);
	        int updateId = (int) idCell.getNumericCellValue();
	        updateId = 476;

	        Cell dateCell = id_date_row.getCell(16);
	        String updateDate = dateCell.getStringCellValue();
	        updateDate = "31/03/2018";



	        // doctor info row (name, finalProf) ------>>
	        Row doctor_info_row = sheet1.getRow(7);

	        Cell nameCell = doctor_info_row.getCell(1);
	        String updateName = nameCell.getStringCellValue();
	        updateName = "Pushpita";

	        Cell finalProfCell = doctor_info_row.getCell(9);
	        String updateFinalProf = finalProfCell.getStringCellValue();
	        updateFinalProf = "March, 2018";

	        // doctor info row (session date) ------>>
	        Row doctor_info_row_2 = sheet1.getRow(8);

	        Cell dateCell2 = doctor_info_row_2.getCell(5);
	        String updateDate2 = dateCell2.getStringCellValue();
	        updateDate2 = "31/03/2018";
	        
	        
	     // medicine row 1 ----->>
	        Row medicine_row_1 = sheet1.getRow(16);

	        Cell IMCellStart1 = medicine_row_1.getCell(0);
	        String updateIMStart1 = IMCellStart1.getStringCellValue();
	        updateIMStart1 = "31/03/2018";

	        Cell IMCellEnd1 = medicine_row_1.getCell(2);
	        String updateIMEnd1 = IMCellEnd1.getStringCellValue();
	        updateIMEnd1 = "31/03/2018";

	        Cell paediatricsCellStart = medicine_row_1.getCell(3);
	        String updatePaediatricsStart = paediatricsCellStart.getStringCellValue();
	        updatePaediatricsStart = "31/03/2018";

	        Cell skin_VD_CellStart = medicine_row_1.getCell(5);
	        String updateSkin_VDStart = skin_VD_CellStart.getStringCellValue();
	        updateSkin_VDStart = "31/03/2018";

	        Cell psychiatryCellStart = medicine_row_1.getCell(6);
	        String updatePsychiatryStart = psychiatryCellStart.getStringCellValue();
	        updatePsychiatryStart = "31/03/2018";

	        Cell cardiologyCellStart = medicine_row_1.getCell(8);
	        String updateCardiologyStart = cardiologyCellStart.getStringCellValue();
	        updateCardiologyStart = "31/03/2018";

	        Cell gastroenterologyCellStart = medicine_row_1.getCell(10);
	        String updateGastroenterologyStart = gastroenterologyCellStart.getStringCellValue();
	        updateGastroenterologyStart = "31/03/2018";

	        Cell nephrologyCellStart = medicine_row_1.getCell(12);
	        String updateNephrologyCellStart = nephrologyCellStart.getStringCellValue();
	        updateNephrologyCellStart = "31/03/2018";

	        Cell neuromedicineCellStart = medicine_row_1.getCell(14);
	        String updateNeuromedicineCellStart = neuromedicineCellStart.getStringCellValue();
	        updateNeuromedicineCellStart = "31/03/2018";



	        // medicine row 2 ----->>
	        Row medicine_row_2 = sheet1.getRow(17);

	        Cell IMCellStart2 = medicine_row_2.getCell(0);
	        String updateIMStart2 = IMCellStart2.getStringCellValue();
	        updateIMStart2 = "31/03/2018";

	        Cell IMCellEnd2 = medicine_row_2.getCell(2);
	        String updateIMEnd2 = IMCellEnd2.getStringCellValue();
	        updateIMEnd2 = "31/03/2018";

	        Cell paediatricsCellEnd = medicine_row_2.getCell(3);
	        String updatePaediatricsEnd = paediatricsCellEnd.getStringCellValue();
	        updatePaediatricsEnd = "31/03/2018";

	        Cell skin_VD_CellEnd = medicine_row_2.getCell(5);
	        String updateSkin_VDEnd = skin_VD_CellEnd.getStringCellValue();
	        updateSkin_VDEnd = "31/03/2018";

	        Cell psychiatryCellEnd = medicine_row_2.getCell(6);
	        String updatePsychiatryEnd = psychiatryCellEnd.getStringCellValue();
	        updatePsychiatryEnd = "31/03/2018";

	        Cell cardiologyCellEnd = medicine_row_2.getCell(8);
	        String updateCardiologyEnd = cardiologyCellEnd.getStringCellValue();
	        updateCardiologyEnd = "31/03/2018";

	        Cell gastroenterologyCellEnd = medicine_row_2.getCell(10);
	        String updateGastroenterologyEnd = gastroenterologyCellEnd.getStringCellValue();
	        updateGastroenterologyEnd = "31/03/2018";

	        Cell nephrologyCellEnd = medicine_row_2.getCell(12);
	        String updateNephrologyCellEnd = nephrologyCellEnd.getStringCellValue();
	        updateNephrologyCellEnd = "31/03/2018";

	        Cell neuromedicineCellEnd = medicine_row_2.getCell(14);
	        String updateNeuromedicineCellEnd = neuromedicineCellEnd.getStringCellValue();
	        updateNeuromedicineCellEnd = "31/03/2018";

			
			
			System.out.println("Sheet Compiled");
			
			
			
			
			
			idCell.setCellValue(updateId);
			nameCell.setCellValue(updateName);
			dateCell.setCellValue(updateDate);
			finalProfCell.setCellValue(updateFinalProf);
			dateCell2.setCellValue(updateDate2);
			
			
			// medicine to excel
	        IMCellStart1.setCellValue(updateIMStart1);
	        IMCellEnd1.setCellValue(updateIMEnd1);
	        IMCellStart2.setCellValue(updateIMStart2);
	        IMCellEnd2.setCellValue(updateIMEnd2);
	        paediatricsCellStart.setCellValue(updatePaediatricsStart);
	        paediatricsCellEnd.setCellValue(updatePaediatricsEnd);
	        skin_VD_CellStart.setCellValue(updateSkin_VDStart);
	        skin_VD_CellEnd.setCellValue(updateSkin_VDEnd);
	        psychiatryCellStart.setCellValue(updatePsychiatryStart);
	        psychiatryCellEnd.setCellValue(updatePsychiatryEnd);
	        cardiologyCellStart.setCellValue(updateCardiologyStart);
	        cardiologyCellEnd.setCellValue(updateCardiologyEnd);
	        gastroenterologyCellStart.setCellValue(updateGastroenterologyStart);
	        gastroenterologyCellEnd.setCellValue(updateGastroenterologyEnd);
	        nephrologyCellStart.setCellValue(updateNephrologyCellStart);
	        nephrologyCellEnd.setCellValue(updateNephrologyCellEnd);
	        neuromedicineCellStart.setCellValue(updateNeuromedicineCellStart);
	        neuromedicineCellEnd.setCellValue(updateNeuromedicineCellEnd);
			
			fileInputStream.close();
			
			FileOutputStream fileOutputStream = new FileOutputStream(new File("new_report.xls"));
			workbook.write(fileOutputStream);
			workbook.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
