package testngCrossbrowsrparallelExecu;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class parallelmethod {

	@BeforeMethod
	void driv() {
		ChromeOptions option=new ChromeOptions();
	    option.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(option);
	
	}
	
	
	WebDriver driver;
	@Test()
	void logo() throws InterruptedException {
		 
		driver.get("https://www.google.com/");
				
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}
	@Test()
	void search() throws InterruptedException {
		driver.get("https://www.amazon.com/");
		System.out.println(driver.getTitle());
		driver.close();
	}
	@AfterMethod
	
	void teardown() throws InterruptedException {
		Thread.sleep(3000);
	}
}
