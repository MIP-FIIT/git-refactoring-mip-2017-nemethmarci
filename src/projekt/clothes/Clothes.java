package projekt.clothes;

import java.util.ArrayList;
import java.util.Scanner;

public class Clothes {
	private int id, quantity, price;
	private String color, material, style;

	Clothes(){
		this.color = "undefined";
		this.material = "undefined";
		this.style = "undefined";
		this.quantity = 0;
		this.price = 0;
	}
	
	Clothes(int quantity, String color, String material, String style){
		this.style = style;
		this.quantity = quantity;
		this.color = color;
		this.material = material;
	}
	
	void setPrice(int price) {
		this.price = price;
	}
	
	void setMaterial(String material) {
		this.material = material;
	}
	
	void setColor(String color) {
		this.color = color;
	}
	
	void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	void setStyle(String style) {
		this.style = style;
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
	
	int getPrice() {
		return this.price;
	}
	
	String getMaterial() {
		return this.material;
	}
	
	String getColor() {
		return this.color;
	}
	
	int getQuantity() {
		return this.quantity;
	}
	
	String getStyle() {
		return this.style;
	}
}
