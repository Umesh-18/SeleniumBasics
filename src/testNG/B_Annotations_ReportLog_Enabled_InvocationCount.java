package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class B_Annotations_ReportLog_Enabled_InvocationCount {

	@Test
	public void Testcase1() {
		Reporter.log("TC1", true);////To get output value in console and report	
	}
	
	@Test(invocationCount = 2)//To execute test case (N) times
	public void Testcase2() {
		Reporter.log("TC2", true);
	}
	
	@Test
	public void Testcase3() {
		Reporter.log("TC3", true);
	}
	
	@Test(enabled = false)//To ignore particular test case
	public void Testcase4() {
		Reporter.log("TC4", true);
	}

}

//Reporter class in testng:
//Reporter class is a class in testng which has a log method that gives functionality 
//to user for mentioning the messages inside the html report as well as in the 
//console(Standard input output media) .


//enabled keyword:
//If we wants to ignore a particular test case from an execution process then we can 
//write enabled =false

//invocationCount keyword:
//If we wants to execute a particular test multiple times then we should use 
//invocationCount keyword.


