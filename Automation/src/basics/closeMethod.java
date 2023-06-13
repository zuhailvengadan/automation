package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;



public class closeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	EdgeOptions options=new EdgeOptions();
	//	options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.ebay.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
