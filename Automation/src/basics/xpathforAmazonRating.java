package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class xpathforAmazonRating {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver =new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("laptop");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//li[contains(@id,'p_89/ASUS')]/descendant::i")).click();
        driver.findElement(By.xpath("//span[text()='4 Stars & Up']")).click();
        Thread.sleep(3000);             
        driver.findElement(By.xpath("//span[text()='4 Stars & Up']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='4 Stars & Up']/following::section[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='4 Stars & Up']/following::section[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='4 Stars & Up']/following::section[3]")).click();
	    driver.close();
	}
}
