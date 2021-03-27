package Testing;

import Main.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class JUnitTest1 {

	@Test
	void testPCFactory() {
		// test factory to create computers
		PCFactory testFactory = new PCFactory();
		
		// Create Apple PC using the factory
		Item ApplePC;
		ApplePC = testFactory.constructPC("Apple", (float) 300, "Test Apple PC");
		
		// test constructed PC
		assertEquals("Apple", ApplePC.getBrand());
		assertEquals((float) 300, ApplePC.getPrice());
		assertEquals("Test Apple PC", ApplePC.getName());
		
		// change the price of the PC
		ApplePC.setPrice((float) 200);
		// make sure the price has changed
		assertNotEquals((float) 300, ApplePC.getPrice());
	}

}
