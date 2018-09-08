package core.generic.utilities;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
//import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.*;
import java.util.concurrent.TimeUnit;
import javax.imageio.ImageIO;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SeleniumHelper extends AutomationCore
{
		public static String Env;
	    public static synchronized ExtentTest getTest() {
	        return extentTestMap.get((int) (long) (Thread.currentThread().getId()));
	    }
	    public static synchronized void endTest() {
	        reportGenerator.endTest(extentTestMap.get((int) (long) (Thread.currentThread().getId())));
	    }
	    public static synchronized ExtentTest startTest(String testName) {
	        return startTest(testName, "");
	    }
	    public static synchronized ExtentTest startTest(String testName, String desc) {
	        ExtentTest test = reportGenerator.startTest(testName, desc);
	        extentTestMap.put((int) (long) (Thread.currentThread().getId()), test);
	        return test;
	    }   
	public static WebDriver launchDriver(String browserName, String driverPath, long syncTime)
	{
		File file =new File(driverPath);
		Env="remote";
		try
		{	
			DesiredCapabilities capabilities;
			final String USERNAME = "vmahajan";
			final String ACCESS_KEY = "dd9a7bdd-4aba-4dd7-b6bf-d68beef9b459";
			final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
			if(Env.equalsIgnoreCase("remote")&&browserName.equalsIgnoreCase("InternetExplorer"))
			{
				System.out.println("<=============Execution Started on Saurce lab=============>");
				System.out.println("<=============Execution Started on IE=============>");
				capabilities = DesiredCapabilities.internetExplorer();
				capabilities.setCapability("platform", "Windows 7");
				capabilities.setCapability("version", "latest");
				capabilities.setPlatform(Platform.WINDOWS);
				capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
				capabilities.setCapability("ie.ensureCleanSession", true);
				capabilities.setCapability("requireWindowFocus", true);
			    capabilities.setCapability("tunnelIdentifier", "OptumSharedTunnel-Dev");
				capabilities.setCapability("parent-tunnel", "sauce_admin");
				System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
				currentDriver =new RemoteWebDriver(new URL(URL), capabilities);	
			}
			else if(Env.equalsIgnoreCase("remote")&&browserName.equalsIgnoreCase("Firefox"))
			{
				System.out.println("<=============Execution Started on Saurce lab=============>");
				System.out.println("<=============Execution Started on FIREFOX=============>");
				FirefoxProfile ffProfile = new FirefoxProfile();
				ffProfile.setAcceptUntrustedCertificates(true);
				ffProfile.setEnableNativeEvents(true);
				System.setProperty("webdriver.firefox.marionette", file.getAbsolutePath());
				capabilities = DesiredCapabilities.firefox();
				capabilities.setCapability("platform", "Windows 7");
				capabilities.setCapability("version", "latest");
				capabilities.setPlatform(Platform.WINDOWS);
				 capabilities.setCapability("tunnelIdentifier", "OptumSharedTunnel-Dev");
					capabilities.setCapability("parent-tunnel", "sauce_admin");
				currentDriver =new RemoteWebDriver(new URL(URL), capabilities);
			}
			else if(Env.equalsIgnoreCase("remote")&&browserName.equalsIgnoreCase("chrome"))
			{
				System.out.println("<=============Execution Started on Saurce lab=============>");
				System.out.println("<=============Execution Started on Chrome=============>");
				System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
				capabilities = DesiredCapabilities.chrome();
				capabilities.setCapability("platform", "Windows 7");
				capabilities.setCapability("version", "latest");
				capabilities.setPlatform(Platform.WINDOWS);
				 capabilities.setCapability("tunnelIdentifier", "OptumSharedTunnel-Dev");
					capabilities.setCapability("parent-tunnel", "sauce_admin");
				currentDriver = new RemoteWebDriver(new URL(URL), capabilities);
			}	
			else if(browserName.equalsIgnoreCase("firefox"))
			{
				System.out.println("<=============Execution Started on FIREFOX browser=============>");
				
				FirefoxProfile ffProfile = new FirefoxProfile();
				ffProfile.setAcceptUntrustedCertificates(true);
				ffProfile.setEnableNativeEvents(true);
				System.setProperty("webdriver.firefox.marionette", file.getAbsolutePath());
				currentDriver = new FirefoxDriver();
			}
			else if(browserName.equalsIgnoreCase("InternetExplorer"))
			{
				System.out.println("<=============Execution Started on INTERNER EXPLORER browser=============>");
				capabilities = DesiredCapabilities.internetExplorer();
				capabilities.setPlatform(Platform.WINDOWS);
				capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
				capabilities.setCapability("ie.ensureCleanSession", true);
				capabilities.setCapability("requireWindowFocus", true);
				System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
				currentDriver = new InternetExplorerDriver(capabilities);		
			}
			else if(browserName.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
				ChromeOptions options = new ChromeOptions();
				options.setExperimentalOption("useAutomationExtension", false);
				currentDriver = new ChromeDriver(options);
			}
			else if(browserName.equals("safari"))
			{	
				currentDriver = new SafariDriver();
			}	
			currentDriver.manage().timeouts().implicitlyWait(syncTime,TimeUnit.SECONDS);
			currentDriver.manage().deleteAllCookies();
			currentDriver.manage().window().maximize();
			
		}
		catch(Exception e)
		{
			e.getMessage();
			currentDriver=null;
		}		
		
		return currentDriver;
	}	
	
	
	public  WebDriver setRunTimeImplicitWait(WebDriver pageDriver)
	{
		long timeInSeconds = Long.parseLong(Environment("pageDefaultSyncTimePeriod"));
		pageDriver.manage().timeouts().implicitlyWait(timeInSeconds, TimeUnit.SECONDS);
		return pageDriver;
	}
		
	public  WebElement findElementByXpath(WebDriver driver,String elementXpath)
	{
		try
		{
			WebElement element = driver.findElement(By.xpath(elementXpath));
			if(element!=null)
			{
				return element;
			}
		}
		catch(Exception e )
		{
			insertReportLine(e);
			e.getMessage();
			
		}
		return null;
	}
	
	public  WebElement findElementByName(WebDriver driver,String elementName)
	{
		try
		{
			WebElement element = driver.findElement(By.name(elementName));
			if(element!=null)
			{
				return element;
			}
		}
		catch(Exception e )
		{
			insertReportLine(e);
			e.getMessage();
			
		}
		return null;
	}
	
	public  WebElement findElementById(WebDriver driver,String elementID)
	{
		try
		{
			WebElement element = driver.findElement(By.id(elementID));
			if(element!=null)
			{
				return element;
			}
		}
		catch(Exception e )
		{
			insertReportLine(e);
			e.getMessage();
			
		}
		return null;
	}
	
	public  void chngdum()
	{
		
	}
	
	public WebElement findElementByClasName(WebDriver driver,String elementClass)
	{
		try
		{
			WebElement element = driver.findElement(By.className(elementClass));
			if(element!=null)
			{
				return element;
			}
		}
		catch(Exception e )
		{
			insertReportLine(e);
			e.getMessage();
			
		}
		return null;
	}
	
	public  List<WebElement> getElementsByTagName(WebElement parentElement, String tagName)
	{
		try
		{
			List<WebElement> elements = parentElement.findElements(By.tagName(tagName));
			if(elements.size()!=0)
			{
				return elements;
			}
		}
		catch(Exception e )
		{
			insertReportLine(e);
			e.getMessage();
			
		}
		return null;
	}
	 //*-------------------------------------Implementation of Webdriver common functions---------------------------------------------*// 
	
	public synchronized boolean enterValueIntoTextField(WebElement textElement, String valueToEnter)
	{
		fieldName =getObjectName();
		try
		{
			seleniumHelper.waitForAobjectToBeVisible(currentDriver,textElement,fieldName, 40);
			if(textElement!=null && textElement.isEnabled())
			{
				textElement.click();
				textElement.clear();
				try {
					if(valueToEnter.length()<3)
					{
						textElement.sendKeys(valueToEnter);
						insertReportLine(LogStatus.PASS, "The value <b>"+valueToEnter+"</b> should be entered in the "+fieldName+" textbox","The value <b>"+valueToEnter+"</b> is entered in the "+fieldName+" textbox");
						Assert.assertTrue(true);
						return true;
					}
					
					if(textElement.getAttribute("aria-autocomplete").trim().toUpperCase().equals("LIST"))
					{
						textElement.sendKeys(valueToEnter);
					}
					else
				 	{
						JavascriptExecutor jse = (JavascriptExecutor)currentDriver;
						jse.executeScript("arguments[0].value='"+valueToEnter.trim()+"';", textElement);
						
					/*textElement.sendKeys(" ");
					textElement.sendKeys(Keys.BACK_SPACE);*/
						
//						WebDriverWait wait = new WebDriverWait(currentDriver, 30);
//						wait.until(ExpectedConditions.stalenessOf(textElement));
				 	}
				}catch(Exception e)
				{
					JavascriptExecutor jse = (JavascriptExecutor)currentDriver;
					jse.executeScript("arguments[0].value='"+valueToEnter.trim()+"';", textElement);
					/*textElement.sendKeys(" ");
					textElement.sendKeys(Keys.BACK_SPACE);*/
				}
				insertReportLine(LogStatus.PASS, "The value <b>"+valueToEnter+"</b> should be entered in the "+fieldName+" textbox","The value <b>"+valueToEnter+"</b> is entered in the "+fieldName+" textbox");
				return true;
			}else
			{
				insertReportLine(LogStatus.FAIL, "The value "+valueToEnter+" should be entered in the "+fieldName +" textbox of "+pageName+" Page","The value "+valueToEnter+" could not be entered "+fieldName+" in the textbox of "+pageName+" page" );
				Assert.assertTrue(false,"Unable to Enter Value on "+fieldName+" textBox");
			}
		}
		catch(Exception e)
		{
			insertReportLine(e);
			insertReportLine(LogStatus.FAIL, "The value "+valueToEnter+" should be entered in the "+fieldName +" textbox of "+pageName+" Page",e.getClass().getName()+" Exception occured while entering "+valueToEnter+" value on  "+fieldName+"  textbox of "+pageName+" page" );
			Assert.assertTrue(false,e.getClass().getName()+" Exception Occured while entering value in "+fieldName+" textBox");
		}		
		return false;
	}
	
	public  synchronized boolean mouseOver(WebElement element)
	{

		fieldName =getObjectName();
		
		try {
			seleniumHelper.waitForAobjectToBeVisible(currentDriver,element,fieldName, 40);
			if(element!=null && element.isEnabled())
			{
				Actions act = new Actions(currentDriver);
				act.moveToElement(element).perform();
				Assert.assertTrue(true);
				insertReportLine(LogStatus.PASS, "mouse over should be done on "+fieldName+" element  of "+pageName, "mouse over is done on"+fieldName+" element  of "+pageName);
				return true;
			}else
			{
				insertReportLine(LogStatus.FAIL, " mouseover should be done on "+fieldName+" element  of "+pageName,"mouse over is not done on"+fieldName+" element  of "+pageName);
				Assert.assertTrue(false, "Unable to MouseOver on "+fieldName+". The field is either null or not enabled");
				return false;
			}
		}catch(Exception e)
		{
			insertReportLine(e);
			
			//insertReportLine(LogStatus.FAIL, " mouseover should be done on "+fieldName+" element  of "+pageName,e.getClass().getName()+"Exception occured while Mouse Over on "+fieldName+" element  of "+pageName);
			Assert.assertTrue(false,e.getClass().getName()+"Exception occured while Mouse Over on "+fieldName+" element  of "+pageName);
			return false;
		}
		
	}

	public  synchronized boolean clickElement(WebElement buttonElement) 
	{

		fieldName = getObjectName();
		try
		{
			seleniumHelper.waitForAobjectToBeVisible(currentDriver, buttonElement,fieldName, 40);
			if(buttonElement!=null && buttonElement.isEnabled())
			{
				buttonElement.click();				
				insertReportLine(LogStatus.PASS, "The "+fieldName+" element of "+pageName+" should be clicked ","The "+fieldName+" element of "+pageName+" element is clicked " );
				return true;
			
			}else
			{
				insertReportLine(LogStatus.FAIL, "The "+fieldName+" element of "+pageName+" should be clicked ","The "+fieldName+" element of "+pageName+" element is not clicked " );
				Assert.assertTrue(false,  "Unable to Click on "+fieldName+". The field is either null or not enabled");
			}
		}
		catch(Exception e)
		{
			e.getMessage();
			insertReportLine(e);
			//insertReportLine(LogStatus.FAIL, "The "+fieldName+" element of "+pageName+" should be clicked ",e.getClass().getName()+"Exception occured while clicking on "+fieldName+" element of "+pageName );
			Assert.assertTrue(false, e.getClass().getName()+"Exception occured while Clicking on "+fieldName+" element  of "+pageName);
		}
		
		return false;
	
	}
	
	public boolean jsClickElement(WebElement buttonElement) 
	{
	
		fieldName =getObjectName();
		try
		{
			seleniumHelper.waitForAobjectToBeVisible(currentDriver, buttonElement,fieldName, 40);
			if(buttonElement!=null && buttonElement.isEnabled())
			{
				JavascriptExecutor executor = (JavascriptExecutor)currentDriver;
				executor.executeScript("arguments[0].click();", buttonElement);
				Assert.assertTrue(true);
				insertReportLine(LogStatus.PASS, "The "+fieldName+" element of "+pageName+" should be clicked ","The "+fieldName+" element of "+pageName+" element is clicked " );
				return true;
			}else
			{
				insertReportLine(LogStatus.FAIL, "The "+fieldName+" element of "+pageName+" should be clicked ","The "+fieldName+" element of "+pageName+" element is not clicked " );
				Assert.assertTrue(false);
			}
		}
		catch(Exception e)
		{
			e.getMessage();
			insertReportLine(e);
			//insertReportLine(LogStatus.FAIL, "The "+fieldName+" element of "+pageName+" should be clicked ",e.getClass().getName()+"Exception occured while clicking on "+fieldName+" element of "+pageName );
			Assert.assertTrue(false);
		}
		
		return false;
	
	}
	public synchronized boolean uploadFileUsingRobotClass(WebElement element, String fileLocation) 
	{
		fieldName = getObjectName();
		try
		{
			if(element!=null && element.isEnabled())
			{
				//SeleniumHelper.jsClickElement(element);
				Actions act = new Actions(currentDriver);
				act.doubleClick(element).perform();
				//element.click();
			
				
			//Setting clipboard with file location
	            setClipboardData(fileLocation);
	            //native key strokes for CTRL, V and ENTER keys
	            Robot robot = new Robot();
	            Thread.sleep(1000);
//                robot.keyPress(KeyEvent.VK_ENTER);
//	            robot.keyRelease(KeyEvent.VK_ENTER);
	            
	            robot.keyPress(KeyEvent.VK_CONTROL);
	            robot.keyPress(KeyEvent.VK_V);
	            robot.keyRelease(KeyEvent.VK_V);
	            robot.keyRelease(KeyEvent.VK_CONTROL);
	            robot.keyPress(KeyEvent.VK_ENTER);
	            robot.keyRelease(KeyEvent.VK_ENTER);
	           	Assert.assertTrue(true);
				Thread.sleep(3000);
				insertReportLine(LogStatus.PASS, "The file on "+fileLocation+" is uploaded to "+fieldName+" on page "+pageName,"The file on "+fileLocation+" is uploaded to "+fieldName+" on page "+pageName);
				return true;
			}else
			{
				insertReportLine(LogStatus.FAIL, "The file on "+fileLocation+" is   uploaded to "+fieldName+" on page "+pageName,"The file on "+fileLocation+" is  not uploaded to "+fieldName+" on page "+pageName);
				Assert.assertTrue(false);
				return false;
			}
		}
		catch(Exception e)
		{
			e.getMessage();
			insertReportLine(e);
			//insertReportLine(LogStatus.FAIL, "The file on "+fileLocation+" is uploaded to "+fieldName+" on page "+pageName,e.getClass().getName()+ " exception occured while uploading "+fieldName+" on page "+pageName);
			Assert.assertTrue(false);
			return false;
		}
		
		
	
	}
	
	public synchronized boolean clearTextrField(WebElement textElement)
	{

		fieldName =getObjectName();//getObjectName(textElement, pageName);
				
		try
		{
			seleniumHelper.waitForAobjectToBeVisible(currentDriver,textElement,fieldName, 40);
			if(textElement!=null && textElement.getText()!=null)
			{
				textElement.clear();
				insertReportLine(LogStatus.PASS, "The"+fieldName+"should be cleared", "The"+fieldName+" is cleared on "+pageName+" Page");
				return true;
			}
			else
			{
				insertReportLine(LogStatus.FAIL, "The"+fieldName+"should be cleared", "The"+fieldName+" is not cleared");
				Assert.assertTrue(false, "The"+fieldName+" is not cleared");
				return false;
			}
		}
		catch(Exception e)
		{
			insertReportLine(e);
			
			//insertReportLine(LogStatus.FAIL, "The"+fieldName+"should be cleared", e.getClass().getName()+"Exception Occured while clearing "+fieldName);
			Assert.assertTrue(false, e.getClass().getName()+"Exception Occured while clearing "+fieldName);
			
		}
		
		return false;	
	}
	
	public synchronized boolean isElementExist(WebElement element)
	{

		fieldName = getObjectName();
		try
		{
			waitForAobjectToBeVisible(currentDriver, element, fieldName, 30);
			if(element.isDisplayed())
			{
				insertReportLine(LogStatus.PASS, "Verify that the "+fieldName+" should be present on "+pageName+" Page", " The "+fieldName+"  is present on "+pageName+" Page");
				return true;
			}else
			{
				insertReportLine(LogStatus.FAIL, "Verify that the "+fieldName+" is exist on "+pageName, fieldName+" does not exist on "+pageName);
				sfAssert.assertTrue(false, fieldName+" does not exist on "+pageName);
				return false;
			}
		}
		catch(Exception e)
		{
			insertReportLine(e);
			//insertReportLine(LogStatus.FAIL, "Verify that the "+fieldName+" is exist on UI", e.getClass().getName()+" Exception occered while verifying "+fieldName+" exist on UI or not");
			sfAssert.assertTrue(false,e.getClass().getName()+" Exception occered while verifying "+fieldName+" exist on "+pageName);
			return false;
		}
		
	}
	
	public synchronized boolean validateElementText(WebElement element, String validateText)
	{
		String actualText = "";
		fieldName =getObjectName();//getObjectName(element, pageName);
	
		try
		{
			seleniumHelper.waitForAobjectToBeVisible(currentDriver,element,fieldName, 40);
			if(element!=null) {
				actualText = element.getText();
			}
			if(element!=null&&element.getText().trim().toUpperCase().equals(validateText.trim().toUpperCase()))
			{	
				insertReportLine(LogStatus.PASS, "The "+fieldName+" should contain text "+validateText, "The "+fieldName+" contains text "+validateText);
				return true;
			} else
			{
				insertReportLine(LogStatus.FAIL, "The "+fieldName+" should contain text "+validateText, "The "+fieldName+" contains--> "+actualText+"<--Instead of-->"+validateText);
				sfAssert.assertTrue(false, "The "+fieldName+" contains--> "+actualText+"<--Instead of-->"+validateText);
			}
		}
		catch(Exception e)
		{
			e.getMessage();
			insertReportLine(e);
			//insertReportLine(LogStatus.FAIL, "The "+fieldName+" should contain text "+validateText, e.getClass().getName()+" Exception occured while validating "+fieldName+" contains text "+validateText+" or not");
			sfAssert.assertTrue(false,  e.getClass().getName()+" Exception occured while validating "+fieldName+" contains text "+validateText+" or not");
		}
		return false;
	}
	
	public synchronized boolean validateElementTextContains(WebElement element, String validateText)
	{
		fieldName =getObjectName();//getObjectName(element, pageName);
		try
		{
			seleniumHelper.waitForAobjectToBeVisible(currentDriver,element,fieldName, 40);
			if(element!=null&&element.getText().trim().toUpperCase().contains(validateText.trim().toUpperCase()))
			{
				insertReportLine(LogStatus.PASS, "The text in element "+fieldName+" should contain "+validateText, "The text in element "+fieldName+" contains "+validateText);
				return true;	
			}
			else 
			{
				insertReportLine(LogStatus.FAIL, "The text in element "+fieldName+" should contain "+validateText, "The text in element "+fieldName+"  contains "+element.getText()+" Instead of "+validateText);
				sfAssert.assertTrue(false,"The text in element "+fieldName+"  contains "+element.getText()+" Instead of "+validateText);
				return false;
			}
		}
		catch(Exception e)
		{
			e.getMessage();
			insertReportLine(e);
			//insertReportLine(LogStatus.FAIL, "The text in element "+fieldName+" should contain "+validateText, e.getClass().getName()+" Exception cooured while validating "+fieldName+" contains "+validateText+" or not");
			sfAssert.assertTrue(false,  e.getClass().getName()+" Exception cooured while validating "+fieldName+" contains "+validateText+" or not");
			
		}
		return false;
	}
	
	
	public synchronized boolean validateElementAttribute(WebElement element, String attrbiuteName, String attributeValue)
	{

		fieldName = getObjectName();//getObjectName(element, pageName);
		String capturedAttributeValue =  "";
	try
		{
		capturedAttributeValue = element.getAttribute(attrbiuteName).trim();
	
			seleniumHelper.waitForAobjectToBeVisible(currentDriver,element,fieldName, 40);
			if(element!=null&&capturedAttributeValue.toUpperCase().equals(attributeValue.trim().toUpperCase()))
			{
				insertReportLine(LogStatus.PASS, "The "+attrbiuteName+" attribute name should contain "+attributeValue+" of element"+fieldName,"The "+attrbiuteName+" attribute name contains "+attributeValue+" of element"+fieldName);
				return true;
			}else
			{

				insertReportLine(LogStatus.FAIL,"The "+attrbiuteName+" attribute name should contain "+attributeValue+" of element"+fieldName,"The "+attrbiuteName+" attribute name contains "+capturedAttributeValue+" of element"+fieldName+" instead of "+attributeValue);
				sfAssert.assertTrue(false, "The "+attrbiuteName+" attribute name contains "+capturedAttributeValue+" of element"+fieldName+" instead of "+attributeValue);
				return false;
			}
		}
		catch(Exception e)
		{
			e.getMessage();
			insertReportLine(e);
			//insertReportLine(LogStatus.FAIL,"The "+attrbiuteName+" attribute name should contain "+attributeValue+" of element"+fieldName,e.getClass().getName()+" Exception occured while validating "+attrbiuteName+" attribute name contains "+attributeValue+" of element"+fieldName);
			
			
			sfAssert.assertTrue(false,e.getClass().getName()+" Exception occured while validating "+attrbiuteName+" attribute name contains "+attributeValue+" of element"+fieldName);
		}
		return false;
	}
	
	public synchronized boolean validateText(String actualText, String expectedText)
	{

		try
		{			
			if(actualText.toUpperCase().equals(expectedText.trim().toUpperCase()))
			{	
				//Assert.assertTrue(true);
				insertReportLine(LogStatus.PASS, "The <b>"+actualText+"</b> should be same as <b>"+expectedText+"</b>", "The <b>"+actualText+"</b> is same as <b>"+expectedText+"</b>");
				return true;
			} else
			{
				insertReportLine(LogStatus.FAIL, "The <b>"+actualText+"</b> should be same as <b>"+expectedText+"</b>", "The actual text is <b>"+actualText+"</b> but the expected text is <b>"+expectedText+"</b>");
				sfAssert.assertTrue(false, "The actual text is "+actualText+" but the expected text is "+expectedText);
			}
		}
		catch(Exception e)
		{
			 try {
				 insertReportLine(e);
				 }catch(Exception e1) {e.printStackTrace();}
//			e.getMessage();
//			insertReportLine(e);
//			//insertReportLine(LogStatus.FAIL,  "The <b>"+actualText+"</b> should be same as <b>"+expectedText+"</b>", e.getClass().getName()+" Exception occured while validating "+"The "+actualText+" should be same as "+expectedText);
//			sfAssert.assertTrue(false,e.getClass().getName()+" Exception occured while validating "+"The "+actualText+" should be same as "+expectedText);
		}
		return false;
	}
	
	public synchronized boolean selectFromDropdownByVisibleText(WebElement string, String text) 
	{

		fieldName =getObjectName();//getObjectName(dropDownElememt, pageName);
		try {
			seleniumHelper.waitForAobjectToBeVisible(currentDriver,string,fieldName, 40);
			if(fieldName!=null) {
				Select sel = new Select(string);
				sel.selectByVisibleText(text);
			
				insertReportLine(LogStatus.PASS, "Verify that <b> "+text+"</b> should be selected from "+fieldName+" dropdownlist","<b>"+text+"</b> is selected from "+fieldName+" dropdownlist");
				return true;
			}
			else
			{
				insertReportLine(LogStatus.FAIL,"Verify that <b> "+text+"</b>  should be selected from "+fieldName+" dropdownlist","<b>"+text+"</b> is not selected "+fieldName+" dropdownlist");
				Assert.assertTrue(false, ""+text+" is not selected "+fieldName+" dropdownlist");
				
			}
			
			
		}catch(Exception e) {
			
			insertReportLine(e);
			//insertReportLine(LogStatus.FAIL,"Verify that <b> "+text+"</b>  should be selected from "+fieldName+"dropdownlist",e.getClass().getName()+" Exception occured while selecting "+text+" from "+fieldName+" dropdownlist");
			Assert.assertTrue(false, e.getClass().getName()+" Exception occured while selecting "+text+" from "+fieldName+" dropdownlist");
		}
		return false;
	}
	
	 public synchronized boolean selectFromAutoCompleteBox( WebElement textBoxEle, List<WebElement> elementList, String text)
	 {

			fieldName =getObjectName();//getObjectName(textBoxEle, pageName);
			try {
			 seleniumHelper.waitForAobjectToBeVisible(currentDriver,textBoxEle,fieldName, 40);
			 
			 boolean clicked = false;
			 textBoxEle.clear();
			 Thread.sleep(1000);
			 seleniumHelper.enterValueIntoTextField(textBoxEle, text.substring(0, 3));
			 
			 seleniumHelper.waitForAobjectToBeVisible(currentDriver, elementList.get(0),fieldName, 180);
			 for(WebElement element:elementList)
			 {
				 if(element.getAttribute("title").trim().toUpperCase().equals(text.trim().toUpperCase()))
				 {
					 seleniumHelper.clickElement(element);
					 insertReportLine(LogStatus.PASS, "<b>"+text+"</b> should be selected from the "+fieldName+" autocomplete box", "<b>"+text+"</b> is selected from "+fieldName+" autocomplete box");
					 Assert.assertTrue(true);
					 clicked = true;
					 break;
				 }
				
			 }
			 
			 if(!clicked)
			 {
				 
					 insertReportLine(LogStatus.FAIL, "<b>"+text+"</b> should be selected from "+fieldName+" autocomplete box", "<b>"+text+"</b> cannot be selected from "+fieldName+" autocomplete box");
					 Assert.assertTrue(false, text+" cannot be selected from "+fieldName+" autocomplete box"); 
					 return false;
				 
			 }
			 return true;
			 
	
		 }catch(Exception e)
		 {
			 insertReportLine(e);
			// insertReportLine(LogStatus.FAIL, e.getClass().getName()+" Exception Occured while selecting from autoCompleteBox");
			 Assert.assertTrue(false, e.getClass().getName()+" Exception Occured while selecting from autoCompleteBox");
		 }
		return false;
	 }
	 
	 
	 public synchronized boolean validateDate(String actualDate, String expectedDate)
	 {
		 try {
			 fieldName = getObjectName();
			 Date actualDated = new Date(actualDate);
			 Date expectedDated = new Date(expectedDate);
			 
			 /*if(actualDated.after(expectedDated)){
				   insertReportLine(LogStatus.PASS, "");
	                System.out.println("actualDated is after expectedDated");
	            }

	            if(actualDated.before(expectedDated)){
	                System.out.println("actualDated is before expectedDated");
	            }*/
			 
			 
	            if(actualDated.equals(expectedDated)){
	            	
	            	 insertReportLine(LogStatus.PASS,"<b style='color:black; background:yellow'>"+"(DATE COMPARISON)"+"</b>actualDate"+"<b>("+actualDate+")</b> of "+fieldName+" should be same as expected date<b>("+expectedDate+")</b>", "actualDate"+"<b>("+actualDate+")</b> of "+fieldName+" is same as expected date<b>("+expectedDate+")</b>");
	            	return true;
	                
	            }else
	            {
	            	 insertReportLine(LogStatus.FAIL,"<b style='color:black; background:yellow'>"+"(DATE COMPARISON)"+"</b>actualDate"+"<b>("+actualDate+")</b> of "+fieldName+" should be same as expected date<b>("+expectedDate+")</b>", "The actual date is <b>"+actualDate+"</b> in "+fieldName+" but the expected date is <b>"+expectedDate+"</b>");
	            }
			 
			 
		 }catch(Exception e)
		 {
			 try {
			 insertReportLine(e);
			 }catch(Exception e1) {e.printStackTrace();}
			// insertReportLine(LogStatus.FAIL, e.getClass().getName()+" Exception Occured while comparing date"); 
		 }
		 return false;
	 }
	
	public synchronized boolean validateElementAttributeContains(WebElement element, String attrbiuteName, String attributeValue)
	{
		try
		{
			if(element!=null&&element.getAttribute(attrbiuteName).trim().toUpperCase().contains(attributeValue.trim().toUpperCase()))
			{
				return true;
			}
		}
		catch(Exception e)
		{
			insertReportLine(e);
			e.getMessage();
		}
		return false;
	}
	
	public String getElementAttributeValue(WebElement element, String attrbiuteName)
	{
		try
		{
			if(element!=null)
			{
				
				return element.getAttribute(attrbiuteName).trim();
			}
		}
		catch(Exception e)
		{
			insertReportLine(e);
			e.getMessage();
		}
		return null;
	}
	
	public String getElementText(WebElement element)
	{
		try
		{
			if(element!=null)
			{
				
				return element.getText().trim();
			}
		}
		catch(Exception e)
		{
			insertReportLine(e);
			e.getMessage();
		}
		return null;
	}
	
	
	
	public int getColumnIndexFromTable(WebElement table, String colTagName,String columnText)
	{
		int colIndex=-1;
		try
		{
			List<WebElement> columnElements = new ArrayList<WebElement>();
			columnElements=table.findElements(By.tagName(colTagName));;
			for(int index=0; index<columnElements.size();index++)
			{
				if((columnElements.get(index)).getText().trim().equals(columnText))
				{
					colIndex= index;
					return colIndex;
				}
			}
		}
		catch(Exception e)
		{
			insertReportLine(e);
			e.getMessage();
		}		
		
		return colIndex;
	}
	
	public int getRowIndexFromTable(WebElement table, String rowTagName,String colTagName, String rowUniqueText)
	{
		int rowIndex=-1;
		try
		{
			List<WebElement> rowElements = new ArrayList<WebElement>();
			rowElements=table.findElements(By.tagName(rowTagName));
			for(int index=0; index<rowElements.size();index++)
			{
				List<WebElement> cells = (rowElements.get(index)).findElements(By.tagName(colTagName));
				for(int cindex=0; cindex<cells.size();cindex++)
				{
					if((cells.get(cindex)).getText().equals(rowUniqueText.toString()))
					{
						rowIndex= index;
						return rowIndex;
					}
				}
				
			}
		}
		catch(Exception e)
		{
			insertReportLine(e);
			e.getMessage();
		}		
		
		return rowIndex;
	}	
	
	
	public String getCellData(WebElement table,String rowTagName,String colTagName,int rowIndex, int colIndex)
	{
		try
		{
			List<WebElement> row = table.findElements(By.tagName(rowTagName));
			List<WebElement> cells = (row.get(rowIndex)).findElements(By.tagName(colTagName));
			return cells.get(colIndex).getText().toString();
		}
		catch(Exception e)
		{
			insertReportLine(e);
		}		
		return null;
	}
	
	public WebElement getCellElement(WebElement table,String rowTagName,String colTagName,
			int rowIndex, int colIndex, String elementTagName)
	{
		try
		{
			List<WebElement> row = table.findElements(By.tagName(rowTagName));
			List<WebElement> cells = (row.get(rowIndex)).findElements(By.tagName(colTagName));
			return cells.get(colIndex).findElement(By.tagName(elementTagName));
		}
		catch(Exception e)
		{
			insertReportLine(e);
		}		
		return null;
	}
	
	public synchronized boolean switchFrame(WebDriver driver, String frameId)
	{
		try
		{
			driver.switchTo().frame(frameId);
			return true;
		}
		catch(Exception e)
		{
			insertReportLine(e);
			return false;
		}
	}
	
	public synchronized boolean switchFrame(WebDriver driver, int frameIndex)
	{
		try
		{
			driver.switchTo().frame(frameIndex);
			return true;
		}
		catch(Exception e)
		{
			insertReportLine(e);
			return false;
		}
	}
	
	public synchronized boolean switchDefaultContent(WebDriver driver)
	{
		try
		{
			driver.switchTo().defaultContent();
			return true;
		}
		catch(Exception e)
		{
			insertReportLine(e);
			return false;
		}
	}
	
	
	public static String takeSnapShot(WebDriver webdriver,String fileWithPath)
	{
		try
		{
			 int pageHeight =  webdriver.manage().window().getSize().height+10;
			   int pageWidth = webdriver.manage().window().getSize().width-25;
			TakesScreenshot scrShot =((TakesScreenshot)webdriver); 	        
			File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);	  
			
			 BufferedImage bufferedImage = ImageIO.read(SrcFile);
			    BufferedImage destImage = bufferedImage.getSubimage(0, 0, pageWidth, pageHeight);
			    ImageIO.write(destImage, "png", SrcFile);
			
			File DestFile=new File(fileWithPath); 	         
			FileUtils.copyFile(SrcFile, DestFile);
			return fileWithPath;
			
			
		}
		catch(Exception e)
		{
			try {
			TakesScreenshot scrShot =((TakesScreenshot)webdriver); 	        
			File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
			File DestFile=new File(fileWithPath); 	         
			
			FileUtils.copyFile(SrcFile, DestFile);
			return fileWithPath;
			} catch (IOException e1) {
				
			insertReportLine(LogStatus.WARNING, "ScreenShot could not be captured due to "+e1.getClass().getName()+" Exception");
			return null;
			}
			
			
		}                   
 
    }
	
	
	public void autoSelectingBox(WebElement boxElement, String text)
	{
		List<WebElement> elements;
		CharSequence letter ;
		try
		{
			outerloop:
			for(int i = 0; i<=text.length()-1; i++)
			{
				letter = text.substring(i, i+1);
				boxElement.sendKeys(letter);;
				Thread.sleep(3000);
				elements = currentDriver.findElements(By.className("ui-menu-item"));
				if(elements!=null) {
				for(WebElement e:elements)
				{
					if(e.getText().equals(text))
					{
						e.click();
						break outerloop;
					}
				}
				}
				
				if(i>=2)
				{
					
					boxElement.sendKeys(Keys.BACK_SPACE);
					i=i-1;
					Thread.sleep(2000);
					elements = currentDriver.findElements(By.className("ui-menu-item"));	
					if(elements!=null) {
					for(WebElement e:elements)
					{
						if(e.getText().equals(text))
						{
							e.click();
							break outerloop;
						}
					}
					}
					}
				}
				
			}
			
		
		catch(Exception e)
		{
			insertReportLine(e);
			e.getMessage();
		} 
	}
	
	
	public void scrollDown(WebDriver driver, int pixelsToScroll)
	{
		try {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript(arg0, arg1)
		
		jse.executeScript("window.scrollBy(0,"+Integer.toString(pixelsToScroll)+")", "");
		Assert.assertTrue(true);
		insertReportLine(LogStatus.PASS, "The Page should scroll down to "+pixelsToScroll+" pixels", "Page Scrolled Down to "+pixelsToScroll+" pixels");
		}catch(Exception e)
		{
			insertReportLine(LogStatus.FAIL, "The Page should scroll down to "+pixelsToScroll+" pixels", "Unable to Scroll Down due to "+e.getClass().getName());
			Assert.assertTrue(false);
		}
	}
	public void scrollUp(WebDriver driver, int pixelsToscroll)
	{
		try {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-"+Integer.toString(pixelsToscroll)+")", "");
		Assert.assertTrue(true);
		insertReportLine(LogStatus.PASS, "The Page should scroll down to "+pixelsToscroll+" pixels", "Page Scrolled Down to "+pixelsToscroll+" pixels");
		}catch(Exception e)
		{
			insertReportLine(e);
		//	insertReportLine(LogStatus.FAIL, "The Page should scroll down to "+pixelsToscroll+" pixels", "Unable to Scroll Down due to "+e.getClass().getName());
			Assert.assertTrue(false);
		}
	}
		 

	static String elementXpath = "" ;
	public void waitForAobjectToBeVisible(WebDriver driver,WebElement element, String objectName, long timeOutInSeconds)
	{
		WebDriverWait wait;
		try {
		 wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
		}catch(Throwable t)
		{
			if(t.getClass().getSimpleName().trim().equalsIgnoreCase("TimeoutException"))
			{
				insertReportLine(LogStatus.FAIL, objectName+" Object Couldnot be found on the UI [TimeOut Occured after "+timeOutInSeconds+" seconds]");
				Assert.assertTrue(false,objectName+" Object Couldnot be found on the UI[TimeOut Occured after "+timeOutInSeconds+" seconds]");
			}
			else
			{
				insertReportLine(LogStatus.FAIL, t.getClass().getSimpleName()+" Exception occured while waiting for "+objectName+" element");
				Assert.assertTrue(false,  t.getClass().getSimpleName()+" Exception occured while waiting for "+objectName+" element");
			}
		}
	}
	public void waitForAobjectToBeVisible(WebElement element,WebDriver driver)
	{
		 long timeOutInSeconds = Long.parseLong(Environment("objectDefaultSyncTimePeriod"));
		String objectName = getObjectName();
		WebDriverWait wait;
		try {
		 wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
		}catch(Throwable t)
		{
			//new TimeoutException()
			if(t.getClass().getSimpleName().trim().equalsIgnoreCase("TimeoutException"))
			{
				insertReportLine(LogStatus.FAIL, objectName+" Object Couldnot be found on the UI(TimeOut Occured after "+timeOutInSeconds+" seconds)");
				Assert.assertTrue(false,objectName+" Object Couldnot be found on the UI(TimeOut Occured after "+timeOutInSeconds+" seconds)");
			}
			else
			{
				insertReportLine(LogStatus.FAIL, t.getClass().getSimpleName()+" Exception occured while waiting for "+objectName+" element");
				Assert.assertTrue(false,  t.getClass().getSimpleName()+" Exception occured while waiting for "+objectName+" element");
			}
			setExceptionLog(t);
		}
	}
	
	public void waitForObjectToload(WebDriver driver,By locator, long timeOutInSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	
	// Added By Anil 
	
		public synchronized boolean isElementNotExist(WebElement element)
		{

			fieldName = getObjectName();
			try
			{
				//waitForAobjectToBeVisible(currentDriver, element, fieldName, 30);
				if(!element.isDisplayed())
				{
					insertReportLine(LogStatus.PASS, "Verify that the "+fieldName+" should not be present on "+pageName+" Page", " The "+fieldName+"  is not present on "+pageName+" Page");
					return true;
				}else
				{
					insertReportLine(LogStatus.FAIL, "Verify that the "+fieldName+" is not exist on "+pageName, fieldName+" exist on "+pageName);
					sfAssert.assertTrue(false, fieldName+" does not exist on "+pageName);
					return false;
				}
			}
			catch(NoSuchElementException e) {
				insertReportLine(LogStatus.PASS, "Verify that the "+fieldName+" should not be present on "+pageName+" Page", " The "+fieldName+"  is not present on "+pageName+" Page");
				return true;
			}
			catch(Exception e)
			{
				insertReportLine(e);
				//insertReportLine(LogStatus.FAIL, "Verify that the "+fieldName+" is exist on UI", e.getClass().getName()+" Exception occered while verifying "+fieldName+" exist on UI or not");
				sfAssert.assertTrue(false,e.getClass().getName()+" Exception occered while verifying "+fieldName+" exist on "+pageName);
				return false;
			}
			
		}
	
	
		/****************
		 * This Function deals with the validation of sorting functionality on table columns
		 * Parameters: List of the column values in String, Type of column Values(String, Numeric, Date), Type of Sort(Ascending/Descending)
		 * ****************/
		
		public boolean isColumnSorted(List<WebElement> wbList, String type, String AscOrDsc) {
			List<String> list = new ArrayList<>();
			try {
				Thread.sleep(5000);
				for(WebElement wb: wbList) {	
					list.add(wb.getText());	
				}
				
				if (type.equalsIgnoreCase("String")) {
					if (AscOrDsc.equalsIgnoreCase("ASC")) {
						
						for(int k=1;k<=list.size()-1;k++)
						{
							if(list.get(k-1).compareToIgnoreCase(list.get(k))>0) {
								insertReportLine(LogStatus.FAIL, "Given String column should be sorted in Ascending Order",
										"Given String column is not sorted in Ascending Order");
								return false;
							}
						}
//						String previous = "";
//						for (String current : list) {
//							if (current.compareTo(previous) < 0) {
//								insertReportLine(LogStatus.FAIL, "Given String column should be sorted in Ascending Order",
//										"Given String column is not sorted in Ascending Order");
//								return false;
//							}
//							previous = current;
	//
//						}
						insertReportLine(LogStatus.PASS, "Given String column should be sorted in Ascending Order",
								"Given String column is sorted in Ascending Order");
						return true;
					} else if (AscOrDsc.equalsIgnoreCase("DSC")) {
						//String previous = "";
						
						for(int k=1;k<=list.size()-1;k++)
						{
							if(list.get(k-1).compareToIgnoreCase(list.get(k))<0) {
								insertReportLine(LogStatus.FAIL, "Given String column should be sorted in Descending Order",
										"Given String column is not sorted in Descending Order");
								return false;
							}
						}
//						for (String current : list) {
//							if (current.compareTo(previous) > 0) {
//								insertReportLine(LogStatus.FAIL, "Given String column should be sorted in Descending Order",
//										"Given String column is not sorted in Descending Order");
//								return false;
//							}
//							previous = current;
//						}
						insertReportLine(LogStatus.PASS, "Given String column should be sorted in Descending Order",
								"Given String column is sorted in Descending Order");
						return true;
					}
				} else if (type.equalsIgnoreCase("Numeric")) {

					if (AscOrDsc.equalsIgnoreCase("ASC")) {
						List<Integer> intLst = new ArrayList<Integer>();
						int i = 0;

						for (String s : list) {
							if(!s.equals("")) {
							i = Integer.parseInt(s);
							intLst.add(i);
							}
							
						}

						//int previous;// = 0;

						for (int j = 1; j <= intLst.size() - 1; j++) {
							if (intLst.get(j - 1) > intLst.get(j)) {
								insertReportLine(LogStatus.FAIL, "Given Numeric column should be sorted in Ascending Order",
										"Given Numeric column is not sorted in Ascending Order");
								return false;
							}
						}
						insertReportLine(LogStatus.PASS, "Given Numeric column should be sorted in Ascending Order",
								"Given Numeric column is sorted in Ascending Order");
						return true;
					} else if (AscOrDsc.equalsIgnoreCase("DSC")) {
						List<Integer> intLst = new ArrayList<Integer>();
						int i=0;

						for (String s : list) {
							
							if(!s.equals("")) {
							i = Integer.parseInt(s);
							intLst.add(i);
							}
						}

						//int previous;// = 0;

						for (int j = 1; j <= intLst.size() - 1; j++) {
							if (intLst.get(j - 1) < intLst.get(j)) {
								insertReportLine(LogStatus.FAIL,
										"Given Numeric column should be sorted in Descending Order",
										"Given Numeric column is not sorted in Descending Order");
								return false;
							}
						}
						insertReportLine(LogStatus.PASS, "Given Numeric column should be sorted in Descending Order",
								"Given Numeric column is sorted in Descending Order");
						return true;
					}
				} else if (type.equalsIgnoreCase("Date")) {
					if (AscOrDsc.equalsIgnoreCase("ASC")) {
						List<Date> dateLst = new ArrayList<Date>();
						for (String s : list) {
							dateLst.add(new Date(s));
						}
						for (int j = 1; j <= dateLst.size() - 1; j++) {
							if (dateLst.get(j - 1).compareTo(dateLst.get(j)) == 1) {
								insertReportLine(LogStatus.FAIL, "Given Date column should be sorted in Ascending Order",
										"Given Date column is not sorted in Ascending Order");
								return false;
							}
						}
						insertReportLine(LogStatus.PASS, "Given Date column should be sorted in Ascending Order",
								"Given Date column is sorted in Ascending Order");
						return true;
					} else if (AscOrDsc.equalsIgnoreCase("DSC")) {
						List<Date> dateLst = new ArrayList<Date>();
						for (String s : list) {
							dateLst.add(new Date(s));
						}
						for (int j = 1; j <= dateLst.size() - 1; j++) {
							if (dateLst.get(j - 1).compareTo(dateLst.get(j)) == -1) {
								insertReportLine(LogStatus.FAIL, "Given Date column should be sorted in Descending Order",
										"Given Date column is not sorted in Descending Order");
								return false;
							}
						}
						insertReportLine(LogStatus.PASS, "Given Date column should be sorted in Descending Order",
								"Given Date column is sorted in Descending Order");
						return true;
					}
				}

			} catch (Throwable t) {
				insertReportLine(t);
			}

			return false;
		}
//This function will validate either the list contains expected string value as text attribute getText()		
	public void validate_String_From_WebElement_List(List<WebElement> webElementList, String expectedString) {
		
		boolean found = false;
		try {
			
			for(WebElement element:webElementList) {
				
				if(element.getText().equals(expectedString))
				{
					insertReportLine(LogStatus.PASS, "The Webelement List should contain text '"+expectedString+"'", "The Webelement List contains text '"+expectedString+"'");
					found = true;
					Assert.assertTrue(true);
				}
				
			}
			if(!found) {
				insertReportLine(LogStatus.FAIL, "The Webelement List should contain text '"+expectedString+"'", "The Webelement List doesnot contain text '"+expectedString+"'");
				Assert.assertTrue(false);
			}
			
		}catch(Exception e) {
			
			
			insertReportLine(e);
			
		}
	}
	
	
public void ClickSelectedElementfromWebList(List<WebElement> webElementList, String expectedString) {
		
		boolean found = false;
		try {
			int RowCnt=1;
			
			for(WebElement element:webElementList) {
				RowCnt=RowCnt+1;
				
				if(element.getText().equals(expectedString))
				{
					element.click();
					insertReportLine(LogStatus.PASS, "The Webelement'"+expectedString+"'"+"Should be cliked", "The Webelement'"+expectedString+"'"+"Has been clicked");
					found = true;
					Assert.assertTrue(true);
	}
				
			}
			if(!found) {
				insertReportLine(LogStatus.FAIL, "The Webelement'"+expectedString+"'"+"Should be cliked", "The Webelement'"+expectedString+"'"+"is not found in the list");
				Assert.assertTrue(false);
			}
			
		}catch(Exception e) {
			
			
			insertReportLine(e);
			
		}
	}


//This function will validate either the list value attribute is equal to expected attribute value as getAttribute("value")		
	public void validateElementValueAttributeFromList(List<WebElement> webElementList, String expectedString) {
		
		boolean found = false;
		try {
			
			for(WebElement element:webElementList) {
				
				if(element.getAttribute("value").equals(expectedString))
				{
					insertReportLine(LogStatus.PASS, "The Webelement List should contain text '"+expectedString+"'", "The Webelement List contains text '"+expectedString+"'");
					found = true;
					Assert.assertTrue(true);
				}
				
			}
			if(!found) {
				insertReportLine(LogStatus.FAIL, "The Webelement List should contain text '"+expectedString+"'", "The Webelement List doesnot contain text '"+expectedString+"'");
				Assert.assertTrue(false);
			}
			
		}catch(Exception e) {
			
			
			insertReportLine(e);
			
		}
	}
 
	
	//This function will validate either the list contains expected string value as text attribute getText()		
		public void ValidateEitherListIsHavingonlyTextYorN(List<WebElement> webElementList) {
			
			boolean found = false;
			try {
				
				for(WebElement element:webElementList) {
					
					if(element.getText().equals("N") || element.getText().equals("Y")  )
					{
						insertReportLine(LogStatus.PASS, "The Webelement List should contain text only '"+"N or Y"+"'", "The Webelement List contains text '"+"N or Y"+"'");
						found = true;
						Assert.assertTrue(true);
					}
					
				}
				if(!found) {
					insertReportLine(LogStatus.FAIL, "The Webelement List should contain text only '"+"N or Y"+"'", "The Webelement List doesnot contain text '"+"N or Y"+"'");
					Assert.assertTrue(false);
				}
				
			}catch(Exception e) {
				
				
				insertReportLine(e);
				
			}
		}
	
	
	
}
