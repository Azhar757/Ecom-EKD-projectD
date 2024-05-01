package API;

import org.apache.commons.lang3.RandomStringUtils;

public class baseApiClass {
	String RendomNUM;
	String rendomALP;
	
	public String RendomNumber() {	 
		RendomNUM=RandomStringUtils.randomNumeric(7);
		return RendomNUM; 
		}

		 public String RendomAlphabets() {

				 rendomALP=	RandomStringUtils.randomAlphabetic(7);
		return rendomALP;	
		}
		
		public String RendomAlphaNUM() {
			RendomNUM=	RendomNumber();
			rendomALP=	RendomAlphabets();
		return (rendomALP+RendomNUM);
		}
	
		 // String packageID=      RendomAlphaNUM(); // you can call methods inside method directly if they below to same class. by if its a static method then create a obj and call the method as its non static 
		//  String TrackingNumber=      RendomAlphaNUM();
	
	

}
