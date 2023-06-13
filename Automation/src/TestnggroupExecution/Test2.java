package TestnggroupExecution;

import org.testng.annotations.Test;

public class Test2 {

	
	
	@Test(groups ="smoke")
	public void tc1() {
		System.out.println("test2 , smoke");
	}
	@Test(groups ="regression")
	public void tc2() {
		System.out.println("test2 , Regression");
	}
	@Test(groups = {"smoke","Regression"})
	public void tc3() {
		System.out.println("test2 , smoke and Regression");
	}
}
