package basics;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class practic100 {
    public static void main (String[] args) throws InterruptedException {
    	ChromeOptions options=new ChromeOptions();
    	options.addArguments("--remote-allow-origin=*");
	WebDriver driver=new ChromeDriver(options);
	driver.get("https://skillrary.com/");

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement course=driver.findElement(By.xpath("//span[text()='GEARS']"));
	Actions a=new Actions(driver);
	a.moveToElement(course).perform();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//ul[contains(@class,'home_menu list-unstyled list-inline')]/li[3]/a")).click();
	driver.findElement(By.xpath("//ul[@class='dropdown-menu gear_menu']/li[7]/a")).click();
	System.out.println(driver.getCurrentUrl());
	driver.close();
	
	course.click();
	
	
	course.click();
	driver.close();
	
    }
 
	
} 



