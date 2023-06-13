package chapter2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class buttonverify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(options);
		driver.manage().window().maximize();
		
		
		
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement button=driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
		
		if (button.isEnabled()) {
			System.out.println("yes enabled");
		}
			else
				System.out.println("not enabled");
	
			
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("hai");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12dsfas3");
		if (button.isEnabled()) {
			System.out.println("yes");
			button.click();
			
		}
		else
			System.out.println("no");
			driver.close();
		}
}

	

