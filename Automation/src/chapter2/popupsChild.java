package chapter2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class popupsChild {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				ChromeOptions options=new ChromeOptions();

				options.addArguments("--remote-allow-origins=*");
				WebDriver driver =new ChromeDriver(options);
				driver.manage().window().maximize();
				
				
				
				driver.get("https://www.flipkart.com/");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				WebElement searchTf=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
				searchTf.click();
				driver.findElement(By.name("q")).sendKeys("iphone");
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				
				driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Blue, 128 GB)']")).click();
				String parentid=driver.getWindowHandle();
				Set <String> ids=driver.getWindowHandles();
				for (String id : ids) {
					
					driver.switchTo().window(id);
				}
				String rating=driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[2]/div/div[2]/div/div/span[1]/div")).getText();
				System.out.println(rating);
				driver.close();
				
				driver.switchTo().window(parentid);
				Thread.sleep(3000);
				searchTf.clear();
				searchTf.sendKeys("smart watches");
				driver.findElement(By.xpath("//button[@type='submit']")).click();

				Thread.sleep(3000);
				driver.close();

				
	}

}
