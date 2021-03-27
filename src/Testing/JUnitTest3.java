package Testing;

import Main.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class JUnitTest3 {
	
	// Testing feature that has not yet been implemented and, therefore, it will fail.
	
	@Test
	void testCartModifications() {
		// Create new shopping cart
		ShoppingCart testCart2 = new ShoppingCart();
		// Create factory to create computers
		PCFactory testFactory2 = new PCFactory();
		
		// Create HP PC using the PC factory
		Item HP_PC;
		HP_PC = testFactory2.constructPC("HP", (float) 750, "Test HP PC");
		// Create HP PC using the factory and print description of it
		Item HP_PC_2;
		HP_PC_2 = testFactory2.constructPC("HP", (float) 950, "Another Test HP PC");
		
		// Create new RAM stick
		Item RAM = new RAM((float) 400, "Hyper", "DDR4", 3, "Test Ram");
		
		// Add PC to cart
		testCart2.addItem(HP_PC);
		testCart2.addItem(HP_PC_2);
		
		// get the cart items
		ArrayList<Item> cartItems = testCart2.getItems();
		// ensure that the number of items in the cart is 2
		assertEquals(2, cartItems.size()); // should fail though
		
		// unimplemented method
		// update quantity of the first HP computer to 2
		testCart2.updateQuantity(HP_PC, 2);
		
		// get the cart items again
		cartItems = testCart2.getItems();
		// check if the number of items in the cart has been increased to 3
		assertEquals(3, cartItems.size()); // should fail though
		
		// new items to add to the cart
		ArrayList<Item> parts = new ArrayList<Item>();
		// add RAM to parts list to add to computer
		parts.add(RAM);
		
		// update details of an item
		testCart2.updateItem(HP_PC_2, (float) 1050, "MacOS", "Test HP PC with MacOS", parts);
		
		// get cart items again in order to check if the updates were made
		cartItems = testCart2.getItems();
		// get the updated PC from the ArrayList
		HP_PC_2 = cartItems.get(1);
		
		// test updated PC
		assertNotEquals((float) 950, HP_PC_2.getPrice());
		assertNotEquals("Windows 10", HP_PC_2.getOS());
		assertEquals("Test HP PC with MacOS", HP_PC_2.getDescription());
		assertEquals(parts, HP_PC_2.getParts());
	}
}
