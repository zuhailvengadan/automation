package basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class frames {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();

		options.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(options);
		//driver.manage().window().maximize();
		
		
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement a=driver.findElement(By.xpath("//iframe[@name='packageFrame']"));
	driver.switchTo().frame(a);
		driver.findElement(By.className("interfaceName")).click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		driver.findElement(By.xpath("//a[text()='Help']")).click();
		
}

	
}


