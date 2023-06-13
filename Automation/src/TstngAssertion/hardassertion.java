package TstngAssertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class hardassertion {
	
	@Test
	public void tc1() {
		String s="hello";
		String s1="Hello";
		
		Assert.assertEquals(s,s1);
		
		System.out.println(s);
		System.out.println(s1);
	}
	
	@Test
	public void tc2() {
		System.out.println("test2");
	}

}
