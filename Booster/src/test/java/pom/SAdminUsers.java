package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SAdminUsers 
{
	
	WebDriver driver;
	public SAdminUsers(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
