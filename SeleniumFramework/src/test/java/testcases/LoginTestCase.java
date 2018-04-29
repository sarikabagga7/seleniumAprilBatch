package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.BaseClass;
import pages.LoginPage;
import pages.LogoutPage;

public class LoginTestCase extends BaseClass
{

	@Test
	public void login()
	{
		LoginPage login=PageFactory.initElements(driver, LoginPage.class);
		
		LogoutPage logout=PageFactory.initElements(driver, LogoutPage.class);
		
		login.verifyTitleBeforeLogin();
		
		login.loginToCRM();
		
		login.verifyTitleAfterLogin();
		
		logout.logOutFromApplication();
		
		login.verifyTitleBeforeLogin();
		
	}
	
	
}
