package TestNgListners;

import org.testng.annotations.Test;

public class RETRYANALYZER {

	@Test
	public void test1() {
		System.out.println("test1");
	}
	
	@Test(retryAnalyzer=TestNgListners.iTRYANALYZR.class)
	public void test2() {
		System.out.println();
	}
	
	
	
	
}
