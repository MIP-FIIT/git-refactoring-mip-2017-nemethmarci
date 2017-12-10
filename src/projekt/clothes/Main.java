package projekt.clothes;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Your name: ");
		String name = sc.nextLine();
		System.out.println("Pleease enter your address ");
		String address = sc.nextLine();

		Client cl = new Client(name, address);
		
		Scanner inp = new Scanner(System.in);
		Scanner txt = new Scanner(System.in);
		
		System.out.println("Enter 'shirt', 't-shirt', 'jacket' or 'coat': ");
		String style = inp.next();
		
		do {
			System.out.println("How many " + style + "s would you like to order?");
			int num = inp.nextInt();
			
			System.out.println("Set the color: ");
			String color = inp.next();
			
			System.out.println("Choose from materials (wool, denim, cotton, leather): ");
			String material = inp.next();
			
			switch (style) {
            case "shirt":	Shirt sh = new Shirt(num, material, color);
            				sh.setPrice();
            				cl.s.add(sh);
            				break;
            case "jacket":	Jacket ja = new Jacket(num, material, color);
            				ja.setPrice();
            				cl.j.add(ja);
							break;
            case "coat":	Coat co = new Coat(num, material, color);
            				co.setPrice();
            				cl.c.add(co);
							break;
            case "t-shirt":	TShirt ts = new TShirt(num, material, color);
							ts.setPrice();
							cl.t.add(ts);
							break;
            default:		System.out.println("Incorrect");
            				break;
			}
			
			System.out.println("Press 'x' to finish your order or choose from 'shirt', 't-shirt', 'jacket' and 'coat' again:");
			style = inp.next();
            
		} while(!style.equals("x"));
		
		txt.close();
		inp.close();
		sc.close();

		cl.printOrder();
		System.out.println(cl.name + ", your order will be shipped to " + cl.address);
		

	}

}
