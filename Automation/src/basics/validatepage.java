package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class validatepage {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
WebDriver driver=new ChromeDriver(options);
driver.get("https://demo.actitime.com/");
driver.manage().window().maximize();
	
driver.findElement(By.id("username")).sendKeys("trainee");
driver.findElement(By.name("pwd")).sendKeys("trainee");
Thread.sleep(2000);
driver.findElement(By.id("loginButton")).click();
Thread.sleep(4000);
String  a=driver.getTitle();
System.out.println(a);
if (a.contains("Enter Time-Track")) {
	System.out.println("pass");
	
}
else
	System.out.println("fail");  
driver.close();
	

	
	
	
	}
	
}