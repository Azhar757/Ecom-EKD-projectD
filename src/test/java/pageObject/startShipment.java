package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class startShipment extends baseClass {

	public startShipment(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	

	
	@FindBy(xpath="//div[contains(text(),'Payment Summary')]")
	WebElement butPaymentSummary;
	
	@FindBy(xpath = "//button[normalize-space()='Ship now']")
	WebElement butShipNow;
	
	// Action Methods 
	
public	void clickOnPaymentSummary() {
		butPaymentSummary.click();
		
	}
	
	
public	void clickOnShipNow() {
	butShipNow.click();
	
}
	
	
	
}
