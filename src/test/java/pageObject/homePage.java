package pageObject;

import java.sql.Driver;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage extends baseClass {

	public homePage(WebDriver driver) {
		super(driver);	
	
	}
	
	//locators 
	
	@FindBy(xpath="//img[contains(@src,'../images/delivers_logo.svg')]")
	WebElement logoED;

	@FindBy(linkText ="How it Works")
	WebElement lnkHowItWorks;
	
	@FindBy(linkText ="Rates")
	WebElement lnkRates;
	
	@FindBy(linkText ="FAQs")
	WebElement lnkFAQs;
	
	@FindBy(linkText ="Contact us")
	WebElement lnkContactus;
	
	@FindBy(linkText ="Sign Up")
	WebElement lnkSignUp;
	
	@FindBy(xpath ="//a[@class='nav-link' and text()='Log In']") 
	public WebElement xpatLogIn;
	
	@FindBy(xpath = "//input[@placeholder='Email']")
	public WebElement LogInplhEmail;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement LogInplhPassword;

	@FindBy(xpath = "//span[contains(@class,'recaptcha-checkbox')]")
	WebElement LogInCaptcha;

	@FindBy(xpath = "//Button[text()='Bot Login']")
	WebElement LogButBotLogin;
	
	//Action Methods
	
	public void ClickLogIn () {
		
		xpatLogIn.click();	
	}
	

public void InputEmail() {
	LogInplhEmail.sendKeys("b451@allfreemail.net");
}

public void InputPassword() {
	LogInplhPassword.sendKeys("Azhar@123");
}
	
	
public void ClikcBotlogin() {
	LogButBotLogin.click();
}
	
	
	
}
