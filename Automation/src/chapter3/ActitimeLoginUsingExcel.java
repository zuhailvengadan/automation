package chapter3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ActitimeLoginUsingExcel {

	public static void main(String[] args) throws IOException, InterruptedException {
	   // TODO Auto-generated method stub
		Map<String,String> map=readfromExcel();
    	ChromeOptions options=new ChromeOptions();

		options.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(map.get("url"));
        driver.findElement(By.id("username")).sendKeys(map.get("username"));
        driver.findElement(By.name("pwd")).sendKeys(map.get("password"));
        
	
        Thread.sleep(3000);
        driver.findElement(By.id("loginButton")).click();
	}

	public static Map<String,String> readfromExcel() throws FileNotFoundException,IOException{
		FileInputStream fil=new FileInputStream("./testresources/Testdata.xlsx") ;
		XSSFWorkbook wb=new XSSFWorkbook(fil);
		XSSFSheet s=wb.getSheet("sheet1");
			
		Map<String,String> map=new HashMap<>();
		DataFormatter df=new DataFormatter();
		for (int i = 0; i <= s.getLastRowNum(); i++) {
			
		String key=df.formatCellValue(s.getRow(i).getCell(0));
		String value=df.formatCellValue(s.getRow(i).getCell(1));
		
		map.put(key,value);
		}
		
		System.out.println(map);
		return map;
		
		
	
			
		}
		
		
		
		
	}
