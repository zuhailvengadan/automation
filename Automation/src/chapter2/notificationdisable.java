package chapter2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class notificationdisable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();

		options.addArguments("--disable-geolocation");
		options.addArguments("--disable-notifications"
				+ "");

		WebDriver driver =new ChromeDriver(options);
    driver.manage().window().maximize();
    driver.get("https://www.ajio.com/");
    Thread.sleep(3000);
    driver.close();
    
	}

}
