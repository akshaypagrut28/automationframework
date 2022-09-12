package Assert;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 { 
	@Test
	public void acti() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String actualtitle = driver.getTitle();
		//System.out.println(exptitle);
		String expectedtitle = "actiTIME - Login";
		System.out.println(actualtitle);
	}

}
