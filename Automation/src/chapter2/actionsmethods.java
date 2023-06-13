package chapter2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class actionsmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(options);
		driver.manage().window().maximize();
		
		
		
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement kids=driver.findElement(By.xpath("//a[text()='Kids' and @data-group='kids']"));
	Actions a=new Actions(driver);
	a.moveToElement(kids).perform();
	driver.findElement(By.xpath("//a[text()='Soft Toys' and @class='desktop-categoryLink']")).click();
	
	WebElement h=driver.findElement(By.xpath("//div[@class='filter-summary-filter']"));
	if (h.getText().contains("Toys")) {
		System.out.println("pass");
	}	else 
			System.out.println("fail");
		driver.close();
	}


}
