package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ebaysearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(options);
	driver.get("https://www.ebay.com/");
	driver.findElement(By.id("gh-ac")).sendKeys("headphone");
	driver.findElement(By.id("gh-btn")).click();
	Thread.sleep(2000);
	driver.close();
	
	}

}
