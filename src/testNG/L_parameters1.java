package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class L_parameters1 {

	//1] parameter.xml for 1 data
	@Test
	@Parameters("browser")
	public void testcase1(String name) {
		System.out.println(name);
		
		if(name.equalsIgnoreCase("Chrome")) {
			System.out.println("Chrome browser test case");
		}
		else if(name.equalsIgnoreCase("Firefox")) {
			System.out.println("Firefox browser test case");
		}
		
	}
}
