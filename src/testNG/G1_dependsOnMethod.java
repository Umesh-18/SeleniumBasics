package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class G1_dependsOnMethod {
	
	@Test(dependsOnMethods = "testNG.G_dependsOnMethod.testcase2", priority = 3)//3
	public void testcase3() {
		Assert.assertEquals("z", "z");
		Reporter.log("testcase3 Passed ",true);
}
}
