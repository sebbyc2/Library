package com.qa.items;

public abstract class LibraryItem {

	// ID attributes
	private static int id_counter = 0;
	private int id;
	private boolean isBorrowed;
	private Integer borrowerId;

	// Shared attributes among all Library items
	private String name;
	private int fee;

	// Constructor
	public LibraryItem(String name, int fee) {
		super();
		this.id = id_counter;
		id_counter++;
		this.fee = fee;
		this.isBorrowed = false;
	}

	// Abstract Methods
	public abstract void throwIt();

	// Methods
	public void borrowItem(Integer borrowerId) {
		this.isBorrowed = true;
		this.borrowerId = borrowerId;
	}

	public void returnItem() {
		this.isBorrowed = false;
		this.borrowerId = null;
	}

	// Getters and Setters
	public int getId() {
		return this.id;
	}

	public boolean getIsBorrowed() {
		return isBorrowed;
	}

	public Integer getBorrowerId() {
		return borrowerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

}
