package com.qa.items;

public abstract class LibraryItem {

	private static int id_counter = 0;

	private int id;
	private int fee;
	private boolean isBorrowed;
	private Integer borrowerId;

	public abstract void throwIt();

}
