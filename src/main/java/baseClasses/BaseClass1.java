package baseClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import utilityClasses.Util1;

public class BaseClass1 {

	private static WebDriver driver = null;
	
	public static WebDriver getDriver(String browser) throws IOException
	{
		if(driver == null)
		{
			if(browser.equals("chrome"))
			{
				driver = new ChromeDriver();
			}
			else if(browser.equals("edge")) 
			{
				driver = new EdgeDriver();
			}
			
			driver.manage().window().maximize();
			driver.get(Util1.getProperty("url"));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			return driver;
		}
		else
		{
			return driver;
		}
	}
}
