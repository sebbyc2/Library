package com.qa;

import com.qa.Library.Library;
import com.qa.items.Book;
import com.qa.person.Person;

public class Main {

	public static void main(String[] args) {

		Library oxford = new Library();

		Book harry = new Book("Harry Pot and the smoking stone", 10, "stoner", "Jamal", 20);

		Person Luis = new Person("Luis");

		oxford.addItem(harry);
		oxford.addMember(Luis);

		oxford.borrowItem(0, 0);

		oxford.getItems();

	}

}
