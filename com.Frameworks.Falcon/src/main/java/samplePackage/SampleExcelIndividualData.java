package samplePackage;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class SampleExcelIndividualData {
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("D:\\Selenium_Files\\IndividualData.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet1");
//		Row r = sh.getRow(1);
//		Cell c = r.getCell(3);
//		String value = c.getStringCellValue();
//		String value = sh.getRow(1).getCell(3).getStringCellValue();

		
		DataFormatter format = new DataFormatter();
		String value = format.formatCellValue(sh.getRow(3).getCell(0));
		System.out.println(value);
	}
}
