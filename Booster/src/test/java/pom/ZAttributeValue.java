package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ZAttributeValue {

	
	@FindBy(xpath="//span[text()='All Clients']")WebElement clientDropDown;
	public void ClickOnClient()
	{
		clientDropDown.click();
	}
	
    
   
}
