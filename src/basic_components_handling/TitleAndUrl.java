package basic_components_handling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleAndUrl {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Downloads\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		
		System.out.println("the title of page is:"+title);
		
		if(title.equalsIgnoreCase("orangeHrm")) {
			
		System.out.println("test case pass");
		}
		else {
			System.out.println("test case FAIL");
		}
		
		String Url = driver.getCurrentUrl();
		System.out.println("the url of page is:"+Url);
	}
}
