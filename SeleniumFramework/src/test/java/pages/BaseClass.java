package pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;

import dataProviders.DataProviderFactory;
import lib.BrowserFactory;

public class BaseClass 
{

	public WebDriver driver;
	public ExtentReports report;
	
	@BeforeSuite
	public void setupTestSuite()
	{
			System.out.println("********************************************");
			System.out.println("Test Suite Start");
			report=new ExtentReports("./Reports/Index1.html");
			
	}
	
	@BeforeClass
	public void startTest()
	{
		driver=BrowserFactory.getBrowser(DataProviderFactory.getConfig().getBrowser(),DataProviderFactory.getConfig().getTestURL());
	}
	
	
	@AfterClass
	public void endTest()
	{
		driver.quit();
	}
	
	
	
	@AfterSuite
	public void tearDownTestSuite()
	{
		System.out.println("Test Suite End");
		report.flush();
		System.out.println("********************************************");
	
	}
	
}
