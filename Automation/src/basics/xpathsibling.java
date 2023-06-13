package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class xpathsibling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method st
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver =new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.bollymoviereviewz.com/2013/04/bollywood-box-office-collection-2013.html");
		driver.findElement(By.xpath("//b[contains(text(),'Pathaan')]/ancestor::tr/preceding-sibling::tr/../tr[8]/descendant::b[contains(text(),'John Wick 4')]")).click();
		
		
		Thread.sleep(3000);
		driver.close();
		

}
}