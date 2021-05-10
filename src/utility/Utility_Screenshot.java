package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility_Screenshot {

	public static WebDriver driver;
	
	public void screenshot() throws IOException {
		TakesScreenshot ss = (TakesScreenshot)driver;
		File Source = ss.getScreenshotAs(OutputType.FILE);
		
		File Destination = new File("C:\\Users\\hp-pc\\Downloads\\Screenshot(Selenium)\\InvalidCredential.png");
		
		FileHandler.copy(Source,Destination);
	}
}
