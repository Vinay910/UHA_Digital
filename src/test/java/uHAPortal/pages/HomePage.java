package uHAPortal.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
	
	

	public  HomePage()
	{		

		PageFactory.initElements(currentDriver, this);
		pageName = this.getClass().getSimpleName();
	
	}
	
	//xpaths
	
	
	
	@FindBy(xpath=".//*[@id='header']/div[1]/div/img")
	public static WebElement UHCG_Logo;  //Logo of the UHCG
	
	@FindBy(xpath=".//*[@id='header']/div[2]/div/div/a")
	public static WebElement Logout_Link;//Link to Logout to Application
	
	@FindBy(xpath=".//*[@id='header']/div[2]/div/div/span")
	public static WebElement UserName; //Full Name Of the User
	
	@FindBy(xpath=".//*[@id='header']/div[2]/div/h2")
	public static WebElement Payer_Name; //PayerName for UHA portal
	
	@FindBy(xpath=".//*[@id='navHome']/a")
	public static WebElement Home_Menu; // Home Menu item on the Page
	
	@FindBy(xpath="//*[@id=\"ctl00_Body1\"]/div/nav/div/ul/li[2]/a")
	public static WebElement Tools_Menu; //Tools Menu and it will have link to the various Queues
	
	@FindBy(xpath=".//*[@id='navClientService']/a")
	public static WebElement ClientService_Menu; // Client Service Menu item on the Page
	
	@FindBy(xpath=".//*[@id='navAdministration']/a")
	public static WebElement Admisnistration_Menu; // Administration Menu item on the Page
	
	@FindBy(xpath=".//*[@id='navOptions']/a")
	public static WebElement Options_Menu; //Option Item of the Page
	
	@FindBy(xpath=".//*[@id='navReferenceLib']/a")
	public static WebElement ReferenceLibrary_Menu;// Referenc_Menu on the Home Page
	
	@FindBy(xpath=".//*[@id='navReferenceLibPublisher']/a")
	public static WebElement ReferenceLibraryPoblisher_Menu;// ReferencePublisher_Menu on the Home Page
	
	@FindBy(xpath=".//h1[contains(text(),'Welcome')]")
	public static WebElement Welecome_text;// Welcome Text on the Menu
	
	@FindBy(xpath=".//p[contains(text(),'The UHCG Portal is secure')]")
	public static WebElement WarningMsg_Text;  //Contains Text given in the box on the Page
	
	@FindBy(xpath=".//*[contains(text(),'For security')]")
	public static WebElement WarningMsgTimeout_Text; //Contains text for timeout
	
	@FindBy(xpath=".//h3[contains(text(),'External Links')]")
	public static WebElement ExternalLink_Text; // ExternalLink Text on the Home page
	
	@FindBy(xpath=".//h3[contains(text(),'Retrieval Links')]")
	public static WebElement RetrivalLink_Text; // Retrival Link for Text  
	
	@FindBy(xpath=".//a[contains(text(),'eServices')]")
	public static WebElement Eservices_Link; // Eservices link on Home Page
	
	@FindBy(xpath=".//a[contains(text(),'PPO')]")
	public static WebElement Facility_FinderPPO_Link; //Faciliy_FinderPPO link on page
	
	@FindBy(xpath=".//a[contains(text(),'Plus')]")
	public static WebElement Facility_Finder_link; //Facility_Finder Link
	
	@FindBy(xpath=".//*[@id='ctl00_Body1']/div[1]/div[2]/div[2]/div[2]/div/ul/li/a")
	public static WebElement Pening_Request_Link;//Pending Request Link
	
	@FindBy(xpath="")
	public static WebElement BDqueue_Link; // This is under the tools menu and can be seen after mouseover on tools.
	
	@FindBy(xpath="")
	public static WebElement BillSearch_Link; //Link to the Bill Search Page
	
	@FindBy(xpath="")
	public static WebElement CSRequest_Link; //This is under the Client service menu and can be seen after mouseover on the client service menu
	
	@FindBy(xpath="")
	public static WebElement CSRSearch_Link; //This is under the Client service menu and link for the CSR search 
	
	 @FindBy(xpath="")
	public static WebElement CSRList_Link;// This is under the Client service menu

	 @FindBy(xpath="")
		public static WebElement DocumentExchange_SubMenu;//This is under the Tools Menu 
	 
	 @FindBy(xpath="")
		public static WebElement DocumentExchangeDashboared_Link;// this is under the Document Exchange submenu
	 
	 @FindBy(xpath="")
		public static WebElement DocumentExchangeDocuments_Link;// this is under the Document Exchange submenu
	 
	 
	 @FindBy(xpath="")
		public static WebElement DocumentExchangeSearch_Link;  // this is under the Document Exchange submenu
	 
	 @FindBy(xpath="")
		public static WebElement ArbitrationResultsQueue_Link; //this is under the tools menu and link to arbitration result queue
	 
	 
	 @FindBy(xpath="")
	public static WebElement RecentlyVoidedQueue_Link; // //this is under the tools menu and link to Recently voided Queue Page
	 
	 
	 @FindBy(xpath="")
	 public static WebElement UHCGrejectedQueue_Subenu;// this is under the tools mwenu a nd link to UHCG rejected claims page which contains submenu HIPAA and Diagnostic
	 
	 @FindBy(xpath="")
	 public static WebElement HIPAAQueue_Link; // this is under the UHCG Rejcted Clai which and link to the HIPAA Queue Page
	 
	 @FindBy(xpath="")
	 public static WebElement DaignosticQueue_Link; // this is under the UHCG rejcted claims and link to the Diagnostic Page.
	 
	 @FindBy(xpath="//*[@id=\"ctl00_Body1\"]/div/nav/div/ul/li[2]/ul/li[6]/a")
	 public static WebElement CategoryManager_Link; //this is under the tools  menu and link to category manager page 
	 
	 @FindBy(xpath="")
		public static WebElement CompanyUser_submenu;//this is submenu inder admininstration
	 
	 @FindBy(xpath="")
		public static WebElement ChangePassword_Link;
	 
	 
	 @FindBy(xpath="")
		public static WebElement Adduser_Link; //This is under company user
	 
	 @FindBy(xpath="")
		public static WebElement Summnery_Link;// This is under company User
	 

	 @FindBy(xpath=".//p[contains(text(),'©')]")
		public static WebElement FooterStatemet_Link; //this is the footer Notice
	 
	 
	 
	 @FindBy(xpath=".//a[contains(text(),'Privacy Policy')]")
		public static WebElement Privacy_Policy; //This is under Footer
	 
	 
	 @FindBy(xpath=".//a[contains(text(),'Security Policy')]")
		public static WebElement Security_Policy; //This is under Footer
	 
	 @FindBy(xpath=".//a[contains(text(),'Terms of Use')]")
		public static WebElement TermsOfUSe; // This is under Footer
	 
	//Functions ..
	
	public void movetoBDqueue_page() {
		
		seleniumHelper.mouseOver(Tools_Menu);
		seleniumHelper.clickElement(BDqueue_Link);
		
	}
	
	public void movetoCSRequest_page() {
		
		seleniumHelper.mouseOver(ClientService_Menu);
		seleniumHelper.clickElement(CSRequest_Link);
	}
	
	
