/*
Authors: Josh Bogin & Tyrese Colquhoun
Email Addresses: joshua.bogin@mymail.champlain.edu & tyrese.colquhoun@mymail.champlain.edu
Assignment: Final Project
*/

package Main;

// imports
import java.util.ArrayList;

public class SpecialSales implements Sales {
	// member variables
	private ArrayList<SalesObserver> observers;
	private float discountAmount;
	
	// SpecialSales class constructor
	public SpecialSales() {
		// create new ArrayList for observers
		observers = new ArrayList<SalesObserver>();		
		// set default discount to 0
		discountAmount = 0;
	}

	// function to add observers to observer list
	@Override
	public void registerObserver(SalesObserver observer) {
		observers.add(observer);
	}
	// function to remove observers from observer list
	@Override
	public void removeObserver(SalesObserver observer) {
		// check index of given observer to be removed
		int	observerIndex = observers.indexOf(observer);
		// if index greater than 0 then it exists
		if (observerIndex >= 0) {
			// remove the observer
			observers.remove(observer);
		}
	}

	
	// function to notify observers of sale changes
	@Override
	public void notifyObservers() {
		// loop through each observer in the list and update them
		for (int i = 0; i < observers.size(); i++) {
			SalesObserver observer = (SalesObserver) observers.get(i);
			observer.update(discountAmount);
		}
	}
	
	// if special sale has changed then call notify observers
	public void SpecialSaleChanged() {
		notifyObservers();	
	} 
	
	// function to set new current sale amount
	public void setSale(float discountAmount) {
		// update discount amount
		this.discountAmount = discountAmount;
		System.out.println("The current sale is " + this.discountAmount + "% off everything.");
		// after new sale amount is set, call SpecialSaleChanged
		SpecialSaleChanged();
	}

	// getter for discount amount
	public float getDiscountAmount() {
		return discountAmount;
	}
	

}
