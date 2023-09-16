package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DSiteNewPage 
{
    @FindBy(xpath="(//select[@formcontrolname='DropdownControl'])[1]")                WebElement client_drop_down;
    @FindBy(xpath="(//input[@placeholder='Enter full name'])[1]")                     WebElement site_name;  
    @FindBy(xpath="//input[@placeholder='Enter Site Title']")                         WebElement title_name; 
    @FindBy(xpath="//div[@class='ng2-tag-input ng-tns-c102-1 bootstrap']")            WebElement lot_name;
    @FindBy(xpath="//button[text()='Cancel']")                                        WebElement cancel_button;
    @FindBy(xpath="//button[text()='Save']")                                          WebElement save_button;

public String NewSiteText()
{
	String text="";
	return text;
}




}
