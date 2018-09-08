package uHAPortal.tests;

import org.testng.annotations.Test;

public class HomeTest extends BaseTest {

	
	@Test(enabled=false)
	public void Tc_01() {
		HomePage.validatinglogo();
		
	}
	
	@Test(enabled=true)
	public void Tc_02() {
		
		HomePage.validateUserName();
		
	}
	
	
	@Test(enabled=false)
	public void Tc_04() throws Throwable {
		
		HomePage.validatingPopup();
		
	}
	
	@Test(enabled=false)
	public void Tc_05() throws Throwable {
		
		HomePage.AcceptingPopup();
		
	}
	
	@Test(enabled=false)
	public void Tc_06() throws Throwable {
		
		HomePage.RejectingPopup();
		
	}
	
	@Test(enabled=false)
	public void Tc_07() throws Throwable {
		
		HomePage.Logout();
		
	}
	
	
	//Test cases for Tabs
	
	@Test(enabled=true)
	
	public void TC_08() throws Throwable{
		HomePage.validatingTabs();
	}
	
	@Test(enabled=false)
	
	public void TC_09() throws Throwable{
		HomePage.validating_DocumentExchange_Submenu();
	}


@Test(enabled=false)

public void TC_10() throws Throwable{
	HomePage.validating_Tools_Menus();
}

@Test(enabled=false)

public void TC_11() throws Throwable{
	HomePage.validaitng_UHCGRejected_Submenu();
}

@Test(enabled=false)

public void TC_12() throws Throwable{
	HomePage.validatung_CSR_Menu();
}


@Test(enabled=false)

public void TC_13() throws Throwable{
	HomePage.validating_Admin_Menu();
}

@Test(enabled=false)

public void TC_14() throws Throwable{
	HomePage.validating_Options_Menu();
}

@Test(enabled=false)

public void TC_15() throws Throwable{
	HomePage.validatingWelcomeMsg();

}

@Test(enabled=false)

public void TC_16() throws Throwable{
	HomePage.validatingInformationMsg();

}

@Test(enabled=false)
public void TC_17() throws Throwable{
	
	HomePage.validatingInformationMsgtimeout();

}

@Test(enabled=false)
public void TC_18() throws Throwable{
	
	HomePage.validatingExternalLinks();

}

@Test(enabled=false)
public void TC_19() throws Throwable{
	
	HomePage.validatingLinks();

}
@Test(enabled=false)
public void TC_20() throws Throwable{
	
	HomePage.validatingRetrivalLinks();

}
@Test(enabled=false)
public void TC_21() throws Throwable{
	
	HomePage.validatingRetrivalLinks();
	

}
@Test(enabled=false)
public void TC_22() throws Throwable{
	
	HomePage.validatingFooter();
	

}
}
