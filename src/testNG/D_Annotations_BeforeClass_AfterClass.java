package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class D_Annotations_BeforeClass_AfterClass {

	@BeforeClass//Before Class Annotation
	public void beforeClass() {
		System.out.println("Before Class is running");
	}
	
	@BeforeMethod
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
	
	@AfterMethod
	public void afterMethod() {
		Reporter.log("after method", true);
	}
	
	@AfterClass//After Class Annotation
	public void afterClass() {
		System.out.println("After Class is running");
	}
}
