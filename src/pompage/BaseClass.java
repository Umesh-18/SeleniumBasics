package pompage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public abstract class BaseClass {

	Properties prop;
	FileInputStream fis;
	public BaseClass() throws IOException {                //constructor of BaseClass
		
		prop = new Properties();
		fis = new FileInputStream(System.getProperty("user.dir")+"\\configProperties");
		prop.load(fis);

	}
}
