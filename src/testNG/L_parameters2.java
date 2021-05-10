package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class L_parameters2 {
	//2] parameter.xml for 2 data
	@Test
	@Parameters({"browser", "buildversion"})
	public void testcase2(String name,String build ) {
		System.out.println(name);
		System.out.println(build);

	}
}
