package testCase;

import static io.restassured.RestAssured.given;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.chrome.AddHasCasting;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.gherkin.model.Given;

import groovyjarjarantlr4.v4.parse.GrammarTreeVisitor.tokenSpec_return;

import static io.restassured.RestAssured.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import API.BODY;
import APIresponce.AuthResponce;


public class Test001API extends baseClass {

@Test(priority = 1)
public void Test()  {
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

}
