package com.qa.items;

public abstract class LibraryItem {

	private static int id_counter = 0;
	private int id;
	private boolean isBorrowed;
	private Integer borrowerId;

	private String name;
	private int fee;

	public LibraryItem(String name, int fee) {
		super();
		this.id = id_counter;
		id_counter++;
		this.fee = fee;
		this.isBorrowed = false;
	}

	public boolean isBorrowed() {
		return isBorrowed;
	}

	public Integer getBorrowerId() {
		return borrowerId;
	}

	public void borrowItem(Integer borrowerId) {
		this.isBorrowed = true;
		this.borrowerId = borrowerId;
	}

	public void returnItem() {
		this.isBorrowed = false;
		this.borrowerId = null;
	}

	public int getId() {
		return this.id;
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

	public abstract void throwIt();

}
