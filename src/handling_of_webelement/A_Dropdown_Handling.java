package handling_of_webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A_Dropdown_Handling {

	public static void main(String[] args) throws InterruptedException  {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Downloads\\ChromeDriver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mbasic.facebook.com/reg/?cid=102&privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjE3NjA2NjY1LCJjYWxsc2l0ZV9pZCI6NjkyMTI5MDA4Mzc1MTIxfQ%3D%3D&refid=9");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);

		
		//Handling of drop-down by using findElements:

		List<WebElement> daylist = driver.findElements(By.xpath("//*[@id='day']//option"));
		
		for(WebElement day:daylist) {
			
			if(day.getText().equals("21"))
				day.click();
			
			System.out.println(day.getText());
		}
		Thread.sleep(2000);
		
//		Handling of drop-down by using SELECT CLASS	:

		WebElement monthlist = driver.findElement(By.xpath("//*[@id='month']"));
		Select monthl = new Select(monthlist);// Select Class
		monthl.selectByIndex(5); //varible.selectByindex(index_value);
		
		Thread.sleep(2000);

//		Handling of drop-down by using select class:

		WebElement yearlist = driver.findElement(By.xpath("//*[@id='year']"));
		Select yearl = new Select(yearlist);
		yearl.selectByIndex(25);  //varible.selectByindex(index_value);
}		
}
