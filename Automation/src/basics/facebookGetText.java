package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class facebookGetText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver =new ChromeDriver(options);
		driver.get("https://www.google.com");
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		String header=driver.findElement(By.xpath("//h2[contains(text(),'Facebook')]")).getText();
	
		System.out.println(header);
		Thread.sleep(3000);
		driver.close();
	
	
	}

}