public void movetoCSRSearch_page() {
		
		seleniumHelper.mouseOver(ClientService_Menu);
		seleniumHelper.clickElement(CSRSearch_Link);
	}
	

public void movetoCSRList_page() {
	
	seleniumHelper.mouseOver(ClientService_Menu);
	seleniumHelper.clickElement(CSRList_Link);
}

public BillsearchPage movetoBillSearch_page() {
	
	seleniumHelper.mouseOver(Tools_Menu);
	seleniumHelper.clickElement(BillSearch_Link);
	 return new BillsearchPage();
}
	

public void movetoDocumentExchange_page() {
	
	seleniumHelper.mouseOver(Tools_Menu);
	seleniumHelper.clickElement(DocumentExchange_SubMenu);
	
}

public void movetoEservices_page() {
	
	seleniumHelper.mouseOver(Tools_Menu);
	seleniumHelper.clickElement(Eservices_Link);
	
}

public void movetoFacilityFinderPPO_page() {
	
	seleniumHelper.mouseOver(Tools_Menu);
	seleniumHelper.clickElement(Facility_FinderPPO_Link);
	
}

public void movetoFacilityFinder_page() {
	
	seleniumHelper.mouseOver(Tools_Menu);
	seleniumHelper.clickElement(Facility_Finder_link);
	
}

