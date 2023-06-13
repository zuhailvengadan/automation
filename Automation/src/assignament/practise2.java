package assignament;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class practise2 {

	@Test
	public void exe() {
		ChromeOptions i=new ChromeOptions();
		i.addArguments("--remote-allow-origin=*");
		WebDriver driver=new ChromeDriver(i);
		driver.get("https://www.google.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement z=driver.findElement(By.xpath("//iframe[@name='callout']"));
		
		
	    driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("iphone");
		List<WebElement> fr1=driver.findElements(By.xpath("//ul[@class='G43f7e']"));
             for (WebElement w : fr1) {
				System.out.println(w.getText());
			}
             fr1.get(4).click();
			driver.close();
		
	}
}
