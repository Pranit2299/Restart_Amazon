package testClasses;

import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import baseClasses.BaseClass1;
import baseClasses.BaseTest;
import pomClasses.LoginPage;

public class VerifyUserCanLogin extends BaseTest {

	private WebDriver driver;
	private LoginPage lp;
	private ExtentTest extentTest;
	
	@Parameters("browser")
	@BeforeClass
	public void setUp(String value) throws IOException
	{
		driver = BaseClass1.getDriver(value);
	}
	
	@BeforeMethod
	public void initilization(Method method)
	{
		lp = new LoginPage(driver);
		
	}
	
	@Test
	public void verifyUserCanLogin()
	{
		lp.signIn();
	}
	
	@AfterMethod
	public void logTestResult()
	{
		
	}
	
	
	@AfterClass
	public void tearDown()
	{
		
	}
	
	
}
