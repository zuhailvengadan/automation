package TstngAssertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

	@Test
	public void tc1() {
		SoftAssert soft=new SoftAssert();
		
		String s="hello";
		String s1="Hello";
		
		soft.assertEquals(s,s1);
		
		System.out.println(s);
		System.out.println(s1);
		soft.assertAll();
	}
	
	@Test
	public void tc2() {
		System.out.println("test2");
	}
}
