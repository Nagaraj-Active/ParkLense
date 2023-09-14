package pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ALogin 
{
	public WebDriver driver;
    public ALogin(WebDriver driver)
	{
	    this.driver=driver;
	    PageFactory.initElements(driver, this);
	}


@FindBy (xpath="//input[@placeholder='Enter Email']")                          WebElement email_text_field;
@FindBy(xpath="//input[@placeholder='Enter Password']")                        WebElement pwd_text_field;
@FindBy(xpath="//button[text()='Sign In']")                                    WebElement signin_btn;
@FindBy(xpath="(//div[@class='imgholder2']/../following-sibling::div//img)[1]")WebElement signin_page_icon;
@FindBy(xpath="(//div[@class='card'])[1]/../../preceding-sibling::div/h1")     WebElement home_page_icon;






public void enter_mail(String mail)
{
  email_text_field.sendKeys(mail);
}

public void enter_password(String pwd)
{
	pwd_text_field.sendKeys(pwd);
}
public void button()
{
	signin_btn.click();
}
public boolean verify_sign()
{
	boolean first_icon=signin_page_icon.isDisplayed();
	return first_icon;
}
public boolean verify_home()
{
	boolean sec_icon=home_page_icon.isDisplayed();
	return sec_icon;
}

public void login_emergency_key() throws AWTException
{
	Robot rb=new Robot();
	rb.keyPress(KeyEvent.VK_TAB);
	rb.keyRelease(KeyEvent.VK_TAB);
	rb.keyPress(KeyEvent.VK_TAB);
	rb.keyRelease(KeyEvent.VK_TAB);
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
}
}

