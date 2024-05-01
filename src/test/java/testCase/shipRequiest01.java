package testCase;






import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.internal.invokers.AbstractParallelWorker.Arguments;

import API.BODY;
import APIresponce.AuthResponce;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.Argument;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;
import pageObject.CPGpage;
import pageObject.MysuitePage;
import pageObject.homePage;
import pageObject.startShipment;

public class shipRequiest01 extends baseClass {
	
	
	@Test(priority = 1)
	public void TestAPIrecivePackage()  {
	
		try {
			
			
		// Authorization
		RequestSpecification reqAuth=	new RequestSpecBuilder().setBaseUri(BaseURI).setContentType(ContentType.JSON).build();
		AuthResponce AuthResponce	=given().log().all().spec(reqAuth).body("{\r\n"
				+ "    \"userName\": \"QIDAPIUser\",\r\n"
				+ "    \"passWord\": \"QIDApi#1\"\r\n"
				+ "}").when().post(AuthResource).then().log().all().extract().as(AuthResponce.class);

		
		
	String token=	AuthResponce.getToken();
			System.out.println(AuthResponce.getToken());
			
			  
			  
			// Recive pacakge API 
			BODY body= new BODY();
			RequestSpecification reqRecive=	new RequestSpecBuilder().setBaseUri(BaseURI).addHeader("Authorization", "Bearer\n"+token).setContentType(ContentType.JSON).build();
		String reciveresponce=given().log().all().spec(reqRecive).body(body.RecivepacakgeBody()).when().post(RecivePKGResource)
			.then().log().all().assertThat().statusCode(200).extract().response().asString();

		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(reciveresponce, "{\"isSuccess\":true,\"exception\":null}");
		System.out.println(reciveresponce);
		
	sa.assertAll();
	}catch (Exception e) {
		// TODO: handle exception
	}
		}
	

		@Test(priority = 2)
		public void testLogIn() throws InterruptedException {
			
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
				
				
				// no element to wait for 
				 //Thread.sleep(1000);
				mysuitePage.clickMysuite();
				
				
	//Assert.	assertEquals(mysuitePage.getMySuiteText(), "MY SUITE","Not Getting Expected Message");
				//Thread.sleep(1000);
				System.out.println(driver1.getCurrentUrl());
			if (driver1.getCurrentUrl().equalsIgnoreCase("https://devtestemiratesdelivers.smartkargo.com/my-package-lockers?lang=en-US"))	
			{System.out.println(driver1.getCurrentUrl());
				driver1.get("https://devtestemiratesdelivers.smartkargo.com/my-suite");
			}
				
			mysuitePage.ClickShipRequiestcheckbox();
		
			

		
		
		
	mysuitePage.ClickShipRequiest();
			
			
//	WebDriverWait expforSuite = new WebDriverWait(driver1, Duration.ofSeconds(10));
	//expforSuite.until(ExpectedConditions.visibilityOfElementLocated(mysuitePage.butNext));
	Thread.sleep(4000);
	
	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver1;
	 jsExecutor.executeScript("arguments[0].click();" , mysuitePage.butNexte );
	
	
	//mysuitePage.ClickNextBut();
			
	startShipment startShipment = new startShipment(driver1);
	startShipment.clickOnPaymentSummary();
			
	
//	Thread.sleep(4000);
	
		startShipment.clickOnShipNow();	
			
			
		CPGpage cpGpage = new CPGpage(driver1);	
			cpGpage.SendCardnum();
			cpGpage.clikcexpirydatefild();	
			cpGpage.SendExparidate();
			cpGpage.clikcCSVfild();
			cpGpage.SendCVS();
			cpGpage.cleanCSVfild();
			Thread.sleep(5000);
			cpGpage.SendCVS();
			cpGpage.clikcPayButton();
				
			
			}catch (Exception e) {
				e.printStackTrace();// TODO: handle exception
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
