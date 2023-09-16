package pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BClientPage 
{
	public WebDriver driver;
	
	public BClientPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@href='/clients']")                                        WebElement clientLink;
	@FindBy(xpath="//div[@class='d-flex flex-wrap']/../h1")                       WebElement clientPageText;
    @FindBy(xpath="//input[@placeholder='Search By Name']")                       WebElement search_field;
	@FindBy(xpath="//button[@class='btn-i-gray3 btn-icon-text commangap-3']")     WebElement client_reset_btn;
	@FindBy(xpath="(//div[@class='filter-dropdown'])[1]")                         WebElement client_filter;
	@FindBy(xpath="(//div[@class='filter-dropdown'])[1]/..//div[2]//input")       WebElement client_search_field;
	@FindBy(xpath="((//div[@class='filter-dropdown'])[1]/..//div[2]//span)[1]")   WebElement alltype;
	@FindBy(xpath="((//div[@class='filter-dropdown'])[1]/..//div[2]//span)[2]")   WebElement pilot_client;
	@FindBy(xpath="((//div[@class='filter-dropdown'])[1]/..//div[2]//span)[3]")   WebElement live_client;
	@FindBy(xpath="(//div[@class='filter-dropdown'])[2]")                         WebElement status_filter;
	@FindBy(xpath="//div[@data-popper-placement='bottom-start']//input")          WebElement status_search_field;
	@FindBy(xpath="(//div[@data-popper-placement='bottom-start']//span)[1]")      WebElement status_All;
	@FindBy(xpath="(//div[@data-popper-placement='bottom-start']//span)[1]")      WebElement status_active;
	@FindBy(xpath="(//div[@data-popper-placement='bottom-start']//span)[1]")      WebElement status_in_active;
    @FindBy(xpath="//select[@class='form-select form-select ms-2 me-2']")         WebElement page_drop_down;
//Search by status filter
    @FindBy(xpath="(//div[@class='table-responsive']//tbody/tr/td[8])[1]")            WebElement client_filter_by_Status;
//first line option icon    
    @FindBy(xpath="((//div[@class='table-responsive']//tbody/tr/td[9])[1]//div)[2]/span/img") WebElement clientFirstKebabIcon;

    @FindBy(xpath="//input[@placeholder='Client Name']")                          WebElement editName;
    @FindBy(xpath="//input[@placeholder='Mobile']")                               WebElement editMobile;
    @FindBy(xpath="//input[@placeholder='Email']")                                WebElement editMail;
    @FindBy(xpath="//input[@placeholder='Address 1']")                            WebElement editAdress;
    @FindBy(xpath="//button[@class='btn-wide-secondary']")                        WebElement saveButton ;
    public void ClickOnSaveButton() throws AWTException
    {
    	saveButton.click();
    	Robot rt=new Robot();
    	rt.keyPress(KeyEvent.VK_ENTER);
    	rt.keyRelease(KeyEvent.VK_ENTER);
    	
    }
    public void EditAdress(String adress)
    {
    	editAdress.clear();
    	editAdress.sendKeys(adress);
    }
    public String VerifyUpdatedAdress()
    {
    	String Adress=editAdress.getText();
         return Adress;
    }
    public String VerifyUpdatedMail()
    {
    	String mail=editMail.getText();
         return mail;
    }
    
    public void EditMail(String mail)
    {
    	editMail.clear();
    	editMail.sendKeys(mail);
    }
    
    public void MobileField(String mobNumber) throws InterruptedException
     {
       editMobile.clear();
       Thread.sleep(2000);
	   editMobile.sendKeys(mobNumber);
     }
    public String VerifyUpdatedMobile()
    {
    	String mobile=editMobile.getText();
         return mobile;
    }
    public void NameText(String name)
    {
     editName.clear();
     editName.sendKeys(name);
    }
    public String VerifyUpdatedClientName()
    {
    	String name=editMail.getText();
         return name;
    }
    
   public void ClickOnClientLink()
    {
	  clientLink.click();
    } 
   public String CLientHomeVerification()
	{
	 String ClientPageText=clientPageText.getText();	
     return ClientPageText;
	} 
   public void EnterIntoSearchField(String id) throws AWTException, InterruptedException
	{
		search_field.sendKeys(id);
		Robot rt=new Robot();
    	rt.keyPress(KeyEvent.VK_ENTER);
    	rt.keyRelease(KeyEvent.VK_ENTER);
    	Thread.sleep(4000);
	}
   public void ClickOnResetButton()
	{
		client_reset_btn.click();
	}
   public void SelectClientType()
	{
		client_filter.click();
	}
   public void client_search_field()
	{
	 client_search_field.click();	
	}
   public void SelectStatus()
	{
		status_filter.click();
	}
   public void SelectPagination()
   {
	   page_drop_down.click();
   }
   
   public void StatusSearchField(String status)
	{
		status_search_field.sendKeys(status);
	}
   
   
}
		

