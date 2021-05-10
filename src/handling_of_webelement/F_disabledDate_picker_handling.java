package handling_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F_disabledDate_picker_handling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Downloads\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='datepicker1']")).click();
		
		int i=0;
		
		while(i==0) {
			
		WebElement	Title = driver.findElement(By.xpath("//*[@class='ui-datepicker-title']"));
		String MONTHaYEAR= Title.getText();
		
		if(!(MONTHaYEAR.equals("February 2021"))) {
		driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		}
		
		else {
			break;
		}
		}
		
		driver.findElement(By.xpath("//*[text()='21']")).click();
	}
}
