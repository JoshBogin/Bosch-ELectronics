package Main;
/*
Authors: Josh Bogin & Tyrese Colquhoun
Email Addresses: joshua.bogin@mymail.champlain.edu & tyrese.colquhoun@mymail.champlain.edu
Assignment: Final Project
*/

public class Customer implements SalesObserver {
	// member variables
	String name;
	Payment paymentMethod;
	ShoppingCart cart;
	float appliedSalesDiscount;
	SpecialSales specialSale;
	
	// Customer class constructor
	Customer(String name, Payment paymentMethod, ShoppingCart cart, SpecialSales special){
		this.name = name;
		this.paymentMethod = paymentMethod;
		this.cart = cart;
		this.specialSale = special;
		// register new customers as observers when they are created
		specialSale.registerObserver(this);
	}
	
	// define update function that notifies customers about current sale
	@Override
	public void update(float discountAmount) {
		this.appliedSalesDiscount = discountAmount;
		System.out.println("Special Sale ---> " + appliedSalesDiscount + "% discount applied! \n");
	}
		
	// define pay method for each customer to pay for their orders
	public void Pay() {
		paymentMethod.pay(name, cart.getTotalPrice());
	}
	
	// define function that applies current special discount to customer's total price
	public void applyDiscount() {
		// divide given percent by 100 to get decimal and subtract it from 1 to get remaining proportion to be paid
		float discount = (float)1.0 - (appliedSalesDiscount / 100);
		// check if current discount is 0 and then apply given discount if it is not
		if (this.specialSale.getDiscountAmount() != 0) {
			// loop through items in the list to set their discounted prices
			for (Item item : cart.getItems()) {
				float discountedPrice = item.getPrice() * discount;
				item.setPrice(discountedPrice);
			}
		}
		// re-calculate total after discount is applied
		cart.calculateTotal();
	}

}
