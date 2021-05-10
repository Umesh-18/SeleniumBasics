package handling_of_webelement;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2_toStoreWindowIDs_intoArray {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Downloads\\ChromeDriver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
				
			driver.get("https://opensource-demo.orangehrmlive.com/");//redirect towards perticular url
				
			driver.manage().window().maximize();//to maximize the window
			
			String parentID = driver.getWindowHandle();
			System.out.println("parent ID is:"+parentID);
			
			
			driver.findElement(By.linkText("OrangeHRM, Inc")).click();
			
			Set<String> allWindowID = driver.getWindowHandles();
			
			int NOofwindows = allWindowID.size();
			
			String [] WindId = new String [NOofwindows];
			
			int i = 0;
			
			for(String ID:allWindowID) {
				
				WindId[i]=ID;
				i++;
			}
			for (String IdValue:WindId) {
				System.out.println(IdValue);
			}
			

	
}
}
