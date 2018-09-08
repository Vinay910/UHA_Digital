package uHAPortal.tests;

import org.testng.annotations.Test;

public class CategoryManagerTest extends BaseTest{
	
	@Test(groups="Category_Manager")
	public void Opening_Category_manager_Page() 
	{
		try {
			HomePage = LoginPage.login(Environment("UHA_UserName"),Environment("UHA_Password"));
		} catch (Throwable e) {
			e.getMessage();
		}
		categoryManagerPage=HomePage.move_to_Category_manager();		
	}

	@Test(dependsOnMethods="Opening_Category_manager_Page")
	public void Header_Validation() 
	{
		categoryManagerPage.HeaderVerification("SANDEEP SHAHI", "UHAP - TB47PROD");
	}
	@Test(dependsOnMethods="Opening_Category_manager_Page")
	public void Tabs_Validation() 
	{	
		categoryManagerPage.validatingTabs();
		try {
			categoryManagerPage.validating_Tools_Menus();
			categoryManagerPage.validating_Admin_Menu();
			categoryManagerPage.validaitng_UHCGRejected_Submenu();
			categoryManagerPage.validatung_CSR_Menu();
			categoryManagerPage.validating_Options_Menu();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	@Test(dependsOnMethods="Opening_Category_manager_Page")
	public void Footer_Validation() 
	{
		categoryManagerPage.validatingFooter();
		categoryManagerPage.validatePrivacyPolicy();
		categoryManagerPage.validateSecurityPolicy();
		categoryManagerPage.validateTermsOfUse();
	}	
}
