package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException {
		
		File src = new File(System.getProperty("user.dir")+"//Test Data For Excel//Book1.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh1 = wb.getSheetAt(0);
		
		File fout = new File(System.getProperty("user.dir")+"//Test Data For Excel//Book1.xlsx");
		
		FileOutputStream fo = new FileOutputStream(fout);
		
		//To write the data into the the perticular row and column of the excel 
		sh1.getRow(4).getCell(1).setCellValue("new value");
		sh1.getRow(5).getCell(1).setCellValue("new value 1");
		
		//For creating new row and column into excel sheet and and write perticular data into it
		sh1.createRow(11).createCell(2).setCellValue("www");		
		
		wb.write(fo);//to execute write command into the workbook
		
		
		
	}
}
