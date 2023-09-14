package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ADashboard 
{
	    WebDriver driver;
		public  ADashboard(WebDriver driver)
		{
			this.driver=driver;
		}
		
		
		@FindBy (xpath ="//span[text()=' Dashboard']")                         WebElement dashboard;
		@FindBy (xpath ="(//div[@class='pp-4 ppt-2'])[1]/h1")                  WebElement prospects;
		@FindBy (xpath ="(//div[@class='pp-4 ppt-2'])[2]/h1")                  WebElement lot;
	    @FindBy (xpath ="(//div[@class='pp-4 ppt-2'])[3]/h1")                  WebElement Stalls;
	    @FindBy (xpath ="(//div[@class='pp-4 ppt-2'])[4]/h1")                  WebElement liveCamera;
	    @FindBy (xpath ="(//div[@class='pp-4 ppt-2'])[5]/h1")                  WebElement downCamera;
	    @FindBy (xpath ="(//div[@class='table-responsive'])[1]/../div/h4[2]/a")WebElement expiryThisMonth;
	    @FindBy (xpath ="(//div[@class='table-responsive'])[3]/../div/h4[2]/a")WebElement lotMaintainance;
	    	    	    
	  	    public String prospects_count()
	    {
	    	 String total = prospects.getText();
	    	 return total;
	    }
	    public String LotCount()
	    {
	    	String active_lot=lot.getText();
	    	return active_lot;
	    }
	    public String StallsCount()
	    {
	    String stalls=Stalls.getText();
	    return stalls;
	    }
	    public String LiveCamera()
	    {
	    	String Lcameras=liveCamera.getText();
	    	return Lcameras;
	    }
	    public String DownCamera()
	    {
	    	String Dcameras=downCamera.getText();
	    	return Dcameras;
	    }
	    public void ClickOnClientViewLink()
	    {
	    	expiryThisMonth.click();
	    }
	    public void ClickOnMainatainanceLotsLink()
	    {
	    	lotMaintainance.click();
	    }
}
