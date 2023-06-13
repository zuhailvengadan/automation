package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class invocationcount {
	@Test(invocationCount=2)
	public void demo1() {
		Reporter.log("gold for  first",true);
	}
	@Test(invocationCount=-1)
	public void demo2() {
		Reporter.log("silver for second",true);
	}
	@Test(invocationCount=4)
	public void demo3() {
		Reporter.log("bronze for third",true);
	}
}
