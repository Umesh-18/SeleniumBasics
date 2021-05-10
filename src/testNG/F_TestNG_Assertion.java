package testNG;

import org.testng.annotations.Test;
import org.testng.Assert;


public class F_TestNG_Assertion {

	@Test
	public void Testcase1() {
		Assert.fail();
	}
	
	@Test
	public void Testcase2() {
		Assert.assertEquals(true, true, "Test Case 2 Passed");
	}
	
	@Test
	public void Testcase3() {
		Assert.assertEquals(true, false, "Test Case 3 Failed");
	}
}

//Assertion: assertion is nothing but the error caused due to difference between 
//actual and expected results of the Test Cases.
