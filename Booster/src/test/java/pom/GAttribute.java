package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GAttribute {

	 WebDriver driver;
	  public GAttribute(WebDriver driver)
	  {
		  this.driver=driver;
		  PageFactory.initElements(driver, this);
	  }	
//**************************************Create******************************	
	  @FindBy(xpath="//input[@placeholder='Attribute Name']")WebElement nameTextField;
	  @FindBy(xpath="//textarea[@placeholder='60 Characters only']")WebElement descriptionField;
	  
	  public void EnterName(String name)
	  {
		  nameTextField.sendKeys(name);
	  }
//*************************************Update*********************************	
	  public void CleratExistText()
	  {
		  nameTextField.clear();
	  }
	
	
	
	
	
	
	
	
	
	
	
}
