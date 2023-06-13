package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class DependencyBtwMethod {
	@Test
	public void ActitimeNavigate() {
		
		ChromeOptions options=new ChromeOptions();

		options.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement logo=driver.findElement(By.className("atLogoImg"));
		
		if (logo.isDisplayed()) {
			System.out.println("pass");
			
		}
		else
			System.out.println("fail");
		driver.close();
	}
	
	@Test(dependsOnMethods = "ActitimeNavigate")
	public void loginActi() throws InterruptedException {
		ChromeOptions options=new ChromeOptions();

		options.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("admin"+Keys.TAB+"manager"+Keys.ENTER);
		
		Thread.sleep(3000);
		driver.close();
	}
	
	
}
