package chapter2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class calenderpopups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();

		options.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(options);
		driver.manage().window().maximize();
		
		
		
		driver.get("https://www.yatra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//	Alert a1=driver.switchTo().alert();
	//	a1.dismiss();
		driver.findElement(By.id("BE_flight_origin_date")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("18/06/2023")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
