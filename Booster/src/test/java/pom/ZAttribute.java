package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZAttribute 
{
  WebDriver driver;
  public ZAttribute(WebDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
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
}