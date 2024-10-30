package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}

	
	@FindBy (xpath="//input[@id='input-email']")
	static
	WebElement EmailField;
	
	@FindBy (xpath="//input[@id='input-password']")
	static
	WebElement PasswordField;
	
	@FindBy (xpath="//button[@type='submit']")
	static
	WebElement LoginButton;
	
	
	
	public static void EnterEmail(String email)
	{
		EmailField.sendKeys(email);
	}
	
	public static void EnterPassword(String password)
	{
		PasswordField.sendKeys(password);
	}
	
	public static void ClickLogin()
	{
		LoginButton.click();
	}
	

}
