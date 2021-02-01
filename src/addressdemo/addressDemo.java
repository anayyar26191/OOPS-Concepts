package addressdemo;

public class addressDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address1 = new Address();
		address1.setHouseNo(546);
		address1.setStreetName("Banting cres");
		address1.setZipCode("L2n6y8");
		address1.setCity("Mississauga");
		address1.setProvince("Ontario");
		address1.setCountry("Canada");
		System.out.println(address1);
		System.out.println(address1.getHouseNo());
		System.out.println(address1.getStreetName());
		System.out.println(address1.getZipCode());
		System.out.println(address1.getCity());
		System.out.println(address1.getProvince());
		System.out.println(address1.getCountry());
		
	}

}
