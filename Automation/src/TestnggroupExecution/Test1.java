package TestnggroupExecution;

import org.testng.annotations.Test;

public class Test1 {

	@Test(groups ="smoke")
	public void tc1() {
		System.out.println("test 1, smoke");
	}
	@Test(groups ="system")
	public void tc2() {
		System.out.println("test 1, system");
	}
	@Test(groups = {"smoke","system"})
	public void tc3() {
		System.out.println("test 1, smoke and system");
	}
	
}
