package uHAPortal.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

	
	public LoginPage()
	{		
		PageFactory.initElements(currentDriver, this);
		pageName = this.getClass().getSimpleName();	
	}
	
//xpaths
	
	@FindBy(xpath="//*[@id=\"txtUsername\"]")
	public static WebElement UserName_box;
	
	
	@FindBy(xpath="//*[@id=\"txtPassword\"]")
	public static WebElement Password_box;
	
	
	@FindBy(xpath="//*[@id=\"btnLogin\"]")
	public static WebElement Login_Btn;
	
	

	@FindBy(xpath="//p[contains(text(),'Login Failed')]")
	public static WebElement Error_Msg;
	
	@FindBy(xpath="//p[contains(text(),'Both Usernamed')]")
	public static WebElement Error_Msg2;

	//@FindBy(xpath="")
	//ublic static WebElement BecomePartner_Link;
	
	
//functions
	
	public HomePage login(String UserName,String Password) throws Throwable {
		
		/*seleniumHelper.enterValueIntoTextField(UserName_box, UserName);
		Thread.sleep(5000);
		seleniumHelper.enterValueIntoTextField(Password_box, Password);
		Thread.sleep(5000);*/
		LoginPage.UserName_box.sendKeys(Environment("UHA_UserName"));
		LoginPage.Password_box.sendKeys(Environment("UHA_Password"));
		Thread.sleep(2000);
		seleniumHelper.clickElement(LoginPage.Login_Btn);
		Thread.sleep(8000);
		
		return new HomePage();
		}
	
	public void validateErrorMessage() {
		
		seleniumHelper.validateElementText(Error_Msg, "Login Failed. The username/password you supplied is invalid.");
	}
	
public void validateErrorMessageBlank() {
		
		seleniumHelper.validateElementText(Error_Msg2, "Both Username and Password should be supplied for Login");
	}
}
