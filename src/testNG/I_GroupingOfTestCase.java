package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class I_GroupingOfTestCase {

	@Test(groups = "sanity")
	public void testcase1() {
		Reporter.log("TC1 for sanity",true);
	}
	
	@Test(groups = {"sanity","regression"})
	public void testcase2() {
		Reporter.log("TC2 for sanity and regression",true);
	}
	
	@Test(groups = {"smoke","regression"})
	public void testcase3() {
		Reporter.log("TC3 for smoke and regression",true);
	}
	
	@Test(groups = "smoke")
	public void testcase4() {
		Reporter.log("TC4 for smoke",true);
	}
	
	@Test(groups = "retesting")
	public void testcase5() {
		Reporter.log("TC5 for retesting",true);
	}
		
		@Test(groups = "retesting")
		public void testcase6() {
			Reporter.log("TC6 for retesting",true);
		}
		
		@Test(groups = "regression")
		public void testcase7() {
			Reporter.log("TC7 for regression",true);
		}
		
		@Test(groups = "regression")
		public void testcase8() {
			Reporter.log("TC8 for regression",true);
	}
}
