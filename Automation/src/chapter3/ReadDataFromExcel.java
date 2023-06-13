package chapter3;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//convert physical file into java readable object
 
		FileInputStream fis = new FileInputStream("testresources/Testdata.xlsx");
	
		//step2:open workbook
		//workbookFactory.create(fis); throws EncryptedDocumentException, 
		Workbook wb=WorkbookFactory.create(fis);
		
		//Step 3: get control over sheet
		Sheet sh=wb.getSheet("sheet1");
		
		//step 4: get control over row 
		Row r=sh.getRow(1);
		
		//step 5: get control over cell
		Cell c=r.getCell(1);
		
		//step 6: get data from cell
		System.out.println(c.getStringCellValue());
		
		//step7: close Excel
		wb.close();
		
	
	 }

}
