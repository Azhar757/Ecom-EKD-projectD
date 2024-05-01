package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CPGpage extends baseClass {

	public CPGpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	@FindBy(xpath = "//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedStart MuiOutlinedInput-inputAdornedStart MuiInputBase-inputTypeSearch']")
	WebElement inputcardnum;
	@FindBy(xpath = "//div[@id='cardExpiryDate']//input[@type='search']")
	WebElement inputExpirydate;
	
	@FindBy(xpath = "//input[@type='password']")
	WebElement inputcvs;
	
	@FindBy (xpath = "//span[normalize-space()='Pay']")
	WebElement butpayElement;
	// Action Methods 
	
public	void SendCardnum () {
	inputcardnum.sendKeys("4111111111111111");
}
	
public	void SendExparidate() {
	inputExpirydate.sendKeys("0987");
}
	
public	void SendCVS() {
	inputcvs.sendKeys("916");
}	
	
public	void clikcPayButton() {
	butpayElement.click();
}	
	
	public void clikcexpirydatefild() {
		
		inputExpirydate.click();
		
	}
public void clikcCSVfild() {
		
		inputcvs.click();
		
	}


public void cleanCSVfild() {
	
	inputcvs.clear();
	
}
	
	
	
}
