package basics;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class fetchingdatausingusermethods {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver =new ChromeDriver(options);
		
		long time=Long.parseLong(read("time"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));

		driver.get(read("url"));
	    driver.close();
	
	}

	public static String read(String key) throws IOException {
		FileInputStream data=null;

		try {
		   data=new FileInputStream("./basic/data.properties");
	   }
	   catch (Exception e) {
		   e.printStackTrace();
	   }
		Properties property= new Properties();
		
			property.load(data);
	
		return property.getProperty ("key");
		
	}

}
