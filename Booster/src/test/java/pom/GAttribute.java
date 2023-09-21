package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GAttribute 
{
  WebDriver driver;
  public GAttribute(WebDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
  }
  @FindBy (xpath="(//div[@class='action align-items-center d-flex justify-content-center'])[1]/span")WebElement editIcon;
  public boolean VerifyEditIcon()
  {
	  boolean verify=editIcon.isEnabled();
	  return verify;
  }
  public void ClickOnEditIcon()
  {
	  editIcon.click();
  }
  @FindBy(xpath="//span[text()=' All Clients']") WebElement clientDrop;
  @FindBy(xpath="//div[@class='px-0 filterdropdownoptions dropdown-menu show']/ul/li")List<WebElement> clientDropOption;
  public void SelectClient(String name)
  {
	  clientDrop.click();
	  for(WebElement clients:clientDropOption)
	  {
		  if(clients.getText().equalsIgnoreCase(name))
		  {
			  clients.click();
			  break;
		  }
	  }
  }
  @FindBy(xpath="//input[@placeholder='Attribute Name']")WebElement nameTextField;
  public boolean VerifyNameTextField()
  {
	boolean verify=nameTextField.isEnabled();
	return verify;
  }
  public void CleratExistText()
  {
	  nameTextField.clear();
  }
  public void EnterName(String name)
  {
	  nameTextField.sendKeys(name);
  }
  @FindBy(xpath="//textarea[@placeholder='60 Characters only']")WebElement descriptionField;
  public boolean VerifyDescriptionField()
  {
	  boolean verify=descriptionField.isEnabled();
	  return verify;
  }
}
