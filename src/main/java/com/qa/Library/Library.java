package com.qa.Library;

import java.util.List;

import com.qa.items.LibraryItem;
import com.qa.person.Person;

public class Library {

	private List<LibraryItem> items;
	private List<Person> members;

	public void addItem(LibraryItem item) {
		items.add(item);
	}

	public void removeItem(LibraryItem item) {
		items.remove(item);
	}

	public void addMember(Person person) {
		members.add(person);
	}

	public void removeMember(Person person) {
		members.remove(person);
	}

}
