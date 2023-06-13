package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class xpathforDelcheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver =new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/s?k=laptop&crid=2MG8P7IBU19JX&sprefix=laptop%2Caps%2C462&ref=nb_sb_noss_1");
	driver.findElement(By.xpath("//b[contains(text(),'Pathaan')]/ancestor::tr/following-sibling::tr/td/a/b[contains(text(),'Bheed')]")).click();
	}

}
