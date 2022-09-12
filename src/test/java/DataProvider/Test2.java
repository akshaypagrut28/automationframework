package DataProvider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

public class Test2 {
	WebDriver driver;
	@DataProvider
	@Test
	public void acti(String Browser) {
		if(Browser.equals("Chrome")) {
			driver = new ChromeDriver();
		}
		else {
			if(Browser.equals("Firefox")) {
				driver= new FirefoxDriver();
			}
		}
		driver.manage().window().maximize();
		
	}
	
}
