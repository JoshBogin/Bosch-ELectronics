/*
Authors: Josh Bogin & Tyrese Colquhoun
Email Addresses: joshua.bogin@mymail.champlain.edu & tyrese.colquhoun@mymail.champlain.edu
Assignment: Final Project
*/

package Main;

// imports
import java.util.ArrayList;

public class ShoppingCart {
	// member variables
	ArrayList<Item> items = new ArrayList<Item>();
	float totalPrice = 0;
	
	// function to add item to cart
	public void addItem(Item item) {
		items.add(item);
		// calculate new total for order
		calculateTotal();
	}
	// function to remove item from cart
	public void removeItem(Item item) {
		items.remove(item);
		// calculate new total for order
		calculateTotal();
	}
	
	// print out complete order to customers
	public void printOrder() {
		System.out.println("Cart Contents:");
		// use count for numbered list of items
		int count = 1;
		// loop through items in cart and print them out
		for (Item item : items) {
			System.out.println(count + ". " + item.getBrand() + ": " + item.getName() + " - $" + String.format("%.2f",item.getPrice()));
			// increment count
			count += 1;
		}
		// then print total price of order after all items have been printed
		System.out.println("------------------------------");
		System.out.println("Total Price: $" + String.format("%.2f", totalPrice) + "\n");
	}
	
	// define function to calculate total price of order
	public void calculateTotal() {
		totalPrice = 0;
		// loop through items in cart and add their price to the total price
		for (Item item : items) {
			totalPrice += item.getPrice();
		}
		// print out current order after total has been calculated
		printOrder();
	}
	
	// getter from total price
	public float getTotalPrice() {
		return totalPrice;
	}

	// getter for ArrayList of cart items
	public ArrayList<Item> getItems() {
		return items;
	}

}
