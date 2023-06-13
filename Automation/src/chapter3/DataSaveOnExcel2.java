package chapter3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.plaf.basic.BasicArrowButton;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataSaveOnExcel2 {

	
	
	public static void main(String [] args) throws EncryptedDocumentException, IOException  {
		FileInputStream file = null;
			try {
				file=new FileInputStream("testresources/Testdata.xlsx");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Workbook wk=WorkbookFactory.create(file);
			
			//System.out.println(c);
		
			DataFormatter df=new DataFormatter();
			String d=df.formatCellValue(wk.getSheet("Sheet1").getRow(1).getCell(0));
			System.out.println(d);
			
		
	}
}
