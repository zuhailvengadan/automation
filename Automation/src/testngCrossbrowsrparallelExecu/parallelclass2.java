package testngCrossbrowsrparallelExecu;

import org.testng.annotations.Test;

public class parallelclass2 extends baseclass {

	
	@Test()
	public void goog() {
		driver.get("https://www.google.com/");
	}
}
