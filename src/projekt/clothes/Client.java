package projekt.clothes;

import java.util.ArrayList;

public class Client {
	public String name;
	public int price = 0;
	Address address;
	final ArrayList <Clothes>clothes = new ArrayList<Clothes>();

	Client(){
		this.name = "unknown";
	}
	
	Client(String name, Address address){
		this.name = name;
		this.address = address;
	}
	
	void printOrder() {
		System.out.println("You ordered: ");
		
		for(int i = 0; i<clothes.size(); i++) {
			System.out.println(clothes.get(i).getQuantity() + " " + clothes.get(i).getStyle() + "s for " + clothes.get(i).getPrice() + "€");
			this.price += clothes.get(i).getPrice();
		}
		
		System.out.println("The price is: " + price + "€");
		System.out.println("Thank you " + this.name + ", your order will be shipped to " + this.address.getStreet() + " - " + this.address.getZIP());
	}
}
