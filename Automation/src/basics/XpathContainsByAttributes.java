package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathContainsByAttributes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver =new ChromeDriver(options);
		driver.get("https://www.amazon.com");
	
	    driver.findElement(By.xpath("//img[contains(@alt,'Headset')]")).click();
	if (driver.getCurrentUrl().contains("gaming+headsets")) {
		System.out.println("yes");
	}
	else
		System.out.println();
	Thread.sleep(3000);
	driver.close();
	}

}
