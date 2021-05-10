package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

public static void main(String[] args) throws IOException {
		
		//To give the path of the excel file where it has been stored
		File src = new File("C:\\Users\\hp-pc\\Desktop\\Test Data For Excel\\Book1.xlsx");
		
		// to load the excel file
		FileInputStream fis = new FileInputStream(src);
		
		// load the workbook or excel file
		XSSFWorkbook wb  = new XSSFWorkbook(fis);
		
		// to get the sheet from the workbook
		XSSFSheet sh1 = wb.getSheetAt(0);
		
		//To get the required value from the perticular row or column
		String value = sh1.getRow(2).getCell(0).getStringCellValue();
		
		System.out.println(value);//to print the value
		
				
}		
}
