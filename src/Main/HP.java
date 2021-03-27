/*
Authors: Josh Bogin & Tyrese Colquhoun
Email Addresses: joshua.bogin@mymail.champlain.edu & tyrese.colquhoun@mymail.champlain.edu
Assignment: Final Project
*/

package Main;

// imports
import java.util.ArrayList;

public class HP extends Item {
	// Constructor for HP computer
	public HP(float price, String name) {
		super(price, "HP", name, 1, "HP PC");
		super.OS = "Windows 10";
	}
	
	// override and define function to modify items
	@Override
	public void modifyPC(ArrayList<Item> additions) {
		super.description += ".\nAdditions: ";
		// loop through items to be added
		for(Item item : additions) {
			// add item to list of add-ons
			super.parts.add(item);
			// add price to PC price
			super.price += item.getPrice();
			// add description to PC description
			super.description += "\n" + item.getDescription();
		}
		System.out.println("Successfully modified HP PC.\n");
		
	}
	
	// override and define function to print description of item to client
	@Override
	public void generateDescription() {
		System.out.println("HP Computer Description: \n" +
						   "Brand: " + brand + "\n" +
						   "Name: " + name + "\n" +
						   "Operating System: " + OS + "\n" +
						   "ID: " + ID + "\n" +
						   "Price: $" + String.format("%.2f", price) + "\n" +
						   "Description: " + description + "\n");
	}

}
