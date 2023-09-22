package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HAttributeValue {
	WebDriver driver;
	public HAttributeValue(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
//*********************AttributeValueCreation**************************	
@FindBy(xpath="//select[@formcontrolname='DropdownControl']")WebElement attributeDropDown;
@FindBy(xpath="//input[@placeholder='Attribute Value Name']")WebElement nameTextField;
@FindBy(xpath="//div[@class='ng-select-container']/span")WebElement attributeValuePageClientDrop;
@FindBy(xpath="//div[@class='ng-dropdown-panel-items scroll-host']/div[2]/div")List<WebElement> attributevaluenewPageClients;  
	
	public void SelectAttributeDropDown()
	{
		Select sel=new Select(attributeDropDown);
		sel.selectByVisibleText("Covered shelter");
	}
	
	public void EnterAttributeValue(String name)
	{
		nameTextField.sendKeys(name);
	}
	
	public void ClickOnClientNewpage()
	{
		attributeValuePageClientDrop.click();
	}
    public void SelectClientOnNewPage(String name)
    {
    	for(WebElement a:attributevaluenewPageClients)
    	{
    		if(a.getText().equalsIgnoreCase(name))
    		{
    			a.click();
    			break;
    		}
    	}
    }


}
