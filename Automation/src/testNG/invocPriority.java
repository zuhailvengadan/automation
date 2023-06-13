package testNG;

import org.testng.annotations.Test;

public class invocPriority {
	@Test(priority=-1,invocationCount=3)
	public void testcase1() {
		System.out.println("test case1");
	}
	@Test(priority=2,enabled=false)
	public void testcase2() {
		System.out.println("test case2");
	}
	@Test(priority=1,enabled=false)
	public void testcase3() {
		System.out.println("test case3");
	}
	@Test(priority=-1,invocationCount=0)
	public void testcase4() {
		System.out.println("test case4");
	}
	@Test()
	public void testcase5() {
		System.out.println("test case5");
	}

}
