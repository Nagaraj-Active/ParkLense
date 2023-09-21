package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class GAttributeValue {

	WebDriver driver;
	public GAttributeValue(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//span[text()='All Clients']")WebElement clientDropDown;
	public boolean VerifyClientDropDown()
	{
		boolean verify=clientDropDown.isEnabled();
		return verify;
	}
	public void ClickOnClient()
	{
		clientDropDown.click();
	}
	@FindBy(xpath="//select[@formcontrolname='DropdownControl']")WebElement attributeDropDown;
	public boolean VerifyAttributeDropDown()
	{
		boolean verify=attributeDropDown.isEnabled();
	    return verify;
	}
	public void SelectAttributeDropDown()
	{
		Select sel=new Select(attributeDropDown);
		sel.selectByVisibleText("Covered shelter");
	}
	@FindBy(xpath="//input[@placeholder='Attribute Value Name']")WebElement nameTextField;
	public boolean VerifyNameTextField()
	{
		boolean verify=nameTextField.isEnabled();
	    return verify;
	}
	public void EnterAttributeValue(String name)
	{
		nameTextField.sendKeys(name);
	}
	@FindBy(xpath="//div[@class='ng-select-container']/span")WebElement attributeValuePageClientDrop;
	public boolean AttributeValuePageClientDrop()
	{
		boolean verify=attributeValuePageClientDrop.isEnabled();
	    return verify;
	}
	public void ClickOnClientNewpage()
	{
		attributeValuePageClientDrop.click();
	}
	@FindBy(xpath="//div[@class='ng-dropdown-panel-items scroll-host']/div[2]/div")List<WebElement> attributevaluenewPageClients;  
    public void SelectClientInNewPage(String name)
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
