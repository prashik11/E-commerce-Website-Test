package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Account_Page 
{
	
	
	WebDriver driver;
	public Account_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (xpath="//h1[text()='Your Account Has Been Created!']")
	WebElement RegistrationSuccesfulText;		
	
	

	public String RegistrationText()
	{
		String registersuccessful=RegistrationSuccesfulText.getText();   // it is use to verify its really open or not
	    return  registersuccessful;
	}

}
