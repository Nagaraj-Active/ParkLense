package ForEachLoop;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Iterations 
{
	WebDriver driver;
//*****************************************For picking features link******************************************
    @FindBy(xpath = "//a[@class='nav-link nav-link-ref']/../../li")
    List<WebElement> AllLinks;

    public Iterations(WebDriver driver) 
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
   public void ClickOnByText(String feature)
   {
	 for(WebElement links:AllLinks)
	 {
		 if(links.getText().equals(feature))
		 {
			 links.click();
			 break;
		 }
	 }
   }
 //**************************************enter Save button And For keyboard**********************************************
   @FindBy(xpath="//button[text()='Save']")                                      WebElement saveButton ;
   @FindBy(xpath="//button[text()='Cancel']")                                    WebElement cancelButton ;
   public void ClickOnSaveButton() throws AWTException
   {
   	saveButton.click();
   	Robot rt=new Robot();
   	rt.keyPress(KeyEvent.VK_ENTER);
   	rt.keyRelease(KeyEvent.VK_ENTER);
   }
   public void ClickOnCancelButton() throws AWTException
   {
   	cancelButton.click();
   	Robot rt=new Robot();
   	rt.keyPress(KeyEvent.VK_ENTER);
   	rt.keyRelease(KeyEvent.VK_ENTER);
   }
    public void EmergencyEnterKey() throws AWTException
   {
   	Robot rb=new Robot();
   	rb.keyPress(KeyEvent.VK_ENTER);
   	rb.keyRelease(KeyEvent.VK_ENTER);
   }
//*************************************For Picking Date*************************************************
   @FindBy(xpath="//select[@title='Select month']") WebElement month_dropdown;
   @FindBy(xpath="//select[@title='Select year']")  WebElement year_dropdown;
   @FindBy(xpath="//div[@class='btn-light']")       List<WebElement> days_dropdown;
  public void DatePicker(String desiredDate)
	{
		 
	     String[] dateParts = desiredDate.split("/");
	     String year = dateParts[0];
	     String month = dateParts[1];
	     String day = dateParts[2];
	     //wait.waitforElement(year_dropdown, 30);
	     year_dropdown.sendKeys(year);
	     //wait.waitforElement(month_dropdown, 30);
	     month_dropdown.sendKeys(month);
	     
	     //wait.waitforElement(days_dropdown, 30);
	     int daysize=days_dropdown.size();
	     for(int d=0;d<daysize-1;d++)
	     {
	    	 WebElement days=days_dropdown.get(d);
	    	 String getdaytext=days.getText();
	    	
	    	 if(getdaytext.equals(day))
	    	 {
	             days.click(); 
	             break;
	    	 }
	     }
	}
//*********************************************CLient Drop Down***********************************************
  @FindBy (xpath = "(//select[@formcontrolname='DropdownControl'])[1]") WebElement clientDrop;
  public void SelectClient(String name)
  {
	  Select sel=new Select(clientDrop);
	  sel.selectByVisibleText(name);
  }
//**********************************************First Record components****************************************** 
  @FindBy(xpath="//select[@class='form-select form-select ms-2 me-2']")         WebElement page_drop_down;

  @FindBy(xpath="//div[@class='table-responsive']//tbody/tr")               List<WebElement>     client_first_record;
    public void featchAllRecordData()
    {
	  
    }
  @FindBy(xpath="(//div[@class='table-responsive']//tbody/tr/td[1])[1]")        WebElement clientFirstRecordId;
   public String FeatchFirstRecordId()
   {
	   String id=clientFirstRecordId.getText();
	   return id;
   }
  @FindBy(xpath="(//div[@class='table-responsive']//tbody/tr/td[2])[1]")         WebElement clientFirstRecordName;
   public String FeatchFirstRecordName()
   {
	   String name=clientFirstRecordName.getText();
	   return name;
   }
//********************************************Edit icon And Search text field*********************************************************************
   @FindBy(xpath ="(//span[@class='btn-sm-gray3 edit'])[1]")                      WebElement settingEditIcon; 
   @FindBy(xpath ="(//div[@class='action align-items-center d-flex'])[1]/span")   WebElement firstRecordEditIcon;
   @FindBy (xpath="//input[@placeholder='Search By Name']")						  WebElement searchField;
   @FindBy(xpath="//button[@class='btn-i-secondary btn-icon-text commangap-3']")  WebElement newButton;     //not using for camera
   public void EditICon()
   {
	   firstRecordEditIcon.click();
   }
   public void SettingEditICon()
   {
	  settingEditIcon.click();
   }
   public void SearchField(String id) throws AWTException, InterruptedException
   {
       searchField.sendKeys(id);
       Thread.sleep(4000);
       Robot rt=new Robot();
   	rt.keyPress(KeyEvent.VK_ENTER);
   	rt.keyRelease(KeyEvent.VK_ENTER);
   }
  
   public void NewButton()
   {
   	newButton.click();
   }
   @FindBy(xpath="(//input[@type='radio' and @formcontrolname='radio'])[1]")         WebElement radioActive;   ////For lot its not working
   @FindBy(xpath="(//input[@type='radio' and @formcontrolname='radio'])[2]")         WebElement radioInactive;
   public void Radiobutton(int id)
   {
	   if (id==2)
	   {
		   radioInactive.click();
	   }
	   else
	   {
		   System.out.println("ByDefault Active In Status");
		   radioActive.click();
	   }
   }
//***************************************Page Text to verify the current page******************************************************   
   @FindBy(xpath="//div[@class='page-content']//h1")                             WebElement pageText;
     public String VerifyCurrentPageText()
     {
   	String text=pageText.getText();
   	return text;
     }

}
