package testngCrossbrowsrparallelExecu;

import org.testng.annotations.Test;

public class parallelClas extends baseclass  {

	
	@Test()
	public void birthcerti() throws InterruptedException {
		driver.get("https://cr.lsgkerala.gov.in/");

		System.out.println(driver.getTitle());
	Thread.sleep(3000);
	
	}
	@Test()
	public void flip() throws InterruptedException {
		driver.get("https://www.amazon.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
	}
}
	