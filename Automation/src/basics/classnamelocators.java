package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class classnamelocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeOptions options=new ChromeOptions();
options.addArguments("--remote-allow-origins=*");
WebDriver driver=new ChromeDriver(options);
driver.manage().window().maximize();
driver.get("https://www.flipkart.com/");

//String c= driver.getTitle();
//System.out.println(c);
driver.findElement(By.className("_2doB4z")).click();
driver.findElement(By.name("q")).sendKeys("iphones");
driver.findElement(By.className("_34RNph")).click();

List<WebElement> iphonelist= driver.findElements(By.className("_4rR01T"));

for (WebElement iphone : iphonelist) {
	String name=iphone.getText();
	System.out.println(name);
	}

	Thread.sleep(3000);
	driver.close();
}
	
	
	
	}


