package uHAPortal.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoryManagerPage extends BasePage {

	public CategoryManagerPage()
	{
		PageFactory.initElements(currentDriver, this);
		pageName = this.getClass().getSimpleName();	
	}
	
	//Xpaths for Category Manager Page header

	@FindBy(xpath="//*[@id=\"header\"]/div[1]/div/img")
	public static WebElement UHCGLogo_element;
	
	@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/span")
	public static WebElement Header_Username_element;
	
	@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/a")
	public static WebElement Header_Logout_element;
	
	@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/h2")
	public static WebElement Header_Payer_element;
	
	
	//Xpaths for Category Manager Footer
	@FindBy(xpath=".//p[contains(text(),'©')]")
	public static WebElement FooterStatemet_Link; //this is the footer Notice
	
	@FindBy(xpath=".//a[contains(text(),'Privacy Policy')]")
	public static WebElement Privacy_Policy; //This is under Footer
	
	@FindBy(xpath=".//a[contains(text(),'Security Policy')]")
	public static WebElement Security_Policy; //This is under Footer 
	
	@FindBy(xpath=".//a[contains(text(),'Terms of Use')]")
	public static WebElement TermsOfUSe; // This is under Footer


	//XPaths for Tabs
	@FindBy(xpath="//*[@id=\"ctl00_Body1\"]/div[1]/nav/div/ul/li[1]/a")
	public static WebElement Home_Menu; // Home Menu item on the Page
	
	@FindBy(xpath="//*[@id=\"ctl00_Body1\"]/div[1]/nav/div/ul/li[2]/a")
	public static WebElement Tools_Menu; //Tools Menu and it will have link to the various Queues
	
	@FindBy(xpath="//*[@id=\"ctl00_Body1\"]/div[1]/nav/div/ul/li[3]/a")
	public static WebElement ClientService_Menu; // Client Service Menu item on the Page
	
	@FindBy(xpath="//*[@id=\"ctl00_Body1\"]/div[1]/nav/div/ul/li[4]/a")
	public static WebElement Admisnistration_Menu; // Administration Menu item on the Page
	
	@FindBy(xpath="//*[@id=\"ctl00_Body1\"]/div[1]/nav/div/ul/li[5]/a")
	public static WebElement Options_Menu; //Option Item of the Page
	
	@FindBy(xpath="//*[@id=\"ctl00_Body1\"]/div[1]/nav/div/ul/li[7]/a")
	public static WebElement ReferenceLibrary_Menu;// Referenc_Menu on the Home Page
	
	@FindBy(xpath="//*[@id=\"ctl00_Body1\"]/div[1]/nav/div/ul/li[6]/a")
	public static WebElement ReferenceLibraryPoblisher_Menu;// ReferencePublisher_Menu on the Home Page
	
	@FindBy(xpath="//*[@id=\"ctl00_Body1\"]/div/nav/div/ul/li[2]/ul/li[1]/a")
	public static WebElement BDqueue_Link; // This is under the tools menu and can be seen after mouse-over on tools.
	
	@FindBy(xpath="//*[@id=\"ctl00_Body1\"]/div/nav/div/ul/li[2]/ul/li[3]/a")
	public static WebElement BillSearch_Link; //Link to the Bill Search Page
	
	@FindBy(xpath="//*[@id=\"ctl00_Body1\"]/div/nav/div/ul/li[3]/ul/li[1]/a")
	public static WebElement CSRequest_Link; //This is under the Client service menu and can be seen after mouseover on the client service menu
	
	@FindBy(xpath="//*[@id=\"ctl00_Body1\"]/div/nav/div/ul/li[3]/ul/li[2]/a")
	public static WebElement CSRSearch_Link; //This is under the Client service menu and link for the CSR search 
	
	@FindBy(xpath="//*[@id=\"ctl00_Body1\"]/div/nav/div/ul/li[3]/ul/li[3]/a")
	public static WebElement CSRList_Link;// This is under the Client service menu

	@FindBy(xpath="//*[@id=\"ctl00_Body1\"]/div/nav/div/ul/li[2]/ul/li[1]/a")
	public static WebElement DocumentExchange_SubMenu;//This is under the Tools Menu 
	 
	@FindBy(xpath="//*[@id=\"ctl00_Body1\"]/div/nav/div/ul/li[2]/ul/li[4]/a")
	public static WebElement ArbitrationResultsQueue_Link; //this is under the tools menu and link to arbitration result queue
	 
	@FindBy(xpath="//*[@id=\"ctl00_Body1\"]/div/nav/div/ul/li[2]/ul/li[5]/a")
	public static WebElement RecentlyVoidedQueue_Link; // //this is under the tools menu and link to Recently voided Queue Page
	 
	@FindBy(xpath="//*[@id=\"ctl00_Body1\"]/div/nav/div/ul/li[2]/ul/li[7]/a")
	public static WebElement UHCGrejectedQueue_Subenu;// this is under the tools menu and link to UHCG rejected claims page which contains submenu HIPAA and Diagnostic
	 
	@FindBy(xpath="//*[@id=\"ctl00_Body1\"]/div/nav/div/ul/li[2]/ul/li[7]/ul/li[1]/a")
	public static WebElement HIPAAQueue_Link; // this is under the UHCG Rejected Claim which and link to the HIPAA Queue Page
	 
	@FindBy(xpath="//*[@id=\"ctl00_Body1\"]/div/nav/div/ul/li[2]/ul/li[7]/ul/li[2]/a")
	public static WebElement DaignosticQueue_Link; // this is under the UHCG rejected claims and link to the Diagnostic Page.
	 
	@FindBy(xpath="//*[@id=\"ctl00_Body1\"]/div/nav/div/ul/li[2]/ul/li[6]/a")
	public static WebElement CategoryManager_Link; //this is under the tools  menu and link to category manager page 
	 
	@FindBy(xpath="//*[@id=\"ctl00_Body1\"]/div/nav/div/ul/li[4]/ul/li/a")
	public static WebElement CompanyUser_submenu;//this is submenu inder admininstration
	 
	@FindBy(xpath="//*[@id=\"ctl00_Body1\"]/div/nav/div/ul/li[5]/ul/li/a")
	public static WebElement ChangePassword_Link;
	 
	@FindBy(xpath="//*[@id=\"ctl00_Body1\"]/div/nav/div/ul/li[4]/ul/li/ul/li[1]/a")
	public static WebElement Adduser_Link; //This is under company user
	 
	@FindBy(xpath="//*[@id=\"ctl00_Body1\"]/div/nav/div/ul/li[4]/ul/li/ul/li[2]/a")
	public static WebElement Summnery_Link;// This is under company User
	
	//Xpath for Category Manager Edit Page
	@FindBy(xpath="")
	public static WebElement EditButton;
	
	//Xpath for Category Manager Create Page
	@FindBy(xpath="//*[@id=\"ctl00_Body1\"]/div[1]/div[2]/div/div/div/div/div/div[1]/div/a")
	public static WebElement CreateButton;
	
	@FindBy(xpath="//*[@id=\"ctl00_Body1\"]/div[1]/div[2]/div/div/div/div/div/div[1]/div/button")
	public static WebElement ClearSortButton;

	@FindBy(xpath="")
	public static WebElement PriorityOrderDropDown;
	
	@FindBy(xpath="")
	public static WebElement CategoryListTable;
	
	@FindBy(xpath="")
	public static WebElement SortInfoMessage;
	
	@FindBy(xpath="")
	public static WebElement CategoryManagerLable;
	
	//Methods
	public void HeaderVerification(String UserName,String Payer ) {
	seleniumHelper.isElementExist(UHCGLogo_element);
	seleniumHelper.isElementExist(Header_Username_element);
	seleniumHelper.validateElementText(Header_Username_element,UserName);//to parameterize user name
	seleniumHelper.isElementExist(Header_Logout_element);
	seleniumHelper.isElementExist(Header_Payer_element);   
	seleniumHelper.validateElementText(Header_Payer_element, Payer);//to parameterize user name

	}

	//Functions to validate footer
	public void validatingFooter() {
		
		seleniumHelper.isElementExist(FooterStatemet_Link);
		seleniumHelper.validateElementText(FooterStatemet_Link, "© UnitedHealthCare Global | All rights reserved. | Any unauthorized duplication of this site or its contents is strictly prohibited.");
		
	}

	public void validatePrivacyPolicy() {
		
		seleniumHelper.isElementExist(Privacy_Policy);
		
		seleniumHelper.clickElement(Privacy_Policy);
	}

	public void validateSecurityPolicy() {
		
		seleniumHelper.isElementExist(Security_Policy);
		
		seleniumHelper.clickElement(Security_Policy);
	}

	public void validateTermsOfUse() {
		
		seleniumHelper.isElementExist(TermsOfUSe);
		
		seleniumHelper.clickElement(TermsOfUSe);
	}

	//Functions for Tabs
	public void validatingTabs() {
		
		
		seleniumHelper.isElementExist(Home_Menu);
		seleniumHelper.isElementExist(Tools_Menu);
		seleniumHelper.isElementExist(ClientService_Menu);
		seleniumHelper.isElementExist(Admisnistration_Menu);
		seleniumHelper.isElementExist(Options_Menu);
		seleniumHelper.isElementExist(Tools_Menu);
		seleniumHelper.isElementExist(ReferenceLibrary_Menu);
		seleniumHelper.isElementExist(ReferenceLibraryPoblisher_Menu);
		
		
	}
	
	public void validating_Tools_Menus() throws Throwable {
		
		seleniumHelper.mouseOver(Tools_Menu);
		seleniumHelper.clickElement(Tools_Menu);
		Thread.sleep(2000);
		seleniumHelper.isElementExist(BDqueue_Link);
		seleniumHelper.isElementExist(DocumentExchange_SubMenu);
		seleniumHelper.isElementExist(BillSearch_Link);
		seleniumHelper.isElementExist(ArbitrationResultsQueue_Link);
		seleniumHelper.isElementExist(RecentlyVoidedQueue_Link);
		seleniumHelper.isElementExist(CategoryManager_Link);
		seleniumHelper.isElementExist(UHCGrejectedQueue_Subenu);
		
	}
	
	public void validaitng_UHCGRejected_Submenu() throws Throwable {
		seleniumHelper.mouseOver(Tools_Menu);
		seleniumHelper.clickElement(Tools_Menu);
		Thread.sleep(2000);
		seleniumHelper.mouseOver(UHCGrejectedQueue_Subenu);
		seleniumHelper.isElementExist(HIPAAQueue_Link);
		seleniumHelper.isElementExist(DaignosticQueue_Link);
	}
	
	public void validatung_CSR_Menu() throws Throwable {
		seleniumHelper.mouseOver(ClientService_Menu);
		seleniumHelper.clickElement(ClientService_Menu);
		Thread.sleep(2000);
		seleniumHelper.isElementExist(CSRequest_Link);
		seleniumHelper.isElementExist(CSRList_Link);
		seleniumHelper.isElementExist(CSRSearch_Link);
		
		
	}
	
	public void validating_Admin_Menu() throws Throwable {
		seleniumHelper.mouseOver(Admisnistration_Menu);
		seleniumHelper.clickElement(Admisnistration_Menu);
		Thread.sleep(2000);
		seleniumHelper.mouseOver(CompanyUser_submenu);
		seleniumHelper.isElementExist(Adduser_Link);
		seleniumHelper.isElementExist(Summnery_Link);
	}
	
	public void  validating_Options_Menu() throws Throwable {
		
		seleniumHelper.mouseOver(Options_Menu);
		seleniumHelper.clickElement(Options_Menu);
		Thread.sleep(2000);
		seleniumHelper.isElementExist(ChangePassword_Link);
	}

	public void Validate_presence_of_WebElements_Category_Manager_Page()
	{
		seleniumHelper.validateElementText(CreateButton, "New Category");
		seleniumHelper.validateElementText(ClearSortButton, "Clear Sort");
		seleniumHelper.validateElementText(PriorityOrderDropDown, "Priority Order");
		seleniumHelper.validateElementText(CategoryListTable, "Clear Sort");
		seleniumHelper.selectFromDropdownByVisibleText(PriorityOrderDropDown, "Status");
		seleniumHelper.validateElementText(SortInfoMessage, "You must clear sorting in order to reprioritize categories");
		seleniumHelper.validateElementText(CategoryManagerLable, "Category Manager");
	}
	public CategoryManagerCreatePage redirect_create_category()
	{
		seleniumHelper.clickElement(CreateButton);
		return new CategoryManagerCreatePage();
	}
	public CategoryManagerEditPage redirect_edit_category()
	{
		seleniumHelper.clickElement(EditButton);
		return new CategoryManagerEditPage();
	}

}
