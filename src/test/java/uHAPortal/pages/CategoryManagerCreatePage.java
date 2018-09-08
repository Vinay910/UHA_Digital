package uHAPortal.pages;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CategoryManagerCreatePage extends CategoryManagerPage {
	
	public CategoryManagerCreatePage() {
		PageFactory.initElements(currentDriver, this);
		pageName = this.getClass().getSimpleName();
	}
	
	@FindBy(xpath="//*[@id=\"ctl00_Body1\"]/div/div[2]/div/div/div/div/div/div[2]/div[1]/div[2]/div/div/span/span[2]/span/span[2]")
	public static WebElement Active_CheckBox;
	
	@FindBy(xpath="//*[@id=\"expandBilledCharges\"]")
	public static WebElement BilledCharges_CheckBox;
	
	@FindBy(xpath="//*[@id=\"expandAllowedAmount\"]")
	public static WebElement AllowedAmount_CheckBox;
	
	@FindBy(xpath="//*[@id=\"expandAgingDOS\"]")
	public static WebElement AgingDOS_CheckBox;
	
	@FindBy(xpath="//*[@id=\"expandAgingRD\"]")
	public static WebElement AgingRD_CheckBox;
	
	@FindBy(xpath="//*[@id=\"expandAgingCBD\"]")
	public static WebElement AgingCBD_CheckBox;
	
	@FindBy(xpath="//*[@id=\"expandPolicyNum\"]")
	public static WebElement Policy_CheckBox;
	
	@FindBy(xpath="//*[@id=\"expandDiagnosisCode\"]")
	public static WebElement Diagnosis_CheckBox;
	
	@FindBy(xpath="//*[@id=\"expandCPTCode\"]")
	public static WebElement CPT_CheckBox;
	
	@FindBy(xpath="//*[@id=\"expandClaimType\"]")
	public static WebElement C_Type_CheckBox;
	
	@FindBy(xpath="//*[@id=\"expandPOS\"]")
	public static WebElement POS_CheckBox;
	
	@FindBy(xpath="//*[@id=\"expandMemberID\"]")
	public static WebElement MemberID_CheckBox;
	
	@FindBy(xpath="//*[@id=\"expandVoidReplace\"]")
	public static WebElement VandR_CheckBox;
	
	@FindBy(xpath="//*[@id=\"expandUnderInvestigation\"]")
	public static WebElement INV_CheckBox;
	
	@FindBy(xpath="//*[@id=\"expandMedRecordRequests\"]")
	public static WebElement MR_CheckBox;
	
	@FindBy(xpath="//*[@id=\"expandOtherRequest\"]")
	public static WebElement ServiceRequest_CheckBox;
	
	@FindBy(xpath="//*[@id=\"ctl00_Body1\"]/div[1]/div[2]/div/div/div/div/div/div[2]/div[1]/div[2]/div/label")
	public static WebElement Active_Label;
	
	@FindBy(xpath="//*[@id=\"ctl00_Body1\"]/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div[1]/div[1]/label")
	public static WebElement BilledCharges_Label;
	
	@FindBy(xpath="//*[@id=\"ctl00_Body1\"]/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div[1]/div[2]/label")
	public static WebElement AllowedAmount_Label;
	
	@FindBy(xpath="//*[@id=\"ctl00_Body1\"]/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div[1]/div[3]/label")
	public static WebElement AgingDOS_Label;
	
	@FindBy(xpath="//*[@id=\"ctl00_Body1\"]/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div[2]/div[1]/label")
	public static WebElement AgingRD_Label;
	
	@FindBy(xpath="//*[@id=\"ctl00_Body1\"]/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div[2]/div[2]/label")
	public static WebElement AgingCBD_Label;
	
	@FindBy(xpath="//*[@id=\"ctl00_Body1\"]/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div[5]/div[3]/label")
	public static WebElement Policy_Label;
	
	@FindBy(xpath="//*[@id=\"ctl00_Body1\"]/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div[2]/div[3]/label")
	public static WebElement Diagnosis_Label;
	
	@FindBy(xpath="//*[@id=\"ctl00_Body1\"]/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div[3]/div[1]/label")
	public static WebElement CPT_Label;
	
	@FindBy(xpath="//*[@id=\"ctl00_Body1\"]/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div[3]/div[2]/label")
	public static WebElement C_Type_Label;
	
	@FindBy(xpath="//*[@id=\"ctl00_Body1\"]/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div[3]/div[3]/label")
	public static WebElement POS_Label;
	
	@FindBy(xpath="//*[@id=\"ctl00_Body1\"]/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div[4]/div[1]/label")
	public static WebElement MemberID_Label;
	
	@FindBy(xpath="//*[@id=\"ctl00_Body1\"]/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div[4]/div[2]/label")
	public static WebElement VandR_Label;
	
	@FindBy(xpath="//*[@id=\"ctl00_Body1\"]/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div[4]/div[3]/label")
	public static WebElement INV_Label;
	
	@FindBy(xpath="//*[@id=\"ctl00_Body1\"]/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div[5]/div[1]/label")
	public static WebElement MR_Label;
	
	@FindBy(xpath="//*[@id=\"ctl00_Body1\"]/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div[5]/div[2]/label")
	public static WebElement ServiceRequest_Label;
	
	@FindBy(xpath="//*[@id=\"ctl00_Body1\"]/div[1]/div[2]/div/div/div/h1")
	public static WebElement Create_lable;
	
	@FindBy(xpath="//*[@id=\"ctl00_Body1\"]/div[1]/div[2]/div/div/div/div/div/div[2]/div[1]/h3")
	public static WebElement CategoryName_lable;
	
	@FindBy(xpath="//*[@id=\"categoryName\"]")
	public static WebElement CategoryName_TextBox;
	
	@FindBy(xpath="//*[@id=\"ctl00_Body1\"]/div[1]/div[2]/div/div/div/div/div/div[1]/div/button[1]")
	public static WebElement Save_Button;
	
	@FindBy(xpath="")
	public static WebElement SaveandExit_Button;
	
	@FindBy(xpath="//*[@id=\"ctl00_Body1\"]/div/div[2]/div/div/div/div/div/div[1]/div/a")
	public static WebElement Cancel_Button;
	
	@FindBy(xpath="//*[@id=\"panelBilledCharges\"]/div/h4")
	public static WebElement Billed_Charges_Main_lable;
	
	@FindBy(xpath="//*[@id=\"panelBilledCharges\"]/div/p")
	public static WebElement Billed_Charges_Note_lable;
	
	@FindBy(xpath="//*[@id=\"panelBilledCharges\"]/div/div[1]/div[1]/label")
	public static WebElement Greater_Billed_lable;
	
	@FindBy(xpath="//*[@id=\"panelBilledCharges\"]/div/div[2]/div[1]/label")
	public static WebElement Less_Billed_lable;
	
	@FindBy(xpath="//*[@id=\"panelBilledCharges\"]/div/div[3]/div[1]/label")
	public static WebElement Between_Billed_lable;
	
	@FindBy(xpath="//*[@id=\"option-bc-equal\"]")
	public static WebElement Greater_Radio_Buttons;
	
	@FindBy(xpath="//*[@id=\"option-bc-less\"]")
	public static WebElement Less_Radio_Buttons;
	
	@FindBy(xpath="//*[@id=\"option-bc-between\"]")
	public static WebElement Between_Radio_Buttons;
	
	@FindBy(xpath="//*[@id=\"fg-bc-equal\"]/input")
	public static WebElement Greater_Billed_TextBox;
	
	@FindBy(xpath="//*[@id=\"fg-bc-less\"]/input")
	public static WebElement Less_Billed_TextBox;
	
	@FindBy(xpath="//*[@id=\"fg-bc-between\"]/div[1]/div/input")
	public static WebElement Between_Billed_TextBox1;
	
	@FindBy(xpath="//*[@id=\"fg-bc-between\"]/div[3]/div/input")
	public static WebElement Between_Billed_TextBox2;
	
	@FindBy(xpath="//*[@id=\"fg-bc-equal\"]/span")
	public static WebElement Billed_Sign1;
	
	@FindBy(xpath="//*[@id=\"fg-bc-less\"]/span")
	public static WebElement Billed_Sign2;
	
	@FindBy(xpath="//*[@id=\"fg-bc-between\"]/div[1]/div/span")
	public static WebElement Billed_Sign3;
	
	@FindBy(xpath="//*[@id=\"panelAllowedAmount\"]/div/h4")
	public static WebElement Allowed_Charges_Main_lable;
	
	@FindBy(xpath="//*[@id=\"panelAllowedAmount\"]/div/p")
	public static WebElement Allowed_Charges_Note_lable;
	
	@FindBy(xpath="//*[@id=\"panelAllowedAmount\"]/div/div[1]/div[1]/label")
	public static WebElement Greater_Allowed_lable;
	
	@FindBy(xpath="//*[@id=\"panelAllowedAmount\"]/div/div[2]/div[1]/label")
	public static WebElement Less_Allowed_lable;
	
	@FindBy(xpath="//*[@id=\"panelAllowedAmount\"]/div/div[3]/div[1]")
	public static WebElement Between_Allowed_lable;
	
	@FindBy(xpath="//*[@id=\"option-aa-equal\"]")
	public static WebElement Greater_Allowed_Radio_Buttons;
	
	@FindBy(xpath="//*[@id=\"option-aa-less\"]")
	public static WebElement Less_Allowed_Radio_Buttons;
	
	@FindBy(xpath="//*[@id=\"option-aa-between\"]")
	public static WebElement Between_Allowed_Radio_Buttons;
	
	@FindBy(xpath="//*[@id=\"fg-aa-equal\"]/input")
	public static WebElement Greater_Allowed_TextBox;
	
	@FindBy(xpath="//*[@id=\"fg-aa-less\"]/input")
	public static WebElement Less_Allowed_TextBox;
	
	@FindBy(xpath="//*[@id=\"fg-aa-between\"]/div[1]/div/input")
	public static WebElement Between_Allowed_TextBox1;
	
	@FindBy(xpath="//*[@id=\"fg-aa-between\"]/div[3]/div/input")
	public static WebElement Between_Allowed_TextBox2;
	
	@FindBy(xpath="//*[@id=\"fg-aa-equal\"]/span")
	public static WebElement Allowed_Sign1;
	
	@FindBy(xpath="//*[@id=\"fg-aa-less\"]/span")
	public static WebElement Allowed_Sign2;
	
	@FindBy(xpath="//*[@id=\"fg-aa-between\"]/div[1]/div/span")
	public static WebElement Allowed_Sign3;
	
	@FindBy(xpath="//*[@id=\"panelAgingDOS\"]/div/h4")
	public static WebElement AgingDOS_Charges_Main_lable;
	
	@FindBy(xpath="//*[@id=\"panelAgingDOS\"]/div/p")
	public static WebElement AgingDOS_Charges_Note_lable;
	
	@FindBy(xpath="//*[@id=\"panelAgingDOS\"]/div/div[1]/div[1]/label")
	public static WebElement Greater_AgingDOS_lable;
	
	@FindBy(xpath="//*[@id=\"panelAgingDOS\"]/div/div[2]/div[1]/label")
	public static WebElement Less_AgingDOS_lable;
	
	@FindBy(xpath="//*[@id=\"panelAgingDOS\"]/div/div[3]/div[1]/label")
	public static WebElement Between_AgingDOS_lable;
	
	@FindBy(xpath="//*[@id=\"option-agingdos-equal\"]")
	public static WebElement Greater_AgingDOS_Radio_Buttons;
	
	@FindBy(xpath="//*[@id=\"option-agingdos-less\"]")
	public static WebElement Less_AgingDOS_Radio_Buttons;
	
	@FindBy(xpath="//*[@id=\"option-agingdos-between\"]")
	public static WebElement Between_AgingDOS_Radio_Buttons;
	
	@FindBy(xpath="//*[@id=\"AGDOSEqualOrGreaterValue\"]")
	public static WebElement Greater_AgingDOS_TextBox;
	
	@FindBy(xpath="//*[@id=\"AGDOSLessOrEqualValue\"]")
	public static WebElement Less_AgingDOS_TextBox;
	
	@FindBy(xpath="//*[@id=\"AGDOSBetweenValue1\"]")
	public static WebElement Between_AgingDOS_TextBox1;
	
	@FindBy(xpath="//*[@id=\"AGDOSBetweenValue2\"]")
	public static WebElement Between_AgingDOS_TextBox2;
	
	@FindBy(xpath="//*[@id=\"fg-ados-less\"]/span")
	public static WebElement AgingDOS_Sign1;
	
	@FindBy(xpath="//*[@id=\"fg-ados-less\"]/span")
	public static WebElement AgingDOS_Sign2;
	
	@FindBy(xpath="//*[@id=\"fg-agingdos-between\"]/div[4]/p")
	public static WebElement AgingDOS_Sign3;
	
	@FindBy(xpath="//*[@id=\"panelAgingRD\"]/div/h4")
	public static WebElement AgingRD_Charges_Main_lable;
	
	@FindBy(xpath="//*[@id=\"panelAgingRD\"]/div/p")
	public static WebElement AgingRD_Charges_Note_lable;
	
	@FindBy(xpath="//*[@id=\"panelAgingRD\"]/div/div[1]/div[1]/label")
	public static WebElement Greater_AgingRD_lable;
	
	@FindBy(xpath="//*[@id=\"panelAgingRD\"]/div/div[2]/div[1]/label")
	public static WebElement Less_AgingRD_lable;
	
	@FindBy(xpath="//*[@id=\"panelAgingRD\"]/div/div[3]/div[1]/label")
	public static WebElement Between_AgingRD_lable;
	
	@FindBy(xpath="//*[@id=\"option-ard-equal\"]")
	public static WebElement Greater_AgingRD_Radio_Buttons;
	
	@FindBy(xpath="//*[@id=\"option-ard-less\"]")
	public static WebElement Less_AgingRD_Radio_Buttons;
	
	@FindBy(xpath="//*[@id=\"option-ard-between\"]")
	public static WebElement Between_AgingRD_Radio_Buttons;
	
	@FindBy(xpath="//*[@id=\"AGRDEqualOrGreaterValue\"]")
	public static WebElement Greater_AgingRD_TextBox;
	
	@FindBy(xpath="//*[@id=\"AGRDLessOrEqualValue\"]")
	public static WebElement Less_AgingRD_TextBox;
	
	@FindBy(xpath="//*[@id=\"AGRDBetweenValue1\"]")
	public static WebElement Between_AgingRD_TextBox1;
	
	@FindBy(xpath="//*[@id=\"AGRDBetweenValue2\"]")
	public static WebElement Between_AgingRD_TextBox2;
	
	@FindBy(xpath="//*[@id=\"fg-ard-less\"]/span")
	public static WebElement AgingRD_Sign1;
	
	@FindBy(xpath="//*[@id=\"fg-ard-less\"]/span")
	public static WebElement AgingRD_Sign2;
	
	@FindBy(xpath="//*[@id=\"fg-ard-between\"]/div[4]/p")
	public static WebElement AgingRD_Sign3;
	
	@FindBy(xpath="//*[@id=\"panelAgingCBD\"]/div/h4")
	public static WebElement AgingCBD_Charges_Main_lable;
	
	@FindBy(xpath="//*[@id=\"panelAgingCBD\"]/div/p")
	public static WebElement AgingCBD_Charges_Note_lable;
	
	@FindBy(xpath="//*[@id=\"panelAgingCBD\"]/div/div[1]/div[1]/label")
	public static WebElement Greater_AgingCBD_lable;
	
	@FindBy(xpath="//*[@id=\"panelAgingCBD\"]/div/div[2]/div[1]/label")
	public static WebElement Less_AgingCBD_lable;
	
	@FindBy(xpath="//*[@id=\"panelAgingCBD\"]/div/div[3]/div[1]/label")
	public static WebElement Between_AgingCBD_lable;
	
	@FindBy(xpath="//*[@id=\"option-cbdq-equal\"]")
	public static WebElement Greater_AgingCBD_Radio_Buttons;
	
	@FindBy(xpath="//*[@id=\"option-cbdq-less\"]")
	public static WebElement Less_AgingCBD_Radio_Buttons;
	
	@FindBy(xpath="//*[@id=\"option-cbdq-between\"]")
	public static WebElement Between_AgingCBD_Radio_Buttons;
	
	@FindBy(xpath="//*[@id=\"CBDQEqualOrGreaterValue\"]")
	public static WebElement Greater_AgingCBD_TextBox;
	
	@FindBy(xpath="//*[@id=\"CBDQLessOrEqualValue\"]")
	public static WebElement Less_AgingCBD_TextBox;
	
	@FindBy(xpath="//*[@id=\"CBDQBetweenValue1\"]")
	public static WebElement Between_AgingCBD_TextBox1;
	
	@FindBy(xpath="//*[@id=\"CBDQBetweenValue2\"]")
	public static WebElement Between_AgingCBD_TextBox2;
	
	@FindBy(xpath="//*[@id=\"fg-cbdq-less\"]/span")
	public static WebElement AgingCBD_Sign1;
	
	@FindBy(xpath="//*[@id=\"fg-cbdq-less\"]/span")
	public static WebElement AgingCBD_Sign2;
	
	@FindBy(xpath="//*[@id=\"fg-bc-between\"]/div[4]/p")
	public static WebElement AgingCBD_Sign3;
	
	@FindBy(xpath="//*[@id=\"panelPolicyNum\"]/div/h4")
	public static WebElement Policy_Main_Label;
	
	@FindBy(xpath="//*[@id=\"panelPolicyNum\"]/div/p")
	public static WebElement Policy_Note_Label;
	
	@FindBy(xpath="//*[@id=\"fg-pnPVRC-planvariation\"]/label")
	public static WebElement Policy_PlanVariation_Label;
	
	@FindBy(xpath="//*[@id=\"fg-pnPVRC-reportingcode\"]/label")
	public static WebElement Policy_ReportingCode_Label;
	
	@FindBy(xpath="//*[@id=\"fg-pnPVRC-less\"]/label")
	public static WebElement Policy_PlanVariation_Label1;
	
	@FindBy(xpath="//*[@id=\"fg-pnPVRC-less\"]/label")
	public static WebElement Policy_ReportingCode_Label1;
	
	@FindBy(xpath="//*[@id=\"panelPolicyNum\"]/div/div[1]/span/span/span[1]")
	public static WebElement Policy_Dropdown;
	
	@FindBy(xpath="//*[@id=\"panelPolicyNum\"]/div/div[1]/p/button")
	public static WebElement Policy_Add_Button;
	
	@FindBy(xpath="//*[@id=\"panelPolicyNum\"]/div/div[1]/div/textarea")
	public static WebElement Policy_Add_TextBox;
	
	@FindBy(xpath="//*[@id=\"option-pnPVRC-less\"]")
	public static WebElement Policy_PlanVariation_RadioButton;
	
	@FindBy(xpath="//*[@id=\"option-pnPVRC-less\"]")
	public static WebElement Policy_PlanVariation_RadioButton1;
	
	@FindBy(xpath="//*[@id=\"fg-pnPVRC-planvariation\"]/textarea")
	public static WebElement Policy_PlanVariation_TextBox;
	
	@FindBy(xpath="//*[@id=\"fg-pnPVRC-less\"]/div[1]/input")
	public static WebElement Policy_PlanVariation_TextBox1;
	
	@FindBy(xpath="//*[@id=\"fg-pnPVRC-less\"]/div[2]/input")
	public static WebElement Policy_PlanVariation_TextBox2;
	
	@FindBy(xpath="//*[@id=\"fg-pnPVRC-reportingcode\"]/textarea")
	public static WebElement Policy_ReportingCode_TextBox;
	
	@FindBy(xpath="//*[@id=\"fg-pnPVRC-less\"]/div[1]/input")
	public static WebElement Policy_ReportingCode_TextBox1;
	
	@FindBy(xpath="//*[@id=\"fg-pnPVRC-less\"]/div[2]/input")
	public static WebElement Policy_ReportingCode_TextBox2;
	
	@FindBy(xpath="//*[@id=\"panelDiagnosisCode\"]/div/h4")
	public static WebElement DC_Main_label;
	
	@FindBy(xpath="//*[@id=\"panelDiagnosisCode\"]/div/p")
	public static WebElement DC_Main_label_note;
	
	@FindBy(xpath="//*[@id=\"option-diagcode-equal\"][@value=\"1\"]")
	public static WebElement DC_Radio1;
	
	@FindBy(xpath="//*[@id=\"option-diagcode-equal\"][@value=\"2\"]")
	public static WebElement DC_Radio2;
	
	@FindBy(xpath="//*[@id=\"panelDiagnosisCode\"]/div/div[1]/div[1]/label/span")
	public static WebElement DC_ICD_Label1;
	
	@FindBy(xpath="//*[@id=\"panelDiagnosisCode\"]/div/div[2]/div[1]/label/span")
	public static WebElement DC_Main_label2;
	
	@FindBy(xpath="//*[@id=\"ICD9OrICD10Value1\"]")
	public static WebElement DC_Textbox1;
	
	@FindBy(xpath="//*[@id=\"ICD9OrICD10Value2\"]")
	public static WebElement DC_Textbox2;
	
	@FindBy(xpath="//*[@id=\"ICD9OrICD10Value3\"]")
	public static WebElement DC_Textbox3;
	
	@FindBy(xpath="//*[@id=\"ICD9OrICD10Value4\"]")
	public static WebElement DC_Textbox4;
	
	@FindBy(xpath="//*[@id=\"ICD9OrICD10Value5\"]")
	public static WebElement DC_Textbox5;
	
	@FindBy(xpath="//*[@id=\"BetweenICD9OrICD10Value1\"]")
	public static WebElement DC_Textbox6;
	
	@FindBy(xpath="//*[@id=\"BetweenICD9OrICD10Value2\"]")
	public static WebElement DC_Textbox7;
	
	@FindBy(xpath="//*[@id=\"panelCPTCode\"]/div/h4")
	public static WebElement CPT_Main_Label;
	
	@FindBy(xpath="//*[@id=\"panelCPTCode\"]/div/p")
	public static WebElement CPT_Note_Label;
	
	@FindBy(xpath="//*[@id=\"option-cptCode-equal\"]")
	public static WebElement CPT_Radio1;
	
	@FindBy(xpath="//*[@id=\"CPTCodesEqualValue1\"]")
	public static WebElement CPT_TextBox1;
	
	@FindBy(xpath="//*[@id=\"CPTCodesEqualValue2\"]")
	public static WebElement CPT_TextBox2;
	
	@FindBy(xpath="//*[@id=\"CPTCodesEqualValue3\"]")
	public static WebElement CPT_TextBox3;
	
	@FindBy(xpath="//*[@id=\"CPTCodesEqualValue4\"]")
	public static WebElement CPT_TextBox4;
	
	@FindBy(xpath="//*[@id=\"CPTCodesEqualValue5\"]")
	public static WebElement CPT_TextBox5;
	
	@FindBy(xpath="//*[@id=\"panelCPTCode\"]/div/div[2]/div[1]/label")
	public static WebElement CPT_Less_label;
	
	@FindBy(xpath="//*[@id=\"option-cptCode-less\"]")
	public static WebElement CPT_Radio2;
	
	@FindBy(xpath="//*[@id=\"CPTCodesLessOrEqualValue\"]")
	public static WebElement CPT_Less_TextBox;
	
	@FindBy(xpath="//*[@id=\"panelCPTCode\"]/div/div[3]/div[1]/label")
	public static WebElement CPT_Between_Label;
	
	@FindBy(xpath="//*[@id=\"option-cptCode-between\"]")
	public static WebElement CPT_Radio3;
	
	@FindBy(xpath="//*[@id=\"CPTCodesBetweenValue1\"]")
	public static WebElement CPT_Between_TextBox1;
	
	@FindBy(xpath="//*[@id=\"CPTCodesBetweenValue2\"]")
	public static WebElement CPT_Between_TextBox2;
	
	@FindBy(xpath="//*[@id=\"panelClaimType\"]/div/h4")
	public static WebElement Claim_Type_Label;
	
	@FindBy(xpath="//*[@id=\"panelClaimType\"]/div/p")
	public static WebElement Claim_Type_Main_Label;
	
	@FindBy(xpath="//*[@id=\"panelClaimType\"]/div/div/div[1]/label/input")
	public static WebElement Claim_Type_Checkbox1;
	
	@FindBy(xpath="//*[@id=\"panelClaimType\"]/div/div/div[2]/label/input")
	public static WebElement Claim_Type_Checkbox2;
	
	@FindBy(xpath="//*[@id=\"panelClaimType\"]/div/div/div[3]/label/input")
	public static WebElement Claim_Type_Checkbox3;
	
	@FindBy(xpath="//*[@id=\"panelClaimType\"]/div/div/div[1]/label")
	public static WebElement Claim_Type_Label1;
	
	@FindBy(xpath="//*[@id=\"panelClaimType\"]/div/div/div[2]/label")
	public static WebElement Claim_Type_Label2;
	
	@FindBy(xpath="//*[@id=\"panelClaimType\"]/div/div/div[3]/label")
	public static WebElement Claim_Type_Label3;
	
	@FindBy(xpath="//*[@id=\"panelPOS\"]/div/h4")
	public static WebElement POS_Main_Label;
	
	@FindBy(xpath="//*[@id=\"panelPOS\"]/div/p")
	public static WebElement POS_Note_Label;
	
	@FindBy(xpath="//*[@id=\"panelPOS\"]/div/div/input[1]")
	public static WebElement POS_TextBox1;
	
	@FindBy(xpath="//*[@id=\"panelPOS\"]/div/div/input[2]")
	public static WebElement POS_TextBox2;
	
	@FindBy(xpath="//*[@id=\"panelPOS\"]/div/div/input[3]")
	public static WebElement POS_TextBox3;
	
	@FindBy(xpath="//*[@id=\"panelPOS\"]/div/div/input[4]")
	public static WebElement POS_TextBox4;
	
	@FindBy(xpath="//*[@id=\"panelPOS\"]/div/div/input[5]")
	public static WebElement POS_TextBox5;
	
	@FindBy(xpath="//*[@id=\"panelMemberID\"]/div/h4")
	public static WebElement MemberID_Label_Main;
	
	@FindBy(xpath="//*[@id=\"panelMemberID\"]/div/p")
	public static WebElement MemberID_Label_Note;
	
	@FindBy(xpath="//*[@id=\"inputMemberID\"]")
	public static WebElement MemberID_TextBox;
	
	@FindBy(xpath="//*[@id=\"panelVoidReplace\"]/div/h4")
	public static WebElement VandR_Label_Main;
	
	@FindBy(xpath="//*[@id=\"panelVoidReplace\"]/div/p")
	public static WebElement VandR_Label_Note;
	
	@FindBy(xpath="//*[@id=\"panelVoidReplace\"]/div/div/div[1]/label")
	public static WebElement VandR_Label1;
	
	@FindBy(xpath="//*[@id=\"panelVoidReplace\"]/div/div/div[2]/label")
	public static WebElement VandR_Label2;
	
	@FindBy(xpath="//*[@id=\"panelVoidReplace\"]/div/div/div[1]/label/input")
	public static WebElement VandR_CheckBox1;
	
	@FindBy(xpath="//*[@id=\"panelVoidReplace\"]/div/div/div[2]/label/input")
	public static WebElement VandR_CheckBox2;
	
	@FindBy(xpath="//*[@id=\"panelUnderInvestigation\"]/div/h4")
	public static WebElement INV_Label_Main;
	
	@FindBy(xpath="//*[@id=\"panelUnderInvestigation\"]/div/p")
	public static WebElement INV_Label_Note;
	
	@FindBy(xpath="//*[@id=\"panelUnderInvestigation\"]/div/p")
	public static WebElement INV_Label1;
	
	@FindBy(xpath="//*[@id=\"panelUnderInvestigation\"]/div/div/div[2]/label")
	public static WebElement INV_Label2;
	
	@FindBy(xpath="//*[@id=\"panelUnderInvestigation\"]/div/div/div[3]/label")
	public static WebElement INV_Label3;
	
	@FindBy(xpath="//*[@id=\"panelUnderInvestigation\"]/div/div/div[1]/label/input")
	public static WebElement INV_CheckBox1;
	
	@FindBy(xpath="//*[@id=\"panelUnderInvestigation\"]/div/div/div[2]/label/input")
	public static WebElement INV_CheckBox2;
	
	@FindBy(xpath="//*[@id=\"panelUnderInvestigation\"]/div/div/div[3]/label/input")
	public static WebElement INV_CheckBox3;
	
	@FindBy(xpath="//*[@id=\"panelMedRecordRequests\"]/div/h4")
	public static WebElement MR_Label_Main;
	
	@FindBy(xpath="//*[@id=\"panelMedRecordRequests\"]/div/p")
	public static WebElement MR_Label_Note;
	
	@FindBy(xpath="//*[@id=\"panelMedRecordRequests\"]/div/div/div[1]/label")
	public static WebElement MR_Label1;
	
	@FindBy(xpath="//*[@id=\"panelMedRecordRequests\"]/div/div/div[2]/label")
	public static WebElement MR_Label2;
	
	@FindBy(xpath="//*[@id=\"panelMedRecordRequests\"]/div/div/div[3]/label")
	public static WebElement MR_Label3;
	
	@FindBy(xpath="//*[@id=\"panelMedRecordRequests\"]/div/div/div[1]/label/input")
	public static WebElement MR_CheckBox1;
	
	@FindBy(xpath="//*[@id=\"panelMedRecordRequests\"]/div/div/div[2]/label/input")
	public static WebElement MR_CheckBox2;
	
	@FindBy(xpath="//*[@id=\"panelMedRecordRequests\"]/div/div/div[3]/label/input")
	public static WebElement MR_CheckBox3;
	
	@FindBy(xpath="//*[@id=\"panelOtherRequest\"]/div/h4")
	public static WebElement CSR_Label_Main;
	
	@FindBy(xpath="//*[@id=\"panelOtherRequest\"]/div/p")
	public static WebElement CSR_Label_Note;
	
	@FindBy(xpath="//*[@id=\"panelOtherRequest\"]/div/div/div[1]/label")
	public static WebElement CSR_Label1;
	
	@FindBy(xpath="//*[@id=\"panelOtherRequest\"]/div/div/div[2]/label")
	public static WebElement CSR_Label2;
	
	@FindBy(xpath="//*[@id=\"panelOtherRequest\"]/div/div/div[3]/label")
	public static WebElement CSR_Label3;
	
	@FindBy(xpath="//*[@id=\"panelOtherRequest\"]/div/div/div[1]/label/input")
	public static WebElement CSR_CheckBox1;
	
	@FindBy(xpath="//*[@id=\"panelOtherRequest\"]/div/div/div[2]/label/input")
	public static WebElement CSR_CheckBox2;
	
	@FindBy(xpath="//*[@id=\"panelOtherRequest\"]/div/div/div[3]/label/input")
	public static WebElement CSR_CheckBox3;
	
	//ERROR Xpaths
	
	// Main Page errors
	
	@FindBy(xpath="//*[@id=\"ctl00_Body1\"]/div/div[2]/div/div/div/div/div/div[2]/div[1]/div[1]/div/span/p")
	public static WebElement Main_Page_Error;
	
	//Main_Errors
	@FindBy(xpath="//*[@id=\"BillChargeRequiredError\"]")
	public static WebElement Billed_Main;
	
	@FindBy(xpath="//*[@id=\"AllowedAmountRequiredError\"]")
	public static WebElement Allowed_Main;
	
	@FindBy(xpath="//*[@id=\"AgingDOSRequiredError\"]")
	public static WebElement DOS_Main;
	
	@FindBy(xpath="//*[@id=\"AgingReceivedDateRequiredError\"]")
	public static WebElement RD_Main;
	
	@FindBy(xpath="//*[@id=\"CBDQueueRequiredError\"]")
	public static WebElement CBD_Main;
	
	@FindBy(xpath="//*[@id=\"DiagnosisCodeRequiredError\"]")
	public static WebElement DC_Main;
	
	@FindBy(xpath="//*[@id=\"CPTCodesRequiredError\"]")
	public static WebElement CPT_Main;
	
	@FindBy(xpath="//*[@id=\"ClaimTypeRequiredError\"]")
	public static WebElement CT_Main;
	
	@FindBy(xpath="//*[@id=\"POSRequiredError\"]")
	public static WebElement POS_Main;
	
	@FindBy(xpath="//*[@id=\"MemberIDRequiredError\"]")
	public static WebElement MI_Main;
	
	@FindBy(xpath="//*[@id=\"VRRequiredError\"]")
	public static WebElement VandR_Main;
	
	@FindBy(xpath="//*[@id=\"UIRequiredError\"]")
	public static WebElement INV_Main;
	
	@FindBy(xpath="//*[@id=\"MRRequiredError\"]")
	public static WebElement MR_Main;
	
	@FindBy(xpath="//*[@id=\"OtherCSRRequiredError\"]")
	public static WebElement CSR_Main;
	
	@FindBy(xpath="//*[@id=\"PolicyNumberPVRCRequiredError\"]")
	public static WebElement Policy_Main;
	
	// Billed Errors
	
	
	@FindBy(xpath="//*[@id=\"BCEqualOrGreaterValueError\"]")
	public static WebElement Billed_Error1;
	
	@FindBy(xpath="//*[@id=\"BCLessOrEqualValueError\"]") 
	public static WebElement Billed_Error2;
	
	@FindBy(xpath="//*[@id=\"BCBetweenValue1Error\"]")
	public static WebElement Billed_Error3;
	
	@FindBy(xpath="//*[@id=\"BCBetweenValue2Error1\"]")
	public static WebElement Billed_Error4;
	
	@FindBy(xpath="//*[@id=\"BCBetweenValue1Error2\"]")
	public static WebElement Billed_Error5;
	
	//Allowed Amount
	@FindBy(xpath="//*[@id=\"AMEqualOrGreaterValueError\"]")
	public static WebElement Allowed_Error1;
	
	@FindBy(xpath="//*[@id=\"AMLessOrEqualValueError\"]") 
	public static WebElement Allowed_Error2;
	
	@FindBy(xpath="//*[@id=\"AMBetweenValue1Error\"]")
	public static WebElement Allowed_Error3;
	
	@FindBy(xpath="//*[@id=\"AMBetweenValue2Error1\"]")
	public static WebElement Allowed_Error4;
	
	@FindBy(xpath="//*[@id=\"AMBetweenValue2Error2\"]")
	public static WebElement Allowed_Error5;
	
	
	// Aging Dos
	@FindBy(xpath="//*[@id=\"AGDOSEqualOrGreaterValueError\"]")
	public static WebElement AGDOS_Error1;
	
	@FindBy(xpath="//*[@id=\"AGDOSLessOrEqualValueError\"]") 
	public static WebElement AGDOS_Error2;
	
	@FindBy(xpath="//*[@id=\"AGDOSBetweenValue1Error\"]")
	public static WebElement AGDOS_Error3;
	
	@FindBy(xpath="//*[@id=\"AGDOSBetweenValue2Error1\"]")
	public static WebElement AGDOS_Error4;
	
	@FindBy(xpath="//*[@id=\"AGDOSBetweenValue2Error2\"]")
	public static WebElement AGDOS_Error5;
	
	// AgingRD
		@FindBy(xpath="//*[@id=\"AGRDEqualOrGreaterValueError\"]")
		public static WebElement RD_Error1;
		
		
		@FindBy(xpath="//*[@id=\"AGRDLessOrEqualValueError\"]") 
		public static WebElement RD_Error2;
		
		@FindBy(xpath="//*[@id=\"AGRDBetweenValue1Error\"]")
		public static WebElement RD_Error3;
		
		@FindBy(xpath="//*[@id=\"AGRDBetweenValue2Error1\"]")
		public static WebElement RD_Error4;
		
		@FindBy(xpath="//*[@id=\"AGRDBetweenValue2Error2\"]")
		public static WebElement RD_Error5;
	
	//Aging CBD
	
	@FindBy(xpath="//*[@id=\"CBDQEqualOrGreaterValueError\"]")
	public static WebElement CBDQ_Error1;
	
	@FindBy(xpath="//*[@id=\"CBDQLessOrEqualValueError\"]") 
	public static WebElement CBDQ_Error2;
	
	@FindBy(xpath="//*[@id=\"CBDQBetweenValue1Error\"]")
	public static WebElement CBDQ_Error3;
	
	@FindBy(xpath="//*[@id=\"CBDQBetweenValue2Error1\"]")
	public static WebElement CBDQ_Error4;
	
	@FindBy(xpath="//*[@id=\"CBDQBetweenValue2Error2\"]")
	public static WebElement CBDQ_Error5;
	
	//POS
	
	@FindBy(xpath="//*[@id=\"POSCode1Error2\"]")
	public static WebElement POS_Error1;
	
	@FindBy(xpath="//*[@id=\"POSCode2Error2\"]") 
	public static WebElement POS_Error2;
	
	@FindBy(xpath="//*[@id=\"POSCode3Error2\"]")
	public static WebElement POS_Error3;
	
	@FindBy(xpath="//*[@id=\"POSCode4Error2\"]")
	public static WebElement POS_Error4;
	
	@FindBy(xpath="//*[@id=\"POSCode5Error2\"]")
	public static WebElement POS_Error5;
	
	
	//MemberID
	
	@FindBy(xpath="//*[@id=\"inputMemberIDError1\"]")
	public static WebElement MID_Error1;
	

	//Methods
	
	Actions action=new Actions(currentDriver);
	
	//Random CategorName Generator
	public void CategoryName()
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMhhmmss");  
		LocalDateTime now = LocalDateTime.now();  
		String Name="TST"+dtf.format(now);
		seleniumHelper.enterValueIntoTextField(CategoryName_TextBox, Name);
		CategoryName_TextBox.sendKeys("A");
	}
	public void Set_Active()
	{
		//seleniumHelper.clickElement(Active_CheckBox);
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
	
		public void validate_Main_Page()
		{
			seleniumHelper.isElementExist(Active_CheckBox);
			seleniumHelper.isElementExist(BilledCharges_CheckBox);
			seleniumHelper.isElementExist(AllowedAmount_CheckBox);
			seleniumHelper.isElementExist(AgingDOS_CheckBox);
			seleniumHelper.isElementExist(AgingRD_CheckBox);
			seleniumHelper.isElementExist(AgingCBD_CheckBox);
			seleniumHelper.isElementExist(Policy_CheckBox);
			seleniumHelper.isElementExist(Diagnosis_CheckBox);
			seleniumHelper.isElementExist(CPT_CheckBox);
			seleniumHelper.isElementExist(C_Type_CheckBox);
			seleniumHelper.isElementExist(POS_CheckBox);
			seleniumHelper.isElementExist(MemberID_CheckBox);
			seleniumHelper.isElementExist(VandR_CheckBox);
			seleniumHelper.isElementExist(INV_CheckBox);
			seleniumHelper.isElementExist(MR_CheckBox);
			seleniumHelper.isElementExist(ServiceRequest_CheckBox);
			seleniumHelper.validateElementTextContains(Active_Label, "Active");
			seleniumHelper.validateElementTextContains(BilledCharges_Label, "Billed Charges");
			seleniumHelper.validateElementTextContains(AllowedAmount_Label, "Allowed Amount");
			seleniumHelper.validateElementTextContains(AgingDOS_Label, "Aging from Date of Service");
			seleniumHelper.validateElementTextContains(AgingRD_Label, "Aging from Received Date");
			seleniumHelper.validateElementTextContains(AgingCBD_Label, "Aging in CBD Queue");
			seleniumHelper.validateElementTextContains(Policy_Label, "Policy Number / PVRC");
			seleniumHelper.validateElementTextContains(Diagnosis_Label, "Diagnosis Code");
			seleniumHelper.validateElementTextContains(CPT_Label, "CPT Codes");
			seleniumHelper.validateElementTextContains(C_Type_Label, "Claim Type");
			seleniumHelper.validateElementTextContains(POS_Label, "Place of Service");
			seleniumHelper.validateElementTextContains(MemberID_Label, "Member ID");
			seleniumHelper.validateElementTextContains(VandR_Label, "Void & Replace");
			seleniumHelper.validateElementTextContains(INV_Label, "Under Investigation");
			seleniumHelper.validateElementTextContains(MR_Label, "Medical Record Requests");
			seleniumHelper.validateElementTextContains(ServiceRequest_Label, "Other Client Service Request");
			seleniumHelper.validateElementTextContains(CategoryName_lable, "Category Name");
			seleniumHelper.validateElementTextContains(Save_Button, "Save");
			seleniumHelper.validateElementTextContains(Cancel_Button, "Cancel");
			
		}
		public void Billed_CheckBox()
		{
			seleniumHelper.clickElement(BilledCharges_CheckBox);
		}
		public void validate_Label_Billed_Charge_Box()
		{
			seleniumHelper.validateElementTextContains(Billed_Charges_Main_lable,"Billed Charges");
			seleniumHelper.validateElementTextContains(Billed_Charges_Note_lable,"Amount billed by the provider in US Dollars.");
			seleniumHelper.validateElementTextContains(Greater_Billed_lable,"Equal or Greater");
			seleniumHelper.validateElementTextContains(Less_Billed_lable,"Less or Equal");
			seleniumHelper.validateElementTextContains(Between_Billed_lable,"Between");
			seleniumHelper.validateElementTextContains(Billed_Sign1,"$");
			seleniumHelper.validateElementTextContains(Billed_Sign2,"$");
			seleniumHelper.validateElementTextContains(Billed_Sign3,"$");
		}
		public void validate_Greater_Billed()
		{
			seleniumHelper.clickElement(Greater_Radio_Buttons);
			seleniumHelper.enterValueIntoTextField(Greater_Billed_TextBox, "100");
		}
		public void validate_Less_Billed()
		{
			seleniumHelper.clickElement(Less_Radio_Buttons);
			seleniumHelper.clearTextrField(Greater_Billed_TextBox);
			seleniumHelper.enterValueIntoTextField(Less_Billed_TextBox, "100.10");
		}
		public void validate_Between_Billed()
		{
			seleniumHelper.clickElement(Between_Radio_Buttons);
			seleniumHelper.clearTextrField(Greater_Billed_TextBox);
			seleniumHelper.clearTextrField(Less_Billed_TextBox);
			seleniumHelper.enterValueIntoTextField(Between_Billed_TextBox1, "100.10");
			seleniumHelper.enterValueIntoTextField(Between_Billed_TextBox2, "900.10");
		}
		public void click_save()
		{
			try {
				WebDriverWait wait = new WebDriverWait(currentDriver, 30);
				wait.until(ExpectedConditions.elementToBeClickable(Save_Button));
			seleniumHelper.clickElement(Save_Button);
			wait.until(ExpectedConditions.alertIsPresent());
			}
			catch(Exception e)
			{
				e.getMessage();
			}
			String Check=currentDriver.switchTo().alert().getText();
			currentDriver.switchTo().alert().accept();
			currentDriver.switchTo().defaultContent();
			if(Check.equalsIgnoreCase("Category created successfully."))
			{
				
			}
			else
			{
				Assert.fail();
			}
		}
		public void save_error()
		{
			WebDriverWait wait = new WebDriverWait(currentDriver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(Save_Button));
			seleniumHelper.clickElement(Save_Button);
		}
		public void Allowed_CheckBox()
		{
			seleniumHelper.clickElement(AllowedAmount_CheckBox);	
		}
		public void validate_Label_Allowed_Charge_Box()
		{
			seleniumHelper.validateElementTextContains(Allowed_Charges_Main_lable,"Allowed Amount");
			seleniumHelper.validateElementTextContains(Allowed_Charges_Note_lable,"Contracted rate for in-network providers; billed charges for out-of-network (USD).");
			seleniumHelper.validateElementTextContains(Greater_Allowed_lable,"Equal or Greater");
			seleniumHelper.validateElementTextContains(Less_Allowed_lable,"Less or Equal");
			seleniumHelper.validateElementTextContains(Between_Allowed_lable,"Between");
			seleniumHelper.validateElementTextContains(Allowed_Sign1,"$");
			seleniumHelper.validateElementTextContains(Allowed_Sign2,"$");
			seleniumHelper.validateElementTextContains(Allowed_Sign3,"$");
		}
		public void validate_Greater_Allowed()
		{
			seleniumHelper.clickElement(Greater_Allowed_Radio_Buttons);
			seleniumHelper.enterValueIntoTextField(Greater_Allowed_TextBox, "100.10");
		}
		public void validate_Less_Allowed()
		{
			seleniumHelper.clickElement(Less_Allowed_Radio_Buttons);
			seleniumHelper.clearTextrField(Greater_Allowed_TextBox);
			seleniumHelper.enterValueIntoTextField(Less_Allowed_TextBox, "100.10");
		}
		public void validate_Between_Allowed()
		{
			seleniumHelper.clickElement(Between_Allowed_Radio_Buttons);
			seleniumHelper.clearTextrField(Greater_Allowed_TextBox);
			seleniumHelper.clearTextrField(Less_Allowed_TextBox);
			seleniumHelper.enterValueIntoTextField(Between_Allowed_TextBox1, "100.10");
			seleniumHelper.enterValueIntoTextField(Between_Allowed_TextBox2, "900.10");
		}
		public void AgingDOS_CheckBox()
		{
			seleniumHelper.clickElement(AgingDOS_CheckBox);
		}
		public void validate_Label_AgingDOS_Charge_Box()
		{
			seleniumHelper.validateElementTextContains(AgingDOS_Charges_Main_lable,"Aging from Date of Service");
			seleniumHelper.validateElementTextContains(AgingDOS_Charges_Note_lable,"Number of days from date of service to current date.");
			seleniumHelper.validateElementTextContains(Greater_AgingDOS_lable,"Equal or Greater");
			seleniumHelper.validateElementTextContains(Less_AgingDOS_lable,"Less or Equal");
			seleniumHelper.validateElementTextContains(Between_AgingDOS_lable,"Between");
			seleniumHelper.validateElementTextContains(AgingDOS_Sign1,"Days");
			seleniumHelper.validateElementTextContains(AgingDOS_Sign2,"Days");
			seleniumHelper.validateElementTextContains(AgingDOS_Sign3,"Days");
		}
		public void validate_Greater_AgingDOS()
		{
			seleniumHelper.clickElement(Greater_AgingDOS_Radio_Buttons);
			seleniumHelper.enterValueIntoTextField(Greater_AgingDOS_TextBox, "1");
		}
		public void validate_Less_AgingDOS()
		{
			seleniumHelper.clickElement(Less_AgingDOS_Radio_Buttons);
			seleniumHelper.enterValueIntoTextField(Less_AgingDOS_TextBox, "1");
		}
		public void validate_Between_AgingDOS()
		{
			seleniumHelper.clickElement(Between_AgingDOS_Radio_Buttons);
			seleniumHelper.enterValueIntoTextField(Between_AgingDOS_TextBox1, "1");
			seleniumHelper.enterValueIntoTextField(Between_AgingDOS_TextBox2, "9");
		}

		public void AgingRD_CheckBox()
		{
			seleniumHelper.clickElement(AgingRD_CheckBox);	}
		public void validate_Label_AgingRD_Charge_Box()
		{
			seleniumHelper.validateElementTextContains(AgingRD_Charges_Main_lable,"Aging from Received Date");
			seleniumHelper.validateElementTextContains(AgingRD_Charges_Note_lable,"Number of days from date UHCG received to current date.");
			seleniumHelper.validateElementTextContains(Greater_AgingRD_lable,"Equal or Greater");
			seleniumHelper.validateElementTextContains(Less_AgingRD_lable,"Less or Equal");
			seleniumHelper.validateElementTextContains(Between_AgingRD_lable,"Between");
			seleniumHelper.validateElementTextContains(AgingRD_Sign1,"Days");
			seleniumHelper.validateElementTextContains(AgingRD_Sign2,"Days");
			seleniumHelper.validateElementTextContains(AgingRD_Sign3,"Days");
		}
		public void validate_Greater_AgingRD()
		{
			seleniumHelper.clickElement(Greater_AgingRD_Radio_Buttons);
			seleniumHelper.enterValueIntoTextField(Greater_AgingRD_TextBox, "10");
		}
		public void validate_Less_AgingRD()
		{
			seleniumHelper.clickElement(Less_AgingRD_Radio_Buttons);
			seleniumHelper.enterValueIntoTextField(Less_AgingRD_TextBox, "10");
		}
		public void validate_Between_AgingRD()
		{
			seleniumHelper.clickElement(Between_AgingRD_Radio_Buttons);
			seleniumHelper.enterValueIntoTextField(Between_AgingRD_TextBox1, "10");
			seleniumHelper.enterValueIntoTextField(Between_AgingRD_TextBox2, "90");
		}
		
		public void AgingCBD_CheckBox()
		{
			seleniumHelper.clickElement(AgingCBD_CheckBox);	}
		public void validate_Label_AgingCBD_Charge_Box()
		{
			seleniumHelper.validateElementTextContains(AgingCBD_Charges_Main_lable,"Aging in CBD Queue");
			seleniumHelper.validateElementTextContains(AgingCBD_Charges_Note_lable,"Number of days from first date in CBD queue to current date.");
			seleniumHelper.validateElementTextContains(Greater_AgingCBD_lable,"Equal or Greater");
			seleniumHelper.validateElementTextContains(Less_AgingCBD_lable,"Less or Equal");
			seleniumHelper.validateElementTextContains(Between_AgingCBD_lable,"Between");
			seleniumHelper.validateElementTextContains(AgingCBD_Sign1,"Days");
			seleniumHelper.validateElementTextContains(AgingCBD_Sign2,"Days");
			seleniumHelper.validateElementTextContains(AgingCBD_Sign3,"Days");
		}
		public void validate_Greater_AgingCBD()
		{
			seleniumHelper.clickElement(Greater_AgingCBD_Radio_Buttons);
			seleniumHelper.enterValueIntoTextField(Greater_AgingCBD_TextBox, "10");
		}
		public void validate_Less_AgingCBD()
		{
			seleniumHelper.clickElement(Less_AgingCBD_Radio_Buttons);
			seleniumHelper.enterValueIntoTextField(Less_AgingCBD_TextBox, "10");
		}
		public void validate_Between_AgingCBD()
		{
			seleniumHelper.clickElement(Between_AgingCBD_Radio_Buttons);
			seleniumHelper.enterValueIntoTextField(Between_AgingCBD_TextBox1, "10");
			seleniumHelper.enterValueIntoTextField(Between_AgingCBD_TextBox2, "90");
		}
		
		public void Diag_Code_CheckBox()
		{
			seleniumHelper.clickElement(Diagnosis_CheckBox);
		}
		public void validate_Label_Diagnosis_Code()
		{
			seleniumHelper.validateElementTextContains(DC_Main_label,"Diagnosis Code");
			seleniumHelper.validateElementTextContains(DC_Main_label_note,"You are limited to five (5) diagnosis code entries.");
			seleniumHelper.validateElementTextContains(DC_ICD_Label1,"ICD-9 or ICD-10");
			seleniumHelper.validateElementTextContains(DC_Main_label2,"Between ICD-9 or ICD-10");
		}
		
		public void ICD9_or_ICD10()
		{
			seleniumHelper.clickElement(DC_Radio1);
			seleniumHelper.enterValueIntoTextField(DC_Textbox1, "A18.81");
			seleniumHelper.enterValueIntoTextField(DC_Textbox2, "780.52");
			seleniumHelper.enterValueIntoTextField(DC_Textbox3, "G44.311");
			seleniumHelper.enterValueIntoTextField(DC_Textbox4, "M54.2");
			seleniumHelper.enterValueIntoTextField(DC_Textbox5, "729.");
			DC_Textbox5.sendKeys("1");
			try
			{
				Thread.sleep(5000);
			}
			catch(Exception e)
			{
				
			}
		}
		public void ICD9_Between_ICD10()
		{
			seleniumHelper.clickElement(DC_Radio2);
			seleniumHelper.enterValueIntoTextField(DC_Textbox6, "A18.81");
			seleniumHelper.enterValueIntoTextField(DC_Textbox7, "780.5");
			DC_Textbox7.sendKeys("2");
			try
			{
				Thread.sleep(5000);
			}
			catch(Exception e)
			{
				
			}
		}
		public void CPT_CheckBox()
		{
			seleniumHelper.clickElement(CPT_CheckBox);
		}
		
		public void CPT_Code_CheckBox()
		{
			seleniumHelper.clickElement(CPT_CheckBox);
		}
		public void validate_Label_CPT_Code()
		{
			seleniumHelper.validateElementTextContains(CPT_Main_Label,"CPT Codes");
			seleniumHelper.validateElementTextContains(CPT_Note_Label,"You are limited to five (5) CPT code entries.");
			seleniumHelper.validateElementTextContains(CPT_Less_label,"Less or Equal");
			seleniumHelper.validateElementTextContains(CPT_Between_Label,"Between");
		}
		public void CPT1_Code()
		{
			seleniumHelper.clickElement(CPT_Radio1);
			seleniumHelper.enterValueIntoTextField(CPT_TextBox1, "99201");
			seleniumHelper.enterValueIntoTextField(CPT_TextBox2, "99499");
			seleniumHelper.enterValueIntoTextField(CPT_TextBox3, "99140");
			seleniumHelper.enterValueIntoTextField(CPT_TextBox4, "69990");
			seleniumHelper.enterValueIntoTextField(CPT_TextBox5, "9919");
			CPT_TextBox5.sendKeys("9");
			try
			{
				Thread.sleep(5000);
			}
			catch(Exception e)
			{
				
			}
		}
		public void Less_CPT_Code()
		{
			seleniumHelper.clickElement(CPT_Radio2);
			seleniumHelper.enterValueIntoTextField(CPT_Less_TextBox, "6999");
			CPT_Less_TextBox.sendKeys("0");
			try
			{
				Thread.sleep(5000);
			}
			catch(Exception e)
			{
				
			}
		}
		public void Between_CPT_Code()
		{
			seleniumHelper.clickElement(CPT_Radio3);
			seleniumHelper.enterValueIntoTextField(CPT_Between_TextBox1, "69990");
			seleniumHelper.enterValueIntoTextField(CPT_Between_TextBox2, "9914");
			CPT_Between_TextBox2.sendKeys("0");
			try
			{
				Thread.sleep(5000);
			}
			catch(Exception e)
			{
				
			}
		}
		
		public void Claim_type_CheckBox()
		{
			seleniumHelper.clickElement(C_Type_CheckBox);
		}
		public void validate_Label_Claim_Type()
		{
			seleniumHelper.validateElementTextContains(Claim_Type_Label,"Claim Type");
			seleniumHelper.validateElementTextContains(Claim_Type_Main_Label,"Select at least one.");
			seleniumHelper.validateElementTextContains(Claim_Type_Label1,"Outpatient");
			seleniumHelper.validateElementTextContains(Claim_Type_Label2,"Inpatient");
			seleniumHelper.validateElementTextContains(Claim_Type_Label3,"Professional");
		}
		public void Claim_Outpatient()
		{
			seleniumHelper.clickElement(Claim_Type_Checkbox1);
		}
		public void Claim_Inpatient()
		{
			seleniumHelper.clickElement(Claim_Type_Checkbox2);
		}
		public void Claim_Professional()
		{
			seleniumHelper.clickElement(Claim_Type_Checkbox3);
		}
		
		public void POS_CheckBox()
		{
			seleniumHelper.clickElement(POS_CheckBox);
		}
		public void validate_label_POS()
		{
			seleniumHelper.validateElementTextContains(POS_Main_Label,"Place of Service");
			seleniumHelper.validateElementTextContains(POS_Note_Label,"List two (2) digit codes");
		}
		public void POS()
		{
			seleniumHelper.enterValueIntoTextField(POS_TextBox1, "11");
			seleniumHelper.enterValueIntoTextField(POS_TextBox2, "12");
			seleniumHelper.enterValueIntoTextField(POS_TextBox3, "13");
			seleniumHelper.enterValueIntoTextField(POS_TextBox4, "14");
			seleniumHelper.enterValueIntoTextField(POS_TextBox5, "15");
		}
		
		public void Member_ID_CheckBox()
		{
			seleniumHelper.clickElement(MemberID_CheckBox);
		}
		public void validate_label_Member_ID()
		{
			seleniumHelper.validateElementTextContains(MemberID_Label_Main,"Member ID");
			seleniumHelper.validateElementTextContains(MemberID_Label_Note,"List 9-digit UHCG identification number.");
		}
		public void enter_Member_ID()
		{
			seleniumHelper.enterValueIntoTextField(MemberID_TextBox, "12345678");
			MemberID_TextBox.sendKeys("9");
			try
			{
				Thread.sleep(5000);
			}
			catch(Exception e)
			{
				
			}
			
		}
		
		public void VandR_CheckBox()
		{
			seleniumHelper.clickElement(VandR_CheckBox);
		}
		public void validate_label_VandR()
		{
			seleniumHelper.validateElementTextContains(VandR_Label_Main,"Void & Replace");
			seleniumHelper.validateElementTextContains(VandR_Label_Note,"Select at least one.");
			seleniumHelper.validateElementTextContains(VandR_Label1,"Replacement claims");
			seleniumHelper.validateElementTextContains(VandR_Label2,"Non- Replacement claims");

		}
		public void Replacement_Claim_VandR()
		{
			seleniumHelper.clickElement(VandR_CheckBox1);
		}
		public void Non_Replacement_Claim_VandR()
		{
			seleniumHelper.clickElement(VandR_CheckBox2);
		}
		
		public void INV_CheckBox()
		{
			seleniumHelper.clickElement(INV_CheckBox);
		}
		public void validate_label_INV()
		{
			seleniumHelper.validateElementTextContains(INV_Label_Main,"Under Investigation");
			seleniumHelper.validateElementTextContains(INV_Label_Note,"Identify claims where 'Under Investigation' was selected");
			seleniumHelper.validateElementTextContains(INV_Label1,"Under Investigation");
			seleniumHelper.validateElementTextContains(INV_Label2,"Not Under Investigation");
			seleniumHelper.validateElementTextContains(INV_Label3,"Completed Investigation");
		}
		
		public void Under_INV()
		{
			seleniumHelper.clickElement(INV_CheckBox1);
		}
		public void Not_Under_INV()
		{
			seleniumHelper.clickElement(INV_CheckBox2);
		}
		public void Complete_Under_INV()
		{
			seleniumHelper.clickElement(INV_CheckBox3);
		}
		
		public void MR_CheckBox()
		{
			seleniumHelper.clickElement(MR_CheckBox);
		}
		public void validate_label_MR()
		{
			seleniumHelper.validateElementTextContains(MR_Label_Main,"Medical Record Requests");
			seleniumHelper.validateElementTextContains(MR_Label_Note,"Claims with a Medical Record CSR attached.");
			seleniumHelper.validateElementTextContains(MR_Label1,"Open MR Requests");
			seleniumHelper.validateElementTextContains(MR_Label2,"Closed MR Requests");
			seleniumHelper.validateElementTextContains(MR_Label3,"Without MR Requests");
		}
		
		public void Open_MR()
		{
			seleniumHelper.clickElement(MR_CheckBox1);
		}
		public void Closed_MR()
		{
			seleniumHelper.clickElement(MR_CheckBox2);
		}
		public void Without_MR()
		{
			seleniumHelper.clickElement(MR_CheckBox3);
		}
		
		public void CSR_CheckBox()
		{
			seleniumHelper.clickElement(ServiceRequest_CheckBox);
		}
		public void validate_label_CSR()
		{
			seleniumHelper.validateElementTextContains(CSR_Label_Main,"Other Client Service Request");
			seleniumHelper.validateElementTextContains(CSR_Label_Note,"Claims with a CSR attached, that is not a Medical Records Required CSR");
			seleniumHelper.validateElementTextContains(CSR_Label1,"Open CSR");
			seleniumHelper.validateElementTextContains(CSR_Label2,"Closed CSR");
			seleniumHelper.validateElementTextContains(CSR_Label3,"Without CSR");
		}
		
		public void Open_CSR()
		{
			seleniumHelper.clickElement(CSR_CheckBox1);
		}
		public void Closed_CSR()
		{
			seleniumHelper.clickElement(CSR_CheckBox2);
		}
		public void Without_CSR()
		{
			seleniumHelper.clickElement(CSR_CheckBox3);
		}
		
		public void Policy_CheckBox()
		{
			seleniumHelper.clickElement(Policy_CheckBox);
		}
		public void validate_label_Policy()
		{
			seleniumHelper.validateElementTextContains(Policy_Main_Label,"Other Client Service Request");
			seleniumHelper.validateElementTextContains(Policy_Note_Label,"Claims with a CSR attached, that is not a Medical Records Required CSR");
			seleniumHelper.validateElementTextContains(Policy_PlanVariation_Label,"Open CSR");
			seleniumHelper.validateElementTextContains(Policy_ReportingCode_Label,"Closed CSR");
			seleniumHelper.validateElementTextContains(Policy_PlanVariation_Label1,"Without CSR");
			seleniumHelper.validateElementTextContains(Policy_ReportingCode_Label1,"Without CSR");
		}
		public void select_policy_dropdown()
		{
			seleniumHelper.selectFromDropdownByVisibleText(Policy_Dropdown, "900097");
			seleniumHelper.clickElement(Policy_Add_Button);
			Assert.assertTrue(seleniumHelper.getElementText(Policy_Add_TextBox).equals("900097"));
		}
		public void one_Policy()
		{
			seleniumHelper.clickElement(Policy_PlanVariation_RadioButton);
			seleniumHelper.enterValueIntoTextField(Policy_PlanVariation_TextBox, "1234");
			seleniumHelper.enterValueIntoTextField(Policy_ReportingCode_TextBox, "1234");
		}
		public void between_Policy()
		{
			seleniumHelper.clickElement(Policy_PlanVariation_RadioButton1);
			seleniumHelper.enterValueIntoTextField(Policy_PlanVariation_TextBox1, "1234");
			seleniumHelper.enterValueIntoTextField(Policy_ReportingCode_TextBox1, "1234");
			seleniumHelper.enterValueIntoTextField(Policy_PlanVariation_TextBox2, "1234");
			seleniumHelper.enterValueIntoTextField(Policy_ReportingCode_TextBox2, "1234");
		
		}
		
		public void Main_Error()
		{
			seleniumHelper.validateElementText(Billed_Main, "Please enter Billed Charges or un-select it from category conditions.");
			seleniumHelper.validateElementText(Allowed_Main, "Please enter allowed amount or un-select it from category conditions.");
			seleniumHelper.validateElementText(DOS_Main, "Please enter aging days of service or un-select it from category conditions.");
			seleniumHelper.validateElementText(RD_Main, "Please enter aging recieved days or un-select it from category conditions.");
			seleniumHelper.validateElementText(CBD_Main, "Please enter aging CBD queue days or un-select it from category conditions.");
			seleniumHelper.validateElementText(DC_Main, "Please enter Diagnosis Code or un-select it from category conditions.");
			seleniumHelper.validateElementText(CPT_Main, "Please enter CPT Code or un-select it from category conditions.");
			seleniumHelper.validateElementText(CT_Main, "Please select atleast one Claim Type or un-select it from category conditions.");
			seleniumHelper.validateElementText(POS_Main, "Please enter atleast one Place of Service or un-select it from category conditions.");
			seleniumHelper.validateElementText(MI_Main, "Please enter Member ID or un-select it from category conditions.");
			seleniumHelper.validateElementText(VandR_Main, "Please select atleast one type of Void&Replace or un-select it from category conditions.");
			seleniumHelper.validateElementText(INV_Main, "Please select atleast one type of Under Investigation or un-select it from category conditions.");
			seleniumHelper.validateElementText(MR_Main, "Please select atleast one type of Medical Records or un-select it from category conditions.");
			seleniumHelper.validateElementText(CSR_Main, "Please select atleast one type of Other Client Service Request or un-select it from category conditions.");
			seleniumHelper.validateElementText(Policy_Main, "Please select Policy No PVRC Code or un-select it from category conditions.");
		}
		public void Billed_error()
		{
			try
			{
			seleniumHelper.enterValueIntoTextField(Greater_Billed_TextBox, "@");
			seleniumHelper.enterValueIntoTextField(Less_Billed_TextBox, "-1");
			seleniumHelper.enterValueIntoTextField(Between_Billed_TextBox1, "@");
			seleniumHelper.enterValueIntoTextField(Between_Billed_TextBox2, "@");
			Thread.sleep(3000);
			seleniumHelper.validateElementTextContains(Billed_Error1, "Please enter a valid dollar amount!");
			seleniumHelper.validateElementTextContains(Billed_Error2, "Please enter a valid dollar amount!");
			seleniumHelper.validateElementTextContains(Billed_Error3, "Please enter a valid dollar amount!");
			seleniumHelper.validateElementTextContains(Billed_Error4, "Please enter a valid dollar amount!");
			seleniumHelper.enterValueIntoTextField(Between_Billed_TextBox1, "11");
			seleniumHelper.enterValueIntoTextField(Between_Billed_TextBox2, "9");
			Thread.sleep(3000);
			seleniumHelper.validateElementTextContains(Billed_Error5, "First Billed Charges must be less than the second one!");
			}
			catch(Exception e)
			{
				
			}
		}
		public void Allowed_error()
		{
			try
			{
			seleniumHelper.enterValueIntoTextField(Greater_Allowed_TextBox, "@");
			seleniumHelper.enterValueIntoTextField(Less_Allowed_TextBox, "-1");
			seleniumHelper.enterValueIntoTextField(Between_Allowed_TextBox1, "@");
			seleniumHelper.enterValueIntoTextField(Between_Allowed_TextBox2, "@");
			Thread.sleep(3000);
			seleniumHelper.validateElementTextContains(Allowed_Error1, "Please enter a valid dollar amount!");
			seleniumHelper.validateElementTextContains(Allowed_Error2, "Please enter a valid dollar amount!");
			seleniumHelper.validateElementTextContains(Allowed_Error3, "Please enter a valid dollar amount!");
			seleniumHelper.validateElementTextContains(Allowed_Error4, "Please enter a valid dollar amount!");
			seleniumHelper.enterValueIntoTextField(Between_Allowed_TextBox1, "11");
			seleniumHelper.enterValueIntoTextField(Between_Allowed_TextBox2, "9");
			Thread.sleep(3000);
			seleniumHelper.validateElementTextContains(Allowed_Error5, "First Allowed Amount Value must be less than the second one!");
			}
			catch(Exception e)
			{
				
			}
		}
		
		public void DOS_error()
		{
			try
			{
			seleniumHelper.enterValueIntoTextField(Greater_AgingDOS_TextBox, "@");
			seleniumHelper.enterValueIntoTextField(Less_AgingDOS_TextBox, "-1");
			seleniumHelper.enterValueIntoTextField(Between_AgingDOS_TextBox1, "@");
			seleniumHelper.enterValueIntoTextField(Between_AgingDOS_TextBox2, "@");
			Thread.sleep(3000);
			seleniumHelper.validateElementTextContains(AGDOS_Error1, "Please enter a valid integer number!");
			seleniumHelper.validateElementTextContains(AGDOS_Error2, "Please enter a valid integer number!");
			seleniumHelper.validateElementTextContains(AGDOS_Error3, "Please enter a valid integer number!");
			seleniumHelper.validateElementTextContains(AGDOS_Error4, "Please enter a valid integer number!");
			seleniumHelper.enterValueIntoTextField(Between_AgingDOS_TextBox1, "11");
			seleniumHelper.enterValueIntoTextField(Between_AgingDOS_TextBox2, "9");
			Thread.sleep(3000);
			seleniumHelper.validateElementTextContains(AGDOS_Error5, "First Aging from Date of Service value must be less than second one!");
			}
			catch(Exception e)
			{
				
			}
		}
		public void RD_error()
		{
			try
			{
			seleniumHelper.enterValueIntoTextField(Greater_AgingRD_TextBox, "@");
			seleniumHelper.enterValueIntoTextField(Less_AgingRD_TextBox, "-1");
			seleniumHelper.enterValueIntoTextField(Between_AgingRD_TextBox1, "@");
			seleniumHelper.enterValueIntoTextField(Between_AgingRD_TextBox2, "@");
			Thread.sleep(3000);
			seleniumHelper.validateElementTextContains(RD_Error1, "Please enter a valid integer number!");
			seleniumHelper.validateElementTextContains(RD_Error2, "Please enter a valid integer number!");
			seleniumHelper.validateElementTextContains(RD_Error3, "Please enter a valid integer number!");
			seleniumHelper.validateElementTextContains(RD_Error4, "Please enter a valid integer number!");
			seleniumHelper.enterValueIntoTextField(Between_AgingRD_TextBox1, "11");
			seleniumHelper.enterValueIntoTextField(Between_AgingRD_TextBox2, "9");
			Thread.sleep(3000);
			seleniumHelper.validateElementTextContains(RD_Error5, "First Aging from Received Date value must be less than the second one!");
			}
			catch(Exception e)
			{
				
			}
		}
		
		public void CBD_error()
		{
			try
			{
			seleniumHelper.enterValueIntoTextField(Greater_AgingCBD_TextBox, "@");
			seleniumHelper.enterValueIntoTextField(Less_AgingCBD_TextBox, "-1");
			seleniumHelper.enterValueIntoTextField(Between_AgingCBD_TextBox1, "@");
			seleniumHelper.enterValueIntoTextField(Between_AgingCBD_TextBox2, "@");
			Thread.sleep(3000);
			seleniumHelper.validateElementTextContains(CBDQ_Error1, "Please enter a valid integer number!");
			seleniumHelper.validateElementTextContains(CBDQ_Error2, "Please enter a valid integer number!");
			seleniumHelper.validateElementTextContains(CBDQ_Error3, "Please enter a valid integer number!");
			seleniumHelper.validateElementTextContains(CBDQ_Error4, "Please enter a valid integer number!");
			seleniumHelper.enterValueIntoTextField(Between_AgingCBD_TextBox1, "11");
			seleniumHelper.enterValueIntoTextField(Between_AgingCBD_TextBox2, "9");
			Thread.sleep(3000);
			seleniumHelper.validateElementTextContains(CBDQ_Error5,"First Aging in CBD Queue value must be less than the second one!");
			}
			catch(Exception e)
			{
				
			}
		}
		public void POS_error()
		{
			try
			{
			seleniumHelper.enterValueIntoTextField(POS_TextBox1, "11");
			seleniumHelper.enterValueIntoTextField(POS_TextBox2, "11");
			seleniumHelper.enterValueIntoTextField(POS_TextBox3, "11");
			seleniumHelper.enterValueIntoTextField(POS_TextBox4, "11");
			seleniumHelper.enterValueIntoTextField(POS_TextBox5, "11");
			Thread.sleep(3000);
			seleniumHelper.validateElementTextContains(POS_Error1,"You have already entered this POS.");
			seleniumHelper.validateElementTextContains(POS_Error2,"You have already entered this POS.");
			seleniumHelper.validateElementTextContains(POS_Error3,"You have already entered this POS.");
			seleniumHelper.validateElementTextContains(POS_Error4,"You have already entered this POS.");
			}
			catch(Exception e)
			{
				
			}
		}
		public void Member_ID_error()
		{
			seleniumHelper.enterValueIntoTextField(MemberID_TextBox, "123456789");
			MemberID_TextBox.sendKeys("0");
			try
			{
				Thread.sleep(3000);
			}
			catch(Exception e)
			{
			}
			seleniumHelper.validateElementTextContains(MID_Error1, "Member ID should be 9 digit integer number!");
		}
		
		
}
		
