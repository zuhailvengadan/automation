package chapter3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datasaveOnExcel {

	public static void main(String[] args) throws IOException   {
		// TODO Auto-generated method stub
	
		   // TODO Auto-generated method stub
				FileInputStream file=new FileInputStream("./testresources/Testdata.xlsx");
				XSSFWorkbook wb=null;
				try {	
			
						wb=new XSSFWorkbook(file);
			    }
			    catch(Exception e) {
				e.printStackTrace();
			    }

				XSSFSheet s=wb.getSheet("sheet1");
				XSSFRow r=s.getRow(3);
				XSSFCell c=r.getCell(1);
				DataFormatter df=null;
			
				try{
					
					df=new DataFormatter();
				}
				catch(Exception e) {
					e.printStackTrace();
				}

			//	System.out.println(df.formatCellValue(c));
			    c.setCellValue(10);
			   FileOutputStream fos=new FileOutputStream("./testresources/Testdata.xlsx");
			wb.write(fos);
    
    

	}

}
