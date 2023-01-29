package generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Baseclass implements FrameworkConstants
{
	public static WebDriver driver;
	public static Properties prop;
	public static WebDriverWait wait;
	
	@BeforeClass
	public static void configu() throws IOException
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream(propertypath);
		prop.load(fis);
	}
	
	@BeforeMethod
	public static void openApp() 
	{
		System.setProperty(geckokey, geckovalue);
		driver= new FirefoxDriver();
		driver.get(prop.getProperty("url"));
		wait=new WebDriverWait(driver, 60);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public static void closeApp(ITestResult result) throws IOException, InterruptedException
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			Generic_screenshot.getPhoto(driver);
		}
		Thread.sleep(3000);
		driver.close();
	}
	
	@AfterClass
	public static void aft_c()
	{
		
	}

}
