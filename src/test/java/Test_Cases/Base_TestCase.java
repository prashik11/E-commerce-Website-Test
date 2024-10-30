package Test_Cases;



import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Base_TestCase {
	
	//We create basetestcase class to store a common methods 
	
	public WebDriver driver;
	Logger logger;      //global variable
	@Parameters({"browser"})
	@BeforeMethod
	void setup(String browsername)
	{
		logger = LogManager.getLogger(this.getClass());  //add this to generate the logs file.

		
		switch( browsername.toLowerCase())   // add to launch on different browsers, for that in testNG.xml we have to add parameter name,value
	    {
	    
	    case "chrome" : driver=new ChromeDriver();break;
	    
	    case "firefox" : driver=new FirefoxDriver();break;
	    
	    case "edge" : driver=new EdgeDriver();break;
	    
	    default : System.out.println("Invalid browser");
	    
	    }
		
		driver.get("https://demo-opencart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));	
		
	}
	
	@AfterMethod
	void TearDown()
	{
		driver.close();
	}


}
