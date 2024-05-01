package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class MysuitePage extends baseClass {

	public MysuitePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//h1[contains(text(),'My suite')]")
public WebElement txtMySuite;
	
	@FindBy(xpath="//h1[contains(text(),'My suite'')]")
	public By bytxtMySuite;
	
	
	@FindBy(xpath ="//a[normalize-space()='My Suite']")
	WebElement hrfMySuiteTab;
	
	
	@FindBy(xpath = "//div[@id='mysuite-tabs-tabpane-US']//button[contains(text(),'Request shipment')]")
WebElement ButtonShipreq;
	
	@FindBy(xpath="//div[@id='mysuite-tabs-tabpane-US']//div[@class='p-0 container']//div[@class='mt-4 row']//div//div[@class='col']//input[@type='checkbox']")
	WebElement checkboxShip;
	
	
	@FindBy(xpath = "//button[contains(text(),'Next')]")
public	By butNext;
	
	
	@FindBy(xpath = "//button[contains(text(),'Next')]")
	public	WebElement butNexte;
	
	
	
	
	
	
	
	
	// Action Methods 
	
public String getMySuiteText() {
	
		try { txtMySuite.getText();
			return	txtMySuite.getText();	
		} catch (Exception e) {
			// TODO: handle exception
		return (e.getMessage());}
	
		}
	
	
 public void clickMysuite() {
	try {
		hrfMySuiteTab.click();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void ClickShipRequiest() {
	 
	
		 try {
			 ButtonShipreq.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	 
 }
public void ClickShipRequiestcheckbox() {
	 
	
	 try {
		 checkboxShip.click();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
	 
	 public void ClickNextBut() {
		 
			
				butNexte.click();
			
	 }



	
}
