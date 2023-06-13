package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class xpathforamazoncheckbox {

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
		driver.findElement(By.xpath("//ul[@data-csa-c-content-id='3837712031']/descendant::i[2]")).click();
		driver.findElement(By.xpath("//ul[@data-csa-c-content-id='3837712031']/descendant::i[3]")).click();
		driver.findElement(By.xpath("//ul[@data-csa-c-content-id='3837712031']/descendant::i[4]")).click();
		driver.findElement(By.xpath("//ul[@data-csa-c-content-id='3837712031']/descendant::i[5]")).click();
		driver.findElement(By.xpath("//ul[@data-csa-c-content-id='3837712031']/descendant::i[6]")).click();
		driver.findElement(By.xpath("//ul[@data-csa-c-content-id='3837712031']/descendant::i[7]")).click();
		Thread.sleep(4000);
	//	driver.close();

	}

}
