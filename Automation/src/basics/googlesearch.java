package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class googlesearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
WebDriver driver=new ChromeDriver(options);
driver.get("https://www.google.com/");
//driver.manage().window().fullscreen();
driver.findElement(By.name("q")).sendKeys("abc");
driver.findElement(By.name("btnk")).click();
driver.close();

	}

}
