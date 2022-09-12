package Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test3 
   {
	SoftAssert sa = new SoftAssert();
	@Test
	public void acti1() 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
		//sa.assertTrue(checkbox.isDisplayed()); //Pass
		sa.assertTrue(checkbox.isSelected());//Fail
		String ele = driver.getTitle();
		System.out.println(ele);
   }
       }