package basic_components_handling;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Downloads\\ChromeDriver\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver(); // to launch the browser
		
		driver.get("https://www.selenium.dev/downloads/");//redirect towards perticular url
		
		driver.manage().window().maximize();//to maximize the window
		
	}
}
