package handling_of_webelement;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E_Multiple_Windows_handling {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Downloads\\ChromeDriver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
				
			driver.get("https://opensource-demo.orangehrmlive.com/");//redirect towards perticular url
				
			driver.manage().window().maximize();//to maximize the window
			
			String parentID = driver.getWindowHandle();
			System.out.println("parent ID is:"+parentID);
			
			
			driver.findElement(By.linkText("OrangeHRM, Inc")).click();
			
			Set<String> allWindowID = driver.getWindowHandles();
			
			for(String id:allWindowID) {
				
				System.out.println("All Window IDs are:"+id);
			}
}
}