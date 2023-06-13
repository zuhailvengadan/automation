package TestNgbatchExecution;

import org.testng.annotations.Test;

public class batchExe2 {

	@Test()
	public void test3() {
		System.out.println("test3");
	}
	@Test(groups = "test4")
	public void test4() {
		System.out.println("test4");
	}
	
}
