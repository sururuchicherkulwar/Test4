package ExcelTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel3 {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\DELL\\Desktop\\ExcelFilesSelenium\\Sheet.xlsx" ;
		FileInputStream file = new FileInputStream(path);
		
		String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		
		System.out.println("class");
		
	}
	
	
}
