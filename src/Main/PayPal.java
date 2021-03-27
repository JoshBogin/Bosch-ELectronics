/*
Authors: Josh Bogin & Tyrese Colquhoun
Email Addresses: joshua.bogin@mymail.champlain.edu & tyrese.colquhoun@mymail.champlain.edu
Assignment: Final Project
*/

package Main;

public class PayPal implements Payment {
	// define pay function for PayPal
	@Override
	public void pay(String name, float balance) {
		System.out.println(name + " paid $" + String.format("%.2f", balance) + " using their Paypal account.");
	}

}
