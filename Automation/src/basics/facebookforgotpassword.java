package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class facebookforgotpassword {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeOptions option=new ChromeOptions();
option.addArguments("--remote-allow-origins=*");
WebDriver driver=new ChromeDriver(option);
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
Thread.sleep(3000);
driver.findElement(By.linkText("Forgotten password?")).click();
Thread.sleep(3000);
driver.findElement(By.name("email")).sendKeys("john.gmail.com");
Thread.sleep(3000);
driver.findElement(By.name("did_submit")).click();
Thread.sleep(3000);
driver.close();

	}

}
