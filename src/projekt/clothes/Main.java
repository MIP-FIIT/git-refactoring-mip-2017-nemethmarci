package projekt.clothes;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Your name: ");
		String name = sc.nextLine();
		System.out.println("Yor address - street: ");
		String address = sc.nextLine();
		System.out.println("Number: ");
		int number = sc.nextInt();
		String help = sc.nextLine();
		
		Address ad = new Address(address, number);
		Client cl = new Client(name, ad);
		
		System.out.println("Enter 'shirt', 't-shirt', 'jacket' or 'coat': ");
		String style = sc.nextLine();
		
		do {
			System.out.println("How many " + style + "s would you like to order?");
			int num = sc.nextInt();
			String help2 = sc.nextLine();
			
			System.out.println("Set the color: ");
			String color = sc.nextLine();
			
			System.out.println("Choose from materials (wool, denim, cotton, leather): ");
			String material = sc.nextLine();
			
			Clothes c;
			
			switch (style) {
            case "shirt":	c = new Shirt(num, material, color, style);
            				break;
            case "jacket":	c = new Jacket(num, material, color, style);
							break;
            case "coat":	c = new Coat(num, material, color, style);
							break;
            case "t-shirt":	c = new TShirt(num, material, color, style);
							break;
            default:		c = new Clothes(num, material, color, style);
            				System.out.println("Incorrect");
            				break;
			}
			
			c.setPrice();
			cl.c.add(c);
			
			System.out.println("Press 'x' to finish your order or choose from 'shirt', 't-shirt', 'jacket' and 'coat' again:");
			style = sc.nextLine();
            
		} while(!style.equals("x"));

		sc.close();

		cl.printOrder();
	}

}
