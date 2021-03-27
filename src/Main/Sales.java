/*
Authors: Josh Bogin & Tyrese Colquhoun
Email Addresses: joshua.bogin@mymail.champlain.edu & tyrese.colquhoun@mymail.champlain.edu
Assignment: Final Project
*/

package Main;

// create function prototypes for Sales interface
public interface Sales {
	void registerObserver(SalesObserver observer);
	void removeObserver(SalesObserver observer);
	void notifyObservers();
}
