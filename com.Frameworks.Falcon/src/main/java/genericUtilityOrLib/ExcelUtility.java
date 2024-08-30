package genericUtilityOrLib;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	public static String readDataFromExcel(String sheetName, int rowNum, int cellNum) throws EncryptedDocumentException, IOException {
	
	FileInputStream fis = new FileInputStream(IconstantUtility.excelPath);
	Workbook book = WorkbookFactory.create(fis);
	Sheet sh = book.getSheet(sheetName);
	DataFormatter format = new DataFormatter();
	String value = format.formatCellValue(sh.getRow(rowNum).getCell(cellNum));
	return value;
	}
	
}
