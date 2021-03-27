/*
Authors: Josh Bogin & Tyrese Colquhoun
Email Addresses: joshua.bogin@mymail.champlain.edu & tyrese.colquhoun@mymail.champlain.edu
Assignment: Final Project
*/

// imports

package Main;

import java.util.ArrayList;

public class RAM extends Item {
	// Constructor for RAM item
	public RAM(float price, String brand, String name, int ID, String description) {
		super(price, brand, name, ID, description);
	}

	// override and define function to print description of item to client
	@Override
	public void generateDescription() {
		// TODO Auto-generated method stub
		System.out.println("RAM Chip Description: \n" +
						   "Brand: " + brand + "\n" +
						   "Name: " + name + "\n" +
						   "ID: " + ID + "\n" +
						   "Price: $" + String.format("%.2f", price) + "\n" +
						   "Description: " + description + "\n");
	}

	// override and define function to modify items
	@Override
	public void modifyPC(ArrayList<Item> additions) {
		System.out.println("Sorry, You cannot modify this item.\n");
	}
}
