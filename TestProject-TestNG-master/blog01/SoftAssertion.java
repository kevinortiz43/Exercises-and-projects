package testproject.blog01;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion
{
	WebDriver driver;
	SoftAssert softassert = new SoftAssert ();
	
	@Test
	public void logIntoTestProject ()
	{
		driver.findElement(By.linkText("Login")).click();
		
		softassert.assertEquals("NewTest", "New Test", "New Test Button Is Not Available");
		softassert.assertTrue(true, "Job Monitor Is Not Available");
		softassert.assertTrue(false, "Reports Are Not Available");
		softassert.assertEquals("Developers", "Developers", "Developers Are Not Available");
		
		softassert.assertAll();
	}
		
	@BeforeMethod
	public void setUp ()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rex Allen Jones II\\Downloads\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver ();
		driver.manage().window().maximize();		
		driver.get("https://testproject.io/");
	}
	
	@AfterMethod
	public void tearUp ()
	{
		driver.quit ();
	}
	
	@Test 
	public void readTestProjectBlog ()
	{
		driver.findElement(By.linkText("Blog")).click();
	}
	
	@Test 
	public void freeTestProjectSignUp ()
	{
		driver.findElement(By.linkText("Free Sign Up")).click();
	}
	

}











