package com.qa.Library;

import java.util.List;

import com.qa.items.LibraryItem;

public class Library {

	private List<LibraryItem> allItems;

	public void addItem(LibraryItem item) {
		allItems.add(item);
	}

	public void removeItem(LibraryItem item) {
		allItems.remove(item);
	}

}
