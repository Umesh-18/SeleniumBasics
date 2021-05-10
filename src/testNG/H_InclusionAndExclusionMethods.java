package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class H_InclusionAndExclusionMethods {

	@Test
	public void testcase1() {
		Reporter.log("TC1",true);
	}
	
	@Test
	public void testcase2() {
		Reporter.log("TC2",true);
	}
	
	@Test
	public void testcase3() {
		Reporter.log("TC3",true);
	}
	
	@Test
	public void testcase4() {
		Reporter.log("TC4",true);
	}
	
	@Test
	public void testcase5() {
		Reporter.log("TC5",true);
	}
}
