package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver =new ChromeDriver(options);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys("manager");
		driver.findElement(By.xpath("//td[@id=\"loginButtonContainer\"]")).click();
	
	Thread.sleep(3000);
	String d=driver.getCurrentUrl();
	System.out.println(d);
	if (d.contains("https://demo.actitime.com/user/submit_tt.do")) {
		System.out.println("yes validated");
		
		
	}
	else
	System.out.println("not valid");
	driver.close();
	
	}

}
