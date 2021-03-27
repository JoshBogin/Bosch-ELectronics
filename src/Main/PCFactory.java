/*
Authors: Josh Bogin & Tyrese Colquhoun
Email Addresses: joshua.bogin@mymail.champlain.edu & tyrese.colquhoun@mymail.champlain.edu
Assignment: Final Project
*/

package Main;

public class PCFactory {
	
	// factory method to create computers
	public Item constructPC(String brand, float price, String name) {
		Item PC = null;
		
		// determine if user wants HP or Apple PC and create the computer
		if(brand == "HP") {
			PC = new HP(price, name);
		}
		else if (brand == "Apple") {
			PC = new Apple(price, name);
		}
		
		// then return the new PC
		return PC;
	}


}
