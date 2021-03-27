package Main;
/*
Authors: Josh Bogin & Tyrese Colquhoun
Email Addresses: joshua.bogin@mymail.champlain.edu & tyrese.colquhoun@mymail.champlain.edu
Assignment: Final Project
*/

public class CreditCard implements Payment {

	// define pay function for credit card
	@Override
	public void pay(String name, float balance) {
		System.out.println(name + " paid $" + String.format("%.2f", balance) + " using their credit card.");
	}
}
