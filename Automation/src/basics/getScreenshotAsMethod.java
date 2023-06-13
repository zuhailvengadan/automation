package basics;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class getScreenshotAsMethod {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(options);
		driver.manage().window().maximize();
		
		
		
		driver.get("https://www.swiggy.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement signUp=driver.findElement(By.xpath("//a[@class='r2iyh']"));
		File src= signUp.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ElementScreenshot/signUp.png");
		FileUtils.copyFile(src,dest);
		driver.close();
	}

}
