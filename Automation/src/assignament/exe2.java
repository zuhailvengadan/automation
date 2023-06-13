package assignament;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class exe2  {

	public static void main(String [] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origin+*");
	WebDriver dri =new ChromeDriver(options);

	dri.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	dri.get("https://www.google.co.in/");
	dri.findElement(By.className("gLFyf")).sendKeys("iphone");
	
	List<WebElement> list=dri.findElements(By.xpath("//div[@class='mkHrUc']/div/div/ul"));

	for (WebElement w : list) {
		System.out.println("hai");
	System.out.println(w.getText());
	
	
	}
	WebElement a=list.get(1);
	String b=a.getText();
	System.out.println(b);
	
	dri.close();
	}

}
