package uHAPortal.pages;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.support.PageFactory;

public class CategoryManagerEditPage extends CategoryManagerCreatePage{

	public CategoryManagerEditPage() {
		PageFactory.initElements(currentDriver, this);
		pageName = this.getClass().getSimpleName();
	}
	public String CategoryName_Edit()
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMhhmmss");  
		LocalDateTime now = LocalDateTime.now();  
		String Name="TST"+dtf.format(now);
		seleniumHelper.enterValueIntoTextField(CategoryName_TextBox, Name);
		CategoryName_TextBox.sendKeys("A");
		Name=Name+"A";
		return Name;
	}
	public void Edit_Category()
	{
		if(BilledCharges_CheckBox.isSelected())
		{
			BilledCharges_CheckBox.click();
		}
		if(AllowedAmount_CheckBox.isSelected())
		{
			AllowedAmount_CheckBox.click();
		}
		Boolean AgDOS=AgingDOS_CheckBox.isSelected();
		if(!AgDOS)
		{
			AgingDOS_CheckBox.click();
			seleniumHelper.clickElement(Greater_AgingDOS_Radio_Buttons);
			seleniumHelper.enterValueIntoTextField(Greater_AgingDOS_TextBox, "100");
		}
		Boolean AgRD=AgingRD_CheckBox.isSelected();
		if(!AgRD)
		{
			AgingRD_CheckBox.click();
			seleniumHelper.clickElement(Less_AgingRD_Radio_Buttons);
			seleniumHelper.enterValueIntoTextField(Less_AgingRD_TextBox, "100");
		}
		Boolean AgCBD=AgingCBD_CheckBox.isSelected();
		if(!AgCBD)
		{
			AgingCBD_CheckBox.click();
			seleniumHelper.clickElement(Greater_AgingCBD_Radio_Buttons);
			seleniumHelper.enterValueIntoTextField(Greater_AgingCBD_TextBox, "100");
		}
		if(Policy_CheckBox.isSelected())
		{
			Policy_CheckBox.click();
		}
		if(Diagnosis_CheckBox.isSelected())
		{
			Diagnosis_CheckBox.click();
		}
		if(CPT_CheckBox.isSelected())
		{
			CPT_CheckBox.click();
		}
		Boolean C_type=C_Type_CheckBox.isSelected();
		if(!C_type)
		{
			C_Type_CheckBox.click();
			seleniumHelper.clickElement(Claim_Type_Checkbox1);
			seleniumHelper.clickElement(Claim_Type_Checkbox2);
			seleniumHelper.clickElement(Claim_Type_Checkbox3);
		}
		Boolean POS=POS_CheckBox.isSelected();
		if(!POS)
		{
			POS_CheckBox.click();
			seleniumHelper.enterValueIntoTextField(POS_TextBox1, "11");
			seleniumHelper.enterValueIntoTextField(POS_TextBox2, "12");
			seleniumHelper.enterValueIntoTextField(POS_TextBox3, "13");
			seleniumHelper.enterValueIntoTextField(POS_TextBox4, "14");
			seleniumHelper.enterValueIntoTextField(POS_TextBox5, "15");
		}
		if(MemberID_CheckBox.isSelected())
		{
			MemberID_CheckBox.click();
		}	
		Boolean VandR=VandR_CheckBox.isSelected();
		if(!VandR)
		{
			VandR_CheckBox.click();
			seleniumHelper.clickElement(VandR_CheckBox);
			seleniumHelper.clickElement(VandR_CheckBox1);
			seleniumHelper.clickElement(VandR_CheckBox2);
		}
		Boolean INV=INV_CheckBox.isSelected();
		if(!INV)
		{
			INV_CheckBox.click();
			seleniumHelper.clickElement(INV_CheckBox1);
			seleniumHelper.clickElement(INV_CheckBox2);
			seleniumHelper.clickElement(INV_CheckBox3);
		}
		Boolean MR=MR_CheckBox.isSelected();
		if(!MR)
		{
			MR_CheckBox.click();
			seleniumHelper.clickElement(MR_CheckBox1);
			seleniumHelper.clickElement(MR_CheckBox2);
			seleniumHelper.clickElement(MR_CheckBox3);
		}
		Boolean CSR=ServiceRequest_CheckBox.isSelected();
		if(!CSR)
		{
			ServiceRequest_CheckBox.click();
			seleniumHelper.clickElement(CSR_CheckBox1);
			seleniumHelper.clickElement(CSR_CheckBox2);
			seleniumHelper.clickElement(CSR_CheckBox3);
		}
	}
}