public void movetoPendingRequest_page() {
	
	seleniumHelper.mouseOver(Tools_Menu);
	seleniumHelper.clickElement(Pening_Request_Link);
	
}

public void movetoAdduser_page() {
	
	seleniumHelper.mouseOver(Admisnistration_Menu);
	seleniumHelper.mouseOver(CompanyUser_submenu);
	seleniumHelper.mouseOver(Adduser_Link);
	
		
}

public void movetoSummery_page() {
	
	seleniumHelper.mouseOver(Admisnistration_Menu);
	seleniumHelper.mouseOver(CompanyUser_submenu);
	seleniumHelper.mouseOver(Summnery_Link);	
}

public void movetoPrivacyPolicy_page() {
	
	seleniumHelper.mouseOver(Privacy_Policy);		
}

public void movetoSecurityPolicy_page() {
	
	seleniumHelper.mouseOver(Security_Policy);			
}

public void movetoTermsOfUse_page() {
	
	seleniumHelper.mouseOver(TermsOfUSe);
			
}



//functions for Test Cases


public void validatinglogo(){
	
	boolean LogoExist = seleniumHelper.isElementExist(UHCG_Logo);
	
sfAssert.assertEquals(LogoExist, true);
		
}
  public void validateUserName() {
	  boolean UsernName = seleniumHelper.isElementExist(UserName);
	  
	  sfAssert.assertEquals(UsernName, true);
	  
  }

  public void validatingPopup() throws Throwable {
	  
	  Thread.sleep(600000);
	  Alert Popup = currentDriver.switchTo().alert();
	  String PoupText = Popup.getText();
	  
	  sfAssert.assertEquals(PoupText, "Your session will expire in another 5 minutes. Do you want to extend the session?");
	  
  }
  
  
  public void AcceptingPopup() throws Throwable {
	  
	  Thread.sleep(600000);
	  Alert Popup = currentDriver.switchTo().alert();
	  Popup.accept();
	  

}
  
public LoginPage RejectingPopup() throws Throwable {
	  
	  Thread.sleep(600000);
	  Alert Popup = currentDriver.switchTo().alert();
	  Popup.dismiss();
	  Alert Popup2 = currentDriver.switchTo().alert();
	  String Popup2Text = Popup2.getText();
	  
	  sfAssert.assertEquals(Popup2Text, "Session expired. You will be redirected to login page.");
	  Popup2.dismiss();
	  
	  return new LoginPage();
	  
}
	
public LoginPage Logout() {
	
	seleniumHelper.isElementExist(Logout_Link);
	
	seleniumHelper.clickElement(Logout_Link);
	 return new LoginPage();
}
	
public  void validatingPayername(String PayerName) {
	
	seleniumHelper.validateElementText(Payer_Name, PayerName);	
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
	Thread.sleep(2000);
	seleniumHelper.isElementExist(BDqueue_Link);
	seleniumHelper.isElementExist(DocumentExchange_SubMenu);
	seleniumHelper.isElementExist(BillSearch_Link);
	seleniumHelper.isElementExist(ArbitrationResultsQueue_Link);
	seleniumHelper.isElementExist(RecentlyVoidedQueue_Link);
	seleniumHelper.isElementExist(CategoryManager_Link);
	seleniumHelper.isElementExist(UHCGrejectedQueue_Subenu);
	
}

