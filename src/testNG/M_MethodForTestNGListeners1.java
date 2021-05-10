package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNG.M_TestNGListeners2.class)
public class M_MethodForTestNGListeners1 {

	@Test(priority = 1)
	public void testcase1() {
		Reporter.log("testcase1",true);
	}
	
	@Test(priority = 2)
	public void testcase2() {
		Reporter.log("testcase2",true);
	}
	
	@Test(priority = 3)
	public void testcase3() {
		Reporter.log("testcase3",true);
		Assert.fail();
	}
	
	@Test(priority = 1, dependsOnMethods="testcase3")
	public void testcase4() {
		Reporter.log("testcase4",true);
	}
}
