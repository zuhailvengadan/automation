package testNG;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class practice {
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		long time=Long.parseLong("5");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement more=driver.findElement(By.xpath("//div[@class='exehdJ']"));
		Actions a=new Actions(driver);
		a.moveToElement(more).perform();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("MoveAction(more)");
		
		
		
	//	driver.quit();
	}
}
