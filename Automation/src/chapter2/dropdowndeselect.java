package chapter2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class dropdowndeselect {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		WebElement dropdown = driver.findElement(By.id("Cars"));
		
		
		Select s = new Select(dropdown);
		
		
		List<WebElement> list = s. getOptions();
		for(WebElement e: list) {
			System.out.println(e.getText());
		
		
		if (s.isMultiple()) {
			s.selectByIndex(0);
			s.selectByIndex(1);
			s.selectByIndex(2);
			
			
		Thread.sleep(3000);
		System.out.println("\nFirst Options: "+s.getFirstSelectedOption().getText());
	
				System.out.println("\nAll selected options");
				List<WebElement> selectedlist=s.getAllSelectedOptions();
				for (WebElement i : selectedlist) {
					System.out.println(i.getText());
					
				}
				s.deselectAll();
		}
		else
			System.out.println("single select dropdown");
		    driver.close();
		
				
				
				
				
				
				
		}
	}
}
