package com.qa.Library;

import java.util.ArrayList;
import java.util.List;

import com.qa.items.LibraryItem;
import com.qa.person.Person;

public class Library {

	private List<LibraryItem> items = new ArrayList<LibraryItem>();
	private List<Person> members = new ArrayList<Person>();

	public List<LibraryItem> getItems() {
		return items;
	}

	public List<Person> getMembers() {
		return members;
	}

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

	public boolean checkItem(int itemID) {

		for (LibraryItem i : items) {
			if (i.getId() == itemID)
				return true;
		}

		return false;
	}

	public boolean checkMember(int memberID) {

		for (Person p : members) {
			if (p.getId() == memberID)
				return true;
		}

		return false;
	}

	public void borrowItem(int itemID, int personID) {

		if (checkItem(itemID) && checkMember(personID)) {
			for (LibraryItem item : items) {
				if (item.getId() == itemID) {

					if (item.getIsBorrowed()) {
						System.out.println("Item is already borrowed");
						break;
					} else {
						item.borrowItem(personID);
						break;
					}
				}

			}
		} else {
			System.out.println("Item or person not valid");
		}
	}
}
