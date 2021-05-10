package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class G_dependsOnMethod {

	@Test(priority = 1)
	public void testcase1() {
		Assert.assertEquals("x", "x");//1
		Reporter.log("testcase1 Passed ",true);
	}
	
	@Test(dependsOnMethods = "testcase1", priority = 2)//2
	public void testcase2() {
		Assert.assertEquals("y", "y");
		Reporter.log("testcase2 Passed ",true);

	}
		
}
