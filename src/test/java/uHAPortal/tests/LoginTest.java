package uHAPortal.tests;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

	@Test(enabled = true)
	public void login() throws Throwable {

		 HomePage = LoginPage.login(Environment("UHA_UserName"),Environment("UHA_Password"));

		/*LoginPage.UserName_box.sendKeys(Environment("UHA_UserName"));
		LoginPage.Password_box.sendKeys(Environment("UHA_Password"));
		Thread.sleep(2000);
		seleniumHelper.clickElement(LoginPage.Login_Btn);
		Thread.sleep(8000);*/
		HomePage.validatinglogo();
	}

	@Test(enabled = false)
	public void TC1() throws Throwable {

		uHAPortal.pages.LoginPage.UserName_box.sendKeys("Arzoo.TA46P");
		uHAPortal.pages.LoginPage.Password_box.sendKeys("Rise563%123");
		Thread.sleep(2000);
		seleniumHelper.clickElement(uHAPortal.pages.LoginPage.Login_Btn);
		LoginPage.validateErrorMessage();

	}

	@Test(enabled = false)
	public void TC2() throws Throwable {

		uHAPortal.pages.LoginPage.UserName_box.sendKeys(Environment("UHA_UserName"));
		Thread.sleep(2000);
		seleniumHelper.clickElement(uHAPortal.pages.LoginPage.Login_Btn);

		LoginPage.validateErrorMessageBlank();

	}

	@Test(enabled = false)
	public void TC3() throws Throwable {

		uHAPortal.pages.LoginPage.Password_box.sendKeys(Environment("Rise563%123"));
		Thread.sleep(2000);
		seleniumHelper.clickElement(uHAPortal.pages.LoginPage.Login_Btn);
		LoginPage.validateErrorMessageBlank();

	}

}
