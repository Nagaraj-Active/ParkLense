package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CUserNewPage 
{
	 WebDriver driver;
	public CUserNewPage(WebDriver driver)
	{
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
	}
	    @FindBy(xpath="//button[@class='btn-i-secondary btn-icon-text commangap-3']")     WebElement New_btn; 
	    @FindBy(xpath="//div[@class='page-content']//h1")                                 WebElement NewUserPageText;
	    @FindBy(xpath="(//select[@formcontrolname='DropdownControl'])[1]")                WebElement Client_drop_down;
	    @FindBy(xpath="(//input[@placeholder='Enter full name'])[1]")                     WebElement Name;
	    @FindBy(xpath="(//input[@placeholder='Enter full name'])[2]")                     WebElement User_Name;
	    @FindBy(xpath="//input[@placeholder='Mobile']")                                   WebElement mobile;
	    @FindBy(xpath="//input[@placeholder='Email']")                                    WebElement Email; 
        @FindBy(xpath="(//select[@formcontrolname='DropdownControl'])[2]")                WebElement Role;
        @FindBy(xpath="//input[@aria-autocomplete='list']")                               WebElement Lot_drop;
        @FindBy(xpath="//input[@placeholder='Password']")                                 WebElement New_pwd;
        @FindBy(xpath="//input[@placeholder='Retype Password']")                          WebElement retype_pwd;
        @FindBy(xpath="(//input[@type='radio' and @formcontrolname='radio'])[1]")         WebElement radio_active;
        @FindBy(xpath="(//input[@type='radio' and @formcontrolname='radio'])[2]")         WebElement radio_in_active;
        @FindBy(xpath="//button[text()='Cancel']")                                        WebElement cancel_button;
        @FindBy(xpath="//button[text()='Save']")                                          WebElement save_button;
	    
	    
	    
	    public void ClickOnNewButton()
	    {
	    	New_btn.click();
	    }
	    public String CLientUserNewpageText()
		{
		 String UserNewPageText=NewUserPageText.getText();	
	     return UserNewPageText;
		} 
	    public void EnterNameIntoTextField(String U_name)
	    {
	    	Name.sendKeys(U_name);
	    }
	    public void EnterUserNameIntoTextField(String CU_name)
	    {
	    	User_Name.sendKeys(CU_name);
	    }
	    public void EnterMobileNumberIntoTextField(String Number)
	    {
	    	mobile.sendKeys(Number);
	    }
	    public void EnterMailIntoMailTextField(String mail)
	    {
	    	Email.sendKeys(mail);
	    }
	    public void EnterNewPasswordIntoPasswordTextField(String new_password)
	    {
	    	New_pwd.sendKeys(new_password);
	    }
	    public void EnterRetypePasswordIntoRetypePasswordField(String conf_pwd)
	    {
	    	retype_pwd.sendKeys(conf_pwd);
	    }
	    public void ClickOnActiveRadioButton()
	    {
             radio_active.click();	    
	    }
	    public void ClickOnInactiveRadioButton()
	    {
	    radio_in_active.click();
	    }
	    public void ClickOnCancelButton()
	    {
	    cancel_button.click();
	    }
	    public void ClickOnSaveButton()
	    {
	    save_button.click();
	    }
}
