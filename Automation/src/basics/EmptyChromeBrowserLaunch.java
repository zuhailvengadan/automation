package basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EmptyChromeBrowserLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ChromeOptions options= new ChromeOptions();
options.addArguments("--remote-allow-origins=*");
ChromeDriver driver=new ChromeDriver(options);
ChromeDriver Driver= new ChromeDriver ();


	}

}

