package ExcelTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel1 {
public static void main(String[] args) throws EncryptedDocumentException, IOException  {
	
String path ="C:\\Users\\DELL\\Desktop\\ExcelFilesSelenium\\velocity.xls";
FileInputStream file = new FileInputStream(path);

String data= WorkbookFactory.create(file)
.getSheet("velocity")
.getRow(1)
.getCell(1)
.getStringCellValue();
System.out.println("class");
	
	
	
	
	
}
}
