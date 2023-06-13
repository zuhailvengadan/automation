package TestNgListners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseclass {

	WebDriver driver;
	@BeforeMethod
	public void config() {
		ChromeOptions p=new ChromeOptions();
		p.addArguments("--remote--allow-origins=*");	
		 driver= new ChromeDriver(p);
	}
	@AfterMethod()
	public void clos() {
		driver.close();
	}
}
