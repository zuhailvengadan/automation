package chapter2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(options);
		driver.manage().window().maximize();		
		
		
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement block1=driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement block3=driver.findElement(By.xpath("//h1[text()='Block 3']"));
				
		Actions a=new Actions(driver);
		a.dragAndDrop(block1,block3).perform();
		Thread.sleep(3000);
		driver.close();
	}

}
