package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class validatetitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

		ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(options);
	driver.get("https://demo.actitime.com/");
	driver.manage().window().fullscreen();
	driver.close();
	
	
	
	
	
	
	}

}
