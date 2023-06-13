package testngCrossbrowsrparallelExecu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class baseclass {

	protected WebDriver driver;
	
	@Parameters("Browser")
	
	@BeforeMethod
	

	
	
	public void ClassConfig(String browser) {
		switch (browser) {
		case "firefox":driver=new FirefoxDriver();
		break;
		case "Chrome":driver=new ChromeDriver();
		break;
		case "Edge":System.setProperty("WebDriver.edge.driver","./msedgedriver.exe");
		break;
		default :System.out.println("invalid browser");
	
		 
		}
		//driver.manage().window().maximize();
	}
		
		@AfterMethod
		public void Classteardown() {
			driver.close();
		}
		
	}

