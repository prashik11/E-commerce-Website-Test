package Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import PageFactory.RegisterPage;

public class General_utilities
{
	public static String email_r;             // we create global public variable to send the email and password to tc02 login
	public static String password_r;

	//create a utilities package to provide a random data to methods
	
	

	public static String generateDynamicFirstName()
	{
		String first_name=RandomStringUtils.randomAlphabetic(5);  // for call a random data write RandomStringUtils. then you can choose.
		return first_name;
	}
	
	public static String generateDynamicLasttName()
	{
		String last_name=RandomStringUtils.randomAlphabetic(5);
		return last_name;
		
	}
	
	public static String generateDynamicEmail()
	{
		String email=RandomStringUtils.randomAlphabetic(5);  //create RandomStringUtils and store in variable
		String emailcom =(email + "@gmail.com");             // concatinate with @gmail.com
		return emailcom;                                     //return variable
	}
	
	public static String generateDynamicPassword()
	{
		String pass=RandomStringUtils.randomAlphabetic(5);
		String password = pass+"1234";
		return password;
	}
	
	public static void scrollingpage(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 200)");
	}
	
	public static void onlyTakingScreenShots(WebDriver driver) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("./Screenshots/s2.png");
		FileHandler.copy(source, target);
	}
	
}
