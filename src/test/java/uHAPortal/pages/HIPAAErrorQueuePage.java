package uHAPortal.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HIPAAErrorQueuePage extends BasePage {
	
	public HIPAAErrorQueuePage() {
		
		PageFactory.initElements(currentDriver, this);
		pageName = this.getClass().getSimpleName();
	
	}

	//xpath
	
	
	@FindBy(name="HIPPA Errors Queue")
	public static WebElement HIPAAErrorQueue_Text;
	
	
	@FindBy(xpath="")
	public static WebElement Total_Claims_Bubble;
	
	
	@FindBy(xpath="")
	public static WebElement TotalBilled__Bubble;
	
	
	@FindBy(xpath="")
	public static WebElement FilterResults_box;
	
	@FindBy(xpath="")
	public static WebElement Notes_Text;
	
	@FindBy(xpath="")
	public static WebElement ExportToExcel;
	
	@FindBy(xpath="")
	public static WebElement UHCG_ClaimID_ColumnName;
	
	@FindBy(xpath="")
	public static WebElement ICN_ColmunName;
	
	@FindBy(xpath="")
	public static WebElement UHCG_MemberID_ColmunName;
	
	@FindBy(xpath="")
	public static WebElement Memeber_Name_ColmunName;
	
	@FindBy(xpath="")
	public static WebElement DOB_ColmunName;
	

	@FindBy(xpath="")
	public static WebElement Billed_ColmunName;
	
	
	@FindBy(xpath="")
	public static WebElement AllowedAmount_ColmunName;
	
	@FindBy(xpath="")
	public static WebElement DateTransmitted_ColmunName;
	
	@FindBy(xpath="")
	public static WebElement StatusExaminer_ColmunName;
	
	@FindBy(xpath="")
	public static WebElement ReplacementClaim_ColmunName;
	
	
	//xapths for Kendo Grid
	

	@FindBy(xpath="")
	public static WebElement ItemsPerPage_Box;
	
	@FindBy(xpath="")
	public static WebElement Pageno_Box;
	
	@FindBy(xpath="")
	public static WebElement Nextpage_link;
	
	@FindBy(xpath="")
	public static WebElement PreviousPage_link;
	
	@FindBy(xpath="")
	public static WebElement firstPage_link;
	
	@FindBy(xpath="")
	public static WebElement Last_link;
	
	
	
	

	
}
