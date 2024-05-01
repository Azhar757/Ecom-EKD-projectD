package API;

public class BODY extends baseApiClass {
	
String	PackageID= "235sdf";
String	TrackingNo=	"sdfsd456";
	
public String RecivepacakgeBody () {
	
	 String packageID=      RendomAlphaNUM(); // you can call methods inside method directly if they below to same class. by if its a static method then create a obj and call the method as its non static 
	  String TrackingNumber=      RendomAlphaNUM();
	
	return "{\r\n"
			+ "    \"SuiteNumber\": \"2334-5463\",\r\n"
			+ "    \"WarehouseCode\": \"MCO01\",\r\n"
			+ "    \"Packages\": [\r\n"
			+ "        {\r\n"
			+ "            \"PackageId\": \""+ packageID +"\",\r\n"
			+ "            \"CreateDateTime\": \"7/23/2023 7:52:00 PM\",\r\n"
			+ "            \"ShipperTrackingNumber\": \""+TrackingNumber+"\",\r\n"
			+ "            \"CustomerOrderNo\": null,\r\n"
			+ "            \"EtailerName\": \"Samuel Baclig\",\r\n"
			+ "            \"MerchantInvoiceAvailable\": false,\r\n"
			+ "            \"Height\": 0.0,\r\n"
			+ "            \"Width\": 0.0,\r\n"
			+ "            \"Length\": 0.0,\r\n"
			+ "            \"Heavy\": false,\r\n"
			+ "            \"Oversize\": false,\r\n"
			+ "            \"Notes\": \"\",\r\n"
			+ "            \"OriginalPackageID\": \"\",\r\n"
			+ "            \"PackageStatus\": \"Ready To Send\",\r\n"
			+ "            \"PackageSubStatus\": \"\",\r\n"
			+ "            \"PackageStatusDescription\": \"\",\r\n"
			+ "            \"HasReturnLabel\": false,\r\n"
			+ "            \"Weight\": 4.0,\r\n"
			+ "            \"WeightUnit\": \"L\",\r\n"
			+ "            \"DimensionUnit\": \"In\",\r\n"
			+ "            \"PackageArrivalDateAtWarehouse\": \"7/19/2023 9:53:54 PM\",\r\n"
			+ "            \"PackageItemDetails\": [\r\n"
			+ "                {\r\n"
			+ "                    \"ItemId\": \"57647607\",\r\n"
			+ "                    \"Description\": \"AutoMale Shirts Textile\",\r\n"
			+ "                    \"Hscode\": \"62059000\",\r\n"
			+ "                    \"HscodeDescription\": \"Men's or boys' shirts, not knitted or crocheted, of textile materials, other than wool, fine animal hair, cotton & man-made fibres.\",\r\n"
			+ "                    \"NumberOfPieces\": 1,\r\n"
			+ "                    \"Currency\": \"USD\",\r\n"
			+ "                    \"ItemValueInCurrency\": 50.0,\r\n"
			+ "                    \"DGR\": false,\r\n"
			+ "                    \"Prohibited\": false,\r\n"
			+ "                    \"Restricted\": false,\r\n"
			+ "                    \"ExciseRate\": 0.0,\r\n"
			+ "                    \"StatisticalQuantity\": 1.0,\r\n"
			+ "                    \"StatisticalUnit\": \"u\",\r\n"
			+ "                    \"DutyPercent\": 5.0\r\n"
			+ "                }\r\n"
			+ "            ],\r\n"
			+ "            \"ChargeDetails\": []\r\n"
			+ "        }\r\n"
			+ "    ]\r\n"
			+ "}" ;
	
	
}
}
