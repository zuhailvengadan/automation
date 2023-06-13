package chapter2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();

		options.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(options);
		driver.manage().window().maximize();
		
		
		
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		Select s = new Select(dropdown);
		
		if (s.isMultiple())
		System.out.println("Multi select dropdown");
		else
		System.out.println("single select dropdown");
		
		
		s.selectByIndex(7);
		Thread.sleep(3000);
	s.selectByValue("search-alias=stripbooks-intl-ship");
	Thread.sleep(3000);
	s.selectByVisibleText("Digital Music");
	Thread.sleep(3000);
	
	driver.close();
			
		}
		
	}


