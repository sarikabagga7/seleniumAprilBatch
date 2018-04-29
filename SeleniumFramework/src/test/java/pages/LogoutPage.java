package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage 
{

	
	@FindBy(id="welcome") WebElement welcomeAdmin;
	
	@FindBy(xpath="//a[text()='Logout']") WebElement logout;
	
	
	public void logOutFromApplication()
	{
		
		welcomeAdmin.click();
		
		try 
		{
			Thread.sleep(2000);
		} catch (InterruptedException e) 
		{
			
		}
		
		logout.click();
	}
	
}
