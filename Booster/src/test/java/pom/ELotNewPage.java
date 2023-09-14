package pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.github.dockerjava.api.model.Event;

public class ELotNewPage 
{
	@FindBy(xpath="//button[@class='btn-i-secondary btn-icon-text commangap-3']")      	   WebElement newBtn;
    @FindBy(xpath="(//select[@formcontrolname='DropdownControl'])[1]")                	   WebElement clientDropDown;
	@FindBy(xpath="(//select[@formcontrolname='DropdownControl'])[2]")			      	   WebElement siteDropDown;
	@FindBy(xpath="//input[@placeholder='Enter Lot Name']")	                               WebElement lotName;
	@FindBy(xpath="//input[@placeholder='Enter Lot Title (Display Name)']")	               WebElement titleName;
	@FindBy(xpath="//input[@placeholder='Enter parking duration']")	                       WebElement parkingDuration;
	

public void ClickOnLotNewButton()
{
	newBtn.click();
}
public void EnterLotName(String name)
{
	lotName.sendKeys(name);
}
public void EnterTitleName(String title)
{
	titleName.sendKeys(title);
}
public void MentionParkingDuration(String time)
{
	parkingDuration.sendKeys(time);
}

@FindBy(xpath="(//div[@class='form-check min-w-108 ng-star-inserted'])[1]/input")      WebElement locationIndoor;
@FindBy(xpath="(//div[@class='form-check min-w-108 ng-star-inserted'])[2]/input")      WebElement locationOutdoor;
@FindBy(xpath="//div[@class='input-group']//span")                                     WebElement lotOverlay;
@FindBy(xpath="//input[@placeholder='Latitude']")	                                   WebElement lattitude;
@FindBy(xpath="//input[@placeholder='Longitude']")	                                   WebElement longitude;
@FindBy(xpath="(//div[@class='form-check min-w-108 ms-3 ng-star-inserted'])[1]/input") WebElement radioActive;
@FindBy(xpath="(//div[@class='form-check min-w-108 ms-3 ng-star-inserted'])[2]/input") WebElement radioInactive;

@FindBy(xpath="//button[text()='Cancel']")                                             WebElement cancelButton;
@FindBy(xpath="//button[text()='Save']")                                               WebElement saveButton;

public void selectLocation(String id)                            {
	if (id=="1")                        {
	locationIndoor.click();         	}
	else                                {
	locationOutdoor.click();        	}                        }
public void EnterLattitude(String lat)  {
	lattitude.sendKeys(lat);            }
public void EnterLongitude(String longi){
	longitude.sendKeys(longi);          }
public void ClickOnRadioButton(String id)                        {
	if(id=="1")                         {
	radioActive.click();            	}
	else                                {
	radioInactive.click();          	}                        }
public void ClickOnDecideButtons(String id) throws AWTException  {
	if(id=="1")                         {
	saveButton.click();            		}
	else 							    {
    cancelButton.click();				}
    Robot rt=new Robot(); 
    rt.keyPress(KeyEvent.VK_ENTER);
    rt.keyRelease(KeyEvent.VK_ENTER);                            }






}
