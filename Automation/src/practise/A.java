package practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A {
	WebDriver driver;
	@BeforeMethod()
	void con() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
	}
	@Test()
	void goog() {
		
		driver.get("https://www.google.co.in/");
		driver.getCurrentUrl();
		driver.close();
		
	}
}
