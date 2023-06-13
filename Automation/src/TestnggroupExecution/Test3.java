package TestnggroupExecution;

import org.testng.annotations.Test;

public class Test3 {

	@Test(groups = "system")
	public void tc1() {
		System.out.println("test3 , system");
	}
	@Test(groups ="Regression")
	public void tc2() {
		System.out.println("test3 , Regression");
	}
	@Test(groups ={"system","regression"})
	public void tc3() {
		System.out.println("test3 , system and Regression");
	}
}
