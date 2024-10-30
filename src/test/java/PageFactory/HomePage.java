package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//locating elements by using @FindBy Annotation
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement MyAccount;
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement RegisterOption;
	
	@FindBy(xpath="//a[text()='Login']")
	WebElement LoginOption;
	
	//Add element for search field
	
	
	// add element for search button
	
	
	

	//Methods to perform actions
	public void ClickOnMyAccount()
	{
		MyAccount.click();
	}
	
	public void ClickOnRegister()
	{
		RegisterOption.click();
	}
	
	public void ClickOnLogin()
	{
		LoginOption.click();
	}
	
	//add method for enter text into searchfield
	
	
	//click on search button
	
	
	
	

}
