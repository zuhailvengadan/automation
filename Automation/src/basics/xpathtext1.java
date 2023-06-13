package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class xpathtext1 {
	public static void main(String[] args) throws InterruptedException {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	
	WebDriver driver =new ChromeDriver(options);
	driver.get("https://demo.actitime.com/login.do");
	
	driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
	Thread.sleep(6000);
	driver.findElement(By.xpath("//a[text()='Return to login page']")).click();
Thread.sleep(6000);
//driver.close();
	
}
}
