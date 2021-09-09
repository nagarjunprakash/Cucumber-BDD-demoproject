package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitHelper;

public class LoginPage {
	public WebDriver driver;
	WaitHelper waitHelper;
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		waitHelper=new WaitHelper(driver);
	}
	
	@FindBy(id="txtUsername")
	private WebElement usernametextbox;
	
	@FindBy(id="txtPassword")
	private WebElement passwordtextbox;
	
	@FindBy(id="btnLogin")
	private WebElement loginbutton;
	
	@FindBy(id="menu_dashboard_index")
	private WebElement dashboarddropdown;
	
	
	
	@FindBy(xpath="//a[normalize-space()='Forgot your password?']")
	private WebElement forgotpasswordlink;
	
	public void usernametextbox(String username)
	{
		usernametextbox.clear();
		usernametextbox.sendKeys(username);
	}
	
	
	public void passwordtextbox(String password)
	{
		passwordtextbox.clear();
		passwordtextbox.sendKeys(password);
	}
	
	public void loginbutton()
	{
		loginbutton.click();
	}
	
	public WebElement forgotpasswordlink()
	{
		return forgotpasswordlink;
	}
	
	public WebElement dashboardTab()
	{
		waitHelper.waitForElement(dashboarddropdown, 10);
		return dashboarddropdown;
	}
	
}
