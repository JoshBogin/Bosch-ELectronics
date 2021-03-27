/*
Authors: Josh Bogin & Tyrese Colquhoun
Email Addresses: joshua.bogin@mymail.champlain.edu & tyrese.colquhoun@mymail.champlain.edu
Assignment: Final Project
*/

package Main;

// imports
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		
		// Create new shopping cart
		ShoppingCart cart = new ShoppingCart();
		// Create new credit card
		Payment paymentMethod = new CreditCard();
		// Create factory to create computers
		PCFactory factory = new PCFactory();
		// Create special sale
		SpecialSales special = new SpecialSales();
		// Create customer
		Customer bobJones = new Customer("Bob Jones", paymentMethod, cart, special);
		
		// Set starting special sale to 60%
		special.setSale(60);
		
		// Create Apple PC using the factory and print description of it
		Item ApplePC;
		ApplePC = factory.constructPC("Apple", (float) 1000.0, "Apple PC");
		ApplePC.generateDescription();
		
		// set program to sleep for 1 second
		TimeUnit.SECONDS.sleep(1);
		
		// Create HP PC using the factory and print description of it
		Item HP_PC;
		HP_PC = factory.constructPC("HP", (float) 500.0, "HP PC");
		
		TimeUnit.SECONDS.sleep(1);
		
		// Create another Apple PC using the factory and print its description
		Item ApplePC2;
		ApplePC2 = factory.constructPC("Apple", (float) 2000.0, "Apple PC 2.0");
		ApplePC2.generateDescription();
		
		TimeUnit.SECONDS.sleep(1);
		
		// Create new RAM stick and print description
		Item hyperRAM = new RAM((float) 300, "Hyper", "DDR4", 3, "DDR4 RAM by Hyper");
		hyperRAM.generateDescription();
		
		TimeUnit.SECONDS.sleep(1);
		
		// Special sale updates every 4 seconds, now set to 25%
		special.setSale(25);
		
		// Create new DVD player and print description
		Item sonyDVD = new DVDPlayer((float) 45, "Sony", "DVD Player", 4, "DVD Player by Sony");
		sonyDVD.generateDescription();
		
		TimeUnit.SECONDS.sleep(1);
		
		// Create ArrayList of items to add to computers
		ArrayList<Item> additions = new ArrayList<Item>(Arrays.asList(hyperRAM, sonyDVD));
		// Call apply modifyPC function to show it cannot be modified
		ApplePC2.modifyPC(additions);
		
		TimeUnit.SECONDS.sleep(1);
		
		// Call apply modifyPC function to show it cannot be modified
		HP_PC.modifyPC(additions);
		// Then print HP PC description again
		HP_PC.generateDescription();
				
		TimeUnit.SECONDS.sleep(1);
		
		// Add items to cart
		cart.addItem(ApplePC);
		cart.addItem(ApplePC2);
		cart.addItem(hyperRAM);
		cart.addItem(HP_PC);
		
		TimeUnit.SECONDS.sleep(1);	
		
		// Set current special sale to 50%
		special.setSale(50);
		
		// Remove items from cart
		cart.removeItem(ApplePC2);
		
		TimeUnit.SECONDS.sleep(1);
		
		// Apply current discount
		bobJones.applyDiscount();
		
		TimeUnit.SECONDS.sleep(1);
		
		// Checkout and pay for order
		bobJones.Pay();

	}

}
