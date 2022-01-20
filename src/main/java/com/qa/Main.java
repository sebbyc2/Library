package com.qa;

import com.qa.Library.Library;
import com.qa.items.Book;
import com.qa.items.Camera;
import com.qa.items.Thesis;
import com.qa.person.Person;

public class Main {

	public static void main(String[] args) {

		Library oxford = new Library();

		Book harry = new Book("Harry Pot and the smoking stone", 10, "stoner", "Jamal", 20);
		Camera nikon = new Camera("Nikon", "z3", 100, 100, "pro", 0.5);
		Thesis thethe = new Thesis("How to code in java", 0, "Seb", "Java is good, python is bad");

		Person Luis = new Person("Luis");

		oxford.addItem(harry);
		oxford.addMember(Luis);
		oxford.addItem(nikon);
		oxford.addItem(thethe);

		oxford.borrowItem(1, 0);

		oxford.getItems();

	}

}
