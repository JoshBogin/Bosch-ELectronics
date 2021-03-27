package Main;
/*
Authors: Josh Bogin & Tyrese Colquhoun
Email Addresses: joshua.bogin@mymail.champlain.edu & tyrese.colquhoun@mymail.champlain.edu
Assignment: Final Project
*/

// imports
import java.util.ArrayList;

public class Apple extends Item {
	// Constructor for Apple computer
	public Apple(float price, String name) {
		super(price, "Apple", name, 2, "Apple PC");
		super.OS = "MacOS";
	}
	
	// override and define function to print description of item to client
	@Override
	public void generateDescription() {
		System.out.println("Apple Computer Description: \n" +
						   "Brand: " + brand + "\n" +
						   "Name: " + name + "\n" +
						   "Operating System: " + OS + "\n" +
						   "ID: " + ID + "\n" +
						   "Price: $" + String.format("%.2f", price) + "\n" +
						   "Description: " + description + "\n");
	}

	// override and define function to modify items
	@Override
	public void modifyPC(ArrayList<Item> additions) {
		System.out.println("Sorry, You cannot modify an Apple PC.\n");
	}
}