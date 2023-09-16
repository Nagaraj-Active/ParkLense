package pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DSitePage 
{
	WebDriver driver;
	public DSitePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	    
	
		//@FindBy (xpath="//a[@href='/sites']//span")									      WebElement site_link;
	    //@FindBy (xpath="//div[@class='d-flex flex-wrap']/../h1")                          WebElement SitePageText;
	    //@FindBy (xpath="//input[@placeholder='Search By Name']")						  WebElement Search_field;
	    //@FindBy(xpath="(//div[@class='table-responsive']//tbody/tr)[1]/td[1]")           WebElement Site_first_record_id;
		@FindBy (xpath="(//div[@class='dropdown-toggle'])[1]")                            WebElement Client_drop_down;
		@FindBy (xpath="(//div[@class='dropdown-toggle'])[2]")							  WebElement Status_drop_down;
	    @FindBy (xpath="//button[@class='btn-i-gray3 btn-icon-text commangap-3']")        WebElement Reset_button;
	    @FindBy (xpath="//select[@class='form-select form-select ms-2 me-2']")            WebElement page_drop_down;

public void ClientDropDown()
{
	Client_drop_down.click();
}
public void StatusDropDown()
{
	Status_drop_down.click();
}
public void ResetButton()
{
	Reset_button.click();
}
public void PageDropDown()
{
	page_drop_down.click();
}


}