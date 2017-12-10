package projekt.clothes;

import java.util.ArrayList;

public class Client {
	public String name, address;
	
	final ArrayList <Shirt>s = new ArrayList<Shirt>();
	final ArrayList <Coat>c = new ArrayList<Coat>();
	final ArrayList <Jacket>j = new ArrayList<Jacket>();

	Client(){
		this.name = "unknown";
	}
	
	Client(String name, String address){
		this.name = name;
		this.address = address;
	}
	
	
	void printOrder() {
		System.out.println("You ordered: ");
		
		int p = 0;
		
		for(int i = 0; i<c.size(); i++) {
			System.out.println(c.get(i).getQuantity() + " " + c.get(i).getColor() + " coats for " + c.get(i).getPrice() + "€");
			p += c.get(i).getPrice();
		}
		
		for(int i = 0; i<s.size(); i++) {
			System.out.println(s.get(i).getQuantity() + " " + s.get(i).getColor() + " shirts for " + s.get(i).getPrice() + "€");
			p += s.get(i).getPrice();
		}
		
		for(int i = 0; i<j.size(); i++) {
			System.out.println(j.get(i).getQuantity() + " " + j.get(i).getColor() + " jackets for " + j.get(i).getPrice() + "€");
			p += j.get(i).getPrice();
		}
		
		System.out.println("The price is: " + p);
	}
}
