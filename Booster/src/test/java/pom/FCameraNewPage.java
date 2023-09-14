package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FCameraNewPage 
{
	@FindBy(xpath="//button[@class='btn-i-secondary btn-icon-text commangap-3 mb-3']")     WebElement New_button;
    @FindBy(xpath="(//select[@formcontrolname='DropdownControl'])[1]")                	   WebElement Client_drop;
	@FindBy(xpath="(//select[@formcontrolname='DropdownControl'])[2]")			      	   WebElement Site_Drop;
	@FindBy(xpath="(//select[@formcontrolname='DropdownControl'])[3]")                     WebElement lot_drop ;
	@FindBy(xpath="//input[@placeholder='Enter Camera Name']")                             WebElement Camera_name ;
	@FindBy(xpath="//input[@aria-autocomplete='list']")                                    WebElement Stalls_drop ;
	@FindBy(xpath="//input[@placeholder='Enter the Camera Access URL']")                   WebElement Camera_url ;
	@FindBy(xpath="(//div[@class='form-check min-w-108 ms-3'])[1]/input")                  WebElement radio_active;
    @FindBy(xpath="(//div[@class='form-check min-w-108 ms-3'])[2]/input")                  WebElement radio_in_active;
    
    @FindBy(xpath="//button[text()='Cancel']")                                             WebElement cancel_button;
    @FindBy(xpath="//button[text()='Save']")                                               WebElement save_button;
}
