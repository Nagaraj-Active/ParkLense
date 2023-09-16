package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import myBrowsers.Browser;

public class BClientNewPage 
{
	public WebDriver driver;
	public BClientNewPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
    @FindBy(xpath="//button[@class='btn-i-secondary btn-icon-text commangap-3']") WebElement Client_newbtn;
    @FindBy(xpath="//div[@class='page-content']//h1")                       WebElement NewUserPageText;
    @FindBy(xpath="//input[@placeholder='Client Name']")                    WebElement name;
    @FindBy(xpath="//input[@placeholder='Mobile']")                         WebElement mobile;
    @FindBy(xpath="//input[@placeholder='Email']")                          WebElement email;
    @FindBy(xpath="//input[@placeholder='Address 1']")                   WebElement adress1;
    @FindBy(xpath="//input[@placeholder='Address 2']")                   WebElement adress2;
    @FindBy(xpath="//input[@placeholder='Address 3']")                   WebElement adress3;
    @FindBy(xpath="(//select[@formcontrolname='DropdownControl'])[1]")   WebElement country_drop;
    @FindBy(xpath="(//select[@formcontrolname='DropdownControl'])[2]")   WebElement state_drop;
    @FindBy(xpath="(//select[@formcontrolname='DropdownControl'])[3]")   WebElement city_drop;
    @FindBy(xpath="(//select[@formcontrolname='DropdownControl'])[4]") WebElement clientType_drop;
    @FindBy(xpath="(//button[@class='input-group-text'])[1]")            WebElement start_date;
    @FindBy(xpath="(//button[@class='input-group-text'])[2]")            WebElement end_date;
    @FindBy(xpath="(//button[@type='button'])[3]")                       WebElement cancel_button;
    @FindBy(xpath="//button[@class='btn-wide-secondary']")               WebElement save_button;
    
    @FindBy(xpath="(//input[@type='radio' and @formcontrolname='radio'])[1]") WebElement radio_active;
    @FindBy(xpath="(//input[@type='radio' and @formcontrolname='radio'])[2]") WebElement radio_in_active;
   
    public void Status(int id)
    {
    	if(id==1)
    	{
    		radio_active.click();
    	}
    	else
    	{
    		radio_in_active.click();;
    	}
    }
    public String NewPageTextVerify()
    {
    	String text=NewUserPageText.getText();
    	return text;
    }
    
    public void ClickOnNewButton()
    {
    	Client_newbtn.click();
    }
    public void EnterName(String Name)
    {
    	name.sendKeys(Name);
    }
    public void EnterMobileNumber(String number)
    {
    	mobile.sendKeys(number);
    }
    public void EnterEMail(String emailid)
    {
    	email.sendKeys(emailid);
    }
    public void adress(String adress)
    {
    	adress1.sendKeys(adress);
    }
    public void SelectCountry()
    {
    	Select sel=new Select(country_drop);
    	sel.selectByValue("1");
    }
    public void SelectState()
    {
    	Select sel=new Select(state_drop);
    	sel.selectByValue("1");
    	//state_drop.click();
    }
    public void SelectCity()
    {
    	Select sel=new Select(city_drop);
    	sel.selectByVisibleText("HYDERABAD");
    	//city_drop.click();
    }
    public void SelectClientType()
    {
    	Select sel=new Select(clientType_drop);
    	sel.selectByValue("Pilot");
    	System.out.println("transfer");
    	//client_drop.click();
    }
    public void SelectStartDate()
    {
    	start_date.click();
    	
    }

    public void SelectEndDate()
    {
    	end_date.click();
    }
    public void ClickOnSave()
    {
    	save_button.click();
    }
    public void ClickOnCancel()
    {
    	cancel_button.click();
    }
     
   
}
















