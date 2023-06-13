package chapter2;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class rightclickwithRobot {

	public static void main(String[] args) throws AWTException, InterruptedException  {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(options);	
		driver.manage().window().maximize();
		
		
		
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.className("a-button-input")).click();

		WebElement today=driver.findElement(By.xpath("//a[@class='nav-a  '][1]"));
		Actions a=new Actions(driver);
		a.contextClick(today).perform();
	    Thread.sleep(3000);	
		Robot b=new Robot();
		b.keyPress(KeyEvent.VK_RIGHT);
		b.keyRelease(KeyEvent.VK_RIGHT);
		b.keyPress(KeyEvent.VK_DOWN);
		b.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		b.keyPress(KeyEvent.VK_ENTER);
		b.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
	//	driver.close();
		
	}

}
