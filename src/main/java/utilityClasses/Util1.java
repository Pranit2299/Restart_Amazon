package utilityClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util1 {

	public static String getProperty(String value) throws IOException
	{
		FileInputStream file = new FileInputStream("Configuration\\config.properties");
		Properties p = new Properties();
		p.load(file);
		String property = p.getProperty(value);
		return property;
	}
	
	
	public static WebElement explicitWait(WebDriver driver, WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(20));
		WebElement newElement = wait.until(ExpectedConditions.visibilityOf(element));
		return newElement;
	}
	
	public static String getScreenshot(WebDriver driver , String TestcaseName)
	{
		SimpleDateFormat frmt = new SimpleDateFormat("hhmmss");
		String time = frmt.format(new Date());
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("Screenshot"+time + TestcaseName + ".jpg");
		return dest.getAbsolutePath();
		
	}
}
