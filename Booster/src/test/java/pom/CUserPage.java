package pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;
import org.testng.annotations.Test;

public class CUserPage 
{
	WebDriver driver;
	public CUserPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//User Home page
		@FindBy (xpath="//span[text()=' Users']")									      WebElement user_link;
		@FindBy (xpath="//div[@class='d-flex flex-wrap']/../h1")                          WebElement user_page_text;
		@FindBy (xpath="//input[@placeholder='Search By Name']")						  WebElement search_field;
		@FindBy (xpath="(//input[@class='form-control'])[1]/../../li")                    List<WebElement> client_drop_down;
		@FindBy (xpath="(//div[@class='dropdown-toggle'])[2]")							  WebElement status_drop_down;
	    @FindBy (xpath="//button[@class='btn-i-gray3 btn-icon-text commangap-3']")        WebElement reset_button;
	    @FindBy (xpath="(//div[@class=\"action align-items-center d-flex\"])[1]")         WebElement edit_btn;
	    @FindBy (xpath="//select[@class='form-select form-select ms-2 me-2']")            WebElement page_drop_down;
	   
	    @FindBy (xpath="(//div[@id='filterdropdown'])[1]")                                WebElement clickonclientdropdown;

     public void ClickOnLink()
     {
       user_link.click();	 
     }
     public String UserPageText()
     {
    	 String text=user_page_text.getText();
    	 return text;
     }
     public void EnterIdIntoSearchField(String id)
     {;
    	 search_field.sendKeys(id);
     }
     public void FirstRecordId()
     {
    	 
     }
     
     public void ClientDropDown(String name) //throws InterruptedException 
     {
    	 name="";
    	 clickonclientdropdown.click();
    	List<WebElement> clients=client_drop_down;
    	 for(int i=0;i<clients.size()-1;i++)
    	 {
    		 WebElement b=clients.get(i);
    	   	if(b.getText().equals(name))
    		 {
    			 ClickOnLink();
    			 
    		 }
    	 }
     }
     

}





