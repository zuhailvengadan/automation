package testNG;

import org.testng.annotations.Test;

public class enabled {
	@Test(enabled=false)
	public void demo() {
		System.out.println("Demo");
	}

}
