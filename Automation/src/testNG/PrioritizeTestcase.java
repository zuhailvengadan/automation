package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PrioritizeTestcase {
	@Test
	public void demo1() {
		Reporter.log("d",true);
	}
	@Test(priority = 2)
	public void demo2() {
		Reporter.log("d2",true);
	}
	@Test(priority = -1)
	public void demo3() {
		Reporter.log("d3",true);
	}
}
