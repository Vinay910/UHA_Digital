package uHAPortal.tests;

import org.testng.annotations.Test;

public class CategoryManagerCreateTest extends BaseTest {

	@Test(groups="Category_Manager_Create",priority=0)
	public void Opening_Category_manager_Create_Page() 
	{
		try {
			HomePage = LoginPage.login(Environment("UHA_UserName"),Environment("UHA_Password"));
		} catch (Throwable e) {
			e.getMessage();
		}
		categoryManagerPage=HomePage.move_to_Category_manager();
		categoryManagerCreatePage=categoryManagerPage.redirect_create_category();
	}
	@Test(dependsOnMethods="Opening_Category_manager_Create_Page",enabled=false)
	public void Header_Validation() 
	{
		categoryManagerCreatePage.HeaderVerification("SANDEEP SHAHI", "UHAP - TB47PROD");
	}
	@Test(dependsOnMethods="Opening_Category_manager_Create_Page",enabled=false)
	public void Tabs_Validation() 
	{	
		categoryManagerCreatePage.validatingTabs();
		try {
			categoryManagerCreatePage.validating_Tools_Menus();
			categoryManagerCreatePage.validating_Admin_Menu();
			categoryManagerCreatePage.validaitng_UHCGRejected_Submenu();
			categoryManagerCreatePage.validatung_CSR_Menu();
			categoryManagerCreatePage.validating_Options_Menu();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		
	}
	@Test(dependsOnMethods="Opening_Category_manager_Create_Page",enabled=false)
	public void Footer_Validation() 
	{
		categoryManagerCreatePage.validatingFooter();
		categoryManagerCreatePage.validatePrivacyPolicy();
		categoryManagerCreatePage.validateSecurityPolicy();
		categoryManagerCreatePage.validateTermsOfUse();
	}	
	
	@Test(dependsOnMethods="Opening_Category_manager_Create_Page",priority=0)
	public void Main_Page_Validation() 
	{
		categoryManagerCreatePage.validate_Main_Page();
	}
	
	//Billed methods
	
	@Test(dependsOnMethods="Opening_Category_manager_Create_Page",priority=1,enabled=false)
	public void Billed_Charges_Validation()
	{
		categoryManagerCreatePage.Billed_CheckBox();
		categoryManagerCreatePage.validate_Label_Billed_Charge_Box();
	}
	
	@Test(dependsOnMethods="Billed_Charges_Validation",priority=1,enabled=false)
	public void Create_Category_Billed_Greater()
	{
		categoryManagerCreatePage.CategoryName();
		categoryManagerCreatePage.Set_Active();
		categoryManagerCreatePage.validate_Greater_Billed();
		categoryManagerCreatePage.click_save();
	}
	@Test(dependsOnMethods= {"Billed_Charges_Validation","Create_Category_Billed_Greater"},priority=1,enabled=false)
	public void Create_Category_Billed_Less()
	{
		categoryManagerCreatePage.Billed_CheckBox();
		categoryManagerCreatePage.CategoryName();
		categoryManagerCreatePage.validate_Less_Billed();
		categoryManagerCreatePage.click_save();
	}
	@Test(dependsOnMethods= {"Billed_Charges_Validation","Create_Category_Billed_Less"},priority=1,enabled=false)
	public void Create_Category_Billed_Between()
	{
		categoryManagerCreatePage.Billed_CheckBox();
		categoryManagerCreatePage.CategoryName();
		categoryManagerCreatePage.validate_Between_Billed();
		categoryManagerCreatePage.click_save();
	}
	
	//Allowed Methods
	@Test(dependsOnMethods="Opening_Category_manager_Create_Page",enabled=false,priority=2)
	public void Allowed_Charges_Validation()
	{
		categoryManagerCreatePage.Allowed_CheckBox();
		categoryManagerCreatePage.validate_Label_Allowed_Charge_Box();
	}
	
	@Test(dependsOnMethods="Allowed_Charges_Validation",enabled=false,priority=2)
	public void Create_Category_Allowed_Greater()
	{
		categoryManagerCreatePage.CategoryName();
		categoryManagerCreatePage.validate_Greater_Allowed();
		categoryManagerCreatePage.click_save();
	}
	@Test(dependsOnMethods= {"Allowed_Charges_Validation","Create_Category_Allowed_Greater"},enabled=false,priority=2)
	public void Create_Category_Allowed_Less()
	{
		categoryManagerCreatePage.Allowed_CheckBox();
		categoryManagerCreatePage.CategoryName();
		categoryManagerCreatePage.validate_Less_Allowed();
		categoryManagerCreatePage.click_save();
	}
	@Test(dependsOnMethods= {"Allowed_Charges_Validation","Create_Category_Allowed_Less"},enabled=false,priority=2)
	public void Create_Category_Allowed_Between()
	{
		categoryManagerCreatePage.Allowed_CheckBox();
		categoryManagerCreatePage.CategoryName();
		categoryManagerCreatePage.validate_Between_Allowed();
		categoryManagerCreatePage.click_save();
	}
	
	//Aging DOS
	
	@Test(dependsOnMethods="Opening_Category_manager_Create_Page",enabled=false,priority=3)
	public void AgingDOS_Charges_Validation()
	{
		categoryManagerCreatePage.AgingDOS_CheckBox();
		categoryManagerCreatePage.validate_Label_AgingDOS_Charge_Box();
	}
	
	@Test(dependsOnMethods="AgingDOS_Charges_Validation",enabled=false,priority=3)
	public void Create_Category_AgingDOS_Greater()
	{
		categoryManagerCreatePage.CategoryName();
		categoryManagerCreatePage.validate_Greater_AgingDOS();
		categoryManagerCreatePage.click_save();
	}
	@Test(dependsOnMethods= {"AgingDOS_Charges_Validation","Create_Category_AgingDOS_Greater"},enabled=false,priority=3)
	public void Create_Category_AgingDOS_Less()
	{
		categoryManagerCreatePage.AgingDOS_CheckBox();
		categoryManagerCreatePage.CategoryName();
		categoryManagerCreatePage.validate_Less_AgingDOS();
		categoryManagerCreatePage.click_save();
	}
	@Test(dependsOnMethods= {"AgingDOS_Charges_Validation","Create_Category_AgingDOS_Less"},enabled=false,priority=3)
	public void Create_Category_AgingDOS_Between()
	{
		categoryManagerCreatePage.AgingDOS_CheckBox();
		categoryManagerCreatePage.CategoryName();
		categoryManagerCreatePage.validate_Between_AgingDOS();
		categoryManagerCreatePage.click_save();
	}

	//AgingRD
	

	@Test(dependsOnMethods="Opening_Category_manager_Create_Page",enabled=false,priority=4)
	public void AgingRD_Charges_Validation()
	{
		categoryManagerCreatePage.AgingRD_CheckBox();
		categoryManagerCreatePage.validate_Label_AgingRD_Charge_Box();
	}
	
	@Test(dependsOnMethods="AgingRD_Charges_Validation",enabled=false,priority=4)
	public void Create_Category_AgingRD_Greater()
	{
		categoryManagerCreatePage.CategoryName();
		categoryManagerCreatePage.validate_Greater_AgingRD();
		categoryManagerCreatePage.click_save();
	}
	@Test(dependsOnMethods= {"AgingRD_Charges_Validation","Create_Category_AgingRD_Greater"},enabled=false,priority=4)
	public void Create_Category_AgingRD_Less()
	{
		categoryManagerCreatePage.AgingRD_CheckBox();
		categoryManagerCreatePage.CategoryName();
		categoryManagerCreatePage.validate_Less_AgingRD();
		categoryManagerCreatePage.click_save();
	}
	@Test(dependsOnMethods= {"AgingRD_Charges_Validation","Create_Category_AgingRD_Less"},enabled=false,priority=4)
	public void Create_Category_AgingRD_Between()
	{
		categoryManagerCreatePage.AgingRD_CheckBox();
		categoryManagerCreatePage.CategoryName();
		categoryManagerCreatePage.validate_Between_AgingRD();
		categoryManagerCreatePage.click_save();
	}
	
	//Aging CBD
	
	@Test(dependsOnMethods="Opening_Category_manager_Create_Page",enabled=false,priority=5)
	public void AgingCBD_Charges_Validation()
	{
		categoryManagerCreatePage.AgingCBD_CheckBox();
		categoryManagerCreatePage.validate_Label_AgingCBD_Charge_Box();
	}
	
	@Test(dependsOnMethods="AgingCBD_Charges_Validation",enabled=false,priority=5)
	public void Create_Category_AgingCBD_Greater()
	{
		categoryManagerCreatePage.CategoryName();
		categoryManagerCreatePage.validate_Greater_AgingCBD();
		categoryManagerCreatePage.click_save();
	}
	@Test(dependsOnMethods= {"AgingCBD_Charges_Validation","Create_Category_AgingCBD_Greater"},enabled=false,priority=5)
	public void Create_Category_AgingCBD_Less()
	{
		categoryManagerCreatePage.AgingCBD_CheckBox();
		categoryManagerCreatePage.CategoryName();
		categoryManagerCreatePage.validate_Less_AgingCBD();
		categoryManagerCreatePage.click_save();
	}
	@Test(dependsOnMethods= {"AgingCBD_Charges_Validation","Create_Category_AgingCBD_Less"},enabled=false,priority=5)
	public void Create_Category_AgingCBD_Between()
	{
		categoryManagerCreatePage.AgingCBD_CheckBox();
		categoryManagerCreatePage.CategoryName();
		categoryManagerCreatePage.validate_Between_AgingCBD();
		categoryManagerCreatePage.click_save();
	}

	//Diag_Code
	
	@Test(dependsOnMethods="Opening_Category_manager_Create_Page",enabled=false,priority=6)
	public void Diag_Code_Validation()
	{
		categoryManagerCreatePage.Diag_Code_CheckBox();
		categoryManagerCreatePage.validate_Label_Diagnosis_Code();
	}
	@Test(dependsOnMethods="Diag_Code_Validation",enabled=false,priority=6)
	public void Create_Diag_ICD9_or_ICD10()
	{
		categoryManagerCreatePage.CategoryName();
		categoryManagerCreatePage.ICD9_or_ICD10();
		categoryManagerCreatePage.click_save();
	}
	@Test(dependsOnMethods= {"Diag_Code_Validation","Create_Diag_ICD9_or_ICD10"},enabled=false,priority=6)
	public void Create_Diag_ICD9_Between_ICD10()
	{
		categoryManagerCreatePage.Diag_Code_CheckBox();
		categoryManagerCreatePage.ICD9_Between_ICD10();
		categoryManagerCreatePage.click_save();
	}
	
	//CPT Code
	
	@Test(dependsOnMethods="Opening_Category_manager_Create_Page",enabled=false,priority=7)
	public void CPT_Code_Validation()
	{
		categoryManagerCreatePage.CPT_Code_CheckBox();
		categoryManagerCreatePage.validate_Label_CPT_Code();
	}
	@Test(dependsOnMethods="CPT_Code_Validation",enabled=false,priority=7)
	public void Create_CPT()
	{
		categoryManagerCreatePage.CategoryName();
		categoryManagerCreatePage.CPT1_Code();
		categoryManagerCreatePage.click_save();
	}
	@Test(dependsOnMethods= {"CPT_Code_Validation","Create_CPT"},enabled=false,priority=7)
	public void Create_CPT_Less()
	{
		categoryManagerCreatePage.CategoryName();
		categoryManagerCreatePage.Less_CPT_Code();
		categoryManagerCreatePage.click_save();
	}
	@Test(dependsOnMethods= {"CPT_Code_Validation","Create_CPT_Less"},enabled=false,priority=7)
	public void Create_CPT_Between()
	{
		categoryManagerCreatePage.CategoryName();
		categoryManagerCreatePage.Between_CPT_Code();
		categoryManagerCreatePage.click_save();
	}
	
	//Claim Type
	
	@Test(dependsOnMethods="Opening_Category_manager_Create_Page",enabled=false,priority=8)
	public void Claim_Type_Validation()
	{
		categoryManagerCreatePage.Claim_type_CheckBox();
		categoryManagerCreatePage.validate_Label_Claim_Type();
	}
	
	@Test(dependsOnMethods="Claim_Type_Validation",enabled=false,priority=8)
	public void Claim_Type_Outpatient()
	{
		categoryManagerCreatePage.CategoryName();
		categoryManagerCreatePage.Claim_Outpatient();
		categoryManagerCreatePage.click_save();
	}
	@Test(dependsOnMethods= {"Claim_Type_Validation","Claim_Type_Outpatient"},enabled=false,priority=8)
		public void Claim_Type_Inpatient()
	{
		categoryManagerCreatePage.CategoryName();
		categoryManagerCreatePage.Claim_type_CheckBox();
		categoryManagerCreatePage.Claim_Inpatient();
		categoryManagerCreatePage.click_save();
	}
	@Test(dependsOnMethods= {"Claim_Type_Validation","Claim_Type_Outpatient"},enabled=false,priority=8)
		public void Claim_Type_Professional()
	{
		categoryManagerCreatePage.Claim_type_CheckBox();
		categoryManagerCreatePage.CategoryName();
		categoryManagerCreatePage.Claim_Professional();
		categoryManagerCreatePage.click_save();
	}
	
	//Place of Service
	
	@Test(dependsOnMethods="Opening_Category_manager_Create_Page",enabled=false,priority=9)
	public void POS_Validation()
	{
		categoryManagerCreatePage.POS_CheckBox();
		categoryManagerCreatePage.validate_label_POS();
	}
	
	@Test(dependsOnMethods="POS_Validation",enabled=false,priority=9)
	public void POS_Outpatient()
	{
		categoryManagerCreatePage.CategoryName();
		categoryManagerCreatePage.POS();
		categoryManagerCreatePage.click_save();
	}
	
	//Member ID
	
		@Test(dependsOnMethods="Opening_Category_manager_Create_Page",enabled=false,priority=10)
		public void Member_ID_Validation()
		{
			categoryManagerCreatePage.Member_ID_CheckBox();
			categoryManagerCreatePage.validate_label_Member_ID();
		}
		
		@Test(dependsOnMethods="Member_ID_Validation",enabled=false,priority=10)
		public void Member_ID()
		{
			categoryManagerCreatePage.CategoryName();
			categoryManagerCreatePage.enter_Member_ID();
			categoryManagerCreatePage.click_save();
		}
		
		//VandR
		
			@Test(dependsOnMethods="Opening_Category_manager_Create_Page",enabled=false,priority=11)
			public void VandR_Validation()
			{
				categoryManagerCreatePage.VandR_CheckBox();
				categoryManagerCreatePage.validate_label_VandR();
			}
			
			@Test(dependsOnMethods="VandR_Validation",enabled=false,priority=11)
			public void VandR_Replacement()
			{
				categoryManagerCreatePage.CategoryName();
				categoryManagerCreatePage.Replacement_Claim_VandR();
				categoryManagerCreatePage.click_save();
			}
			@Test(dependsOnMethods= {"VandR_Validation","VandR_Replacement"},enabled=false,priority=11)
			public void VandR_Non_Replacement()
			{
				categoryManagerCreatePage.CategoryName();
				categoryManagerCreatePage.VandR_CheckBox();
				categoryManagerCreatePage.Non_Replacement_Claim_VandR();
				categoryManagerCreatePage.click_save();
			}

			// Under INV
			
			@Test(dependsOnMethods="Opening_Category_manager_Create_Page",enabled=false,priority=12)
			public void INV_Validation()
			{
				categoryManagerCreatePage.INV_CheckBox();
				categoryManagerCreatePage.validate_label_INV();
			}
			
			@Test(dependsOnMethods="INV_Validation",enabled=false,priority=12)
			public void INV_Under()
			{
				categoryManagerCreatePage.CategoryName();
				categoryManagerCreatePage.Under_INV();
				categoryManagerCreatePage.click_save();
			}
			@Test(dependsOnMethods= {"INV_Validation","INV_Under"},enabled=false,priority=12)
			public void INV_Not_Under()
			{
				categoryManagerCreatePage.INV_CheckBox();
				categoryManagerCreatePage.CategoryName();
				categoryManagerCreatePage.Not_Under_INV();
				categoryManagerCreatePage.click_save();
			}
			
			@Test(dependsOnMethods={"INV_Validation","INV_Under"},enabled=false,priority=12)
			public void INV_Completed()
			{
				categoryManagerCreatePage.INV_CheckBox();
				categoryManagerCreatePage.CategoryName();
				categoryManagerCreatePage.Complete_Under_INV();
				categoryManagerCreatePage.click_save();
			}
			
	// Under MR
			
			@Test(dependsOnMethods="Opening_Category_manager_Create_Page",enabled=false,priority=13)
			public void MR_Validation()
			{
				categoryManagerCreatePage.MR_CheckBox();
				categoryManagerCreatePage.validate_label_MR();
			}
			
			@Test(dependsOnMethods="MR_Validation",enabled=false,priority=13)
			public void MR_Open()
			{
				categoryManagerCreatePage.CategoryName();
				categoryManagerCreatePage.Open_MR();
				categoryManagerCreatePage.click_save();
			}
			@Test(dependsOnMethods= {"MR_Validation","MR_Open"},enabled=false,priority=13)
			public void MR_Closed()
			{
				categoryManagerCreatePage.MR_CheckBox();
				categoryManagerCreatePage.CategoryName();
				categoryManagerCreatePage.Closed_MR();
				categoryManagerCreatePage.click_save();
			}
			
			@Test(dependsOnMethods={"MR_Validation","MR_Open","MR_Closed"},enabled=false,priority=13)
			public void MR_Without()
			{
				categoryManagerCreatePage.MR_CheckBox();
				categoryManagerCreatePage.CategoryName();
				categoryManagerCreatePage.Without_MR();
				categoryManagerCreatePage.click_save();
			}
			
			// Under CSR
			
						@Test(dependsOnMethods="Opening_Category_manager_Create_Page",enabled=false,priority=14)
						public void CSR_Validation()
						{
							categoryManagerCreatePage.CSR_CheckBox();
							categoryManagerCreatePage.validate_label_CSR();
						}
						
						@Test(dependsOnMethods="CSR_Validation",enabled=false,priority=14)
						public void CSR_Open()
						{
							categoryManagerCreatePage.CategoryName();
							categoryManagerCreatePage.Open_CSR();
							categoryManagerCreatePage.click_save();
						}
						@Test(dependsOnMethods= {"CSR_Validation","CSR_Open"},enabled=false,priority=14)
						public void CSR_Closed()
						{
							categoryManagerCreatePage.CSR_CheckBox();
							categoryManagerCreatePage.CategoryName();
							categoryManagerCreatePage.Closed_CSR();
							categoryManagerCreatePage.click_save();
						}
						
						@Test(dependsOnMethods={"CSR_Validation","CSR_Open","CSR_Closed"},enabled=false,priority=14)
						public void CSR_Without()
						{
							categoryManagerCreatePage.CSR_CheckBox();
							categoryManagerCreatePage.CategoryName();
							categoryManagerCreatePage.Without_CSR();
							categoryManagerCreatePage.click_save();
						}
						@Test(dependsOnMethods="Opening_Category_manager_Create_Page",enabled=true,priority=15)
						public void Main_Error_Validation()
						{
							categoryManagerCreatePage.AgingCBD_CheckBox();
							categoryManagerCreatePage.AgingDOS_CheckBox();
							categoryManagerCreatePage.AgingRD_CheckBox();
							categoryManagerCreatePage.Allowed_CheckBox();
							categoryManagerCreatePage.Billed_CheckBox();
							categoryManagerCreatePage.Claim_type_CheckBox();
							categoryManagerCreatePage.CPT_CheckBox();
							categoryManagerCreatePage.CSR_CheckBox();
							categoryManagerCreatePage.Diag_Code_CheckBox();
							categoryManagerCreatePage.INV_CheckBox();
							categoryManagerCreatePage.Member_ID_CheckBox();
							categoryManagerCreatePage.MR_CheckBox();
							categoryManagerCreatePage.POS_CheckBox();
							categoryManagerCreatePage.Policy_CheckBox();
							categoryManagerCreatePage.VandR_CheckBox();
							categoryManagerCreatePage.CategoryName();
							categoryManagerCreatePage.save_error();
							categoryManagerCreatePage.Main_Error();
						}
						@Test(dependsOnMethods= {"Opening_Category_manager_Create_Page","Main_Error_Validation"},enabled=true,priority=15)
						public void Billed_Error_Validation()
						{
							categoryManagerCreatePage.Billed_error();
						}
						@Test(dependsOnMethods= {"Opening_Category_manager_Create_Page","Main_Error_Validation"},enabled=true,priority=15)
						public void Allowed_Error_Validation()
						{
							categoryManagerCreatePage.Allowed_error();
						}
						@Test(dependsOnMethods= {"Opening_Category_manager_Create_Page","Main_Error_Validation"},enabled=true,priority=15)
						public void RD_Error_Validation()
						{
							categoryManagerCreatePage.RD_error();
						}
						@Test(dependsOnMethods= {"Opening_Category_manager_Create_Page","Main_Error_Validation"},enabled=true,priority=15)
						public void DOS_Error_Validation()
						{
							categoryManagerCreatePage.DOS_error();
						}
						@Test(dependsOnMethods= {"Opening_Category_manager_Create_Page","Main_Error_Validation"},enabled=true,priority=15)
						public void CBD_Error_Validation()
						{
							categoryManagerCreatePage.CBD_error();
						}
						@Test(dependsOnMethods= {"Opening_Category_manager_Create_Page","Main_Error_Validation"},enabled=true,priority=15)
						public void POS_Error_Validation()
						{
							categoryManagerCreatePage.POS_error();
						}
						@Test(dependsOnMethods= {"Opening_Category_manager_Create_Page","Main_Error_Validation"},enabled=true,priority=15)
						public void MI_Error_Validation()
						{
							categoryManagerCreatePage.Member_ID_error();
						}
}
