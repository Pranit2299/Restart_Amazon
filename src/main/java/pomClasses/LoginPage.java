package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilityClasses.Util1;

public class LoginPage extends Util1 {

	private WebDriver driver;
	
	@FindBy(xpath="//span[text()='Hello, sign in']")
	private WebElement signIn;
	
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	public void signIn()
	{
		explicitWait(driver, signIn);
		signIn.click();
	}
	
	
}
