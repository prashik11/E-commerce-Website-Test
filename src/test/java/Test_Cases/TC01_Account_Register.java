package Test_Cases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageFactory.Account_Page;
import PageFactory.HomePage;
import PageFactory.RegisterPage;
import Utilities.General_utilities;

public class TC01_Account_Register extends Base_TestCase    //we use extends to call the variable and methods from that class (BaseTestCase)
{
	
	
	
	@Test
	void Register() throws InterruptedException
	{
		HomePage hp = new HomePage(driver);    //create homepage object to call homepage class data
		hp.ClickOnMyAccount();
		hp.ClickOnRegister();
		
		
		RegisterPage rp = new RegisterPage(driver);   //create a registerpage object to call registerpage class data
		rp.EnterFirstName();
		logger.info("First name entered");
		rp.EnterLastName();
		logger.info("last name entered");
		rp.EnterEmail();
		logger.info("Email entered");
		rp.EnterPassword();
		logger.info("Password entered");
		
		Thread.sleep(5000);
		
		General_utilities rd1 = new General_utilities();
		rd1.scrollingpage(driver );
		
		Thread.sleep(5000);
		
		rp.ClickPrivacyPolicy();
		rp.ContinueButton();
	
		
		
		Account_Page ap = new Account_Page(driver);      //create a accountpage object to call accountpage class data
		String Actual_text=ap.RegistrationText();
		String Expected_text="Your Account Has Been Created!";
		
		Assert.assertEquals(Actual_text, Expected_text);  //create assertion to see the its really register or not
		
		logger.info("Test Case Passed");  // 
	}

	
	

}
