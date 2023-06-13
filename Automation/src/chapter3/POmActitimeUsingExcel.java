package chapter3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class POmActitimeUsingExcel {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub

		Map <String,String> map=ActitimeLoginUsingExcel.readfromExcel();
		
		
		ChromeOptions options=new ChromeOptions();

		options.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(options);
   
		driver.manage().window().maximize();
		driver.get(map.get("url"));
		System.out.println(driver.getTitle());
		
		long time=Long.parseLong(map.get("time"));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		pomLoginPage login=new pomLoginPage(driver);
		
		if (login.getLogo().isDisplayed()) {
			System.out.println("login page is displayed");
		}
		else
			System.out.println("login page is not displayed");
		
		login.setUsername(map.get("username"));
		login.setpassword(map.get("password"));
		login.keepmeloggedin();
		login.clickLogin();
	
	    WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(time));
	    Boolean status=wait.until(ExpectedConditions.titleContains("actiTIME - Login"));

	    if (status) {
			System.out.println("pass");
		}
	    else
	    	System.out.println("fail");
	   driver.close();
	}

}
