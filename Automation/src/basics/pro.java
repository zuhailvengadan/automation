package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class pro {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
Thread.sleep(2000);
driver.get("https://www.google.com/");
Thread.sleep(2000);
driver.get("https://www.flipkart.com/");
Thread.sleep(2000);
String a=driver.getTitle();
String b=driver.getCurrentUrl();
String c=driver.getPageSource();

driver.navigate().back();
Thread.sleep(2000);
driver.navigate().forward();
Thread.sleep(2000);
System.out.println(a);
System.out.println(b);
driver.close();
	}

}
