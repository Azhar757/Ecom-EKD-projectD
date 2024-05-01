package testCase;



import java.time.Duration;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {
	public ResourceBundle rb;
	 public WebDriver driver1;
	 
	public Logger logger ;
	 
	@BeforeClass
	@Parameters("browser")
	public void setUp(String B) {
		//rb=ResourceBundle.getBundle("Config01");// for the .proprites file get bundle
		 logger = LogManager.getLogger(this.getClass()); // to start logging 
		

		

	
		if (B.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			
		driver1 = new ChromeDriver();
		}else if (B.equals("edge")) {
			
			driver1=new EdgeDriver();
		}else if (B.equals("firefox"))
		{
			
			driver1= new FirefoxDriver();
		}
		
		
		
		
		driver1.get("https://devtestemiratesdelivers.smartkargo.com/?lang=en-US");
		
		//driver1.manage().deleteAllCookies();
		driver1.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver1.manage().window().maximize();
		
		
	}
	@AfterClass
	public void tearDown() {
		//driver1.quit();
		
	}
	
	
	public String BotloginURL= "https://devtestemiratesdelivers.smartkargo.com/botlogin";
	
	
	
	public String RendomNumber() {	 
	String RendomNUM=RandomStringUtils.randomNumeric(7);
	return RendomNUM; 
	}

	 public String RendomAlphabets() {

			String rendomALP=	RandomStringUtils.randomAlphabetic(7);
	return rendomALP;	
	}
	
	public String RendomAlphaNUM() {
		String	RendomNUM=RandomStringUtils.randomNumeric(7);
		String	rendomALP=	RandomStringUtils.randomAlphabetic(7);		
	return (rendomALP+RendomNUM);
	}
	


public  String BaseURI= "https://ekdevtestapi.smartkargo.com";
	public  String AuthResource="/wms-devtest-api/tokens/GenerateToken";
	public  String RecivePKGResource ="/wms-devtest-api/packages/ReceivePackage";
	
	
	
}
