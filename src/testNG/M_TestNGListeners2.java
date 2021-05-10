package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class M_TestNGListeners2 extends M1_Login implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Starting of test case "+result.getName());		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case passed "+result.getName());		
		}
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case failed "+result.getName());		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case skipped "+result.getName());		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onStart(ITestContext context) {
		System.out.println("Starting the process "+context.getName());		
		
	}
	
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Finishing the process "+context.getName());		
	}

}
