package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.General_utilities;

public class RegisterPage 
{
	
    WebDriver driver;
	public RegisterPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	

	@FindBy (xpath="//input[@id='input-firstname']")
	WebElement Firstname;
	
	@FindBy (xpath="//input[@id='input-lastname']")
	WebElement Lastname;
	
	@FindBy (xpath="//input[@name='email']")  
	WebElement Email;
	
	@FindBy (xpath="//input[@type='password']")
	WebElement Password;
	
	@FindBy (xpath="//input[@name='agree']")
	WebElement TogglePrivacy;
	
	@FindBy (xpath="//button[@type='submit']")
	WebElement Continue;
	
	

	//create a Methods to perform actions on page element

	public void EnterFirstName()
	{
		Firstname.sendKeys(General_utilities.generateDynamicFirstName());  //direct create object random_data class and send methods.
	}
	
	public void EnterLastName()
	{
		Lastname.sendKeys(General_utilities.generateDynamicLasttName());
	}
	
	public void EnterEmail()
	{
		String email = General_utilities.generateDynamicEmail();
		Email.sendKeys(email);
		General_utilities.email_r=email;     // it send the email to email_r variable , we created in random_data class.
	}
	
	public void EnterPassword()
	{
		String password= General_utilities.generateDynamicPassword();
		System.out.println(password);
		Password.sendKeys(password);
	    General_utilities.password_r=password;
	}
	
	
	public void  ClickPrivacyPolicy()
	{
		TogglePrivacy.click();
		
	}
	
	public void ContinueButton()
	{
		Continue.click();
	}

}
