package chapter2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class javascriptExcecutorpart1 {

	static WebDriver driver=new ChromeDriver();;
    static JavascriptExecutor js=(JavascriptExecutor)driver;
	
    
    public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    //WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();

    driver.get("https://amazon.com/");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.findElement(By.xpath("//div[@class='glow-toaster-footer']/span/span")).click();
    WebElement electro=driver.findElement(By.xpath("//h2[contains(text(),'trackers and smartwatches')]"));
    WebElement last=driver.findElement(By.xpath("//a[text()='Your Ads Privacy Choices']"));
    Point loc=electro.getLocation();
    int x=loc.getX();
    int y=loc.getY();
    System.out.println(loc);
    
    //elementLoc(loc.x,loc.y);
   // coordinate(0,2000);
     element(last);
     driver.close();
	}
    
    
    static void coordinate(int cordinateA,int cordinateB) throws InterruptedException {
	
	       js.executeScript("window.scrollBy("+cordinateA+","+cordinateB+")");
	       Thread.sleep(3000);
	       js.executeScript("window.scrollBy("+cordinateA+","+-cordinateB+")");
    }
    
    
    static void elementLoc(int x,int y) throws InterruptedException{
    	  js.executeScript("window.scrollBy("+x+","+y+")");
    	  Thread.sleep(3000);
    }
    
    
    
    
    
    static void element(WebElement element) {
    	
    	 js.executeScript("arguments[0].scrollIntoView(true)",element);
    }
}


