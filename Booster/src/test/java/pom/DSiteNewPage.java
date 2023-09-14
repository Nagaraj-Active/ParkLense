package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DSiteNewPage 
{
	@FindBy(xpath="//button[@class='btn-i-secondary btn-icon-text commangap-3']")     WebElement new_btn;
    @FindBy(xpath="(//select[@formcontrolname='DropdownControl'])[1]")                WebElement client_drop_down;
    @FindBy(xpath="(//input[@placeholder='Enter full name'])[1]")                     WebElement site_name;  
    @FindBy(xpath="//input[@placeholder='Enter Site Title']")                         WebElement title_name; 
    @FindBy(xpath="//div[@class='ng2-tag-input ng-tns-c102-1 bootstrap']")            WebElement lot_name;
    @FindBy(xpath="(//input[@type='radio' and @formcontrolname='radio'])[1]")         WebElement radio_active;
    @FindBy(xpath="(//input[@type='radio' and @formcontrolname='radio'])[2]")         WebElement radio_in_active;
    
    @FindBy(xpath="//button[text()='Cancel']")                                        WebElement cancel_button;
    @FindBy(xpath="//button[text()='Save']")                                          WebElement save_button;

public void NewButton()
{
	new_btn.click();
}
public String NewSiteText()
{
	String text="";
	return text;
}




}
