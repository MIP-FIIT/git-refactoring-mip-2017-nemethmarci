package projekt.clothes;

public class Address {
	private String street;
	private int ZIP;
	
	Address(){
		this.street = "undefined";
		this.ZIP = -1;
	}
	
	Address(String street, int number){
		this.street = street;
		this.ZIP = number;
	}
	
	String getStreet() {
		return this.street;
	}
	
	int getZIP() {
		return this.ZIP;
	}
}