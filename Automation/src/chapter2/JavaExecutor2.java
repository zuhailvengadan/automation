package chapter2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavaExecutor2 {

	public static void main(String[] args) {
		// navigate, fetch title and url , refresh
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView(true)",s);
		System.out.println(js.executeScript("return document.url"));
		System.out.println(js.executeScript("return document.title"));
		js.executeScript("history.go[0]");

		
	}

}
