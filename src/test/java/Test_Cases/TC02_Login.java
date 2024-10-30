package Test_Cases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageFactory.HomePage;
import PageFactory.LoginPage;
import PageFactory.MyAccount;
import PageFactory.RegisterPage;
import Utilities.General_utilities;

public class TC02_Login extends Base_TestCase
{
	@Test
	void login() throws InterruptedException
	{
		
		HomePage hp = new HomePage(driver);
		hp.ClickOnMyAccount();
		hp.ClickOnLogin();
		
		LoginPage lp = new LoginPage(driver);
		
		//Entering email and password on login page
		lp.EnterEmail(General_utilities.email_r);
		logger.info("Email entered");
		lp.EnterPassword(General_utilities.password_r);
		logger.info("Password entered");
		lp.ClickLogin();
		
		MyAccount ma = new MyAccount(driver);
		String actual_text = ma.myaccounttext();
		String expected_text= "My Account1234";
		
		Assert.assertEquals(actual_text, expected_text);
		
		logger.info("login test pass");
		
	}
	
	

}
