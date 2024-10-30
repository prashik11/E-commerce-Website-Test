package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount 
{
	
	WebDriver driver;
	public MyAccount(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//h2[text()='My Account']")
	WebElement successfulLoginText;


	public String myaccounttext()
	{
		String text = successfulLoginText.getText();
		return text;
	}

}
