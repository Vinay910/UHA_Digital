package uHAPortal.tests;

import org.testng.annotations.Test;

public class CategoryManagerEditTest extends BaseTest  {

	@Test(groups="Category_Manager_Edit",priority=0,expectedExceptions=ArithmeticException.class)
	public void Opening_Category_manager_Edit_Page() 
	{
		try {
			HomePage = LoginPage.login(Environment("UHA_UserName"),Environment("UHA_Password"));
		} catch (Throwable e) {
			e.getMessage();
		}
		categoryManagerPage=HomePage.move_to_Category_manager();
		categoryManagerEditPage=categoryManagerPage.redirect_edit_category();
	}
	@Test(groups="Category_Manager_Edit",dependsOnMethods="Opening_Category_manager_Edit_Page",priority=1)
	public void create_Category_for_Edit_verification() 
	{
		
	}
}
