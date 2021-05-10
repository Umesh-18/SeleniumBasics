package handling_of_webelement;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E1_Switch_to_Window {
	public static void main(String[] args) throws InterruptedException {
		
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Downloads\\ChromeDriver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://opensource-demo.orangehrmlive.com/");//redirect towards perticular url
				
			driver.manage().window().maximize();//to maximize the window
			
			String parentID = driver.getWindowHandle();
			System.out.println("parent ID is:"+parentID);
			
			driver.findElement(By.linkText("OrangeHRM, Inc")).click();

			Set<String> allWindowID = driver.getWindowHandles();
			
			for(String id : allWindowID) {
				
			if(!(id.equals(parentID))) {
				
			driver.switchTo().window(id);
			 //for switching towards perticular window i.e child window
			Thread.sleep(5000);

			
			driver.findElement(By.xpath("//*[@class='demo-btn home-btn trial-btn pulse']")).click();
			//to perform operations on child window
			Thread.sleep(2000);
			
			driver.quit();//To close the complete browser
			}
			System.out.println(id);
		}
}
}
