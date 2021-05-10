package testNG;

import org.testng.annotations.Test;

public class A_Annotations_Priority {

	@Test(priority = 2)//Priority
	public void Testcase1() {
		System.out.println("FIrst test case got executed");//To get output value in console	
	}
	
	@Test(priority = 1)//Priority
	public void Testcase2() {
		System.out.println("Second test case got executed");
	}
	
	@Test//dictionary order
	public void Testcase0() {
		System.out.println("Zeroth test case got executed");

}
	

//	Without any keyword:  We have not use any keyword which decides the execution order, 
//	in this case the execution will depends on dictionary order of the test case name.
//
//	With keyword i.e priority: If we set the priority  to the test case then
//	the execution will happen according to it.
//	Default value of priority would be 0.
	
//	Priority of the test case can be :
//	a. –ve value
//	b. +ve value
//	c. 0 value
//	d. duplicate
//
//	Priority cannot be:
//	a. decimal value
//	b. variable

	
	
}
