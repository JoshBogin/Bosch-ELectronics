/*
Authors: Josh Bogin & Tyrese Colquhoun
Email Addresses: joshua.bogin@mymail.champlain.edu & tyrese.colquhoun@mymail.champlain.edu
Assignment: Final Project
*/

package Main;

// imports
import java.util.ArrayList;

public abstract class Item {
	// member variables
	protected float price; // yes
	protected String brand; // no
	protected String name; // no
	protected int ID; // no
	protected String description; // yes
	protected String OS; // yes
	protected ArrayList<Item> parts = new ArrayList<Item>(); // yes

	// Item class constructor
	public Item(float price, String brand, String name, int ID, String description) {
		this.price = price;
		this.brand = brand;
		this.name = name;
		this.ID = ID;
		this.description = description;
	}
	
	// create abstract function to print description of items to client
	public abstract void generateDescription();
	
	// create abstract function to modify items
	public abstract void modifyPC(ArrayList<Item> additions);
	
	// getters and setters
	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getOS() {
		return OS;
	}

	public void setOS(String oS) {
		OS = oS;
	}

	public ArrayList<Item> getParts() {
		return parts;
	}

	public void setParts(ArrayList<Item> parts) {
		this.parts = parts;
	}
}
