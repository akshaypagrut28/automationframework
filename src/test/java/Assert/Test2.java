package Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Test2 
{
	@Test
	public void acti1() 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
		//Assert.assertTrue(checkbox.isDisplayed()); //Pass
		Assert.assertTrue(checkbox.isSelected()); //Failed
		Assert.assertFalse(checkbox.isDisplayed());//Failed
		Assert.assertFalse(checkbox.isSelected()); //Pass
		String ele = driver.getTitle();
		System.out.println(ele);

  }
	}
