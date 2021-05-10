package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class C {
	public class ExcelReader {

		public String readData(int row, int column, String filename) throws IOException {

			// to get the path of the variable and let the java know about it
			// File src = new File("C:\\Users\\A\\Desktop\\SampleTestData.xlsx");

			File src = new File(System.getProperty("user.dir")+"//Test Data For Excel//Book1.xlsx");
			// to load the file																																													
		
			FileInputStream fis = new FileInputStream(src);

			// load the workbook or excel file
			XSSFWorkbook wb = new XSSFWorkbook(fis);

			// to get the sheet from the workbook
			XSSFSheet sh1 = wb.getSheetAt(0);

			
			// if we wants to get the numeric value
			 CellType type = sh1.getRow(row).getCell(column).getCellType();
	String value = "";
			 if(type==CellType.NUMERIC)
			 {
				double number = sh1.getRow(row).getCell(column).getNumericCellValue();
				
				int intnumber = (int)number;
				
				value = String.valueOf(intnumber);
			 }
			 else
			 {
				 value = sh1.getRow(row).getCell(column).getStringCellValue();
			 }
			 
			// sh1.getRow(row).getCell(column).getNumericCellValue();

			System.out.println(value);

			return value;

		}
	}
}