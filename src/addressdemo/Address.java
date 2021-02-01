package addressdemo;

public class Address {
	private static int HouseNo;
	private static String streetName;
	private static  String zipCode;
	private static String city;
	private static String province;
	private static String country;
	public Address() {
		
	}

	public Address(int HouseNo,String streetName,String zipCode,String city,String province,String country ) {
		this.HouseNo=HouseNo;
		this.streetName=streetName;
		this.zipCode =zipCode;
		this.city =city;
		this.province=province;
		this.country=country;
		
	}
	
	public int getHouseNo() {
		return this.HouseNo;	
	}
	public String getStreetName() {
		return this.streetName;			
	}
	public String getZipCode() {
		return this.zipCode;		
	}
	public String getCity() {
		return this.city;
		
	}
	public String getProvince() {
		return this.province;
		
	}
	public String getCountry() {
		return this.country;
	}
	public void setHouseNo(int HouseNo) {
		this.HouseNo=HouseNo;	
	}
	public void setStreetName(String streetName) {
		this.streetName=streetName;			
	}
	public void setZipCode(String zipCode) {
		this.zipCode=zipCode;		
	}
	public void setCity(String city) {
		this.city=city;
		
	}
	public void setProvince(String province) {
		this.province=province;
		
	}
	public void setCountry(String string) {
		this.country=country;
	}

	@Override
	public String toString() {
		return "Address is ";
	}
	
}
