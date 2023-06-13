package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class xpathUsingforwardTrasversing {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			
			WebDriver driver =new ChromeDriver(options);
			driver.get("https://www.amazon.in/");
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
			driver.findElement(By.id("nav-search-submit-button")).click();
	
	       driver.findElement(By.xpath("//span[text()='//span[text()='Samsung Galaxy S23 5G (Cream, 8GB, 128GB Storage)']/../../../../div[3]/div/div/div/div/a/span/span[text()='₹74,998']")).click();
	       driver.close();

	
	}

}
