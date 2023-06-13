package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class cssSelector2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();


driver.findElement(By.cssSelector("input[data-testid=royal_email]")).sendKeys("zuhail.gmail.com");
driver.findElement(By.cssSelector("#pass")).sendKeys("1234");
driver.findElement(By.className("_42ft")).click();
Thread.sleep(3000);
driver.close();
	}

}
