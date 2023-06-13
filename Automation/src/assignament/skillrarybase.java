package assignament;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

public class skillrarybase    {
	
    WebDriver driver;
    skillraryPOM pom;
    

    
	@BeforeMethod
	public void coficlass() {
		ChromeOptions options=new ChromeOptions();

		options.addArguments("--remote-allow-origins=*");
	    driver =new ChromeDriver(options);
	    pom=new skillraryPOM(driver);
	   
	}
	
	@AfterClass
	public void confi() {
		driver.close();
	}
	
}
