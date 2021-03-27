package Testing;

import Main.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class JUnitTest2 {

	@Test
	void testShoppingCart() {
		// Create new shopping cart
		ShoppingCart testCart = new ShoppingCart();
		// Create factory to create computers
		PCFactory testFactory = new PCFactory();
				
			
		// Create Apple PC using the PC factory
		Item ApplePC;
		ApplePC = testFactory.constructPC("Apple", (float) 800, "Test Apple PC");
		
		// Create new RAM stick
		Item RAM = new RAM((float) 425, "Hyper", "DDR4", 3, "Test Ram");

		// Add PC to cart
		testCart.addItem(ApplePC);

		// create list for expected items
		ArrayList<Item> items = new ArrayList<Item>();
		items.add(ApplePC);

		// test that item has been properly added to cart
		assertEquals(items, testCart.getItems());

		// add the RAM to the cart
		testCart.addItem(RAM);

		// make sure that list has changes
		assertNotEquals(items, testCart.getItems());

		// test that the price is correct
		assertEquals((float) 1225, testCart.getTotalPrice());
	}
}
