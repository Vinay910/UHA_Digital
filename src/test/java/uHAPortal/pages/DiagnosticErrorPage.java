package uHAPortal.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DiagnosticErrorPage extends BasePage {

	
	public DiagnosticErrorPage() {
		
		
		PageFactory.initElements(currentDriver, this);
		pageName = this.getClass().getSimpleName();	
	}
	
	@FindBy(name="")
	public static  WebElement Diag_Queue_Logo;
	
	@FindBy(name="")
	public static  WebElement Total_Claims_Bubble;
	
	@FindBy(name="")
	public static  WebElement Total_Biled_Bubble;
	
	@FindBy(xpath="")
	public static WebElement FilterResults_box;
	
	@FindBy(xpath="")
	public static WebElement InboundEdiFileName_ColumnName;
	
	@FindBy(xpath="")
	public static WebElement ICN_ColumnName;
	
	@FindBy(xpath="")
	public static WebElement UHCGClaimID_ColumnName;
	
	@FindBy(xpath="")
	public static WebElement DateTransmitted_ColumnName;
	
	@FindBy(xpath="")
	public static WebElement ClaimErrorDescription_ColumnName;
	
	
	
	//Xpath for Kendo
	
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
