package projekt.clothes;

import java.util.ArrayList;
import java.util.Scanner;

public class Clothes {
	public int id, quantity, price;
	
	public String color, material, size;

	Clothes(){
		this.color = "undefined";
		this.material = "undefined";
		this.size = "undefined";
		this.quantity = 0;
		this.price = 0;
	}
	
	Clothes(int quantity, String color, String material){
		this.quantity = quantity;
		this.color = color;
		this.material = material;
	}
	
	void setSize(String size) {
		this.size  = size;
	}
	
	void setPrice() {
		int p = 0;
		String material = this.material;
		switch (material) {
        case "wool":	p = 8;
        				break;
        case "leather":	p = 9;       				
						break;
        case "cotton":	p = 3;
						break;
        case "denim":	p = 5;
						break;
        default:		System.out.println("Incorrect material");
        				break;
		}
		
		this.price = this.quantity * p;
	}
	
}
