package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathbyTrasversing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver =new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
 Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='card-body px-0 text-center']/../../../div[2]/div/div[2]/p[4]/a")).click();
	}

}
