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
			System.out.println(c.get(i).quantity + " " + c.get(i).color + " coats for " + c.get(i).price + "€");
			p += c.get(i).price;
		}
		
		for(int i = 0; i<s.size(); i++) {
			System.out.println(s.get(i).quantity + " " + s.get(i).color + " coats for " + s.get(i).price + "€");
			p += s.get(i).price;
		}
		
		for(int i = 0; i<j.size(); i++) {
			System.out.println(j.get(i).quantity + " " + j.get(i).color + " coats for " + j.get(i).price + "€");
			p += j.get(i).price;
		}
		
		System.out.println("The price is: " + p);
	}
}
