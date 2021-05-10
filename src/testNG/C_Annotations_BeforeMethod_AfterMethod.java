package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class C_Annotations_BeforeMethod_AfterMethod {

	@BeforeMethod//Before Method Annotation
	public void beforeMethod() {
		Reporter.log("before method", true);
	}
	
	@Test
	public void Testcase1() {
		Reporter.log("TC1", true);
	}
	
	@Test
	public void Testcase2() {
		Reporter.log("TC2", true);
	}
	
	@Test
	public void Testcase3() {
		Reporter.log("TC3", true);
	}
	
	@AfterMethod//After Method Annotation
	public void afterMethod() {
		Reporter.log("after method", true);
	}
	
}
