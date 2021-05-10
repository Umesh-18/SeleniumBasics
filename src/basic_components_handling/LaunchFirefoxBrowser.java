package basic_components_handling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {
public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\hp-pc\\Downloads\\geckodriver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver(); // to launch the browser
		
		driver.get("https://opensource-demo.orangehrmlive.com/");//redirect towards perticular url
		
		driver.manage().window().maximize();//to maximize the window
		
	}

}
