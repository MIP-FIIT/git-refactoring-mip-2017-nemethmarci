package projekt.clothes;

import java.util.ArrayList;

public class Client {
	public String name, address;
	
	public int p = 0;
	
	final ArrayList <Clothes>c = new ArrayList<Clothes>();

	Client(){
		this.name = "unknown";
	}
	
	Client(String name, String address){
		this.name = name;
		this.address = address;
	}
	
	void printOrder() {
		System.out.println("You ordered: ");
		
		for(int i = 0; i<c.size(); i++) {
			System.out.println(c.get(i).getQuantity() + " " + c.get(i).getStyle() + "s for " + c.get(i).getPrice() + "€");
			this.p += c.get(i).getPrice();
		}
		
		System.out.println("The price is: " + p + "€");
		
		System.out.println("Thank you " + this.name + ", your order will be shipped to " + this.address);
	}
}
