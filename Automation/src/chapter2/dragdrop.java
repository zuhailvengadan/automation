package chapter2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class dragdrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver =new ChromeDriver(options);
	driver.manage().window().maximize();
	
	
	
	driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html\r\n");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	WebElement d1=driver.findElement(By.xpath("//h1[text()='Block 1']"));
	WebElement d4=driver.findElement(By.xpath("//h1[text()='Block 4']"));
	
	Actions a=new Actions(driver);
	a.dragAndDrop(d1,d4).perform();
	Thread.sleep(3000);
	driver.close();

}
}
