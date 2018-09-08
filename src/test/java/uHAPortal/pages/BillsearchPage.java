package uHAPortal.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillsearchPage extends BasePage {
               

public  BillsearchPage ()
{
               PageFactory.initElements(currentDriver, this);
               pageName = this.getClass().getSimpleName();

}

//xpaths for Bill Search header

@FindBy(xpath="")
public static WebElement UHCGLogo_element;
@FindBy(xpath="")
public static WebElement Header_Username_element;
@FindBy(xpath="")
public static WebElement Header_Logout_element;
@FindBy(xpath="")
public static WebElement Header_Payer_element;


//xpaths for Bill Search Tabs

@FindBy(xpath="")
public static WebElement Menu_Home; 
@FindBy(xpath="")
public static WebElement Menu_Tools;
@FindBy(xpath="")
public static WebElement Menu_ClientService; 
@FindBy(xpath="")
public static WebElement Menu_Admisnistration; 
@FindBy(xpath="")
public static WebElement Menu_Options; 
@FindBy(xpath="")
public static WebElement Menu_ReferenceLibraryPublisher; 
@FindBy(xpath="")
public static WebElement Menu_ReferenceLibrary; 
@FindBy(xpath="")
public static WebElement Text_BillSearch; 


//xpaths for Bill Search buttons and search criteria

@FindBy(xpath="")
public static WebElement BillSearch_Search_button; 
@FindBy(xpath="")
public static WebElement BillSearch_Reset_button; 
@FindBy(xpath="")
public static WebElement BillSearch_note; 


@FindBy(xpath="")
public static WebElement BillSearch_UHCGClaimID_label; 
@FindBy(xpath="")
public static WebElement BillSearch_UHCGClaimID_textfield; 

@FindBy(xpath="")
public static WebElement BillSearch_UHCGMemberID_label; 
@FindBy(xpath="")
public static WebElement BillSearch_UHCGMemberID_textfield; 

@FindBy(xpath="")
public static WebElement BillSearch_ICN_label; 
@FindBy(xpath="")
public static WebElement BillSearch_ICN_textfield; 


@FindBy(xpath="")
public static WebElement BillSearch_MemberFirstName_label; 
@FindBy(xpath="")
public static WebElement BillSearch_MemberFirstName_textfield; 

@FindBy(xpath="")
public static WebElement BillSearch_MemberLastName_label; 
@FindBy(xpath="")
public static WebElement BillSearch_MemberLastName_textfield; 

@FindBy(xpath="")
public static WebElement BillSearch_DOB_label; 
@FindBy(xpath="")
public static WebElement BillSearch_DOB_dropdown; 

@FindBy(xpath="")
public static WebElement BillSearch_ClaimStatus_label; 
@FindBy(xpath="")
public static WebElement BillSearch_ClaimStatus_dropdown; 


@FindBy(xpath="")
public static WebElement BillSearch_ClaimStatus_dropdown_Select_Option1;
@FindBy(xpath="")
public static WebElement BillSearch_ClaimStatus_dropdown_Select_Option2;
@FindBy(xpath="")
public static WebElement BillSearch_ClaimStatus_dropdown_Select_Option3;
@FindBy(xpath="")
public static WebElement BillSearch_ClaimStatus_dropdown_Select_Option4;
@FindBy(xpath="")
public static WebElement BillSearch_ClaimStatus_dropdown_Select_Option5;
@FindBy(xpath="")
public static WebElement BillSearch_ClaimStatus_dropdown_Select_Option6;

@FindBy(xpath="")
public static WebElement BillSearch_BilledCharges_label; 
@FindBy(xpath="")
public static WebElement BillSearch_BilledCharges_textfield; 

@FindBy(xpath="")
public static WebElement BillSearch_DOS_label; 
@FindBy(xpath="")
public static WebElement BillSearch_DOS_dropdown; 



@FindBy(xpath="")
public static WebElement BillSearch_Customfield1_label; 
@FindBy(xpath="")
public static WebElement BillSearch_Customfield1_textfield; 

@FindBy(xpath="")
public static WebElement BillSearch_Customfield2_label; 
@FindBy(xpath="")
public static WebElement BillSearch_Customfield2_textfield; 

@FindBy(xpath="")
public static WebElement BillSearch_Customfield3_label;; 
@FindBy(xpath="")
public static WebElement BillSearch_Customfield3_textfield; 


@FindBy(xpath="")
public static WebElement BillSearch_SearchResults_text; 
@FindBy(xpath="")
public static WebElement BillSearch_SearchResultswarning_text; 

//xpaths for Bill Search Footer
@FindBy(xpath="")
               public static WebElement Footer_Copyright; 
@FindBy(xpath="")
public static WebElement Footer_PrivacyPolicy_link;
@FindBy(xpath="")
public static WebElement PrivacyPolicy_page; 
@FindBy(xpath="")
public static WebElement PrivacyPolicy_page_text; 

@FindBy(xpath="")
public static WebElement Footer_SecurityPolicy_link; 
@FindBy(xpath="")
public static WebElement SecurityPolicy_page; 
@FindBy(xpath="")
public static WebElement SecurityPolicy_page_text; 

@FindBy(xpath="")
public static WebElement Footer_TermsOfUse_link; 
@FindBy(xpath="")
public static WebElement TermsOfUse_page; 
@FindBy(xpath="")
public static WebElement TermsofUse_page_text; 


//xpaths for addtional pages:
@FindBy(xpath="")
public static WebElement PrivacyPolicy_page_closelink;

@FindBy(xpath="")
public static WebElement SecurityPolicy_page_closelink;

@FindBy(xpath="")
public static WebElement TermsofUse_page_closelink;


//xpaths for Bill Search Results grid


@FindBy(xpath="")
public static WebElement BillSearch_Filterresults_text; 


@FindBy(xpath="")
public static WebElement BillSearch_Filterresults_note; 


@FindBy(xpath="")
public static WebElement BillSearch_Exporttoexcel_button;


@FindBy(xpath="")
public static WebElement BillSearch_Resultgrid_UHCGClaimID_filter;


@FindBy(xpath="")
public static WebElement BillSearch_Resultgrid_ICN_filter;


@FindBy(xpath="")
public static WebElement BillSearch_Resultgrid_DOS;

@FindBy(xpath="")
public static WebElement BillSearch_Resultgrid_UHCGMemberID_filter;


@FindBy(xpath="")
public static WebElement BillSearch_Resultgrid_NetworkStatus;


@FindBy(xpath="")
public static WebElement BillSearch_Resultgrid_MemberName_filter;


@FindBy(xpath="")
public static WebElement BillSearch_Resultgrid_DOB;


@FindBy(xpath="")
public static WebElement BillSearch_Resultgrid_Billed_filter;


@FindBy(xpath="")
public static WebElement BillSearch_Resultgrid_NetPay;


@FindBy(xpath="")
public static WebElement BillSearch_Resultgrid_Allowed_filter;


@FindBy(xpath="")
public static WebElement BillSearch_Resultgrid_PatientResp;


@FindBy(xpath="")
public static WebElement BillSearch_Resultgrid_Customfield1_filter;



@FindBy(xpath="")
public static WebElement BillSearch_Resultgrid_PlaceofServiceType;


@FindBy(xpath="")
public static WebElement BillSearch_Resultgrid_Customfield2_filter;

@FindBy(xpath="")
public static WebElement BillSearch_Resultgrid_Dx;



@FindBy(xpath="")
public static WebElement BillSearch_Resultgrid_Customfield3_filter;

@FindBy(xpath="")
public static WebElement BillSearch_Resultgrid_UBorHCFA;


@FindBy(xpath="")
public static WebElement BillSearch_Resultgrid_Inqueue_filter;


@FindBy(xpath="")
public static WebElement BillSearch_Resultgrid_StatusCode;


@FindBy(xpath="")
public static WebElement BillSearch_Paginationoptions_dropdown;


@FindBy(xpath="")
public static WebElement BillSearch_Pagenumbertext;


@FindBy(xpath="")
public static WebElement BillSearch_Pagination_Firstpagenavigator;


@FindBy(xpath="")
public static WebElement BillSearch_Pagination_Lastpagenavigator;


@FindBy(xpath="")
public static WebElement BillSearch_Pagination_Previouspagenavigator;

@FindBy(xpath="")
public static WebElement BillSearch_Pagination_Nextpagenavigator;


//Methods
public void HeaderVerification(String UserName,String Payer ) {
seleniumHelper.isElementExist(UHCGLogo_element);
seleniumHelper.isElementExist(Header_Username_element);
seleniumHelper.validateElementText(Header_Username_element,UserName);//to parameterize user name
seleniumHelper.isElementExist(Header_Logout_element);
seleniumHelper.isElementExist(Header_Payer_element);   
seleniumHelper.validateElementText(Header_Payer_element, Payer);//to parameterize user name

}
public void TabVerification () {
seleniumHelper.isElementExist(Menu_Home);
seleniumHelper.isElementExist(Menu_Tools);
seleniumHelper.isElementExist(Menu_ClientService);
seleniumHelper.isElementExist(Menu_Admisnistration);    
seleniumHelper.isElementExist(Menu_Options);    
seleniumHelper.isElementExist(Menu_ReferenceLibraryPublisher);
seleniumHelper.isElementExist(Menu_ReferenceLibrary);
}

public void FooterVerification () {
               seleniumHelper.isElementExist(Footer_Copyright); 
               //actual xpath for copyright text to be co ordinated with Dev
               seleniumHelper.validateElementText(Footer_Copyright,", UnitedHealthcare Global | All rights reserved. | Any unauthorized duplication of this site or its contents is strictly prohibited");   
               
               seleniumHelper.isElementExist(Footer_PrivacyPolicy_link);
               seleniumHelper.clickElement(Footer_PrivacyPolicy_link);
               seleniumHelper.isElementExist(PrivacyPolicy_page);
               seleniumHelper.validateElementText(PrivacyPolicy_page_text, "");
               seleniumHelper.clickElement(PrivacyPolicy_page_closelink);
               
               
               seleniumHelper.isElementExist(Footer_SecurityPolicy_link);
               seleniumHelper.clickElement(Footer_SecurityPolicy_link);
               seleniumHelper.isElementExist(SecurityPolicy_page);
               seleniumHelper.validateElementText(SecurityPolicy_page_text,"");
               seleniumHelper.clickElement(SecurityPolicy_page_closelink);
               
               
               seleniumHelper.isElementExist(Footer_TermsOfUse_link);
               seleniumHelper.clickElement(Footer_TermsOfUse_link);
               seleniumHelper.isElementExist(TermsOfUse_page);
               seleniumHelper.validateElementText(TermsofUse_page_text,"");
               seleniumHelper.clickElement(TermsofUse_page_closelink);
               

}

public void LogoutVerification () {
               seleniumHelper.clickElement(Header_Logout_element);
               seleniumHelper.isElementExist(LoginPage.UserName_box);
}


public void SearchCriteriaFieldsVerification () {
               seleniumHelper.isElementExist(Text_BillSearch);
               seleniumHelper.validateElementText(Text_BillSearch,"Bill Search");
               seleniumHelper.isElementExist(BillSearch_Search_button);
               seleniumHelper.isElementExist(BillSearch_Reset_button);
               seleniumHelper.isElementExist(BillSearch_note);
               seleniumHelper.validateElementText(BillSearch_note,"At least one search field must be entered. Fields marked with * can use Wild Card values.");
               
               seleniumHelper.isElementExist(BillSearch_UHCGClaimID_label);
               seleniumHelper.validateElementText(BillSearch_UHCGClaimID_label,"UHCG Claim ID");
               seleniumHelper.isElementExist(BillSearch_UHCGClaimID_textfield);
               
               seleniumHelper.isElementExist(BillSearch_UHCGMemberID_label);
               seleniumHelper.validateElementText(BillSearch_UHCGMemberID_label,"UHCG Member ID");
               seleniumHelper.isElementExist(BillSearch_UHCGMemberID_textfield);
               
               seleniumHelper.isElementExist(BillSearch_ICN_label);
               seleniumHelper.validateElementText(BillSearch_ICN_label,"ICN");
               seleniumHelper.isElementExist(BillSearch_ICN_textfield);
               
               seleniumHelper.isElementExist(BillSearch_MemberFirstName_label);
               seleniumHelper.validateElementText(BillSearch_MemberFirstName_label,"Member First Name*");
               seleniumHelper.isElementExist(BillSearch_MemberFirstName_textfield);
               
               
               seleniumHelper.isElementExist(BillSearch_MemberLastName_label);
               seleniumHelper.validateElementText(BillSearch_MemberLastName_label,"Member Last Name*");
               seleniumHelper.isElementExist(BillSearch_MemberLastName_textfield);
               
               
               seleniumHelper.isElementExist(BillSearch_DOB_label);
               seleniumHelper.validateElementText(BillSearch_DOB_label,"Date of Birth");
               seleniumHelper.isElementExist(BillSearch_DOB_dropdown);
               
               
               seleniumHelper.isElementExist(BillSearch_ClaimStatus_label);
               seleniumHelper.validateElementText(BillSearch_ClaimStatus_label,"Claim Status");
               seleniumHelper.isElementExist(BillSearch_ClaimStatus_dropdown);
               //should we click before selectinG options -  to be checked after dev deployment
               seleniumHelper.validateElementText(BillSearch_ClaimStatus_dropdown_Select_Option1,"Select");
               seleniumHelper.validateElementText(BillSearch_ClaimStatus_dropdown_Select_Option2,"Client Benefit Determination");
               seleniumHelper.validateElementText(BillSearch_ClaimStatus_dropdown_Select_Option3,"Arbitrations");
               seleniumHelper.validateElementText(BillSearch_ClaimStatus_dropdown_Select_Option4,"UHCG Benefit Determination");
               seleniumHelper.validateElementText(BillSearch_ClaimStatus_dropdown_Select_Option5,"Returned");
               seleniumHelper.validateElementText(BillSearch_ClaimStatus_dropdown_Select_Option6,"Voided");
               
               
               
               
               seleniumHelper.isElementExist(BillSearch_BilledCharges_label);
               seleniumHelper.validateElementText(BillSearch_BilledCharges_label,"Billed Charges");
               seleniumHelper.isElementExist(BillSearch_BilledCharges_textfield);
               
               seleniumHelper.isElementExist(BillSearch_DOS_label);
               seleniumHelper.validateElementText(BillSearch_DOS_label,"Date of Service");
               seleniumHelper.isElementExist(BillSearch_DOS_dropdown);
               
               
               //custom fields to be modified as per the payer
               seleniumHelper.isElementExist(BillSearch_Customfield1_label);
               seleniumHelper.validateElementText(BillSearch_Customfield1_label,"");
               seleniumHelper.isElementExist(BillSearch_Customfield1_textfield);
               
               seleniumHelper.isElementExist(BillSearch_Customfield2_label);
               seleniumHelper.validateElementText(BillSearch_Customfield2_label,"");
               seleniumHelper.isElementExist(BillSearch_Customfield2_textfield);
               
               seleniumHelper.isElementExist(BillSearch_Customfield3_label);
               seleniumHelper.validateElementText(BillSearch_Customfield3_label,"");
               seleniumHelper.isElementExist(BillSearch_Customfield3_textfield);
               
}
}



