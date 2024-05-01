package testCase;








import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import pageObject.MysuitePage;
import pageObject.homePage;

public class logInTest01 extends baseClass {

	@Test(priority = 2)
	public void test() throws InterruptedException {
		try {
			logger.debug("Application logs.......");
			logger.info("*** Starting logInTest01 *** ");
		homePage hpage= new homePage(driver1);
		
		logger.info(" Get bot log in URL  ");
		driver1.get(BotloginURL);
		logger.info("Giving the user login Data ");
		hpage.InputEmail();
		hpage.InputPassword();
		hpage.ClikcBotlogin();
		logger.info("Refresh ");
	
		
		Thread.sleep(1000);
		MysuitePage mysuitePage=new MysuitePage(driver1);
		
		
		
	
		driver1.navigate().refresh();
		
				
				logger.info("Validating My Suite ");		
			
			
			//WebDriverWait expforSuite = new WebDriverWait(driver1, Duration.ofSeconds(10));
			//expforSuite.until(ExpectedConditions.visibilityOfElementLocated(mysuitePage.bytxtMySuite));// no element to wait for 
			 //Thread.sleep(1000);
			mysuitePage.clickMysuite();
			
			
Assert.	assertEquals(mysuitePage.getMySuiteText(), "MY SUITE","Not Getting Expected Message");
	
		}catch (Exception e) {
			
			logger.error("Test Fail");
			
			e.printStackTrace();
	
			org.testng.Assert.fail();
		
		
		// TODO: handle exception
		}
				
		
		
		
		
		
		
		
		
		
	}

	
	

}