public void validating_DocumentExchange_Submenu() throws Throwable {
	seleniumHelper.mouseOver(Tools_Menu);
	Thread.sleep(2000);
	seleniumHelper.mouseOver(DocumentExchange_SubMenu);
	seleniumHelper.isElementExist(DocumentExchangeDashboared_Link);
	seleniumHelper.isElementExist(DocumentExchangeDocuments_Link);
	seleniumHelper.isElementExist(DocumentExchangeSearch_Link);
}


public void validaitng_UHCGRejected_Submenu() throws Throwable {
	seleniumHelper.mouseOver(Tools_Menu);
	Thread.sleep(2000);
	seleniumHelper.mouseOver(UHCGrejectedQueue_Subenu);
	seleniumHelper.isElementExist(HIPAAQueue_Link);
	seleniumHelper.isElementExist(DaignosticQueue_Link);
}


public void validatung_CSR_Menu() throws Throwable {
	seleniumHelper.mouseOver(ClientService_Menu);
	Thread.sleep(2000);
	seleniumHelper.isElementExist(CSRequest_Link);
	seleniumHelper.isElementExist(CSRList_Link);
	seleniumHelper.isElementExist(CSRSearch_Link);
	
	
}

public void validating_Admin_Menu() throws Throwable {
	seleniumHelper.mouseOver(Admisnistration_Menu);
	Thread.sleep(2000);
	seleniumHelper.mouseOver(CompanyUser_submenu);
	seleniumHelper.isElementExist(Adduser_Link);
	seleniumHelper.isElementExist(Summnery_Link);
}
public void  validating_Options_Menu() throws Throwable {
	
	seleniumHelper.mouseOver(Options_Menu);
	Thread.sleep(2000);
	seleniumHelper.isElementExist(ChangePassword_Link);
}

//funtions for Grid

public void validatingWelcomeMsg() {
	
	seleniumHelper.validateElementText(Welecome_text, "Welcome to the UHCG Portal!");
	
}

public void validatingInformationMsg() {
	
	seleniumHelper.validateElementText(WarningMsg_Text, "The UHCG Portal is secure but dependent on your careful maintenance of the confidentiality of your username and password.");
	
}

public void validatingInformationMsgtimeout() {
	
	seleniumHelper.validateElementText(WarningMsgTimeout_Text, "The UHCG Portal is secure but dependent on your careful maintenance of the confidentiality of your username and password.");
	
}


//functions for External Links

public void validatingExternalLinks() {
	
	seleniumHelper.isElementExist(ExternalLink_Text);
	seleniumHelper.isElementExist(Eservices_Link);
	seleniumHelper.isElementExist(Facility_Finder_link);
	seleniumHelper.isElementExist(Facility_FinderPPO_Link);
}

public void validatingLinks() throws Throwable {
	
	seleniumHelper.clickElement(Eservices_Link);
	Thread.sleep(2000);
	seleniumHelper.clickElement(Facility_Finder_link);
	Thread.sleep(2000);
	seleniumHelper.clickElement(Facility_FinderPPO_Link);
	
}

//functins for Retrival Link
public  void validatingRetrivalLinks() {
	
	seleniumHelper.isElementExist(RetrivalLink_Text);
	seleniumHelper.isElementExist(Pening_Request_Link);
	seleniumHelper.clickElement(Pening_Request_Link);
}


//funnctions for Foooter

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

// Method to move to Category Manager Page

public CategoryManagerPage move_to_Category_manager()
{
	seleniumHelper.clickElement(Tools_Menu);
	seleniumHelper.clickElement(CategoryManager_Link);
	return new CategoryManagerPage();
}

}

