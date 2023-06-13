package chapter3;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeloginScript {

	public static void main(String[] args) throws InterruptedException   {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(readdata("url"));
		
		long time=Long.parseLong(readdata("time"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		//System.out.println(driver.getTitle());
		
	    driver.findElement(By.id("username")).sendKeys(readdata("user"));
	    driver.findElement(By.name("pwd")).sendKeys(readdata("password"));
	    driver.findElement(By.id("loginButton")).click();
	    
	    WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(time));
	    Boolean status=wait.
	    until(ExpectedConditions.titleContains("actiTIME - Login"));
	    if (status) {
	    	System.out.println("pass");
			
		}
	    else
	    	System.out.println("fail");
	    
	    Thread.sleep(3000);
	    driver.close();
		
	}
		public static String readdata(String key)  {
			String path="./testresources/data.properties";
			FileInputStream file=null;
			try{
				file=new FileInputStream(path);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			Properties pro=new Properties();
			try{
				pro.load(file);
			}
			catch(Exception a) {
				a.printStackTrace();
			}
			//String d=pro.getProperty(key);
			//System.out.println(d);
			return pro.getProperty(key);
			
		

	}

}
