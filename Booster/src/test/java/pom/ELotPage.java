package pom;
	import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import myBrowsers.Browser;

	public class ELotPage 
	{
	 WebDriver driver;
	 public ELotPage(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver,this);
	 }
//*************************************HomePage**********************************************	 
	    @FindBy(xpath="//span[text()=' All Status']")                   WebElement homePageStatus;
	    @FindBy(xpath="//span[text()=' All Sites']")                    WebElement homePageSites;
	    @FindBy(xpath="//span[text()=' All Clients']")                  WebElement homePageClientDrop;
//********************************Creation Page*******************************************************	    
	    @FindBy(xpath="(//select[@formcontrolname='DropdownControl'])[1]")WebElement newPageClientDrop;
		@FindBy(xpath="(//select[@formcontrolname='DropdownControl'])[2]")WebElement newPageSiteDrop;
		@FindBy(xpath="//input[@placeholder='Enter Lot Name']")           WebElement lotName;
		@FindBy(xpath="//input[@placeholder='Enter Lot Title (Display Name)']")WebElement lotTitle;
		
		public void Selectclient(String name)
		{
			Select sel=new Select(newPageClientDrop);
			sel.selectByVisibleText(name);
		}
		
		public void Selectsite(String name)
		{
			Select sel=new Select(newPageSiteDrop);
			sel.selectByVisibleText(name);
		}
		
		public void EnterLotName(String name)
		{
			lotName.sendKeys(name);
		}
		
		
		public void EnterLotTitle(String title)
		{
			lotTitle.sendKeys(title);
		}
		@FindBy(xpath="//input[@placeholder='Enter parking duration']")WebElement parkingDurationfield;
		@FindBy(xpath="//span[@id='basic-addon1']")                    WebElement uploadButton;
		@FindBy(xpath="//input[@placeholder='Latitude']")              WebElement lattitudeField;
		@FindBy(xpath="//input[@placeholder='Longitude']")             WebElement longitudeField;
		@FindBy(xpath="(//input[@type='radio'])[3]")                   WebElement indoor;
		@FindBy(xpath="(//input[@type='radio'])[4]")                   WebElement outDoor;
		public void EnterParkingDuration(String dur)
		{
			parkingDurationfield.sendKeys(dur);
		}
		public void UploadOverlay()
		{
			uploadButton.click();
		}
		
	
		public void Enterlattitude(String lat)
		{
			lattitudeField.sendKeys(lat);
		}
		public void EnterLongitude(String longitude)
		{
			longitudeField.sendKeys(longitude);;
		}
		public void SelectLotLocation(int id)
		{
			if(id==2)
			{
				outDoor.click();
			}
		}
		@FindBy(xpath="(//input[@type='radio'])[5]")WebElement activeStatus;
		@FindBy(xpath="(//input[@type='radio'])[6]")WebElement inActiveStatus;
		@FindBy(xpath="//div[@class='table-responsive']//tbody/tr[1]/td[9]//span[2]")WebElement stallsIcon; 
		public void SelectLotStatus(int id)
		{
			if(id==2)
		{
				inActiveStatus.click();
		}
		}
		public void ClickOnStallsIcon()
		{
				stallsIcon.click();
		}
//***********************************************UpdateLot******************************************
		public void ClearLotName() throws InterruptedException
		{
			Thread.sleep(3000);
			lotName.clear();
		}
		public void uploadLotOverlayImage() throws AWTException, InterruptedException
	    {
	       	uploadButton.click();
	    	
	    	Robot rob=new Robot();
	    	rob.delay(2000);
	    	
	    	StringSelection copyPath=new StringSelection("/home/active35/Downloads/ac-gayst (6).png");
	    	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(copyPath, null);
	    	
	    	rob.keyPress(KeyEvent.VK_CONTROL);
	    	rob.keyPress(KeyEvent.VK_V);
	    	rob.keyRelease(KeyEvent.VK_CONTROL);
	    	rob.keyRelease(KeyEvent.VK_V);
	    	
	    	rob.keyPress(KeyEvent.VK_ENTER);
	    	rob.keyRelease(KeyEvent.VK_ENTER);
	    	
	    }
	}
	
	
	

