package uHAPortal.tests;

import org.testng.annotations.Test;

public class BillSearchTest extends BaseTest{
       
       //navigating to Bill Search Page
       @Test(enabled = true)
       public void TC_01(){
             BillSearchPage=HomePage.movetoBillSearch_page();
}
       
       //Verification of headers
       @Test(enabled = true)
       public void Tc_02(String UserName,String Payer ) {
             BillSearchPage=HomePage.movetoBillSearch_page();
             BillSearchPage.HeaderVerification(UserName, Payer);
       }
       
       
       //Verification of Tabs
             @Test(enabled = true)
             public void Tc_03() {
                    BillSearchPage=HomePage.movetoBillSearch_page();
                    BillSearchPage.TabVerification();
       }
                    
                    
    //Verification of Footer
                    @Test(enabled = true)
                    public void Tc_04() {
                           BillSearchPage=HomePage.movetoBillSearch_page();
                           BillSearchPage.FooterVerification();
                                               
    }
                    
       //Verification of Logout
                    //@Test(enabled = true)
                    //public void Tc_05() {
                           //BillSearchPage=HomePage.movetoBillSearch_page();
                           //BillSearchPage.LogoutVerification();
                           
                           
                    
                    
                    //Verification of  Search Criteria
                    @Test(enabled = true)
                    public void Tc_05(String DOB) {
                           BillSearchPage=HomePage.movetoBillSearch_page();
                           BillSearchPage.SearchCriteriaFieldsVerification();
                           //function is in Basetest, hence separating it.
                           BillSearchPage.selectDateFromCalender(DOB, currentDriver);
                                 
                    
                    }                   
}
