package chapter2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class getcssmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(options);
		driver.manage().window().maximize();
		
		
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement createAccount=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
	System.out.println(createAccount.getCssValue("font"));
	System.out.println(createAccount.getCssValue("color"));
	System.out.println(createAccount.getCssValue("background-color"));
	driver.close();
	
	
	}

}
