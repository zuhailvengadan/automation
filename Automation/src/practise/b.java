package practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class b {
	WebDriver driver;
	@BeforeMethod()
	void con() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
	}
	@Test()
	void flip() {
		
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
	}

}
