package chapter2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Screenshotofwindow {

	public static void main(String[] args) throws IOException {
		ChromeOptions options=new ChromeOptions();

		options.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(options);
		driver.manage().window().maximize();
		
		
		
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		TakesScreenshot t =(TakesScreenshot) driver;	
		File Screenshot = t.getScreenshotAs(OutputType.FILE);
		File dest= new File("./ElementScreenshot/amazon.png");
		FileUtils.copyFile(Screenshot,dest);
		
		driver.quit();
	}
	

}
