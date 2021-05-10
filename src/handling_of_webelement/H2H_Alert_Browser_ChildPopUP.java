package handling_of_webelement;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class H2H_Alert_Browser_ChildPopUP {

	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Downloads\\ChromeDriver\\chromedriver.exe");
		
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://groww.in/");
			
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			String GrowwWindowID = driver.getWindowHandle();
			System.out.println("GrowwWindowID is:"+GrowwWindowID);
			
			WebElement Login_Register= driver.findElement(By.xpath("//*[@class='absolute-center btn51ParentDimension']"));
			Login_Register.click();
			Thread.sleep(5000);
			
			WebElement ContinueWithGoogle = driver.findElement(By.xpath("//div[@class='gsb183ContinueTxt']"));
			ContinueWithGoogle.click();
			Thread.sleep(2000);
			
			Set<String> GroowwandEmail = driver.getWindowHandles();
			
			for(String SignIn : GroowwandEmail) {
				
				if(!(SignIn.equals(GrowwWindowID))) {
					driver.switchTo().window(SignIn);
					driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("hatwateumesh.21@gmail.com");//email
					Thread.sleep(2000);
					driver.findElement(By.xpath("//*[@class='VfPpkd-RLmnJb']")).click();//next 
					Thread.sleep(2000);
				}
				System.out.println(SignIn);	
			}
			
		
}
}