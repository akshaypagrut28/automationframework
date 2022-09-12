package CrossBrowser;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

	public class Test1 {
	WebDriver driver;
	@Parameters("Browser")
	@Test
	public void acti(String Browser) {
		if(Browser.equals("Chrome")) {
			driver = new ChromeDriver();
		}
		else {
			if(Browser.equals("Firefox")) {
				driver= new FirefoxDriver();
			}
			else {
				if(Browser.equals("MicrosoftEdge")) {
					driver = new EdgeDriver();
				}
			}
		}
		driver.manage().window().maximize();
		
	}

}
